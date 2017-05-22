package com.chuangge.user.service;

import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.chuangge.user.model.domain.Test;

/**
 * Copyright (C), 2012-2014, 上海创格服饰有限公司
 * @author jinchunyu
 * Date:2017年5月17日
 * @since   JDK1.8
 */
public interface TestService {
	
    JSONObject deleteByPrimaryKey(String id);

    JSONObject selectByPrimaryKey(Map map);

    JSONObject updateByPrimaryKeySelective(Test record);

    JSONObject selectTestList(Map map);
} 

