package com.lets.platform.model.uc.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
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
import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 组织表
 * </p>
 *
 * @author FZY
 * @since 2023-06-09
 */
@Getter
@Setter
@TableName("sys_org")
@ApiModel(value = "SysOrg对象", description = "组织表")
public class SysOrg extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "部门编码", required = true)
    @TableField("code")
    @ExcelProperty(value = "部门编码", index = 0)
    @NotBlank(message = "org.code", groups = {Save.class, Update.class})
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_20, message = "org.code", groups = {Save.class, Update.class})
    private String code;

    @ApiModelProperty(value = "部门名称", required = true)
    @TableField("name")
    @ExcelProperty(value = "部门名称", index = 1)
    @NotBlank(message = "org.name", groups = {Save.class, Update.class})
    @Length(max = 30, message = "org.name", groups = {Save.class, Update.class})
    private String name;

    @ApiModelProperty("部门负责人ID")
    @TableField("leader_user_id")
    @ExcelIgnore
    private String leaderUserId;

    @ApiModelProperty("部门负责人名称")
    @TableField(exist = false)
    @ExcelIgnore
    private String leaderUserName;

    @ApiModelProperty("上级部门ID")
    @TableField("parent_code")
    @ExcelIgnore
    private String parentCode;

    @ApiModelProperty("上级部门名称")
    @TableField(exist = false)
    @ExcelProperty(value = "上级部门", index = 2)
    private String parentName;

    /**
     * @see com.lets.platform.model.uc.enums.OrgTypeEnum
     */
    @ApiModelProperty(value = "部门类型", required = true)
    @TableField("type")
    @ExcelIgnore
    @NotBlank(message = "org.type", groups = {Save.class, Update.class})
    private String type;
    @ApiModelProperty("部门类型名称")
    @TableField(exist = false)
    @ExcelProperty(value = "部门类型", index = 3)
    private String typeName;

    @ApiModelProperty("启用状态[0:禁用;1:启用]")
    @TableField("enable")
    @ExcelIgnore
    private Integer enable;

    @ApiModelProperty("启用状态")
    @TableField(exist = false)
    @ExcelIgnore
    private String enableName;

    @ApiModelProperty("是否财务核算[0:否;1:是]")
    @TableField("finance_count")
    @ExcelIgnore
    private Integer financeCount;

    @ApiModelProperty("是否财务核算")
    @TableField(exist = false)
    @ExcelProperty(value = "是否财务核算", index = 4)
    @ColumnWidth(25)
    private String financeCountName;

    @ApiModelProperty("描述")
    @TableField("remark")
    @ExcelProperty(value = "部门说明", index = 5)
    @Length(max = 200, message = "org.remark", groups = {Save.class, Update.class})
    private String remark;

    @ApiModelProperty("子部门")
    @TableField(exist = false)
    @ExcelIgnore
    private List<SysOrg> children;

    @ExcelIgnore
    @TableField(exist = false)
    private Boolean hasParent;

    @ExcelIgnore
    @ApiModelProperty("良品入库-限定仓库")
    @TableField("qualified_store_id")
    private String qualifiedStoreId;
    @ExcelIgnore
    @TableField(exist = false)
    private String qualifiedStoreName;

    @ExcelIgnore
    @ApiModelProperty("良品入库-限定库区")
    @TableField("qualified_area_id")
    private String qualifiedAreaId;
    @ExcelIgnore
    @TableField(exist = false)
    private String qualifiedAreaName;

    @ExcelIgnore
    @ApiModelProperty("良品入库-限定库位")
    @TableField("qualified_position_id")
    private String qualifiedPositionId;
    @ExcelIgnore
    @TableField(exist = false)
    private String qualifiedPositionName;

    @ExcelIgnore
    @ApiModelProperty("不良品入库-限定仓库")
    @TableField("defect_store_id")
    private String defectStoreId;
    @ExcelIgnore
    @TableField(exist = false)
    private String defectStoreName;

    @ExcelIgnore
    @ApiModelProperty("不良品入库-限定库区")
    @TableField("defect_area_id")
    private String defectAreaId;
    @ExcelIgnore
    @TableField(exist = false)
    private String defectAreaName;

    @ExcelIgnore
    @ApiModelProperty("不良品入库-限定库位")
    @TableField("defect_position_id")
    private String defectPositionId;
    @ExcelIgnore
    @TableField(exist = false)
    private String defectPositionName;

    @ExcelIgnore
    @ApiModelProperty("报废品入库-限定仓库")
    @TableField("scrap_store_id")
    private String scrapStoreId;
    @ExcelIgnore
    @TableField(exist = false)
    private String scrapStoreName;

    @ExcelIgnore
    @ApiModelProperty("报废品入库-限定库区")
    @TableField("scrap_area_id")
    private String scrapAreaId;
    @ExcelIgnore
    @TableField(exist = false)
    private String scrapAreaName;

    @ExcelIgnore
    @ApiModelProperty("报废品入库-限定库位")
    @TableField("scrap_position_id")
    private String scrapPositionId;
    @ExcelIgnore
    @TableField(exist = false)
    private String scrapPositionName;

    @ExcelIgnore
    @ApiModelProperty("返工品入库-限定仓库")
    @TableField("rework_store_id")
    private String reworkStoreId;
    @ExcelIgnore
    @TableField(exist = false)
    private String reworkStoreName;

    @ExcelIgnore
    @ApiModelProperty("返工品入库-限定库区")
    @TableField("rework_area_id")
    private String reworkAreaId;
    @ExcelIgnore
    @TableField(exist = false)
    private String reworkAreaName;

    @ExcelIgnore
    @ApiModelProperty("返工品入库-限定库位")
    @TableField("rework_position_id")
    private String reworkPositionId;
    @ExcelIgnore
    @TableField(exist = false)
    private String reworkPositionName;
}
