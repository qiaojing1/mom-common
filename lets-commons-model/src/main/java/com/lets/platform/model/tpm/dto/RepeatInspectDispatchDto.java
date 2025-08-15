package com.lets.platform.model.tpm.dto;

import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.uc.entity.SysUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 复检工单派发
 * @author DING WEI
 * @date 2024/12/26 11:32
 * @version 1.0
 */
@Data
@ApiModel("复检工单派发")
public class RepeatInspectDispatchDto {

    @NotEmpty(message = "请选择复检工单", groups = {Update.class})
    @ApiModelProperty("复检工单主键")
    private List<String> ids;

    @NotNull(message = "[复检人员]不能为空", groups = {Update.class})
    @ApiModelProperty("复检人员")
    private SysUser inspectUser;
    @ApiModelProperty("协助人员")
    private List<SysUser> assistUserList;

}
