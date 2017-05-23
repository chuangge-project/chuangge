package com.chuangge.goods.dao;

import com.chuangge.goods.modle.domain.goods_sku;

public interface goods_skuMapper {
    int deleteByPrimaryKey(Long skuId);

    int insert(goods_sku record);

    int insertSelective(goods_sku record);

    goods_sku selectByPrimaryKey(Long skuId);

    int updateByPrimaryKeySelective(goods_sku record);

    int updateByPrimaryKey(goods_sku record);
}