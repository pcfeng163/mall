package com.mall.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TbSpuDetail)实体类
 *
 * @author makejava
 * @since 2020-07-20 21:57:47
 */
public class TbSpuDetail implements Serializable {
    private static final long serialVersionUID = -32492426997003379L;
    
    private Long spuId;
    /**
    * 商品描述信息
    */
    private String description;
    /**
    * 通用规格参数数据
    */
    private String genericSpec;
    /**
    * 特有规格参数及可选值信息，json格式
    */
    private String specialSpec;
    /**
    * 包装清单
    */
    private String packingList;
    /**
    * 售后服务
    */
    private String afterService;
    
    private Date createTime;
    
    private Date updateTime;


    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenericSpec() {
        return genericSpec;
    }

    public void setGenericSpec(String genericSpec) {
        this.genericSpec = genericSpec;
    }

    public String getSpecialSpec() {
        return specialSpec;
    }

    public void setSpecialSpec(String specialSpec) {
        this.specialSpec = specialSpec;
    }

    public String getPackingList() {
        return packingList;
    }

    public void setPackingList(String packingList) {
        this.packingList = packingList;
    }

    public String getAfterService() {
        return afterService;
    }

    public void setAfterService(String afterService) {
        this.afterService = afterService;
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