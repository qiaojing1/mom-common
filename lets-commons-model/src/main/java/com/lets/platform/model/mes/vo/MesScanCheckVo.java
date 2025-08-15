package com.lets.platform.model.mes.vo;

import com.lets.platform.model.mes.entity.MesDispatchDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 工位机 扫码 展示对象
 * @author: DING WEI
 * @date: 2024/1/29 11:58
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("工位机 扫码 展示对象")
public class MesScanCheckVo {

    @ApiModelProperty("校验是否通过")
    private Boolean pass;

    @ApiModelProperty("派工单信息")
    private MesDispatchDetail dispatchDetail;

}
