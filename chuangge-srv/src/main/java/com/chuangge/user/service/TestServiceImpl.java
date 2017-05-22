package com.chuangge.user.service;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.chuangge.user.dao.TestMapper;
import com.chuangge.user.model.domain.Test;

/**
 * Copyright (C), 2012-2014, 上海好屋网信息技术有限公司 Author:zouwei Date:2014年8月12日
 * Description:AuthUserServiceImpl.java
 */
@Service
public class TestServiceImpl implements TestService {
	
	private static Logger logger = LoggerFactory.getLogger(AuthUserServiceImpl.class);

	@Autowired
	private TestMapper testMapper;
	
	@Override
	public JSONObject deleteByPrimaryKey(Long id) {
		testMapper.deleteByPrimaryKey(id);
		return null;
	}

	@Override
	public JSONObject selectByPrimaryKey(Map map) {
		JSONObject json = new JSONObject();
		Test test = testMapper.selectByPrimaryKey(map);
		json.put("aa", test);
		return json;
	}

	@Override
	public JSONObject updateByPrimaryKeySelective(Test record) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JSONObject insert(Test record) {
		int i = testMapper.insert(record);
		JSONObject json = new JSONObject();
		json.put("aa", i);
		return json;
	}

	@Override
	public JSONObject selectTestList(Map map) {
		// TODO Auto-generated method stub
		return null;
	}


}
