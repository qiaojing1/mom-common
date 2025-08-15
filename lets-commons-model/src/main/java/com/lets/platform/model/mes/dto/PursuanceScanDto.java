package com.lets.platform.model.mes.dto;

import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.model.common.entity.CommonHmiSettings;
import com.lets.platform.model.mes.enums.produceOrder.PursuanceRecordTypeEnum;
import com.lets.platform.model.mes.enums.produceOrder.PursuanceScanCodeTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

/**
 * 工单执行-扫码
 * @author: DING WEI
 * @date: 2024/10/22 9:12
 */
@Data
@ApiModel("工单执行-扫码")
public class PursuanceScanDto {

    private String produceDetailId;

    @NotBlank(message = "工位机主键不能为空")
    private String hmiId;

//    @NotBlank(message = "请扫码")
    private String code;
    private String generateBarcode;

    @ValidatedEnum(enumClass = PursuanceRecordTypeEnum.class, required = true, message = "扫码业务类型非法")
    private String type;

    /**
     * @see PursuanceScanCodeTypeEnum
     */
    private String scanCodeType;

    /**
     * @see com.lets.platform.model.psi.enums.ScanCodeConfirmTypeEnum
     */
    @ApiModelProperty("确认类型")
    private String confirmType;
    @ApiModelProperty(hidden = true)
    private Boolean auto;

    @ApiModelProperty(value = "是否用料清单校验", hidden = true)
    private Boolean billCheck;

    @ApiModelProperty("容器主键")
    private String containerId;

    @ApiModelProperty("工位机信息")
    private CommonHmiSettings hmiSettings;

    @ApiModelProperty("扫码时间,自动线pursuanceBarcode点位触发的扫码执行的时间")
    private LocalDateTime scanTime;
}
