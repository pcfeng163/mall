package com.mall.dao;

import com.mall.entity.TbUserDetail;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TbUserDetail)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-20 21:58:08
 */
public interface TbUserDetailDao {

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    TbUserDetail queryById(Long userId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbUserDetail> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbUserDetail 实例对象
     * @return 对象列表
     */
    List<TbUserDetail> queryAll(TbUserDetail tbUserDetail);

    /**
     * 新增数据
     *
     * @param tbUserDetail 实例对象
     * @return 影响行数
     */
    int insert(TbUserDetail tbUserDetail);

    /**
     * 修改数据
     *
     * @param tbUserDetail 实例对象
     * @return 影响行数
     */
    int update(TbUserDetail tbUserDetail);

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 影响行数
     */
    int deleteById(Long userId);

}