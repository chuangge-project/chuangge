package com.chuangge.user.plugins;

import java.util.Collection;
import java.util.Properties;
import java.util.SortedSet;

import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.springframework.util.CollectionUtils;

import com.chuangge.common.utils.GenericsUtils;
import com.chuangge.common.utils.ReflectUtils;
import com.chuangge.common.utils.SpringContextUtils;
import com.chuangge.mybatis.extend.EntityEvent;
import com.chuangge.mybatis.extend.EntityListener;
import com.chuangge.mybatis.extend.EntityListenerComparator;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

/*
 * Copyright (C), 2012-2014, 上海好屋网信息技术有限公司
 * Author:   国楠
 * Date:     14-11-27
 * Description: 实体侦听实现插件( 需启用此插件才能使用 实体侦听功能 ),
 *              依托 spring 容器,所有实现侦听器接口的自动注册
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 国楠           14-11-27           00000001         创建文件
 *
 */
@Intercepts({
        @Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class })
        ,@Signature(method = "query", type = Executor.class, args = {MappedStatement.class,Object.class, RowBounds.class,ResultHandler.class})
        ,@Signature(method = "query", type = Executor.class, args = {MappedStatement.class,Object.class, RowBounds.class,ResultHandler.class,CacheKey.class,BoundSql.class})
})
public class SchEntityListenerPlugin implements Interceptor {

    private static final Logger logger = org.slf4j.LoggerFactory.getLogger(SchEntityListenerPlugin.class);
    private java.util.Map<Class,SortedSet<EntityListener>> maps = Maps.newConcurrentMap();
    private boolean needProcess =true;
    private boolean started = false;

    public SchEntityListenerPlugin(){
//      init();
    }
    public synchronized void init(){

        if( !started  ){
            started = true;
            if( !SpringContextUtils.isAvailable() && logger.isWarnEnabled()){

                logger.warn("spring容器工具类没有启动,不能从spring容器获取实体侦听器");
                return;
            }

            try {
                Collection<EntityListener> listeners = SpringContextUtils.getBeansOfType(EntityListener.class,true,false).values();
                if( !CollectionUtils.isEmpty(listeners)  ){
                    for( EntityListener listener : listeners){
                        addListener(listener);
                    }
                }
            }catch (Exception e){

                e.printStackTrace();
            }finally {

                needProcess = !CollectionUtils.isEmpty(maps);
                if( !needProcess && logger.isWarnEnabled() ){
                    logger.warn("没有默认实体侦听器!");
                }
            }
        }


    }

    //通过
    private void initBySpringContext(){



    }

    /**
     * 增加侦听器
     * @param listener
     */
    public void addListener(EntityListener listener){

        Class auditTargetClass =  GenericsUtils.getInterfaceActualClass(listener.getClass(), EntityListener.class);
        if( !maps.containsKey( auditTargetClass ) ){
            maps.put(auditTargetClass, Sets.newTreeSet(new EntityListenerComparator()));
        }
        maps.get(auditTargetClass).add(listener);
        needProcess = !CollectionUtils.isEmpty(maps);

        if( logger.isInfoEnabled() ){
            logger.info("增加类型{}的实体侦听器成功",auditTargetClass.getName());
        }
    }


    @Override
    public Object intercept(Invocation invocation) throws Throwable {

        if( !started ){
            init();
        }

        Object target = invocation.getTarget();
        if( target instanceof Executor ){

            Object [] args=invocation.getArgs();
            MappedStatement mappedStatement = (MappedStatement) args[0];
            notice(mappedStatement,args[1],true);
            Object result=invocation.proceed();
            notice(mappedStatement,args[1],false);
            return result;
        }
        return invocation.proceed();
    }


    @Override
    public Object plugin(Object target) {

        if( !started ){
            init();
        }

        if( needProcess && target instanceof Executor )
            return Plugin.wrap(target, this);
        return target;
    }

    private void notice(MappedStatement mappedStatement,Object params,boolean isBefore){

        try {

            if( null != mappedStatement && needProcess){
                for(java.util.Map.Entry<Class,SortedSet<EntityListener>> entry : maps.entrySet()){
                    Object auditTarget = Object.class == entry.getKey() ? params : ReflectUtils.findMemberByType(params, entry.getKey()) ;
                    if( null == auditTarget )
                        return;
                    for(EntityListener listener: entry.getValue()){
                        try {
                            EntityEvent.TriggerType triggerType = EntityEvent.TriggerType.valueOf(mappedStatement.getSqlCommandType().name());
                            if( isBefore ){
                                listener.beforeChange(new EntityEvent( auditTarget,triggerType ));
                            }else {
                                listener.afterChange(new EntityEvent( auditTarget,triggerType ));
                            }
                        }catch (Exception e){
                            if (logger.isWarnEnabled()){
                                logger.warn(e.getMessage(),e);
                            }
                        }
                    }
                }
            }
        }catch (Throwable e){
            if (logger.isWarnEnabled()){
                logger.warn(e.getMessage(),e);
            }
        }
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
