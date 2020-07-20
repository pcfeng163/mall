package com.mall.dao;

import com.mall.entity.TbSpecParam;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 规格参数组下的参数名(TbSpecParam)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-20 21:57:26
 */
public interface TbSpecParamDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbSpecParam queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbSpecParam> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbSpecParam 实例对象
     * @return 对象列表
     */
    List<TbSpecParam> queryAll(TbSpecParam tbSpecParam);

    /**
     * 新增数据
     *
     * @param tbSpecParam 实例对象
     * @return 影响行数
     */
    int insert(TbSpecParam tbSpecParam);

    /**
     * 修改数据
     *
     * @param tbSpecParam 实例对象
     * @return 影响行数
     */
    int update(TbSpecParam tbSpecParam);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}