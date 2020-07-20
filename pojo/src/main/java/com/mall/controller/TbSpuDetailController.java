package com.mall.controller;

import com.mall.entity.TbSpuDetail;
import com.mall.service.TbSpuDetailService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TbSpuDetail)表控制层
 *
 * @author makejava
 * @since 2020-07-20 21:57:47
 */
@RestController
@RequestMapping("tbSpuDetail")
public class TbSpuDetailController {
    /**
     * 服务对象
     */
    @Resource
    private TbSpuDetailService tbSpuDetailService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbSpuDetail selectOne(Long id) {
        return this.tbSpuDetailService.queryById(id);
    }

}