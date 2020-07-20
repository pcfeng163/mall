package com.mall.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 订单详情表(TbOrderDetail)实体类
 *
 * @author makejava
 * @since 2020-07-20 21:56:47
 */
public class TbOrderDetail implements Serializable {
    private static final long serialVersionUID = -57209174223409793L;
    /**
    * 订单详情id 
    */
    private Long id;
    /**
    * 订单id
    */
    private Long orderId;
    /**
    * sku商品id
    */
    private Long skuId;
    /**
    * 购买数量
    */
    private Integer num;
    /**
    * 商品标题
    */
    private String title;
    /**
    * 商品动态属性键值集
    */
    private String ownSpec;
    /**
    * 价格,单位：分
    */
    private Integer price;
    /**
    * 商品图片
    */
    private String image;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 更新时间
    */
    private Date updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOwnSpec() {
        return ownSpec;
    }

    public void setOwnSpec(String ownSpec) {
        this.ownSpec = ownSpec;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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