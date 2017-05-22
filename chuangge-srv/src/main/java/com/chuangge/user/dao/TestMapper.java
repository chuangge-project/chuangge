package com.chuangge.user.dao;

import java.util.List;
import java.util.Map;

import com.chuangge.user.model.domain.Test;

public interface TestMapper {
	
    int deleteByPrimaryKey(Long id);

    Test selectByPrimaryKey(Map map);

    int updateByPrimaryKeySelective(Test record);

    int insert(Test record);

	List<Test> selectTestList(Map map);
}