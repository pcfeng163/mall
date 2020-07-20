package com.mall.controller;

import com.mall.entity.TbOrder;
import com.mall.service.TbOrderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbOrder)表控制层
 *
 * @author makejava
 * @since 2020-07-20 21:56:39
 */
@RestController
@RequestMapping("tbOrder")
public class TbOrderController {
    /**
     * 服务对象
     */
    @Resource
    private TbOrderService tbOrderService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbOrder selectOne(Long id) {
        return this.tbOrderService.queryById(id);
    }

}