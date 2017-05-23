package com.chuangge.goods.dao;

import com.chuangge.goods.modle.domain.GoodsCategory;

public interface GoodsCategoryMapper {
    int deleteByPrimaryKey(Integer catId);

    int insert(GoodsCategory record);

    int insertSelective(GoodsCategory record);

    GoodsCategory selectByPrimaryKey(Integer catId);

    int updateByPrimaryKeySelective(GoodsCategory record);

    int updateByPrimaryKey(GoodsCategory record);
}