package com.lets.platform.model.uc.entity;

import lombok.Data;

/**
 * select_repeat
 * @author: DING WEI
 * @date: 2023/7/11 11:49
 */
@Data
public class InitTenancyConfigSubDto {

    private String code;
    private String name;
    private String basic_unit;
    private String sql;
    private String execute;

}
