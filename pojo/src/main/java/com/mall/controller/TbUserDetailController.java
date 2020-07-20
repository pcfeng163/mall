package com.mall.controller;

import com.mall.entity.TbUserDetail;
import com.mall.service.TbUserDetailService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbUserDetail)表控制层
 *
 * @author makejava
 * @since 2020-07-20 21:58:08
 */
@RestController
@RequestMapping("tbUserDetail")
public class TbUserDetailController {
    /**
     * 服务对象
     */
    @Resource
    private TbUserDetailService tbUserDetailService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbUserDetail selectOne(Long id) {
        return this.tbUserDetailService.queryById(id);
    }

}