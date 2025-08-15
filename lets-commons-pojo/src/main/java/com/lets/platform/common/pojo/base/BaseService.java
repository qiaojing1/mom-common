package com.lets.platform.common.pojo.base;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈公用的Server方法〉
 * T 数据传输对象 DTO
 * V 数据展示对象 VO
 * @author DING WEI
 * @create 2021/1/28 10:04
 * @since 1.0.0
 */
public interface BaseService<T, V> {

    /**
     * 保存实体对象
     * @param t 数据传输对象
     * @return long 主键id
     * @throws
     * @author DING WEI
     * @Date 2021/04/23 10:04
     */
    String save(T t);

    /**
     * 更新实体对象
     * @param t 数据传输对象
     * @return long 主键id
     * @throws
     * @author DING WEI
     * @Date 2021/04/23 10:04
     */
    Integer updateById(T t);

    /**
     * 通过主键删除实体对象
     * @param id 主键
     * @return boolean
     * @throws
     * @author DING WEI
     * @Date 2021/04/23 10:04
     */
    Integer deleteById(String id);

    /**
     * 通过主键查找实体对象
     * @param id
     * @return V 实体展示对象
     * @throws
     * @author DING WEI
     * @Date 2021/04/23 10:04
     */
    V findById(String id);

    /**
     * 查询所有，缓存使用
     * @return List<UserVo>
     * @throws
     * @author DING WEI
     * @Date 2021/04/23 10:04
     */
    List<V> findAll();

    /**
     * 批量保存实体
     * @param list dto集合
     * @return 
     * @throws
     * @author DING WEI
     * @Date 2021/04/23 10:04
     */
    List<String> saveBatch(List<T> list);

}
