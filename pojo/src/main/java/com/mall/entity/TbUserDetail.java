package com.mall.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TbUserDetail)实体类
 *
 * @author makejava
 * @since 2020-07-20 21:58:08
 */
public class TbUserDetail implements Serializable {
    private static final long serialVersionUID = 909251530953999080L;
    /**
    * 用户id、与user表1对1
    */
    private Long userId;
    /**
    * 用户名
    */
    private String username;
    /**
    * 昵称
    */
    private String email;
    /**
    * 性别
    */
    private String gender;
    /**
    * 年
    */
    private String year;
    /**
    * 月
    */
    private String month;
    /**
    * 天
    */
    private String day;
    /**
    * 省
    */
    private String province1;
    /**
    * 市
    */
    private String city1;
    /**
    * 区
    */
    private String district1;
    /**
    * 工作、职业
    */
    private String work;
    /**
    * 用户头像的图片，多个图片以‘,’分割
    */
    private String images;
    /**
    * 更新时间
    */
    private Date updateTime;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getProvince1() {
        return province1;
    }

    public void setProvince1(String province1) {
        this.province1 = province1;
    }

    public String getCity1() {
        return city1;
    }

    public void setCity1(String city1) {
        this.city1 = city1;
    }

    public String getDistrict1() {
        return district1;
    }

    public void setDistrict1(String district1) {
        this.district1 = district1;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}