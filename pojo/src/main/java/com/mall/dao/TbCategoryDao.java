package com.mall.dao;

import com.mall.entity.TbCategory;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 商品类目表，类目和商品(spu)是一对多关系，类目与品牌是多对多关系(TbCategory)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-20 21:55:59
 */
public interface TbCategoryDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbCategory queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbCategory> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbCategory 实例对象
     * @return 对象列表
     */
    List<TbCategory> queryAll(TbCategory tbCategory);

    /**
     * 新增数据
     *
     * @param tbCategory 实例对象
     * @return 影响行数
     */
    int insert(TbCategory tbCategory);

    /**
     * 修改数据
     *
     * @param tbCategory 实例对象
     * @return 影响行数
     */
    int update(TbCategory tbCategory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}