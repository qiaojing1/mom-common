package com.lets.platform.model.uc.entity;

import lombok.Data;

import java.util.List;

/**
 * InitTenancyConfigDto
 * @author: DING WEI
 * @date: 2023/4/23 10:34
 */
@Data
public class InitTenancyConfigDto {

    private InitTenancyConfigSubDto delete;
    private InitTenancyConfigSubDto select_repeat;
    private List<InitTenancyConfigSubDto> insert;
    private List<String> successIds;

    private String tenancyId;
    private String userIdInSql;
    private String nameInSql;
    private String nowFormatInSql;
    private String principalUserId;
    private String principalName;
    private SysTenancy tenancy;
}
