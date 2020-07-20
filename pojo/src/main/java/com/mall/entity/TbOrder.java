package com.mall.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TbOrder)实体类
 *
 * @author makejava
 * @since 2020-07-20 21:56:39
 */
public class TbOrder implements Serializable {
    private static final long serialVersionUID = -26763991313032086L;
    /**
    * 订单id
    */
    private Long orderId;
    /**
    * 总金额，单位为分
    */
    private Long totalFee;
    /**
    * 实付金额。单位:分。如:20007，表示:200元7分
    */
    private Long actualFee;
    /**
    * 优惠活动id，多个以，隔开
    */
    private String promotionIds;
    /**
    * 支付类型，1、在线支付，2、货到付款
    */
    private Object paymentType;
    /**
    * 邮费。单位:分。如:20007，表示:200元7分
    */
    private Long postFee;
    /**
    * 用户id
    */
    private Long userId;
    /**
    * 发票类型(0无发票1普通发票，2电子发票，3增值税发票)
    */
    private Integer invoiceType;
    /**
    * 订单来源：1:app端，2：pc端，3：微信端
    */
    private Integer sourceType;
    /**
    * 订单的状态，1、未付款 2、已付款,未发货 3、已发货,未确认 4、确认收货，交易成功 5、交易取消，订单关闭 6、交易结束，已评价
    */
    private Object status;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 支付时间
    */
    private Date payTime;
    /**
    * 发货时间
    */
    private Date consignTime;
    /**
    * 交易完成时间
    */
    private Date endTime;
    /**
    * 交易关闭时间
    */
    private Date closeTime;
    /**
    * 评价时间
    */
    private Date commentTime;
    /**
    * 更新时间
    */
    private Date updateTime;


    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Long totalFee) {
        this.totalFee = totalFee;
    }

    public Long getActualFee() {
        return actualFee;
    }

    public void setActualFee(Long actualFee) {
        this.actualFee = actualFee;
    }

    public String getPromotionIds() {
        return promotionIds;
    }

    public void setPromotionIds(String promotionIds) {
        this.promotionIds = promotionIds;
    }

    public Object getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Object paymentType) {
        this.paymentType = paymentType;
    }

    public Long getPostFee() {
        return postFee;
    }

    public void setPostFee(Long postFee) {
        this.postFee = postFee;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Integer invoiceType) {
        this.invoiceType = invoiceType;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
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

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}