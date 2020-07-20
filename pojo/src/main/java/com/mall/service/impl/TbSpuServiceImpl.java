package com.mall.service.impl;

import com.mall.entity.TbSpu;
import com.mall.dao.TbSpuDao;
import com.mall.service.TbSpuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * spu表，该表描述的是一个抽象性的商品，比如 iphone8(TbSpu)表服务实现类
 *
 * @author makejava
 * @since 2020-07-20 21:57:38
 */
@Service("tbSpuService")
public class TbSpuServiceImpl implements TbSpuService {
    @Resource
    private TbSpuDao tbSpuDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbSpu queryById(Long id) {
        return this.tbSpuDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TbSpu> queryAllByLimit(int offset, int limit) {
        return this.tbSpuDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbSpu 实例对象
     * @return 实例对象
     */
    @Override
    public TbSpu insert(TbSpu tbSpu) {
        this.tbSpuDao.insert(tbSpu);
        return tbSpu;
    }

    /**
     * 修改数据
     *
     * @param tbSpu 实例对象
     * @return 实例对象
     */
    @Override
    public TbSpu update(TbSpu tbSpu) {
        this.tbSpuDao.update(tbSpu);
        return this.queryById(tbSpu.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tbSpuDao.deleteById(id) > 0;
    }
}