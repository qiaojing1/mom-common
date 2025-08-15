package com.lets.platform.model.mes.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 物料来源检验标准配置表
 * </p>
 *
 * @author FZY
 * @since 2024-01-12
 */
@Getter
@Setter
@TableName("material_source_inspection_standard_config")
@ApiModel(value = "MaterialSourceInspectionStandardConfig对象", description = "物料来源检验标准配置表")
public class MaterialSourceInspectionStandardConfig extends BaseEntity {

    @ApiModelProperty("标准编码")
    @TableField("code")
    @NotBlank(message = "[标准编码]不能为空")
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_40, message = "[标准编码]长度 1~40，支持字母、数字和常用符号", groups = {Save.class, Update.class})
    @ExcelProperty(value = "标准编码", index = 0)
    private String code;

    @ApiModelProperty("标准名称")
    @TableField("name")
    @NotBlank(message = "[标准名称]不能为空")
    @Length(min = 1, max = 70, message = "[标准名称]长度 1~40，输入：中文、字母、数字、符号", groups = {Save.class, Update.class})
    @ExcelProperty(value = "标准名称", index = 1)
    private String name;

    @ApiModelProperty("检验类型")
    @TableField("inspect_type")
    @ExcelIgnore
    private String inspectType;

    @ApiModelProperty("检验类型名称")
    @TableField(exist = false)
    @ExcelProperty(value = "检验类型", index = 2)
    private String inspectTypeName;

    @ApiModelProperty("供应商ID")
    @TableField("supplier_id")
    @ExcelIgnore
    private String supplierId;

    @TableField(exist = false)
    @ExcelProperty(value = "供应商编码", index = 3)
    private String supplierCode;

    @ApiModelProperty("供应商名称")
    @TableField("supplier_name")
    @ExcelIgnore
    private String supplierName;

    @ApiModelProperty("生产单元ID")
    @TableField("factory_mode_id")
    @ExcelIgnore
    private String factoryModeId;

    @TableField(exist = false)
    @ExcelProperty(value = "生产单元编码", index = 4)
    private String factoryModeCode;

    @ApiModelProperty("生产单元名称")
    @TableField("factory_mode_name")
    @ExcelIgnore
    private String factoryModeName;

    @ApiModelProperty("数据状态[0:创建,1:暂存,2:审核中,3:已审核]")
    @TableField("status")
    @ExcelIgnore
    private Integer status;

    @TableField(exist = false)
    @ExcelIgnore
    private String statusName;

    @ApiModelProperty("启用状态")
    @TableField("enable")
    @ExcelIgnore
    private Integer enable;

    @TableField(exist = false)
    @ExcelIgnore
    private String enableName;

    @ApiModelProperty("备注")
    @TableField("remark")
    @ExcelIgnore
    private String remark;

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

    @TableField(exist = false)
    @ExcelIgnore
    private List<MaterialSourceInspectionStandardConfigDetail> detailList;
}
