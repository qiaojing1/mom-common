package com.lets.platform.model.adapter.entity;

import com.lets.platform.model.collection.entity.CollDeviceStatusHistory;
import lombok.Data;

import java.util.List;
import java.util.Set;

/**
 * 分割数据补偿
 * @author: DING WEI
 * @date: 2023/12/16 13:40
 */
@Data
public class AddSplitDataDto {

    private Set<String> deleteIds;

    private List<CollDeviceStatusHistory> list;

}
