package com.chuangge.order.modle.domain;

import java.util.Date;

public class OrderLog {
    private Long orderLogId;

    private Long orderId;

    private Byte operatorType;

    private Byte actionType;

    private Byte reasonType;

    private Byte previousState;

    private Byte currentState;

    private Long operator;

    private Date createTime;

    private Date updateTime;

    public Long getOrderLogId() {
        return orderLogId;
    }

    public void setOrderLogId(Long orderLogId) {
        this.orderLogId = orderLogId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Byte getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(Byte operatorType) {
        this.operatorType = operatorType;
    }

    public Byte getActionType() {
        return actionType;
    }

    public void setActionType(Byte actionType) {
        this.actionType = actionType;
    }

    public Byte getReasonType() {
        return reasonType;
    }

    public void setReasonType(Byte reasonType) {
        this.reasonType = reasonType;
    }

    public Byte getPreviousState() {
        return previousState;
    }

    public void setPreviousState(Byte previousState) {
        this.previousState = previousState;
    }

    public Byte getCurrentState() {
        return currentState;
    }

    public void setCurrentState(Byte currentState) {
        this.currentState = currentState;
    }

    public Long getOperator() {
        return operator;
    }

    public void setOperator(Long operator) {
        this.operator = operator;
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