package com.lets.platform.model.device.query;

import com.lets.platform.common.pojo.base.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * 设备查询参数
 *
 * @version 1.0
 * @ClassName DeviceQuery
 * @author: DING WEI
 * @create: 2021/05/13 15:13
 **/
@Data
@ApiModel("设备查询参数")
public class DeviceQuery extends PageQuery {

    @ApiModelProperty("设备名称")
    private String deviceName;

    @ApiModelProperty("设备编码")
    private String code;
    private Set<String> codes;

    @ApiModelProperty("使用部门")
    private String useDept;
    private String useDeptCode;
    @ApiModelProperty("维保部门")
    private String maintenanceDept;
    @ApiModelProperty(hidden = true)
    private Collection<String> maintenanceDepts;

    @ApiModelProperty("设备类型")
    private String typeId;
    private Set<String> typeIds;
    private String notTypeClassify;
    @ApiModelProperty(hidden = true)
    private List<String> typeClassifies;

    @ApiModelProperty("设备型号")
    private String modelId;

    @ApiModelProperty("生产单元id")
    private String factoryModeId;

    @ApiModelProperty("生产单元id")
    private Set<String> factoryModeIds;

    private Set<String> modelIds;

    @ApiModelProperty("资产状态")
    private String assetsStatus;
    private Set<String> unAssetsStatus;

    @ApiModelProperty("物联状态")
    private String internetStatus;

    @ApiModelProperty("工位机主键")
    private String stationMachineId;

    @ApiModelProperty(hidden = true)
    private String tenancyId;

    @ApiModelProperty(hidden = true)
    private Set<String> deviceIdSet;

    @ApiModelProperty(hidden = true)
    private Set<String> unDeviceIdSet;

    @ApiModelProperty(hidden = true)
    private Set<String> deviceIdSetOr;
    @ApiModelProperty(hidden = true)
    private String keyWork;

    private String nameOrCode;
    @ApiModelProperty("设备分类类型 1:电表 2:气表,4:气表  3:水表  5:其他设备")
    private String typeClassify;

    @ApiModelProperty("控制器id")
    private String controllerId;
}
