package com.mall.dao;

import com.mall.entity.TbCategoryBrand;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 商品分类和品牌的中间表，两者是多对多关系(TbCategoryBrand)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-20 21:56:28
 */
public interface TbCategoryBrandDao {

    /**
     * 通过ID查询单条数据
     *
     * @param categoryId 主键
     * @return 实例对象
     */
    TbCategoryBrand queryById(Long categoryId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbCategoryBrand> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbCategoryBrand 实例对象
     * @return 对象列表
     */
    List<TbCategoryBrand> queryAll(TbCategoryBrand tbCategoryBrand);

    /**
     * 新增数据
     *
     * @param tbCategoryBrand 实例对象
     * @return 影响行数
     */
    int insert(TbCategoryBrand tbCategoryBrand);

    /**
     * 修改数据
     *
     * @param tbCategoryBrand 实例对象
     * @return 影响行数
     */
    int update(TbCategoryBrand tbCategoryBrand);

    /**
     * 通过主键删除数据
     *
     * @param categoryId 主键
     * @return 影响行数
     */
    int deleteById(Long categoryId);

}