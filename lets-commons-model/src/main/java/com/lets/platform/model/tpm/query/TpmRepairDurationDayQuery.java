package com.lets.platform.model.tpm.query;

import com.lets.platform.common.pojo.constant.GlobalConstant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Collection;

/**
 * 设备维修时长统计-查询对象
 * @author: DING WEI
 * @date: 2024/12/10 9:31
 */
@Data
@ApiModel("设备维修时长统计-查询对象")
public class TpmRepairDurationDayQuery {

    @ApiModelProperty("查询类别[0按人员,1班组]")
    private Integer category = GlobalConstant.ZERO;

    @NotNull(message = "开始时间不能为空")
    @ApiModelProperty("开始日期")
    private LocalDate startDate;
    @NotNull(message = "结束时间不能为空")
    @ApiModelProperty("结束日期")
    private LocalDate endDate;

    @ApiModelProperty("设备主键")
    private String deviceId;
    private Collection<String> deviceIdList;
    @ApiModelProperty("设备编码")
    private String deviceCode;
    @ApiModelProperty("设备名称")
    private String deviceName;
    @ApiModelProperty("资产编码")
    private String assetsCode;
    @ApiModelProperty("设备类型")
    private String typeId;
    private String typeName;
    private Collection<String> typeIdList;
    @ApiModelProperty("设备型号")
    private String modelId;
    private String modelName;
    private Collection<String> modelIdList;
    @ApiModelProperty("生产单元")
    private String factoryModeId;
    private String factoryModeName;
    private Collection<String> factoryModeIdList;

    @ApiModelProperty("全域查询")
    private String keyword;
    @ApiModelProperty("所属组织")
    private Collection<String> orgIdList;
    @ApiModelProperty("所属岗位")
    private Collection<String> postIdList;
    @ApiModelProperty("所属班组")
    private Collection<String> teamIdList;
    private String userId;
    private Collection<String> userIdList;
    private String faultId;
    private Collection<String> faultIdList;

    @ApiModelProperty(hidden = true)
    private String tenancyId;

    @NotNull(message = "页码不能为空")
    @ApiModelProperty("页码")
    private Integer current;
    @NotNull(message = "大小不能为空")
    @ApiModelProperty("大小")
    private Integer size;

}
