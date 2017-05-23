package com.chuangge.goods.dao;

import com.chuangge.goods.modle.domain.GoodsPic;

public interface GoodsPicMapper {
    int deleteByPrimaryKey(Long picId);

    int insert(GoodsPic record);

    int insertSelective(GoodsPic record);

    GoodsPic selectByPrimaryKey(Long picId);

    int updateByPrimaryKeySelective(GoodsPic record);

    int updateByPrimaryKey(GoodsPic record);
}