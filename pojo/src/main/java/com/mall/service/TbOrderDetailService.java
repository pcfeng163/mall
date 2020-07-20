package com.mall.service;

import com.mall.entity.TbOrderDetail;
import java.util.List;

/**
 * 订单详情表(TbOrderDetail)表服务接口
 *
 * @author makejava
 * @since 2020-07-20 21:56:47
 */
public interface TbOrderDetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbOrderDetail queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbOrderDetail> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbOrderDetail 实例对象
     * @return 实例对象
     */
    TbOrderDetail insert(TbOrderDetail tbOrderDetail);

    /**
     * 修改数据
     *
     * @param tbOrderDetail 实例对象
     * @return 实例对象
     */
    TbOrderDetail update(TbOrderDetail tbOrderDetail);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}