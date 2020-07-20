package com.mall.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 品牌表，一个品牌下有多个商品（spu），一对多关系(TbBrand)实体类
 *
 * @author makejava
 * @since 2020-07-20 21:55:49
 */
public class TbBrand implements Serializable {
    private static final long serialVersionUID = 326171248924097503L;
    /**
    * 品牌id
    */
    private Long id;
    /**
    * 品牌名称
    */
    private String name;
    /**
    * 品牌图片地址
    */
    private String image;
    /**
    * 品牌的首字母
    */
    private String letter;
    
    private Date createTime;
    
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
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