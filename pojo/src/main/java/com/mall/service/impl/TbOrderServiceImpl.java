package com.mall.service.impl;

import com.mall.entity.TbOrder;
import com.mall.dao.TbOrderDao;
import com.mall.service.TbOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbOrder)表服务实现类
 *
 * @author makejava
 * @since 2020-07-20 21:56:39
 */
@Service("tbOrderService")
public class TbOrderServiceImpl implements TbOrderService {
    @Resource
    private TbOrderDao tbOrderDao;

    /**
     * 通过ID查询单条数据
     *
     * @param orderId 主键
     * @return 实例对象
     */
    @Override
    public TbOrder queryById(Long orderId) {
        return this.tbOrderDao.queryById(orderId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TbOrder> queryAllByLimit(int offset, int limit) {
        return this.tbOrderDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbOrder 实例对象
     * @return 实例对象
     */
    @Override
    public TbOrder insert(TbOrder tbOrder) {
        this.tbOrderDao.insert(tbOrder);
        return tbOrder;
    }

    /**
     * 修改数据
     *
     * @param tbOrder 实例对象
     * @return 实例对象
     */
    @Override
    public TbOrder update(TbOrder tbOrder) {
        this.tbOrderDao.update(tbOrder);
        return this.queryById(tbOrder.getOrderId());
    }

    /**
     * 通过主键删除数据
     *
     * @param orderId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long orderId) {
        return this.tbOrderDao.deleteById(orderId) > 0;
    }
}