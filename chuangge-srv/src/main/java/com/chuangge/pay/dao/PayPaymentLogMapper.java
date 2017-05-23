package com.chuangge.pay.dao;

import com.chuangge.pay.modle.domain.PayPaymentLog;

public interface PayPaymentLogMapper {
    int deleteByPrimaryKey(Long paymentId);

    int insert(PayPaymentLog record);

    int insertSelective(PayPaymentLog record);

    PayPaymentLog selectByPrimaryKey(Long paymentId);

    int updateByPrimaryKeySelective(PayPaymentLog record);

    int updateByPrimaryKey(PayPaymentLog record);
}