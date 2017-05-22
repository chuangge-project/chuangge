package com.chuangge.user.dao;

import java.util.List;
import java.util.Map;

import com.chuangge.user.model.domain.Test;

public interface TestMapper {
	
    int deleteByPrimaryKey(String activityId);

    Test selectByPrimaryKey(Map map);

    int updateByPrimaryKeySelective(Test record);

	List<Test> selectTestList(Map map);
}