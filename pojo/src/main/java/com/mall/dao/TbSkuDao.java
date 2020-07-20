package com.mall.dao;

import com.mall.entity.TbSku;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * sku表,该表表示具体的商品实体,如黑色的 64g的iphone 8(TbSku)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-20 21:57:08
 */
public interface TbSkuDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbSku queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbSku> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbSku 实例对象
     * @return 对象列表
     */
    List<TbSku> queryAll(TbSku tbSku);

    /**
     * 新增数据
     *
     * @param tbSku 实例对象
     * @return 影响行数
     */
    int insert(TbSku tbSku);

    /**
     * 修改数据
     *
     * @param tbSku 实例对象
     * @return 影响行数
     */
    int update(TbSku tbSku);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}