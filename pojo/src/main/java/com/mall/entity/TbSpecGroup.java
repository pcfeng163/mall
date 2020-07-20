package com.mall.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 规格参数的分组表，每个商品分类下有多个规格参数组(TbSpecGroup)实体类
 *
 * @author makejava
 * @since 2020-07-20 21:57:17
 */
public class TbSpecGroup implements Serializable {
    private static final long serialVersionUID = 268553934547774264L;
    /**
    * 主键
    */
    private Long id;
    /**
    * 商品分类id，一个分类下有多个规格组
    */
    private Long cid;
    /**
    * 规格组的名称
    */
    private String name;
    
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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