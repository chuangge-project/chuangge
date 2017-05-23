package com.chuangge.orders.dao;

import com.chuangge.order.modle.domain.OrderLog;

public interface OrderLogMapper {
    int deleteByPrimaryKey(Long orderLogId);

    int insert(OrderLog record);

    int insertSelective(OrderLog record);

    OrderLog selectByPrimaryKey(Long orderLogId);

    int updateByPrimaryKeySelective(OrderLog record);

    int updateByPrimaryKey(OrderLog record);
}