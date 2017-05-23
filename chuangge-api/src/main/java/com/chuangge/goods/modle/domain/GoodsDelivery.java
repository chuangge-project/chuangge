package com.chuangge.goods.modle.domain;

import java.util.Date;

public class GoodsDelivery {
    private Long deliveryId;

    private Long goodsId;

    private Long orderId;

    private Integer deliverAddrId;

    private Integer refundAddrId;

    private Integer freightTemplateId;

    private Date createTime;

    private Date updateTime;

    public Long getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Long deliveryId) {
        this.deliveryId = deliveryId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getDeliverAddrId() {
        return deliverAddrId;
    }

    public void setDeliverAddrId(Integer deliverAddrId) {
        this.deliverAddrId = deliverAddrId;
    }

    public Integer getRefundAddrId() {
        return refundAddrId;
    }

    public void setRefundAddrId(Integer refundAddrId) {
        this.refundAddrId = refundAddrId;
    }

    public Integer getFreightTemplateId() {
        return freightTemplateId;
    }

    public void setFreightTemplateId(Integer freightTemplateId) {
        this.freightTemplateId = freightTemplateId;
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