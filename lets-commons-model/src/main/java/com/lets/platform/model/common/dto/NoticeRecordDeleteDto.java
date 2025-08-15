package com.lets.platform.model.common.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Set;

/**
 * @description: 预警记录删除
 * @author: DING WEI
 * @date: 2022/5/5 11:31
 */
@Data
@ApiModel("预警记录删除")
public class NoticeRecordDeleteDto {

    @ApiModelProperty("预警记录主键集合")
    private Set<String> ids;

}
