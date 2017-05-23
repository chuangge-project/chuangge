package com.chuangge.user.dao;

import com.chuangge.user.model.domain.SellerDetail;

public interface SellerDetailMapper {
    int deleteByPrimaryKey(Long detailId);

    int insert(SellerDetail record);

    int insertSelective(SellerDetail record);

    SellerDetail selectByPrimaryKey(Long detailId);

    int updateByPrimaryKeySelective(SellerDetail record);

    int updateByPrimaryKey(SellerDetail record);
}