package com.chuangge.user.dao;

import com.chuangge.user.model.domain.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}