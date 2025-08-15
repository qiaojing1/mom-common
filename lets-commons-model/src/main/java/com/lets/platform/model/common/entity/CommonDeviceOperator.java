package com.lets.platform.model.common.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 设备—限定操作员
 * @author DING WEI
 * @since 2024-12-03
 */
@Getter
@Setter
@TableName("common_device_operator")
@ApiModel(value = "CommonDeviceOperator对象", description = "设备—限定操作员")
public class CommonDeviceOperator extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ExcelIgnore
    @TableField(exist = false)
    private Integer excelIndex;

    @ExcelIgnore
    @ApiModelProperty("设备主键")
    @TableField("device_id")
    private String deviceId;
    @ColumnWidth(20)
    @ExcelProperty("设备编码")
    @TableField(exist = false)
    private String deviceCode;

    @ExcelIgnore
    @ApiModelProperty("操作员主键")
    @TableField("operator_id")
    private String operatorId;

    @ColumnWidth(25)
    @ExcelProperty("限定人员姓名")
    @ApiModelProperty("操作员名称")
    @TableField("operator_name")
    private String operatorName;

    @ExcelIgnore
    @ApiModelProperty("操作员账号")
    @TableField("login_id")
    private String loginId;
    @ExcelIgnore
    @ApiModelProperty("所属部门")
    @TableField(exist = false)
    private String operatorOrgName;
    @ExcelIgnore
    @ApiModelProperty("所属岗位")
    @TableField(exist = false)
    private String operatorPostNames;
    @ExcelIgnore
    @ApiModelProperty("部门类型")
    @TableField(exist = false)
    private String orgType;
    @ExcelIgnore
    @ApiModelProperty("数量")
    @TableField(exist = false)
    private Integer number;
}
