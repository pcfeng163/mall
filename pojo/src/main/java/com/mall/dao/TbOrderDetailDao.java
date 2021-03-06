package com.mall.dao;

import com.mall.entity.TbOrderDetail;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 订单详情表(TbOrderDetail)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-20 21:56:47
 */
public interface TbOrderDetailDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbOrderDetail queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbOrderDetail> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbOrderDetail 实例对象
     * @return 对象列表
     */
    List<TbOrderDetail> queryAll(TbOrderDetail tbOrderDetail);

    /**
     * 新增数据
     *
     * @param tbOrderDetail 实例对象
     * @return 影响行数
     */
    int insert(TbOrderDetail tbOrderDetail);

    /**
     * 修改数据
     *
     * @param tbOrderDetail 实例对象
     * @return 影响行数
     */
    int update(TbOrderDetail tbOrderDetail);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}