package com.chuangge.goods.modle.domain;

import java.util.Date;

public class GoodsPic {
    private Long picId;

    private Long goodsId;

    private String goodsImg;

    private String goodsImgApp;

    private Byte isGoodsImgDefault;

    private Byte isGoodsImgAppDefault;

    private Integer sortNo;

    private Date createDate;

    private Date updateDate;

    public Long getPicId() {
        return picId;
    }

    public void setPicId(Long picId) {
        this.picId = picId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public String getGoodsImgApp() {
        return goodsImgApp;
    }

    public void setGoodsImgApp(String goodsImgApp) {
        this.goodsImgApp = goodsImgApp;
    }

    public Byte getIsGoodsImgDefault() {
        return isGoodsImgDefault;
    }

    public void setIsGoodsImgDefault(Byte isGoodsImgDefault) {
        this.isGoodsImgDefault = isGoodsImgDefault;
    }

    public Byte getIsGoodsImgAppDefault() {
        return isGoodsImgAppDefault;
    }

    public void setIsGoodsImgAppDefault(Byte isGoodsImgAppDefault) {
        this.isGoodsImgAppDefault = isGoodsImgAppDefault;
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}