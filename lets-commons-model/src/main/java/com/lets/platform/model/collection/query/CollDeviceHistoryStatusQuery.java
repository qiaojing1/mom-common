package com.lets.platform.model.collection.query;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author zhangweiyan
 * @ClassName CollDeviceHistoryStatus
 * @Description  设备历史状态查询类
 * @Date 2023/12/8 15:47
 **/
@Data
@Api("设备历史状态查询类")
public class CollDeviceHistoryStatusQuery {
    @ApiModelProperty("生产单元主键")
    private String productUnitId;
    @ApiModelProperty("设备id")
    private String deviceId;
    @ApiModelProperty("设备id列表")
    private List<String> deviceIds;
    @ApiModelProperty("格式化后的日期 yyyy-MM-dd")
    private String date;
    @ApiModelProperty("指定要查询的状态")
    private String codes;
}
