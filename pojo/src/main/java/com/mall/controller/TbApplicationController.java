package com.mall.controller;

import com.mall.entity.TbApplication;
import com.mall.service.TbApplicationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 服务信息表，记录微服务的id，名称，密文，用来做服务认证(TbApplication)表控制层
 *
 * @author makejava
 * @since 2020-07-20 21:55:09
 */
@RestController
@RequestMapping("tbApplication")
public class TbApplicationController {
    /**
     * 服务对象
     */
    @Resource
    private TbApplicationService tbApplicationService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbApplication selectOne(Integer id) {
        return this.tbApplicationService.queryById(id);
    }

}