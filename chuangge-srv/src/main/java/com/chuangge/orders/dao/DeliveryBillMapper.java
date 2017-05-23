package com.chuangge.orders.dao;

import com.chuangge.order.modle.domain.DeliveryBill;

public interface DeliveryBillMapper {
    int deleteByPrimaryKey(Long deliveryBillId);

    int insert(DeliveryBill record);

    int insertSelective(DeliveryBill record);

    DeliveryBill selectByPrimaryKey(Long deliveryBillId);

    int updateByPrimaryKeySelective(DeliveryBill record);

    int updateByPrimaryKey(DeliveryBill record);
}