package com.mall.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 商品类目表，类目和商品(spu)是一对多关系，类目与品牌是多对多关系(TbCategory)实体类
 *
 * @author makejava
 * @since 2020-07-20 21:55:59
 */
public class TbCategory implements Serializable {
    private static final long serialVersionUID = 270857991147425788L;
    /**
    * 类目id
    */
    private Long id;
    /**
    * 类目名称
    */
    private String name;
    /**
    * 父类目id,顶级类目填0
    */
    private Long parentId;
    /**
    * 是否为父节点，0为否，1为是
    */
    private Object isParent;
    /**
    * 排序指数，越小越靠前
    */
    private Object sort;
    /**
    * 数据创建时间
    */
    private Date createTime;
    /**
    * 数据更新时间
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

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Object getIsParent() {
        return isParent;
    }

    public void setIsParent(Object isParent) {
        this.isParent = isParent;
    }

    public Object getSort() {
        return sort;
    }

    public void setSort(Object sort) {
        this.sort = sort;
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