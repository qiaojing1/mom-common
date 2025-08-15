package com.lets.platform.model.common.query;

import com.lets.platform.common.pojo.base.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;
import java.util.Set;

/**
 * 工序定义Query
 */
@Data
@ApiModel("工序定义查询条件")
public class ProcessQuery extends PageQuery {

    @ApiModelProperty(value = "工序编码")
    private String code;

    @ApiModelProperty(value = "报工方式")
    private String reportWay;

    @ApiModelProperty(value = "质检标准编码")
    private String checkStandardCode;
    private String checkStandardId;
    @ApiModelProperty(hidden = true)
    private Set<String> checkStandardIds;

    @ApiModelProperty(value = "状态")
    private String status;
    @ApiModelProperty(hidden = true)
    private String name;

    @ApiModelProperty(hidden = true)
    private String tenancyId;
    @ApiModelProperty(value = "工序id")
    private String id;
    @ApiModelProperty(hidden = true)
    private Set<String> modeIdSet;
    @ApiModelProperty(value = "生产单元")
    private String modeIds;
    @ApiModelProperty(value = "设备编码")
    private String deviceCode;
    @ApiModelProperty(value = "设备名称")
    private String deviceName;
    @ApiModelProperty(value = "设备类型")
    private String deviceType;
    @ApiModelProperty(value = "设备型号")
    private String deviceModel;
    @ApiModelProperty(hidden = true)
    private Set<String> deviceIds;

    private List<String> codesEqual;

}
