package com.mall.service.impl;

import com.mall.entity.TbSpecGroup;
import com.mall.dao.TbSpecGroupDao;
import com.mall.service.TbSpecGroupService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 规格参数的分组表，每个商品分类下有多个规格参数组(TbSpecGroup)表服务实现类
 *
 * @author makejava
 * @since 2020-07-20 21:57:17
 */
@Service("tbSpecGroupService")
public class TbSpecGroupServiceImpl implements TbSpecGroupService {
    @Resource
    private TbSpecGroupDao tbSpecGroupDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbSpecGroup queryById(Long id) {
        return this.tbSpecGroupDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TbSpecGroup> queryAllByLimit(int offset, int limit) {
        return this.tbSpecGroupDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbSpecGroup 实例对象
     * @return 实例对象
     */
    @Override
    public TbSpecGroup insert(TbSpecGroup tbSpecGroup) {
        this.tbSpecGroupDao.insert(tbSpecGroup);
        return tbSpecGroup;
    }

    /**
     * 修改数据
     *
     * @param tbSpecGroup 实例对象
     * @return 实例对象
     */
    @Override
    public TbSpecGroup update(TbSpecGroup tbSpecGroup) {
        this.tbSpecGroupDao.update(tbSpecGroup);
        return this.queryById(tbSpecGroup.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tbSpecGroupDao.deleteById(id) > 0;
    }
}