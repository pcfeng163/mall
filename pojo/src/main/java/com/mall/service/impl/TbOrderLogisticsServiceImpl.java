package com.mall.service.impl;

import com.mall.entity.TbOrderLogistics;
import com.mall.dao.TbOrderLogisticsDao;
import com.mall.service.TbOrderLogisticsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbOrderLogistics)表服务实现类
 *
 * @author makejava
 * @since 2020-07-20 21:56:58
 */
@Service("tbOrderLogisticsService")
public class TbOrderLogisticsServiceImpl implements TbOrderLogisticsService {
    @Resource
    private TbOrderLogisticsDao tbOrderLogisticsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param orderId 主键
     * @return 实例对象
     */
    @Override
    public TbOrderLogistics queryById(Long orderId) {
        return this.tbOrderLogisticsDao.queryById(orderId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TbOrderLogistics> queryAllByLimit(int offset, int limit) {
        return this.tbOrderLogisticsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbOrderLogistics 实例对象
     * @return 实例对象
     */
    @Override
    public TbOrderLogistics insert(TbOrderLogistics tbOrderLogistics) {
        this.tbOrderLogisticsDao.insert(tbOrderLogistics);
        return tbOrderLogistics;
    }

    /**
     * 修改数据
     *
     * @param tbOrderLogistics 实例对象
     * @return 实例对象
     */
    @Override
    public TbOrderLogistics update(TbOrderLogistics tbOrderLogistics) {
        this.tbOrderLogisticsDao.update(tbOrderLogistics);
        return this.queryById(tbOrderLogistics.getOrderId());
    }

    /**
     * 通过主键删除数据
     *
     * @param orderId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long orderId) {
        return this.tbOrderLogisticsDao.deleteById(orderId) > 0;
    }
}