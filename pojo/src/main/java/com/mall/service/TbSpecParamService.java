package com.mall.service;

import com.mall.entity.TbSpecParam;
import java.util.List;

/**
 * 规格参数组下的参数名(TbSpecParam)表服务接口
 *
 * @author makejava
 * @since 2020-07-20 21:57:26
 */
public interface TbSpecParamService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbSpecParam queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbSpecParam> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbSpecParam 实例对象
     * @return 实例对象
     */
    TbSpecParam insert(TbSpecParam tbSpecParam);

    /**
     * 修改数据
     *
     * @param tbSpecParam 实例对象
     * @return 实例对象
     */
    TbSpecParam update(TbSpecParam tbSpecParam);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}