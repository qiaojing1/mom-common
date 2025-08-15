package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import java.time.LocalDateTime;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ExampleProperty;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.Resource;

/**
 * <p>
 * 货源清单
 * </p>
 *
 * @author csy
 * @since 2025-03-31
 */
@Getter
@Setter
@TableName("psi_source_list")
@ApiModel(value = "PsiSourceList对象", description = "货源清单")
public class PsiSourceList extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer index;

    @ExcelProperty("货源清单编码")
    @ApiModelProperty("编码")
    @TableField("CODE")
    private String code;

    @ExcelProperty("货源清单名称")
    @ApiModelProperty("名称")
    @TableField("NAME")
    private String name;

    @ExcelIgnore
    @ApiModelProperty("限定方式[0供应商1供应商分组]")
    @TableField("limit_type")
    private String limitType;
    @ExcelProperty("限定方式")
    @TableField(exist = false)
    private String limitTypeName;

    @ExcelIgnore
    @ApiModelProperty("生效日期")
    @TableField("effective_time")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime effectiveTime;
    @ExcelProperty("生效日期")
    @TableField(exist = false)
    private String effectiveTimeStr;

    @ExcelIgnore
    @ApiModelProperty("失效日期")
    @TableField("expiring_time")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime expiringTime;
    @ExcelProperty("失效日期")
    @TableField(exist = false)
    private String expiringTimeStr;


    @ExcelProperty("备注")
    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ExcelIgnore
    @ApiModelProperty("单据状态")
    @TableField("STATUS")
    private Integer status;
    @ExcelIgnore
    @TableField(exist = false)
    private String statusName;

    @ExcelIgnore
    @ApiModelProperty("启用状态")
    @TableField("ENABLE")
    private Integer enable;
    @ExcelIgnore
    @TableField(exist = false)
    private String enableName;

    @ExcelIgnore
    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;

    @ExcelIgnore
    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;

    @ExcelIgnore
    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @ExcelIgnore
    @TableField(exist = false)
    private List<PsiSourceListSupplier> suppliers;

    @ExcelIgnore
    @TableField(exist = false)
    private List<PsiSourceListDetail> details;

    @ExcelIgnore
    @TableField(exist = false)
    private String validTag;

}
