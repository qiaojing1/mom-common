package com.lets.platform.model.common.dto;

import com.lets.platform.model.common.entity.CommonNoticeRecord;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CommonNoticeRecordJobDto
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2023/12/1
 */
@Data
public class CommonNoticeRecordJobDto {
    private List<CommonNoticeRecord> saveList;
    private List<CommonNoticeRecord> updateEndTimeList;
    private List<CommonNoticeRecord> updateDealTimeList;
    private List<CommonNoticeRecord> messagesList;
}
