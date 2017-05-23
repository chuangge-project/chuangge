package com.chuangge.orders.dao;

import com.chuangge.order.modle.domain.Order;

public interface OrderMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKeyWithBLOBs(Order record);

    int updateByPrimaryKey(Order record);
}