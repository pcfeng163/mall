package com.mall.controller;

import com.mall.entity.SysDept;
import com.mall.service.SysDeptService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SysDept)表控制层
 *
 * @author makejava
 * @since 2020-07-20 21:53:37
 */
@RestController
@RequestMapping("sysDept")
public class SysDeptController {
    /**
     * 服务对象
     */
    @Resource
    private SysDeptService sysDeptService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysDept selectOne(String id) {
        return this.sysDeptService.queryById(id);
    }

}