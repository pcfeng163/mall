package com.mall.service;

import com.mall.entity.TbSpuDetail;
import java.util.List;

/**
 * (TbSpuDetail)表服务接口
 *
 * @author makejava
 * @since 2020-07-20 21:57:47
 */
public interface TbSpuDetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param spuId 主键
     * @return 实例对象
     */
    TbSpuDetail queryById(Long spuId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbSpuDetail> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbSpuDetail 实例对象
     * @return 实例对象
     */
    TbSpuDetail insert(TbSpuDetail tbSpuDetail);

    /**
     * 修改数据
     *
     * @param tbSpuDetail 实例对象
     * @return 实例对象
     */
    TbSpuDetail update(TbSpuDetail tbSpuDetail);

    /**
     * 通过主键删除数据
     *
     * @param spuId 主键
     * @return 是否成功
     */
    boolean deleteById(Long spuId);

}