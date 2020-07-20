package com.mall.controller;

import com.mall.entity.TbSpecParam;
import com.mall.service.TbSpecParamService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 规格参数组下的参数名(TbSpecParam)表控制层
 *
 * @author makejava
 * @since 2020-07-20 21:57:26
 */
@RestController
@RequestMapping("tbSpecParam")
public class TbSpecParamController {
    /**
     * 服务对象
     */
    @Resource
    private TbSpecParamService tbSpecParamService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbSpecParam selectOne(Long id) {
        return this.tbSpecParamService.queryById(id);
    }

}