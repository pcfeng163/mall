package com.mall.dao;

import com.mall.entity.TbSpu;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * spu表，该表描述的是一个抽象性的商品，比如 iphone8(TbSpu)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-20 21:57:38
 */
public interface TbSpuDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbSpu queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbSpu> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbSpu 实例对象
     * @return 对象列表
     */
    List<TbSpu> queryAll(TbSpu tbSpu);

    /**
     * 新增数据
     *
     * @param tbSpu 实例对象
     * @return 影响行数
     */
    int insert(TbSpu tbSpu);

    /**
     * 修改数据
     *
     * @param tbSpu 实例对象
     * @return 影响行数
     */
    int update(TbSpu tbSpu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}