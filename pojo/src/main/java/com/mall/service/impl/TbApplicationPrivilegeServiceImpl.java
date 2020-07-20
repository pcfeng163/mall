package com.mall.service.impl;

import com.mall.entity.TbApplicationPrivilege;
import com.mall.dao.TbApplicationPrivilegeDao;
import com.mall.service.TbApplicationPrivilegeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 服务中间表，记录服务id以及服务能访问的目标服务的id(TbApplicationPrivilege)表服务实现类
 *
 * @author makejava
 * @since 2020-07-20 21:55:39
 */
@Service("tbApplicationPrivilegeService")
public class TbApplicationPrivilegeServiceImpl implements TbApplicationPrivilegeService {
    @Resource
    private TbApplicationPrivilegeDao tbApplicationPrivilegeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param serviceId 主键
     * @return 实例对象
     */
    @Override
    public TbApplicationPrivilege queryById(Integer serviceId) {
        return this.tbApplicationPrivilegeDao.queryById(serviceId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TbApplicationPrivilege> queryAllByLimit(int offset, int limit) {
        return this.tbApplicationPrivilegeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbApplicationPrivilege 实例对象
     * @return 实例对象
     */
    @Override
    public TbApplicationPrivilege insert(TbApplicationPrivilege tbApplicationPrivilege) {
        this.tbApplicationPrivilegeDao.insert(tbApplicationPrivilege);
        return tbApplicationPrivilege;
    }

    /**
     * 修改数据
     *
     * @param tbApplicationPrivilege 实例对象
     * @return 实例对象
     */
    @Override
    public TbApplicationPrivilege update(TbApplicationPrivilege tbApplicationPrivilege) {
        this.tbApplicationPrivilegeDao.update(tbApplicationPrivilege);
        return this.queryById(tbApplicationPrivilege.getServiceId());
    }

    /**
     * 通过主键删除数据
     *
     * @param serviceId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer serviceId) {
        return this.tbApplicationPrivilegeDao.deleteById(serviceId) > 0;
    }
}