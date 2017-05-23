package com.chuangge.goods.modle.domain;

import java.util.Date;

public class goods_sku {
    private Long skuId;

    private String code;

    private String barCode;

    private Long goodsId;

    private Long featureId;

    private Long featureValueId;

    private Integer inventory;

    private Integer inventoryWarning;

    private Byte isMainSku;

    private Date createTime;

    private Date updateTime;

    private Byte isDeleted;

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getFeatureId() {
        return featureId;
    }

    public void setFeatureId(Long featureId) {
        this.featureId = featureId;
    }

    public Long getFeatureValueId() {
        return featureValueId;
    }

    public void setFeatureValueId(Long featureValueId) {
        this.featureValueId = featureValueId;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public Integer getInventoryWarning() {
        return inventoryWarning;
    }

    public void setInventoryWarning(Integer inventoryWarning) {
        this.inventoryWarning = inventoryWarning;
    }

    public Byte getIsMainSku() {
        return isMainSku;
    }

    public void setIsMainSku(Byte isMainSku) {
        this.isMainSku = isMainSku;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }
}