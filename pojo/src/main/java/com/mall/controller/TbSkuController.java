package com.mall.controller;

import com.mall.entity.TbSku;
import com.mall.service.TbSkuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * sku表,该表表示具体的商品实体,如黑色的 64g的iphone 8(TbSku)表控制层
 *
 * @author makejava
 * @since 2020-07-20 21:57:08
 */
@RestController
@RequestMapping("tbSku")
public class TbSkuController {
    /**
     * 服务对象
     */
    @Resource
    private TbSkuService tbSkuService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbSku selectOne(Long id) {
        return this.tbSkuService.queryById(id);
    }

}