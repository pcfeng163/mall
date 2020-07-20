package com.mall.service;

import com.mall.entity.TbSku;
import java.util.List;

/**
 * sku表,该表表示具体的商品实体,如黑色的 64g的iphone 8(TbSku)表服务接口
 *
 * @author makejava
 * @since 2020-07-20 21:57:08
 */
public interface TbSkuService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbSku queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbSku> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbSku 实例对象
     * @return 实例对象
     */
    TbSku insert(TbSku tbSku);

    /**
     * 修改数据
     *
     * @param tbSku 实例对象
     * @return 实例对象
     */
    TbSku update(TbSku tbSku);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}