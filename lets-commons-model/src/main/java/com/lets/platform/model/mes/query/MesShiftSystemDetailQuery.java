package com.lets.platform.model.mes.query;

import com.lets.platform.model.mes.entity.MesShiftSystemDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author zhangweiyan
 * @ClassName MesShiftSystemDetailQuery
 * @Description 校验指定班次是否可以插入当前班制组内查询实体
 * @Date 2023/12/19 11:09
 **/
@Data
@ApiModel("校验指定班次是否可以插入当前班制组内查询实体")
public class MesShiftSystemDetailQuery {

    @ApiModelProperty("目标班次")
    @NotNull
    private String targetShiftId;

    @ApiModelProperty("当前班制内已存在班次信息")
    @NotEmpty
    private List<MesShiftSystemDetail> existShifts;

    private int index;
}
