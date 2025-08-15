package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * <p>
 * 采购-物料可采控制
 * </p>
 *
 * @author zhangweiyan
 * @since 2025-04-22
 */
@Getter
@Setter
@TableName("psi_purchase_material_control")
@ApiModel(value = "PsiPurchaseMaterialControl对象", description = "采购-物料可采控制")
public class PsiPurchaseMaterialControl extends BaseEntity {
    @TableField(exist = false)
    private String code = "";

    @ApiModelProperty("可销范围 0:采购部门 1: 采购人员")
    @TableField("marketable_range")
    private String marketableRange;
    @TableField(exist = false)
    private String marketableRangeName;

    @ApiModelProperty("可销对象 0:物料 1:物料分组")
    @TableField("marketable_object")
    private String marketableObject;
    @TableField(exist = false)
    private String marketableObjectName;

    @ApiModelProperty("控制类型 1:不可采购 2:仅可采购")
    @TableField("control_type")
    private String controlType;
    @TableField(exist = false)
    private String controlTypeName;

    @ApiModelProperty("是否启用 0停用 1启用")
    @TableField("enable")
    private String enable;
    @TableField(exist = false)
    private String enableName;

    @TableField(exist = false)
    private List<PsiPurchaseMaterialControlRange> ranges;
    @TableField(exist = false)
    private List<PsiPurchaseMaterialControlObject> objects;
    @TableField(exist = false)
    private Integer rowIndex;

    public String getEnable() {
        return StringUtils.isNotBlank(enable) ? enable : "1";
    }
}
