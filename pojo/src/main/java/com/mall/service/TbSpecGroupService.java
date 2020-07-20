package com.mall.service;

import com.mall.entity.TbSpecGroup;
import java.util.List;

/**
 * 规格参数的分组表，每个商品分类下有多个规格参数组(TbSpecGroup)表服务接口
 *
 * @author makejava
 * @since 2020-07-20 21:57:17
 */
public interface TbSpecGroupService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbSpecGroup queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbSpecGroup> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbSpecGroup 实例对象
     * @return 实例对象
     */
    TbSpecGroup insert(TbSpecGroup tbSpecGroup);

    /**
     * 修改数据
     *
     * @param tbSpecGroup 实例对象
     * @return 实例对象
     */
    TbSpecGroup update(TbSpecGroup tbSpecGroup);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}