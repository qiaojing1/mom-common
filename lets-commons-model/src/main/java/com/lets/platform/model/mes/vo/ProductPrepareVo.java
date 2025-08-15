package com.lets.platform.model.mes.vo;

import com.lets.platform.model.mes.entity.MesDispatchDetailProductPrepare;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 生产准备 展示对象
 * @author: DING WEI
 * @date: 2024/1/9 16:55
 */
@Data
@ApiModel("生产准备 展示对象")
public class ProductPrepareVo {

    @ApiModelProperty("工艺文档")
    private List<MesDispatchDetailProductPrepare> processDocumentList;

    @ApiModelProperty("工艺变更通知")
    private List processChangeNotice;

    @ApiModelProperty("设备运行参数")
    private List<MesDispatchDetailProductPrepare> deviceRunParamList;

}
