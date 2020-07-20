package com.mall.service;

import com.mall.entity.TbApplication;
import java.util.List;

/**
 * 服务信息表，记录微服务的id，名称，密文，用来做服务认证(TbApplication)表服务接口
 *
 * @author makejava
 * @since 2020-07-20 21:55:09
 */
public interface TbApplicationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbApplication queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbApplication> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbApplication 实例对象
     * @return 实例对象
     */
    TbApplication insert(TbApplication tbApplication);

    /**
     * 修改数据
     *
     * @param tbApplication 实例对象
     * @return 实例对象
     */
    TbApplication update(TbApplication tbApplication);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}