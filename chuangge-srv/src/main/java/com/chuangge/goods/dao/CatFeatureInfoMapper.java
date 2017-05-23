package com.chuangge.goods.dao;

import com.chuangge.goods.modle.domain.CatFeatureInfo;

public interface CatFeatureInfoMapper {
    int deleteByPrimaryKey(Long featureId);

    int insert(CatFeatureInfo record);

    int insertSelective(CatFeatureInfo record);

    CatFeatureInfo selectByPrimaryKey(Long featureId);

    int updateByPrimaryKeySelective(CatFeatureInfo record);

    int updateByPrimaryKey(CatFeatureInfo record);
}