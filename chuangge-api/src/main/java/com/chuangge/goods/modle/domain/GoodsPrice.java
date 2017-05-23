package com.chuangge.goods.modle.domain;

import java.util.Date;

public class GoodsPrice {
    private Long priceId;

    private Long goodsSkuId;

    private Double price;

    private Double marketPrice;

    private Double costPrice;

    private Double promPrice;

    private Byte isProm;

    private Double memberPrice;

    private Byte isMember;

    private Date createTime;

    private Date updateTime;

    public Long getPriceId() {
        return priceId;
    }

    public void setPriceId(Long priceId) {
        this.priceId = priceId;
    }

    public Long getGoodsSkuId() {
        return goodsSkuId;
    }

    public void setGoodsSkuId(Long goodsSkuId) {
        this.goodsSkuId = goodsSkuId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    public Double getPromPrice() {
        return promPrice;
    }

    public void setPromPrice(Double promPrice) {
        this.promPrice = promPrice;
    }

    public Byte getIsProm() {
        return isProm;
    }

    public void setIsProm(Byte isProm) {
        this.isProm = isProm;
    }

    public Double getMemberPrice() {
        return memberPrice;
    }

    public void setMemberPrice(Double memberPrice) {
        this.memberPrice = memberPrice;
    }

    public Byte getIsMember() {
        return isMember;
    }

    public void setIsMember(Byte isMember) {
        this.isMember = isMember;
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
}