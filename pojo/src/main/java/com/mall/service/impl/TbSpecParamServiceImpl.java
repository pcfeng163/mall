package com.mall.service.impl;

import com.mall.entity.TbSpecParam;
import com.mall.dao.TbSpecParamDao;
import com.mall.service.TbSpecParamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 规格参数组下的参数名(TbSpecParam)表服务实现类
 *
 * @author makejava
 * @since 2020-07-20 21:57:26
 */
@Service("tbSpecParamService")
public class TbSpecParamServiceImpl implements TbSpecParamService {
    @Resource
    private TbSpecParamDao tbSpecParamDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbSpecParam queryById(Long id) {
        return this.tbSpecParamDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TbSpecParam> queryAllByLimit(int offset, int limit) {
        return this.tbSpecParamDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbSpecParam 实例对象
     * @return 实例对象
     */
    @Override
    public TbSpecParam insert(TbSpecParam tbSpecParam) {
        this.tbSpecParamDao.insert(tbSpecParam);
        return tbSpecParam;
    }

    /**
     * 修改数据
     *
     * @param tbSpecParam 实例对象
     * @return 实例对象
     */
    @Override
    public TbSpecParam update(TbSpecParam tbSpecParam) {
        this.tbSpecParamDao.update(tbSpecParam);
        return this.queryById(tbSpecParam.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tbSpecParamDao.deleteById(id) > 0;
    }
}