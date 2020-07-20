package com.mall.dao;

import com.mall.entity.TbSpuDetail;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TbSpuDetail)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-20 21:57:47
 */
public interface TbSpuDetailDao {

    /**
     * 通过ID查询单条数据
     *
     * @param spuId 主键
     * @return 实例对象
     */
    TbSpuDetail queryById(Long spuId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbSpuDetail> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbSpuDetail 实例对象
     * @return 对象列表
     */
    List<TbSpuDetail> queryAll(TbSpuDetail tbSpuDetail);

    /**
     * 新增数据
     *
     * @param tbSpuDetail 实例对象
     * @return 影响行数
     */
    int insert(TbSpuDetail tbSpuDetail);

    /**
     * 修改数据
     *
     * @param tbSpuDetail 实例对象
     * @return 影响行数
     */
    int update(TbSpuDetail tbSpuDetail);

    /**
     * 通过主键删除数据
     *
     * @param spuId 主键
     * @return 影响行数
     */
    int deleteById(Long spuId);

}