package com.mall.service.impl;

import com.mall.entity.TbApplication;
import com.mall.dao.TbApplicationDao;
import com.mall.service.TbApplicationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 服务信息表，记录微服务的id，名称，密文，用来做服务认证(TbApplication)表服务实现类
 *
 * @author makejava
 * @since 2020-07-20 21:55:09
 */
@Service("tbApplicationService")
public class TbApplicationServiceImpl implements TbApplicationService {
    @Resource
    private TbApplicationDao tbApplicationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbApplication queryById(Integer id) {
        return this.tbApplicationDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TbApplication> queryAllByLimit(int offset, int limit) {
        return this.tbApplicationDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbApplication 实例对象
     * @return 实例对象
     */
    @Override
    public TbApplication insert(TbApplication tbApplication) {
        this.tbApplicationDao.insert(tbApplication);
        return tbApplication;
    }

    /**
     * 修改数据
     *
     * @param tbApplication 实例对象
     * @return 实例对象
     */
    @Override
    public TbApplication update(TbApplication tbApplication) {
        this.tbApplicationDao.update(tbApplication);
        return this.queryById(tbApplication.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tbApplicationDao.deleteById(id) > 0;
    }
}