package com.chuangge.goods.dao;

import com.chuangge.goods.modle.domain.GoodsDelivery;

public interface GoodsDeliveryMapper {
    int deleteByPrimaryKey(Long deliveryId);

    int insert(GoodsDelivery record);

    int insertSelective(GoodsDelivery record);

    GoodsDelivery selectByPrimaryKey(Long deliveryId);

    int updateByPrimaryKeySelective(GoodsDelivery record);

    int updateByPrimaryKey(GoodsDelivery record);
}