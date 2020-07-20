package com.mall.entity;

import java.io.Serializable;

/**
 * 商品分类和品牌的中间表，两者是多对多关系(TbCategoryBrand)实体类
 *
 * @author makejava
 * @since 2020-07-20 21:56:28
 */
public class TbCategoryBrand implements Serializable {
    private static final long serialVersionUID = -83306093564166236L;
    /**
    * 商品类目id
    */
    private Long categoryId;
    /**
    * 品牌id
    */
    private Long brandId;


    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

}