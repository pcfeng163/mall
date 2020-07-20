package com.mall.service;

import com.mall.entity.TbUserDetail;
import java.util.List;

/**
 * (TbUserDetail)表服务接口
 *
 * @author makejava
 * @since 2020-07-20 21:58:08
 */
public interface TbUserDetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    TbUserDetail queryById(Long userId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbUserDetail> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbUserDetail 实例对象
     * @return 实例对象
     */
    TbUserDetail insert(TbUserDetail tbUserDetail);

    /**
     * 修改数据
     *
     * @param tbUserDetail 实例对象
     * @return 实例对象
     */
    TbUserDetail update(TbUserDetail tbUserDetail);

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    boolean deleteById(Long userId);

}