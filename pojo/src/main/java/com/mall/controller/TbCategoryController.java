package com.mall.controller;

import com.mall.entity.TbCategory;
import com.mall.service.TbCategoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 商品类目表，类目和商品(spu)是一对多关系，类目与品牌是多对多关系(TbCategory)表控制层
 *
 * @author makejava
 * @since 2020-07-20 21:56:00
 */
@RestController
@RequestMapping("tbCategory")
public class TbCategoryController {
    /**
     * 服务对象
     */
    @Resource
    private TbCategoryService tbCategoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbCategory selectOne(Long id) {
        return this.tbCategoryService.queryById(id);
    }

}