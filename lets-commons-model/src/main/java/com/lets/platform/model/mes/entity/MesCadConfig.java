package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;
import java.util.List;

/**
 * CAD提取配置
 * @author DING WEI
 * @since 2025-04-07
 */
@Getter
@Setter
@TableName("mes_cad_config")
@ApiModel(value = "MesCadConfig对象", description = "CAD提取配置")
public class MesCadConfig extends BaseEntity {

    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("文件格式[.dwg，.exb，.sldasm]")
    @TableField("type")
    private String type;

    @ApiModelProperty("状态")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("是否启用[0停用1启用]")
    @TableField("enable")
    private Integer enable;
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;
    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;
    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @ApiModelProperty("明细")
    @TableField(exist = false)
    @NotEmpty(message = "配置明细不能为空")
    private List<MesCadConfigDetail> details;
}
