package com.mall.entity;

import java.io.Serializable;

/**
 * (SysDept)实体类
 *
 * @author makejava
 * @since 2020-07-20 21:53:34
 */
public class SysDept implements Serializable {
    private static final long serialVersionUID = -41755332906095632L;
    
    private String deptId;
    
    private String deptName;


    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

}