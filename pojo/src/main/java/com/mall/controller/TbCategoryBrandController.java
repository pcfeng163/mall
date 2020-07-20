package com.mall.controller;

import com.mall.entity.TbCategoryBrand;
import com.mall.service.TbCategoryBrandService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 商品分类和品牌的中间表，两者是多对多关系(TbCategoryBrand)表控制层
 *
 * @author makejava
 * @since 2020-07-20 21:56:28
 */
@RestController
@RequestMapping("tbCategoryBrand")
public class TbCategoryBrandController {
    /**
     * 服务对象
     */
    @Resource
    private TbCategoryBrandService tbCategoryBrandService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbCategoryBrand selectOne(Long id) {
        return this.tbCategoryBrandService.queryById(id);
    }

}