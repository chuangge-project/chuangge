package com.chuangge.order.modle.domain;

import java.util.Date;

public class DeliveryBill {
    private Long deliveryBillId;

    private String deliveryBillNo;

    private Long goodsId;

    private Integer warehouseId;

    private String logistics;

    private Integer logisticsCmpyId;

    private Date createTime;

    private Date updateTime;

    private Byte isDeleted;

    public Long getDeliveryBillId() {
        return deliveryBillId;
    }

    public void setDeliveryBillId(Long deliveryBillId) {
        this.deliveryBillId = deliveryBillId;
    }

    public String getDeliveryBillNo() {
        return deliveryBillNo;
    }

    public void setDeliveryBillNo(String deliveryBillNo) {
        this.deliveryBillNo = deliveryBillNo;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getLogistics() {
        return logistics;
    }

    public void setLogistics(String logistics) {
        this.logistics = logistics;
    }

    public Integer getLogisticsCmpyId() {
        return logisticsCmpyId;
    }

    public void setLogisticsCmpyId(Integer logisticsCmpyId) {
        this.logisticsCmpyId = logisticsCmpyId;
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