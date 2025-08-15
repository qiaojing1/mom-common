package com.lets.platform.model.mes.vo;

import com.lets.platform.model.common.entity.CommonHmiSettings;
import com.lets.platform.model.mes.entity.MesDispatchDetailMaterialPrepare;
import com.lets.platform.model.mes.entity.MesProcessPlanDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 物料准备 展示对象
 * @author: DING WEI
 * @date: 2024/1/9 16:55
 */
@Data
@ApiModel("物料准备 展示对象")
public class MaterialPrepareVo {

    @ApiModelProperty("上一工序名称")
    private String preProcessName;
    @ApiModelProperty(hidden = true)
    private List<MesProcessPlanDetail> preProcess;
    @ApiModelProperty(hidden = true)
    private MesProcessPlanDetail currentProcess;
    @ApiModelProperty("下一工序名称")
    private String nextProcessName;

    @ApiModelProperty("HMI配置信息")
    private CommonHmiSettings hmiSettings;

    @ApiModelProperty("物料列表")
    private List<MesDispatchDetailMaterialPrepare> materialPrepareList;

}
