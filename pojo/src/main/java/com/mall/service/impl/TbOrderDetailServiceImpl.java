package com.mall.service.impl;

import com.mall.entity.TbOrderDetail;
import com.mall.dao.TbOrderDetailDao;
import com.mall.service.TbOrderDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 订单详情表(TbOrderDetail)表服务实现类
 *
 * @author makejava
 * @since 2020-07-20 21:56:47
 */
@Service("tbOrderDetailService")
public class TbOrderDetailServiceImpl implements TbOrderDetailService {
    @Resource
    private TbOrderDetailDao tbOrderDetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbOrderDetail queryById(Long id) {
        return this.tbOrderDetailDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TbOrderDetail> queryAllByLimit(int offset, int limit) {
        return this.tbOrderDetailDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbOrderDetail 实例对象
     * @return 实例对象
     */
    @Override
    public TbOrderDetail insert(TbOrderDetail tbOrderDetail) {
        this.tbOrderDetailDao.insert(tbOrderDetail);
        return tbOrderDetail;
    }

    /**
     * 修改数据
     *
     * @param tbOrderDetail 实例对象
     * @return 实例对象
     */
    @Override
    public TbOrderDetail update(TbOrderDetail tbOrderDetail) {
        this.tbOrderDetailDao.update(tbOrderDetail);
        return this.queryById(tbOrderDetail.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tbOrderDetailDao.deleteById(id) > 0;
    }
}