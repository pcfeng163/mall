package com.mall.service.impl;

import com.mall.entity.TbBrand;
import com.mall.dao.TbBrandDao;
import com.mall.service.TbBrandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 品牌表，一个品牌下有多个商品（spu），一对多关系(TbBrand)表服务实现类
 *
 * @author makejava
 * @since 2020-07-20 21:55:49
 */
@Service("tbBrandService")
public class TbBrandServiceImpl implements TbBrandService {
    @Resource
    private TbBrandDao tbBrandDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbBrand queryById(Long id) {
        return this.tbBrandDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TbBrand> queryAllByLimit(int offset, int limit) {
        return this.tbBrandDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbBrand 实例对象
     * @return 实例对象
     */
    @Override
    public TbBrand insert(TbBrand tbBrand) {
        this.tbBrandDao.insert(tbBrand);
        return tbBrand;
    }

    /**
     * 修改数据
     *
     * @param tbBrand 实例对象
     * @return 实例对象
     */
    @Override
    public TbBrand update(TbBrand tbBrand) {
        this.tbBrandDao.update(tbBrand);
        return this.queryById(tbBrand.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tbBrandDao.deleteById(id) > 0;
    }
}