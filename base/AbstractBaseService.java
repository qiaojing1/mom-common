package com.lets.platform.common.pojo.base;

import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.util.IdUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 持久层接口的默认实现
 * @Author DING WEI
 * @Date 2021/04/23 10:07
 * @Version 1.0
 **/
public abstract class AbstractBaseService<T, V, D extends BaseDo> implements BaseService<T, V> {

    protected BaseDao<D> dao;

    /**
     * 抽象初始化实例对象
     * @param
     * @throws
     * @author DING WEI
     * @Date 2021/04/23 10:07
     */
    public abstract void setDao();

    /**
     * 将数据传输对象转换成表实体对象
     * @param t  数据传输对象
     * @return D 表实体对象
     * @throws
     * @author DING WEI
     * @Date 2021/04/23 10:07
     */
    public abstract D dtoToDo(T t);

    /**
     * 将Do转成Vo
     * @param d 实体对象
     * @return V 展示对象
     * @throws
     * @author DING WEI
     * @Date 2021/04/23 10:07
     */
    public abstract V doToVo(D d);

    /**
     * 实体数据校验
     * @param d 实体对象
     * @return
     * @throws
     * @author DING WEI
     * @Date 2021/04/23 10:07
     */
    public abstract void checkEntity(D d);

    @Override
    public String save(T t) {
        D d = this.dtoToDo(t);
        if (d.getCreateTime() == null) {
            d.setCreateTime(System.currentTimeMillis());
        }
        if (StringUtils.isBlank(d.getCode())) {
            d.setCode(IdUtil.getUUID());
        }
        if (StringUtils.isBlank(d.getCreateUser())) {
            d.setCreateUser(GlobalConstant.ZERO_STR);
        }
        d.setUpdateTime(d.getCreateTime());
        d.setUpdateUser(d.getCreateUser());
        this.checkEntity(d);
        this.dao.save(d);
        return d.getId();
    }

    @Override
    public List<String> saveBatch(List<T> list) {
        List<String> idList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(list)) {
            List<D> ds = this.dtoToDos(list);
            dao.batSave(ds);
            idList = ds.stream().map(D::getId).collect(Collectors.toList());
        }
        return idList;
    }

    @Override
    public Integer updateById(T t) {
        D d = this.dtoToDo(t);
        this.checkEntity(d);
        d.setUpdateTime(System.currentTimeMillis());
        return this.dao.update(d);
    }

    @Override
    public V findById(String id) {
      return this.doToVo(this.dao.findById(id));
    }

    @Override
    public List<V> findAll() {
        return this.doToVos(this.dao.findAll());
    }

    @Override
    public Integer deleteById(String id) {
        return this.dao.delete(id);
    }

    /**
     * 批量将do转换成Vo
     * @param list 实体集合
     * @return List<V> 展示对集合
     * @throws
     * @author DING WEI
     * @Date 2021/04/23 10:07
     */
    public List<V> doToVos(List<D> list) {
       return list.stream().filter(Objects::nonNull)
                .map(x -> this.doToVo(x))
                .collect(Collectors.toList());
    }

    /**
     * 批量将dto转换成do
     * @param list 实体集合
     * @return List<V> 展示对集合
     * @throws
     * @author DING WEI
     * @Date 2021/04/23 10:07
     */
    public List<D> dtoToDos(List<T> list) {
        return list.stream().filter(Objects::nonNull)
                .map(x -> this.dtoToDo(x))
                .collect(Collectors.toList());
    }
}