package com.mall.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 服务信息表，记录微服务的id，名称，密文，用来做服务认证(TbApplication)实体类
 *
 * @author makejava
 * @since 2020-07-20 21:55:09
 */
public class TbApplication implements Serializable {
    private static final long serialVersionUID = -69743974001079690L;
    /**
    * 主键
    */
    private Integer id;
    /**
    * 服务名称
    */
    private String serviceName;
    /**
    * 密钥
    */
    private String secret;
    /**
    * 服务介绍
    */
    private String info;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 更新时间
    */
    private Date updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
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