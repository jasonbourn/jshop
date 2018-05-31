package com.jason.shop.order.dao.model;

import java.math.BigDecimal;
import java.util.Date;

public class TbOrder {
    /** 订单id */
    private String orderId;

    /** 实付金额 */
    private BigDecimal payment;

    /** 支付类型 1在线支付 2货到付款 */
    private Integer paymentType;

    /** 邮费 */
    private BigDecimal postFee;

    /** 状态 0未付款 1已付款 2未发货 3已发货 4交易成功 5交易关闭 6交易失败 */
    private Integer status;

    /** 订单创建时间 */
    private Date createTime;

    /** 订单更新时间 */
    private Date updateTime;

    /** 付款时间 */
    private Date paymentTime;

    /** 发货时间 */
    private Date consignTime;

    /** 交易完成时间 */
    private Date endTime;

    /** 交易关闭时间 */
    private Date closeTime;

    /** 物流名称 */
    private String shippingName;

    /** 物流单号 */
    private String shippingCode;

    /** 用户id */
    private Long userId;

    /** 买家留言 */
    private String buyerMessage;

    /** 买家昵称 */
    private String buyerNick;

    /** 买家是否已经评价 */
    private Boolean buyerComment;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public BigDecimal getPostFee() {
        return postFee;
    }

    public void setPostFee(BigDecimal postFee) {
        this.postFee = postFee;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Date getConsignTime() {
        return consignTime;
    }

    public void setConsignTime(Date consignTime) {
        this.consignTime = consignTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public String getShippingName() {
        return shippingName;
    }

    public void setShippingName(String shippingName) {
        this.shippingName = shippingName == null ? null : shippingName.trim();
    }

    public String getShippingCode() {
        return shippingCode;
    }

    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode == null ? null : shippingCode.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getBuyerMessage() {
        return buyerMessage;
    }

    public void setBuyerMessage(String buyerMessage) {
        this.buyerMessage = buyerMessage == null ? null : buyerMessage.trim();
    }

    public String getBuyerNick() {
        return buyerNick;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick == null ? null : buyerNick.trim();
    }

    public Boolean getBuyerComment() {
        return buyerComment;
    }

    public void setBuyerComment(Boolean buyerComment) {
        this.buyerComment = buyerComment;
    }
}