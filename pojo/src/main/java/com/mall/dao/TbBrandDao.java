package com.mall.dao;

import com.mall.entity.TbBrand;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 品牌表，一个品牌下有多个商品（spu），一对多关系(TbBrand)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-20 21:55:49
 */
public interface TbBrandDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbBrand queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbBrand> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbBrand 实例对象
     * @return 对象列表
     */
    List<TbBrand> queryAll(TbBrand tbBrand);

    /**
     * 新增数据
     *
     * @param tbBrand 实例对象
     * @return 影响行数
     */
    int insert(TbBrand tbBrand);

    /**
     * 修改数据
     *
     * @param tbBrand 实例对象
     * @return 影响行数
     */
    int update(TbBrand tbBrand);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}