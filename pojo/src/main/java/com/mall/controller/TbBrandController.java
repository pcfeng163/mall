package com.mall.controller;

import com.mall.entity.TbBrand;
import com.mall.service.TbBrandService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 品牌表，一个品牌下有多个商品（spu），一对多关系(TbBrand)表控制层
 *
 * @author makejava
 * @since 2020-07-20 21:55:49
 */
@RestController
@RequestMapping("tbBrand")
public class TbBrandController {
    /**
     * 服务对象
     */
    @Resource
    private TbBrandService tbBrandService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbBrand selectOne(Long id) {
        return this.tbBrandService.queryById(id);
    }

}