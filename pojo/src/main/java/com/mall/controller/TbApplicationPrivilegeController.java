package com.mall.controller;

import com.mall.entity.TbApplicationPrivilege;
import com.mall.service.TbApplicationPrivilegeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 服务中间表，记录服务id以及服务能访问的目标服务的id(TbApplicationPrivilege)表控制层
 *
 * @author makejava
 * @since 2020-07-20 21:55:39
 */
@RestController
@RequestMapping("tbApplicationPrivilege")
public class TbApplicationPrivilegeController {
    /**
     * 服务对象
     */
    @Resource
    private TbApplicationPrivilegeService tbApplicationPrivilegeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbApplicationPrivilege selectOne(Integer id) {
        return this.tbApplicationPrivilegeService.queryById(id);
    }

}