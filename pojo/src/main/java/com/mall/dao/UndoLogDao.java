package com.mall.dao;

import com.mall.entity.UndoLog;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (UndoLog)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-20 21:58:19
 */
public interface UndoLogDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UndoLog queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UndoLog> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param undoLog 实例对象
     * @return 对象列表
     */
    List<UndoLog> queryAll(UndoLog undoLog);

    /**
     * 新增数据
     *
     * @param undoLog 实例对象
     * @return 影响行数
     */
    int insert(UndoLog undoLog);

    /**
     * 修改数据
     *
     * @param undoLog 实例对象
     * @return 影响行数
     */
    int update(UndoLog undoLog);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}