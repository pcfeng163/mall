package com.mall.service.impl;

import com.mall.entity.TbSku;
import com.mall.dao.TbSkuDao;
import com.mall.service.TbSkuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * sku表,该表表示具体的商品实体,如黑色的 64g的iphone 8(TbSku)表服务实现类
 *
 * @author makejava
 * @since 2020-07-20 21:57:08
 */
@Service("tbSkuService")
public class TbSkuServiceImpl implements TbSkuService {
    @Resource
    private TbSkuDao tbSkuDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbSku queryById(Long id) {
        return this.tbSkuDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TbSku> queryAllByLimit(int offset, int limit) {
        return this.tbSkuDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbSku 实例对象
     * @return 实例对象
     */
    @Override
    public TbSku insert(TbSku tbSku) {
        this.tbSkuDao.insert(tbSku);
        return tbSku;
    }

    /**
     * 修改数据
     *
     * @param tbSku 实例对象
     * @return 实例对象
     */
    @Override
    public TbSku update(TbSku tbSku) {
        this.tbSkuDao.update(tbSku);
        return this.queryById(tbSku.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tbSkuDao.deleteById(id) > 0;
    }
}