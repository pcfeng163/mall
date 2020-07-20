package com.mall.service;

import com.mall.entity.TbApplicationPrivilege;
import java.util.List;

/**
 * 服务中间表，记录服务id以及服务能访问的目标服务的id(TbApplicationPrivilege)表服务接口
 *
 * @author makejava
 * @since 2020-07-20 21:55:39
 */
public interface TbApplicationPrivilegeService {

    /**
     * 通过ID查询单条数据
     *
     * @param serviceId 主键
     * @return 实例对象
     */
    TbApplicationPrivilege queryById(Integer serviceId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbApplicationPrivilege> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbApplicationPrivilege 实例对象
     * @return 实例对象
     */
    TbApplicationPrivilege insert(TbApplicationPrivilege tbApplicationPrivilege);

    /**
     * 修改数据
     *
     * @param tbApplicationPrivilege 实例对象
     * @return 实例对象
     */
    TbApplicationPrivilege update(TbApplicationPrivilege tbApplicationPrivilege);

    /**
     * 通过主键删除数据
     *
     * @param serviceId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer serviceId);

}