package com.lets.platform.common.pojo.base;

import java.util.List;

/**
 * 公用数据库操作模块
 * @Author DING WEI
 * @Date 2021/04/23 13:50
 * @Version 1.0
 **/
public interface BaseDao<D> {

    /**
     * 保存表实体对象
     *
     * @param d 用户表实体对象
     * @return Long 主键
     * @throws
     * @author DING WEI
     * @date 2021/4/23 11:28
     */
    void save(D d);

    /**
     * 批量保存
     * @param list
     * @return
     * @Author DING WEI
     * @Date 2021/4/23 11:28
     * @Version 1.0
     **/
    void batSave(List<D> list);

    /**
     * 通过主键查找实体对象
     *
     * @param id 主键
     * @return V 数据展示对象
     * @throws
     * @author DING WEI
     * @date 2021/4/23 11:28
     */
    D findById(String id);

    /**
     * 通过主键删除实体
     *
     * @param id 主键
     * @return
     * @throws
     * @author DING WEI
     * @date 2021/4/23 11:28
     */
    Integer delete(String id);

    /**
     * 更新实体表对象
     *
     * @param d 实体表对象
     * @return
     * @throws
     * @author DING WEI
     * @date 2021/4/23 11:28
     */
    Integer update(D d);

    /**
     * 查询所有
     * @return List<D>
     * @throws
     * @author DING WEI
     * @date 2021/4/23 11:28
     */
    List<D> findAll();

}

