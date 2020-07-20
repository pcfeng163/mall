package com.mall.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * spu表，该表描述的是一个抽象性的商品，比如 iphone8(TbSpu)实体类
 *
 * @author makejava
 * @since 2020-07-20 21:57:38
 */
public class TbSpu implements Serializable {
    private static final long serialVersionUID = -43608328674212206L;
    /**
    * spu id
    */
    private Long id;
    /**
    * 商品名称
    */
    private String name;
    /**
    * 副标题，一般是促销信息
    */
    private String subTitle;
    /**
    * 1级类目id
    */
    private Long cid1;
    /**
    * 2级类目id
    */
    private Long cid2;
    /**
    * 3级类目id
    */
    private Long cid3;
    /**
    * 商品所属品牌id
    */
    private Long brandId;
    /**
    * 是否上架，0下架，1上架
    */
    private Object saleable;
    /**
    * 添加时间
    */
    private Date createTime;
    /**
    * 最后修改时间
    */
    private Date updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public Long getCid1() {
        return cid1;
    }

    public void setCid1(Long cid1) {
        this.cid1 = cid1;
    }

    public Long getCid2() {
        return cid2;
    }

    public void setCid2(Long cid2) {
        this.cid2 = cid2;
    }

    public Long getCid3() {
        return cid3;
    }

    public void setCid3(Long cid3) {
        this.cid3 = cid3;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Object getSaleable() {
        return saleable;
    }

    public void setSaleable(Object saleable) {
        this.saleable = saleable;
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