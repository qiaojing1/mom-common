package com.lets.platform.model.tpm.dto;

import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.tpm.enums.RepairWayEnum;
import com.lets.platform.model.uc.entity.SysUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 维修工单派发
 * @author: DING WEI
 * @date: 2024/11/20 8:31
 */
@Data
@ApiModel("维修工单派发")
public class RepairDispatchDto {

    @NotEmpty(message = "请选择维修工单", groups = {Save.class, Update.class})
    @ApiModelProperty("维修工单主键")
    private List<String> ids;

    @ValidatedEnum(enumClass = RepairWayEnum.class, required = true, groups = {Save.class}, message = "[维修方式]非法")
    @ApiModelProperty("维修方式[1：内修、2：委外、3：无需维修]")
    private String repairWay;

    @ApiModelProperty("班组主键")
    private String teamsId;
    @ApiModelProperty("班组名称")
    private String teamsName;

    @NotEmpty(message = "[维修人员]不能为空", groups = {Update.class})
    @ApiModelProperty("维修人员")
    private List<SysUser> repairUserList;
    @ApiModelProperty("派工协助人员主键")
    private List<SysUser> dispatchAssistUserList;

    @ApiModelProperty("无需维修原因")
    private String noNeedRepairReason;

    @ApiModelProperty("类型[维修派发,维修变更]")
    private String typeName;

    @NotNull(message = "[委外时间]不能为空", groups = {Update.class})
    @ApiModelProperty("委外时间")
    private LocalDateTime outsourcingTime;
    @NotBlank(message = "[委外供应商]不能为空", groups = {Update.class})
    @ApiModelProperty("委外维修供应商主键")
    private String outsourcingSupplierId;
    @NotBlank(message = "[委外供应商]不能为空", groups = {Update.class})
    @ApiModelProperty("委外维修供应商名称")
    private String outsourcingSupplierName;
    @Length(max = 200, message = "[委外维修描述]长度1-20，支持汉字、字母、数字及常用符号", groups = {Save.class, Update.class})
    @ApiModelProperty("委外维修描述")
    private String outsourcingDescribe;

    @ApiModelProperty("预计维修时长(h)")
    private BigDecimal expectHours;

    @ApiModelProperty("预计完成时间")
    private LocalDateTime expectFinishTime;
}
