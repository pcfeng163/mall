package com.mall.service.impl;

import com.mall.entity.TbCategoryBrand;
import com.mall.dao.TbCategoryBrandDao;
import com.mall.service.TbCategoryBrandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品分类和品牌的中间表，两者是多对多关系(TbCategoryBrand)表服务实现类
 *
 * @author makejava
 * @since 2020-07-20 21:56:28
 */
@Service("tbCategoryBrandService")
public class TbCategoryBrandServiceImpl implements TbCategoryBrandService {
    @Resource
    private TbCategoryBrandDao tbCategoryBrandDao;

    /**
     * 通过ID查询单条数据
     *
     * @param categoryId 主键
     * @return 实例对象
     */
    @Override
    public TbCategoryBrand queryById(Long categoryId) {
        return this.tbCategoryBrandDao.queryById(categoryId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TbCategoryBrand> queryAllByLimit(int offset, int limit) {
        return this.tbCategoryBrandDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbCategoryBrand 实例对象
     * @return 实例对象
     */
    @Override
    public TbCategoryBrand insert(TbCategoryBrand tbCategoryBrand) {
        this.tbCategoryBrandDao.insert(tbCategoryBrand);
        return tbCategoryBrand;
    }

    /**
     * 修改数据
     *
     * @param tbCategoryBrand 实例对象
     * @return 实例对象
     */
    @Override
    public TbCategoryBrand update(TbCategoryBrand tbCategoryBrand) {
        this.tbCategoryBrandDao.update(tbCategoryBrand);
        return this.queryById(tbCategoryBrand.getCategoryId());
    }

    /**
     * 通过主键删除数据
     *
     * @param categoryId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long categoryId) {
        return this.tbCategoryBrandDao.deleteById(categoryId) > 0;
    }
}