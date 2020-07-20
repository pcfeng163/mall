package com.mall.dao;

import com.mall.entity.TbSpecGroup;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 规格参数的分组表，每个商品分类下有多个规格参数组(TbSpecGroup)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-20 21:57:17
 */
public interface TbSpecGroupDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbSpecGroup queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbSpecGroup> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbSpecGroup 实例对象
     * @return 对象列表
     */
    List<TbSpecGroup> queryAll(TbSpecGroup tbSpecGroup);

    /**
     * 新增数据
     *
     * @param tbSpecGroup 实例对象
     * @return 影响行数
     */
    int insert(TbSpecGroup tbSpecGroup);

    /**
     * 修改数据
     *
     * @param tbSpecGroup 实例对象
     * @return 影响行数
     */
    int update(TbSpecGroup tbSpecGroup);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}