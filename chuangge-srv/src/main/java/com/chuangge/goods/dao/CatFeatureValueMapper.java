package com.chuangge.goods.dao;

import com.chuangge.goods.modle.domain.CatFeatureValue;

public interface CatFeatureValueMapper {
    int deleteByPrimaryKey(Integer valueId);

    int insert(CatFeatureValue record);

    int insertSelective(CatFeatureValue record);

    CatFeatureValue selectByPrimaryKey(Integer valueId);

    int updateByPrimaryKeySelective(CatFeatureValue record);

    int updateByPrimaryKey(CatFeatureValue record);
}