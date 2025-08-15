package com.lets.common.mybatis;

import com.lets.common.mybatis.interfaces.ValidationPluginInterface;
import com.lets.platform.model.base.BaseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangweiyan
 * @ClassName ValidationManager
 * @Description 校验注册插件管理类
 * @Date 2024/4/9 18:11
 **/
@Component
public class ValidationManager {
    private final List<ValidationPluginInterface> plugins;

    @Autowired
    public ValidationManager(List<ValidationPluginInterface> plugins) {
        this.plugins = plugins;
    }

    public void executeAll(List<BaseEntity> entities) {
        for (ValidationPluginInterface plugin : plugins) {
            plugin.validate(entities);
        }
    }
}
