package com.chuangge.user.model.domain;

import java.util.Date;

public class SellerDetail {
    private Long detailId;

    private Long sellerId;

    private String introduction;

    private String promoImg;

    private String bizLicenseImg;

    private String remark;

    private Date createTime;

    private Date updateTime;

    public Long getDetailId() {
        return detailId;
    }

    public void setDetailId(Long detailId) {
        this.detailId = detailId;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getPromoImg() {
        return promoImg;
    }

    public void setPromoImg(String promoImg) {
        this.promoImg = promoImg;
    }

    public String getBizLicenseImg() {
        return bizLicenseImg;
    }

    public void setBizLicenseImg(String bizLicenseImg) {
        this.bizLicenseImg = bizLicenseImg;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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