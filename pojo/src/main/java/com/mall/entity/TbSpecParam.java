package com.mall.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 规格参数组下的参数名(TbSpecParam)实体类
 *
 * @author makejava
 * @since 2020-07-20 21:57:26
 */
public class TbSpecParam implements Serializable {
    private static final long serialVersionUID = -48197406882052078L;
    /**
    * 主键
    */
    private Long id;
    /**
    * 商品分类id
    */
    private Long cid;
    
    private Long groupId;
    /**
    * 参数名
    */
    private String name;
    /**
    * 是否是数字类型参数，true或false
    */
    private Object numeric;
    /**
    * 数字类型参数的单位，非数字类型可以为空
    */
    private String unit;
    /**
    * 是否是sku通用属性，true或false
    */
    private Object generic;
    /**
    * 是否用于搜索过滤，true或false
    */
    private Object searching;
    /**
    * 数值类型参数，如果需要搜索，则添加分段间隔值，如CPU频率间隔：0.5-1.0
    */
    private String segments;
    
    private Date createTime;
    
    private Date updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getNumeric() {
        return numeric;
    }

    public void setNumeric(Object numeric) {
        this.numeric = numeric;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Object getGeneric() {
        return generic;
    }

    public void setGeneric(Object generic) {
        this.generic = generic;
    }

    public Object getSearching() {
        return searching;
    }

    public void setSearching(Object searching) {
        this.searching = searching;
    }

    public String getSegments() {
        return segments;
    }

    public void setSegments(String segments) {
        this.segments = segments;
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