package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 盘点方案
 * </p>
 *
 * @author FZY
 * @since 2023-10-07
 */
@Getter
@Setter
@TableName("psi_inventory_check_scheme")
@ApiModel(value = "PsiInventoryCheckScheme对象", description = "盘点方案")
public class PsiInventoryCheckScheme extends BaseEntity {

    @ApiModelProperty("盘点方案编码")
    @TableField("code")
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_40, message = "[物料编码]长度 1~40，支持字母、数字和常用符号", groups = {Save.class, Update.class})
    private String code;

    @ApiModelProperty("盘点方案名称")
    @TableField("name")
    @Length(min = 1, max = 40, message = "[物料名称]长度 1~40，输入：中文、字母、数字、符号", groups = {Save.class, Update.class})
    private String name;

    @ApiModelProperty("盘点类型[0:全盘;1:动盘]")
    @TableField("type")
    @JsonSerialize(using = ToStringSerializer.class)
    private Integer type;

    @ApiModelProperty("盘点类型名称")
    @TableField(exist = false)
    private String typeName;

    @ApiModelProperty("实盘数默认值[0:0;1:账面库存数量]")
    @TableField("default_quantity_type")
    @JsonSerialize(using = ToStringSerializer.class)
    private Integer defaultQuantityType;

    @ApiModelProperty("不考虑有特征属性物料[0:否;1:是]")
    @TableField("none_specific_material")
    private Integer noneSpecificMaterial;

    @ApiModelProperty("包括下级分组[0:否;1:是]")
    @TableField("included_group_children")
    private Integer includedGroupChildren;

    @ApiModelProperty("单据状态")
    @TableField("status")
    @JsonSerialize(using = ToStringSerializer.class)
    private Integer status;

    @ApiModelProperty("单据状态名称")
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;

    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;

    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @TableField(exist = false)
    private List<PsiInventoryCheckSchemeMaterial> inventoryCheckSchemeMaterialList;
    @TableField(exist = false)
    private List<PsiInventoryCheckSchemeMaterialGroup> inventoryCheckSchemeMaterialGroupList;
    @TableField(exist = false)
    private List<PsiInventoryCheckSchemeStore> inventoryCheckSchemeStoreList;
    @TableField(exist = false)
    private List<PsiInventoryCheckSchemeSplitRule> inventoryCheckSchemeSplitRuleList;
    @TableField(exist = false)
    private List<PsiInventoryCheckSchemeSortRule> inventoryCheckSchemeSortRuleList;
}
