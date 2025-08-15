package com.lets.common.mybatis.interfaces;

import com.lets.platform.model.base.BaseEntity;

import java.util.List;

/**
 * @author zhangweiyan
 * @InterfaceName ValidationPluginInterface
 * @Description 删除插件接口
 * @Date 2024/4/9 18:09
 **/
public interface ValidationPluginInterface {
    void validate(List<BaseEntity> entities);
    default String getParentCode(String id){
         return "select parent_code from `lets-platform-common`.common_user_dict " +
                "where id in (" + id + ");";
    }
}
