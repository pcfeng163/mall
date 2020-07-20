package com.mall.controller;

import com.mall.entity.TbOrderLogistics;
import com.mall.service.TbOrderLogisticsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbOrderLogistics)表控制层
 *
 * @author makejava
 * @since 2020-07-20 21:56:58
 */
@RestController
@RequestMapping("tbOrderLogistics")
public class TbOrderLogisticsController {
    /**
     * 服务对象
     */
    @Resource
    private TbOrderLogisticsService tbOrderLogisticsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbOrderLogistics selectOne(Long id) {
        return this.tbOrderLogisticsService.queryById(id);
    }

}