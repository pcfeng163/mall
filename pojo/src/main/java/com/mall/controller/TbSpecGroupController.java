package com.mall.controller;

import com.mall.entity.TbSpecGroup;
import com.mall.service.TbSpecGroupService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 规格参数的分组表，每个商品分类下有多个规格参数组(TbSpecGroup)表控制层
 *
 * @author makejava
 * @since 2020-07-20 21:57:17
 */
@RestController
@RequestMapping("tbSpecGroup")
public class TbSpecGroupController {
    /**
     * 服务对象
     */
    @Resource
    private TbSpecGroupService tbSpecGroupService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbSpecGroup selectOne(Long id) {
        return this.tbSpecGroupService.queryById(id);
    }

}