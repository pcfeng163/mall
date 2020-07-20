package com.mall.service;

import com.mall.entity.TbSpu;
import java.util.List;

/**
 * spu表，该表描述的是一个抽象性的商品，比如 iphone8(TbSpu)表服务接口
 *
 * @author makejava
 * @since 2020-07-20 21:57:38
 */
public interface TbSpuService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbSpu queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbSpu> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbSpu 实例对象
     * @return 实例对象
     */
    TbSpu insert(TbSpu tbSpu);

    /**
     * 修改数据
     *
     * @param tbSpu 实例对象
     * @return 实例对象
     */
    TbSpu update(TbSpu tbSpu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}