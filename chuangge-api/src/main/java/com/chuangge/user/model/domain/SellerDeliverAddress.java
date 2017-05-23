package com.chuangge.user.model.domain;

import java.util.Date;

public class SellerDeliverAddress {
    private Long addressId;

    private Integer districtId;

    private String address;

    private Byte isDefaultAddr;

    private Date createTime;

    private Date updateTime;

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Byte getIsDefaultAddr() {
        return isDefaultAddr;
    }

    public void setIsDefaultAddr(Byte isDefaultAddr) {
        this.isDefaultAddr = isDefaultAddr;
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