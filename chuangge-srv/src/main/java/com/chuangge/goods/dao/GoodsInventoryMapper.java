package com.chuangge.goods.dao;

import com.chuangge.goods.modle.domain.GoodsInventory;

public interface GoodsInventoryMapper {
    int deleteByPrimaryKey(Long inventoryId);

    int insert(GoodsInventory record);

    int insertSelective(GoodsInventory record);

    GoodsInventory selectByPrimaryKey(Long inventoryId);

    int updateByPrimaryKeySelective(GoodsInventory record);

    int updateByPrimaryKey(GoodsInventory record);
}