package com.lets.platform.model.collection.vo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author zhangweiyan
 * @ClassName CollDeviceChannelsVo
 * @Description 设备在线监控vo
 * @Date 2024/1/31 16:03
 **/
@Data
public class CollDeviceChannelsVo {
    @ApiModelProperty("生产单元")
    private String factoryModeId;
    private String factoryModeCode;
    private String factoryModeName;

    @ApiModelProperty("设备编号")
    private String deviceId;
    private String imageId;
    private String deviceImageUrl;

    @ApiModelProperty("设备编号")
    private String deviceCode;

    @ApiModelProperty("设备名称")
    private String deviceName;

    @ApiModelProperty("实验员id")
    private String testerId;

    @ApiModelProperty("实验员名称")
    private String testerName;

    @ApiModelProperty("设备整体状态")
    private String status;

    @ApiModelProperty("通道列表")
    private List<CollDeviceChannelVo> channels;
    @ApiModelProperty("通道1的数据")
    private CollDeviceChannelVo vo;
    private JSONObject map;
    private String monitorId;

}
