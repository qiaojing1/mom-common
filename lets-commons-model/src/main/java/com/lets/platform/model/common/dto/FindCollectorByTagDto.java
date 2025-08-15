package com.lets.platform.model.common.dto;

import lombok.Data;

import java.util.Collection;

/**
 * 查询设备的唯一采集器
 * @author: DING WEI
 * @date: 2024/2/29 9:42
 */
@Data
public class FindCollectorByTagDto {

    private Collection<String> deviceIds;

    private String tagId;

}
