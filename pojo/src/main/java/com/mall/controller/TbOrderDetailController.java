package com.mall.controller;

import com.mall.entity.TbOrderDetail;
import com.mall.service.TbOrderDetailService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 订单详情表(TbOrderDetail)表控制层
 *
 * @author makejava
 * @since 2020-07-20 21:56:47
 */
@RestController
@RequestMapping("tbOrderDetail")
public class TbOrderDetailController {
    /**
     * 服务对象
     */
    @Resource
    private TbOrderDetailService tbOrderDetailService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbOrderDetail selectOne(Long id) {
        return this.tbOrderDetailService.queryById(id);
    }

}