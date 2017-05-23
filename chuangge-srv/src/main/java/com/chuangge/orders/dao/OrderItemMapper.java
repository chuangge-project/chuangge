package com.chuangge.orders.dao;

import com.chuangge.order.modle.domain.OrderItem;

public interface OrderItemMapper {
    int deleteByPrimaryKey(Integer itemId);

    int insert(OrderItem record);

    int insertSelective(OrderItem record);

    OrderItem selectByPrimaryKey(Integer itemId);

    int updateByPrimaryKeySelective(OrderItem record);

    int updateByPrimaryKey(OrderItem record);
}