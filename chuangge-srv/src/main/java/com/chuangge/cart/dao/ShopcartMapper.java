package com.chuangge.cart.dao;

import com.chuangge.cart.modle.domain.Shopcart;

public interface ShopcartMapper {
    int deleteByPrimaryKey(Long cartId);

    int insert(Shopcart record);

    int insertSelective(Shopcart record);

    Shopcart selectByPrimaryKey(Long cartId);

    int updateByPrimaryKeySelective(Shopcart record);

    int updateByPrimaryKey(Shopcart record);
}