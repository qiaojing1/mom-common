package com.lets.platform.model.collection.query;

import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.model.collection.enums.EnergyTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 用(水、电、气)报表 查询对象
 * @author DING WEI
 * @date 2025/1/2 11:08
 * @version 1.0
 */
@Data
@ApiModel("用(水、电、气)报表 查询对象")
public class UseEnergyReportQuery {

    /**
     * @see com.lets.platform.model.collection.enums.EnergyTypeEnum
     */
    @ValidatedEnum(enumClass = EnergyTypeEnum.class, required = true, message = "类型非法")
    @ApiModelProperty("水电气类型")
    private String type;

    @NotBlank(message = "年-月-日不能为空")
    @ApiModelProperty("年-月-日")
    private String yearMonthDay;

    @NotNull(message = "开始时不能为空")
    @ApiModelProperty("开始时")
    private Integer startHour;
    @NotNull(message = "结束时不能为空")
    @ApiModelProperty("结束时")
    private Integer endHour;

    @NotEmpty(message = "设备不能为空")
    @ApiModelProperty("设备")
    private List<String> deviceIds;

    @ApiModelProperty(hidden = true)
    private String tenancyId;

    public String startHourAsStr() {
        if (startHour < GlobalConstant.TEN) {
            return GlobalConstant.ZERO_STR + startHour;
        } else {
            return GlobalConstant.EMPTY_STR + startHour;
        }
    }

    public String endHourAsStr() {
        if ((endHour + GlobalConstant.ONE) < GlobalConstant.TEN) {
            return GlobalConstant.ZERO_STR + (endHour + GlobalConstant.ONE);
        } else {
            return GlobalConstant.EMPTY_STR + (endHour + GlobalConstant.ONE);
        }
    }

}
