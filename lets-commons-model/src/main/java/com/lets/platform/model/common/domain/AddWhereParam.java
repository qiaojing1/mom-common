package com.lets.platform.model.common.domain;

import lombok.Data;

/**
 * Sql语句添加查询条件
 * @author: DING WEI
 * @date: 2022/7/7 13:56
 */
@Data
public class AddWhereParam {

    private String fieldName;

    private String fieldType;

    private String value;

    public AddWhereParam() {
    }

    public AddWhereParam(String fieldName, String fieldType, String value) {
        this.fieldName = fieldName;
        this.fieldType = fieldType;
        this.value = value;
    }
}
