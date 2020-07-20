package com.mall.service.impl;

import com.mall.entity.TbSpuDetail;
import com.mall.dao.TbSpuDetailDao;
import com.mall.service.TbSpuDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbSpuDetail)表服务实现类
 *
 * @author makejava
 * @since 2020-07-20 21:57:47
 */
@Service("tbSpuDetailService")
public class TbSpuDetailServiceImpl implements TbSpuDetailService {
    @Resource
    private TbSpuDetailDao tbSpuDetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param spuId 主键
     * @return 实例对象
     */
    @Override
    public TbSpuDetail queryById(Long spuId) {
        return this.tbSpuDetailDao.queryById(spuId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TbSpuDetail> queryAllByLimit(int offset, int limit) {
        return this.tbSpuDetailDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbSpuDetail 实例对象
     * @return 实例对象
     */
    @Override
    public TbSpuDetail insert(TbSpuDetail tbSpuDetail) {
        this.tbSpuDetailDao.insert(tbSpuDetail);
        return tbSpuDetail;
    }

    /**
     * 修改数据
     *
     * @param tbSpuDetail 实例对象
     * @return 实例对象
     */
    @Override
    public TbSpuDetail update(TbSpuDetail tbSpuDetail) {
        this.tbSpuDetailDao.update(tbSpuDetail);
        return this.queryById(tbSpuDetail.getSpuId());
    }

    /**
     * 通过主键删除数据
     *
     * @param spuId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long spuId) {
        return this.tbSpuDetailDao.deleteById(spuId) > 0;
    }
}