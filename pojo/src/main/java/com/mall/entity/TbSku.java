package com.mall.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * sku表,该表表示具体的商品实体,如黑色的 64g的iphone 8(TbSku)实体类
 *
 * @author makejava
 * @since 2020-07-20 21:57:08
 */
public class TbSku implements Serializable {
    private static final long serialVersionUID = 162038751268662274L;
    /**
    * sku id
    */
    private Long id;
    /**
    * spu id
    */
    private Long spuId;
    /**
    * 商品标题
    */
    private String title;
    /**
    * 商品的图片，多个图片以‘,’分割
    */
    private String images;
    /**
    * 库存
    */
    private Object stock;
    /**
    * 销售价格，单位为分
    */
    private Long price;
    /**
    * 特有规格属性在spu属性模板中的对应下标组合
    */
    private String indexes;
    /**
    * sku的特有规格参数键值对，json格式，反序列化时请使用linkedHashMap，保证有序
    */
    private String ownSpec;
    /**
    * 是否有效，0无效，1有效
    */
    private Object enable;
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

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Object getStock() {
        return stock;
    }

    public void setStock(Object stock) {
        this.stock = stock;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getIndexes() {
        return indexes;
    }

    public void setIndexes(String indexes) {
        this.indexes = indexes;
    }

    public String getOwnSpec() {
        return ownSpec;
    }

    public void setOwnSpec(String ownSpec) {
        this.ownSpec = ownSpec;
    }

    public Object getEnable() {
        return enable;
    }

    public void setEnable(Object enable) {
        this.enable = enable;
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