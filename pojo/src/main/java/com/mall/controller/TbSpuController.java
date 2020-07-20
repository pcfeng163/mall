package com.mall.controller;

import com.mall.entity.TbSpu;
import com.mall.service.TbSpuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * spu表，该表描述的是一个抽象性的商品，比如 iphone8(TbSpu)表控制层
 *
 * @author makejava
 * @since 2020-07-20 21:57:38
 */
@RestController
@RequestMapping("tbSpu")
public class TbSpuController {
    /**
     * 服务对象
     */
    @Resource
    private TbSpuService tbSpuService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbSpu selectOne(Long id) {
        return this.tbSpuService.queryById(id);
    }

}