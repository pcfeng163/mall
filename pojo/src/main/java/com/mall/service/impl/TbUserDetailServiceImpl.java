package com.mall.service.impl;

import com.mall.entity.TbUserDetail;
import com.mall.dao.TbUserDetailDao;
import com.mall.service.TbUserDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbUserDetail)表服务实现类
 *
 * @author makejava
 * @since 2020-07-20 21:58:08
 */
@Service("tbUserDetailService")
public class TbUserDetailServiceImpl implements TbUserDetailService {
    @Resource
    private TbUserDetailDao tbUserDetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    @Override
    public TbUserDetail queryById(Long userId) {
        return this.tbUserDetailDao.queryById(userId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TbUserDetail> queryAllByLimit(int offset, int limit) {
        return this.tbUserDetailDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbUserDetail 实例对象
     * @return 实例对象
     */
    @Override
    public TbUserDetail insert(TbUserDetail tbUserDetail) {
        this.tbUserDetailDao.insert(tbUserDetail);
        return tbUserDetail;
    }

    /**
     * 修改数据
     *
     * @param tbUserDetail 实例对象
     * @return 实例对象
     */
    @Override
    public TbUserDetail update(TbUserDetail tbUserDetail) {
        this.tbUserDetailDao.update(tbUserDetail);
        return this.queryById(tbUserDetail.getUserId());
    }

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long userId) {
        return this.tbUserDetailDao.deleteById(userId) > 0;
    }
}