package com.lets.platform.model.mes.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 程序档案表
 * </p>
 *
 * @author FZY
 * @since 2024-02-22
 */
@Getter
@Setter
@TableName("mes_dnc_program_file")
@ApiModel(value = "MesDncProgramFile对象", description = "程序档案表")
public class MesDncProgramFile extends BaseEntity {

    @ApiModelProperty("程序档案编号")
    @TableField("code")
    @ExcelProperty(value = "程序档案编号", index = 0)
    private String code;

    @ApiModelProperty("程序档案名称")
    @TableField("name")
    @ExcelProperty(value = "程序档案名称", index = 1)
    private String name;

    @ApiModelProperty("程序版本")
    @TableField("program_version")
    @ExcelProperty(value = "程序版本", index = 2)
    private String programVersion;

    @ApiModelProperty("编程员ID")
    @TableField("programmer_id")
    @ExcelIgnore
    private String programmerId;

    @ApiModelProperty("编程员名称")
    @TableField(exist = false)
    @ExcelProperty(value = "编程员", index = 3)
    private String programmerName;

    @ApiModelProperty("工件装夹方式")
    @TableField("clamping_method")
    @ExcelProperty(value = "工件装夹方式", index = 4)
    private String clampingMethod;

    @ApiModelProperty("工件X设定")
    @TableField("x_setting")
    @ExcelProperty(value = "工件X设定", index = 5)
    @JsonProperty("xSetting")
    private String xSetting;

    @ApiModelProperty("工件Y设定")
    @TableField("y_setting")
    @ExcelProperty(value = "工件Y设定", index = 6)
    @JsonProperty("ySetting")
    private String ySetting;

    @ApiModelProperty("工件Z设定")
    @TableField("z_setting")
    @ExcelProperty(value = "工件Z设定", index = 7)
    @JsonProperty("zSetting")
    private String zSetting;

    @ApiModelProperty("刀具冷却方式")
    @TableField("cooling_method")
    @ExcelProperty(value = "刀具冷却方式", index = 8)
    private String coolingMethod;

    @ApiModelProperty("设备类型ID")
    @TableField("device_type_id")
    @ExcelIgnore
    private String deviceTypeId;

    @ApiModelProperty("设备类型名称")
    @TableField(exist = false)
    @ExcelProperty(value = "设备类型", index = 10)
    private String deviceTypeName;

    @ApiModelProperty("设备控制器ID")
    @TableField("device_controller_id")
    @ExcelIgnore
    private String deviceControllerId;

    @ApiModelProperty("设备控制器名称")
    @TableField(exist = false)
    @ExcelProperty(value = "设备控制器", index = 11)
    private String deviceControllerName;

    @ApiModelProperty("数据状态[0:创建,1:暂存,2:审核中,3:已审核]")
    @TableField("status")
    @ExcelIgnore
    private Integer status;

    @ApiModelProperty("数据状态")
    @TableField(exist = false)
    @ExcelIgnore
    private String statusName;

    @ApiModelProperty("备注")
    @TableField("remark")
    @ExcelProperty(value = "备注", index = 9)
    private String remark;

    @ApiModelProperty("程序名称")
    @TableField(exist = false)
    @ExcelIgnore
    private String programName;

    @ApiModelProperty("文件列表")
    @TableField(exist = false)
    @ExcelIgnore
    private List<CommonFile> fileList;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    @ExcelIgnore
    private LocalDateTime auditTime;

    @ApiModelProperty("审核人员")
    @TableField("audit_user")
    @ExcelIgnore
    private String auditUser;

    @ApiModelProperty("审核人员名称")
    @TableField("audit_user_name")
    @ExcelIgnore
    private String auditUserName;

    @ApiModelProperty("刀具信息")
    @TableField(exist = false)
    @ExcelIgnore
    private List<MesDncProgramFileTool> toolList;

}
