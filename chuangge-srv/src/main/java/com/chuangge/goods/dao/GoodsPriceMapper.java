package com.chuangge.goods.dao;

import com.chuangge.goods.modle.domain.GoodsPrice;

public interface GoodsPriceMapper {
    int deleteByPrimaryKey(Long priceId);

    int insert(GoodsPrice record);

    int insertSelective(GoodsPrice record);

    GoodsPrice selectByPrimaryKey(Long priceId);

    int updateByPrimaryKeySelective(GoodsPrice record);

    int updateByPrimaryKey(GoodsPrice record);
}