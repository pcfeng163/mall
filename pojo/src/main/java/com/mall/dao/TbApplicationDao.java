package com.mall.dao;

import com.mall.entity.TbApplication;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 服务信息表，记录微服务的id，名称，密文，用来做服务认证(TbApplication)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-20 21:55:09
 */
public interface TbApplicationDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbApplication queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbApplication> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbApplication 实例对象
     * @return 对象列表
     */
    List<TbApplication> queryAll(TbApplication tbApplication);

    /**
     * 新增数据
     *
     * @param tbApplication 实例对象
     * @return 影响行数
     */
    int insert(TbApplication tbApplication);

    /**
     * 修改数据
     *
     * @param tbApplication 实例对象
     * @return 影响行数
     */
    int update(TbApplication tbApplication);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}