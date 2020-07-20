package com.mall.service;

import com.mall.entity.TbCategory;
import java.util.List;

/**
 * 商品类目表，类目和商品(spu)是一对多关系，类目与品牌是多对多关系(TbCategory)表服务接口
 *
 * @author makejava
 * @since 2020-07-20 21:55:59
 */
public interface TbCategoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbCategory queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbCategory> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbCategory 实例对象
     * @return 实例对象
     */
    TbCategory insert(TbCategory tbCategory);

    /**
     * 修改数据
     *
     * @param tbCategory 实例对象
     * @return 实例对象
     */
    TbCategory update(TbCategory tbCategory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}