package com.mall.service;

import com.mall.entity.TbOrderLogistics;
import java.util.List;

/**
 * (TbOrderLogistics)表服务接口
 *
 * @author makejava
 * @since 2020-07-20 21:56:58
 */
public interface TbOrderLogisticsService {

    /**
     * 通过ID查询单条数据
     *
     * @param orderId 主键
     * @return 实例对象
     */
    TbOrderLogistics queryById(Long orderId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbOrderLogistics> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbOrderLogistics 实例对象
     * @return 实例对象
     */
    TbOrderLogistics insert(TbOrderLogistics tbOrderLogistics);

    /**
     * 修改数据
     *
     * @param tbOrderLogistics 实例对象
     * @return 实例对象
     */
    TbOrderLogistics update(TbOrderLogistics tbOrderLogistics);

    /**
     * 通过主键删除数据
     *
     * @param orderId 主键
     * @return 是否成功
     */
    boolean deleteById(Long orderId);

}