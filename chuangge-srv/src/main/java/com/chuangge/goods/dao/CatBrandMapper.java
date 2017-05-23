package com.chuangge.goods.dao;

import com.chuangge.goods.modle.domain.CatBrand;

public interface CatBrandMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CatBrand record);

    int insertSelective(CatBrand record);

    CatBrand selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CatBrand record);

    int updateByPrimaryKey(CatBrand record);
}