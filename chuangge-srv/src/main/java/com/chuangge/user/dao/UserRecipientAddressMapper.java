package com.chuangge.user.dao;

import com.chuangge.user.model.domain.UserRecipientAddress;

public interface UserRecipientAddressMapper {
    int deleteByPrimaryKey(Integer addrId);

    int insert(UserRecipientAddress record);

    int insertSelective(UserRecipientAddress record);

    UserRecipientAddress selectByPrimaryKey(Integer addrId);

    int updateByPrimaryKeySelective(UserRecipientAddress record);

    int updateByPrimaryKey(UserRecipientAddress record);
}