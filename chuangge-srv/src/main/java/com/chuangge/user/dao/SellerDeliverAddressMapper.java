package com.chuangge.user.dao;

import com.chuangge.user.model.domain.SellerDeliverAddress;

public interface SellerDeliverAddressMapper {
    int deleteByPrimaryKey(Long addressId);

    int insert(SellerDeliverAddress record);

    int insertSelective(SellerDeliverAddress record);

    SellerDeliverAddress selectByPrimaryKey(Long addressId);

    int updateByPrimaryKeySelective(SellerDeliverAddress record);

    int updateByPrimaryKey(SellerDeliverAddress record);
}