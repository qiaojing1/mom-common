package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.enums.YesOrNo;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.psi.enums.IsOrNotEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Pattern;

/**
 * <p>
 * 生命周期
 * </p>
 *
 * @author DING WEI
 * @since 2023-07-10
 */
@Getter
@Setter
@TableName("psi_life_cycle")
@ApiModel(value = "PsiLifeCycle对象", description = "生命周期")
public class PsiLifeCycle extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer index;

    @ColumnWidth(30)
    @ExcelProperty("生命周期编码")
    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @Length(min = 1, max = 20, message = "PsiLifeCycle.name", groups = {Save.class, Update.class})
    @ColumnWidth(30)
    @ExcelProperty("生命周期名称")
    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @ValidatedEnum(enumClass = YesOrNo.class, required = true, message = "PsiLifeCycle.canDiscussOrder", groups = {Save.class, Update.class})
    @ExcelIgnore
    @ApiModelProperty("可开研发工单[N否Y是]")
    @TableField("can_discuss_order")
    private String canDiscussOrder;
    @ColumnWidth(30)
    @ExcelProperty("可开研发工单")
    @TableField(exist = false)
    private String canDiscussOrderName;

    @ValidatedEnum(enumClass = YesOrNo.class, required = true, message = "PsiLifeCycle.canFormalOrder", groups = {Save.class, Update.class})
    @ExcelIgnore
    @ApiModelProperty("可开正式工单[N否Y是]")
    @TableField("can_formal_order")
    private String canFormalOrder;
    @ColumnWidth(30)
    @ExcelProperty("可开正式工单")
    @TableField(exist = false)
    private String canFormalOrderName;

    @ValidatedEnum(enumClass = YesOrNo.class, required = true, message = "PsiLifeCycle.needEcn", groups = {Save.class, Update.class})
    @ExcelIgnore
    @ApiModelProperty("是否需要ECN[N否Y是]")
    @TableField("need_ecn")
    private String needEcn;
    @ColumnWidth(25)
    @ExcelProperty("是否需要ECN")
    @TableField(exist = false)
    private String needEcnName;

    @ValidatedEnum(enumClass = YesOrNo.class, required = true, message = "PsiLifeCycle.loseEfficacy", groups = {Save.class, Update.class})
    @ExcelIgnore
    @ApiModelProperty("是否失效[N否Y是]")
    @TableField("lose_efficacy")
    private String loseEfficacy;
    @ColumnWidth(30)
    @ExcelProperty("是否失效")
    @TableField(exist = false)
    private String loseEfficacyName;


    @ValidatedEnum(enumClass = YesOrNo.class, required = true, message = "[是否可开销售单]非法", groups = {Save.class, Update.class})
    @ExcelIgnore
    @ApiModelProperty("是否可开销售单[N否Y是]")
    @TableField("can_sale")
    private String canSale;
    @ColumnWidth(30)
    @ExcelProperty("是否可开销售单")
    @TableField(exist = false)
    private String canSaleName;

    @ValidatedEnum(enumClass = IsOrNotEnum.class, message = "SysUser.enable", groups = {Save.class, Update.class})
    @ExcelIgnore
    @ApiModelProperty("是否启用[0停用1启用]")
    @TableField("enable")
    private Integer enable;
    @ExcelIgnore
    @TableField(exist = false)
    private String enableName;

    @ExcelIgnore
    @ApiModelProperty("是否删除[N否Y是]")
    @TableField(value = "deleted", fill = FieldFill.INSERT)
    private String deleted;

    @ExcelIgnore
    @ApiModelProperty("是否预制")
    @TableField(value = "is_preset")
    private String isPreset;
    @ExcelIgnore
    @ApiModelProperty("是否预制")
    @TableField(exist = false)
    private String isPresetName;

}
