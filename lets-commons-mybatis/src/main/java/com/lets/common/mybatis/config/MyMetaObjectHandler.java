package com.lets.common.mybatis.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.lets.commons.security.pojo.User;
import com.lets.commons.security.util.SecurityUtils;
import com.lets.platform.common.pojo.enums.YesOrNo;
import com.lets.platform.model.adapter.util.SplitUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Objects;

@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        LocalDateTime now = LocalDateTime.now(SplitUtil.shangHai);
        this.strictInsertFill(metaObject, "createTime", LocalDateTime.class, now);
        this.strictInsertFill(metaObject, "updateTime", LocalDateTime.class, now);
        this.strictInsertFill(metaObject, "deleted", String.class, YesOrNo.NO.getValue());
        User principal = null;
        try {
            principal = SecurityUtils.getPrincipal();
        } catch (Exception ignored) {
        }
        if (Objects.nonNull(principal)) {
            String userId = principal.getId();
            String name = "[" + principal.getUsername() + "]" + principal.getName();
            String tenancyId = principal.getTenancyId();
            this.strictInsertFill(metaObject, "createUser", String.class, userId);
            this.strictInsertFill(metaObject, "createUserName", String.class, name);
            this.strictInsertFill(metaObject, "updateUser", String.class, userId);
            this.strictInsertFill(metaObject, "updateUserName", String.class, name);
            this.strictInsertFill(metaObject, "tenancyId", String.class, tenancyId);
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.strictUpdateFill(metaObject, "updateTime", LocalDateTime.class, LocalDateTime.now(SplitUtil.shangHai));
        User principal = null;
        try {
            principal = SecurityUtils.getPrincipal();
        } catch (Exception ignored) {
        }
        if (Objects.nonNull(principal)) {
            String userId = principal.getId();
            String name = "[" + principal.getUsername() + "]" + principal.getName();
            this.strictUpdateFill(metaObject, "updateUser", String.class, userId);
            this.strictUpdateFill(metaObject, "updateUserName", String.class, name);
        }
    }

}
