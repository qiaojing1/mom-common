package com.lets.platform.model.mes.vo;

import com.lets.platform.model.mes.entity.MesInspectionOrderDetailRepairProcess;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RepairProcessGroup  {

    @ApiModelProperty("分组ID")
    private String processGroupId;

    @ApiModelProperty("分组名称")
    private String processGroupName;

    @ApiModelProperty("分组排序")
    private Integer step;

    @ApiModelProperty("工序列表")
    private List<MesInspectionOrderDetailRepairProcess> processList;
}
