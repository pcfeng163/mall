package com.mall.dao;

import com.mall.entity.TbApplicationPrivilege;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 服务中间表，记录服务id以及服务能访问的目标服务的id(TbApplicationPrivilege)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-20 21:55:39
 */
public interface TbApplicationPrivilegeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param serviceId 主键
     * @return 实例对象
     */
    TbApplicationPrivilege queryById(Integer serviceId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbApplicationPrivilege> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbApplicationPrivilege 实例对象
     * @return 对象列表
     */
    List<TbApplicationPrivilege> queryAll(TbApplicationPrivilege tbApplicationPrivilege);

    /**
     * 新增数据
     *
     * @param tbApplicationPrivilege 实例对象
     * @return 影响行数
     */
    int insert(TbApplicationPrivilege tbApplicationPrivilege);

    /**
     * 修改数据
     *
     * @param tbApplicationPrivilege 实例对象
     * @return 影响行数
     */
    int update(TbApplicationPrivilege tbApplicationPrivilege);

    /**
     * 通过主键删除数据
     *
     * @param serviceId 主键
     * @return 影响行数
     */
    int deleteById(Integer serviceId);

}