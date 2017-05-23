package com.chuangge.order.modle.domain;

import java.util.Date;

public class Order {
    private Long orderId;

    private String orderNo;

    private Long userId;

    private Long sellerId;

    private Byte tradeType;

    private String buyerMessage;

    private Byte isInvoice;

    private Byte invoiceType;

    private Byte paymentMethod;

    private Double orderTotalFee;

    private Double oughtProductFee;

    private Double oughtFreight;

    private Double discountAmount;

    private Double actuallyFee;

    private Double cashbackFee;

    private Date cashbackDate;

    private Byte cashbackStatus;

    private Byte state;

    private Byte closedType;

    private Byte isCashback;

    private Byte isCustomerService;

    private Byte isInRefund;

    private Byte hasRefund;

    private Byte paymentState;

    private Date paymentTime;

    private Integer recipientDuration;

    private Date confirmTime;

    private Date createTime;

    private Date updateTime;

    private Byte isDeleted;

    private byte[] invoiceTitle;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Byte getTradeType() {
        return tradeType;
    }

    public void setTradeType(Byte tradeType) {
        this.tradeType = tradeType;
    }

    public String getBuyerMessage() {
        return buyerMessage;
    }

    public void setBuyerMessage(String buyerMessage) {
        this.buyerMessage = buyerMessage;
    }

    public Byte getIsInvoice() {
        return isInvoice;
    }

    public void setIsInvoice(Byte isInvoice) {
        this.isInvoice = isInvoice;
    }

    public Byte getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Byte invoiceType) {
        this.invoiceType = invoiceType;
    }

    public Byte getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Byte paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Double getOrderTotalFee() {
        return orderTotalFee;
    }

    public void setOrderTotalFee(Double orderTotalFee) {
        this.orderTotalFee = orderTotalFee;
    }

    public Double getOughtProductFee() {
        return oughtProductFee;
    }

    public void setOughtProductFee(Double oughtProductFee) {
        this.oughtProductFee = oughtProductFee;
    }

    public Double getOughtFreight() {
        return oughtFreight;
    }

    public void setOughtFreight(Double oughtFreight) {
        this.oughtFreight = oughtFreight;
    }

    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Double getActuallyFee() {
        return actuallyFee;
    }

    public void setActuallyFee(Double actuallyFee) {
        this.actuallyFee = actuallyFee;
    }

    public Double getCashbackFee() {
        return cashbackFee;
    }

    public void setCashbackFee(Double cashbackFee) {
        this.cashbackFee = cashbackFee;
    }

    public Date getCashbackDate() {
        return cashbackDate;
    }

    public void setCashbackDate(Date cashbackDate) {
        this.cashbackDate = cashbackDate;
    }

    public Byte getCashbackStatus() {
        return cashbackStatus;
    }

    public void setCashbackStatus(Byte cashbackStatus) {
        this.cashbackStatus = cashbackStatus;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Byte getClosedType() {
        return closedType;
    }

    public void setClosedType(Byte closedType) {
        this.closedType = closedType;
    }

    public Byte getIsCashback() {
        return isCashback;
    }

    public void setIsCashback(Byte isCashback) {
        this.isCashback = isCashback;
    }

    public Byte getIsCustomerService() {
        return isCustomerService;
    }

    public void setIsCustomerService(Byte isCustomerService) {
        this.isCustomerService = isCustomerService;
    }

    public Byte getIsInRefund() {
        return isInRefund;
    }

    public void setIsInRefund(Byte isInRefund) {
        this.isInRefund = isInRefund;
    }

    public Byte getHasRefund() {
        return hasRefund;
    }

    public void setHasRefund(Byte hasRefund) {
        this.hasRefund = hasRefund;
    }

    public Byte getPaymentState() {
        return paymentState;
    }

    public void setPaymentState(Byte paymentState) {
        this.paymentState = paymentState;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Integer getRecipientDuration() {
        return recipientDuration;
    }

    public void setRecipientDuration(Integer recipientDuration) {
        this.recipientDuration = recipientDuration;
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
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

    public byte[] getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(byte[] invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }
}