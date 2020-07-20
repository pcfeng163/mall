package com.mall.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 服务中间表，记录服务id以及服务能访问的目标服务的id(TbApplicationPrivilege)实体类
 *
 * @author makejava
 * @since 2020-07-20 21:55:39
 */
public class TbApplicationPrivilege implements Serializable {
    private static final long serialVersionUID = -61425417486653346L;
    /**
    * 服务id
    */
    private Integer serviceId;
    /**
    * 目标服务id
    */
    private Integer targetId;
    /**
    * 创建时间
    */
    private Date createTime;


    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getTargetId() {
        return targetId;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}