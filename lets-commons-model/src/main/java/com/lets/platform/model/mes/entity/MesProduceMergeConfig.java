package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.annotation.ValidBigDecimal;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.mes.enums.InspectPlanMaterialScopeEnum;
import com.lets.platform.model.mes.enums.ProduceMergeTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;
import java.util.List;

/**
 * 生产工单合并方案
 * @author DING WEI
 * @since 2025-08-13
 */
@Getter
@Setter
@TableName("mes_produce_merge_config")
@ApiModel(value = "MesProduceMergeConfig对象", description = "生产工单合并方案")
public class MesProduceMergeConfig extends BaseEntity {

    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @ValidatedEnum(enumClass = InspectPlanMaterialScopeEnum.class, required = true, message = "[适用物料范围]非法", groups = {Save.class, Update.class})
    @ApiModelProperty("适用物料范围")
    @TableField("material_scope")
    private String materialScope;
    @TableField(exist = false)
    private String materialScopeName;

    @Length(max = 200, message = "[描述]长度不可超过200个字符", groups = {Save.class, Update.class})
    @ApiModelProperty("描述")
    @TableField("describe")
    private String describe;

    @ApiModelProperty("启用状态")
    @TableField("enable")
    private Integer enable;
    @TableField(exist = false)
    private String enableName;

    /**
     * @see ProduceMergeTypeEnum
     */
    @ApiModelProperty("合并类型[1按数量增补]")
    @TableField("merge_type")
    private Integer mergeType;
    @TableField(exist = false)
    private Integer mergeTypeName;

    /**
     * @see com.lets.platform.model.mes.enums.ProduceMergeMomentEnum
     */
    @ApiModelProperty("合并时机[1计划投放]")
    @TableField("merge_moment")
    private Integer mergeMoment;
    @TableField(exist = false)
    private String mergeMomentName;

    @ValidBigDecimal(message = "[限定数量]范围[1, 9999999999]", min = "1", max = "9999999999", includeMin = true, groups = {Save.class, Update.class})
    @ApiModelProperty("限定数量")
    @TableField("limit_number")
    private BigDecimal limitNumber;

    @ApiModelProperty("适用物料")
    @TableField(exist = false)
    private List<MesProduceMergeConfigDetail> materialList;

    @ApiModelProperty("适用物料分组")
    @TableField(exist = false)
    private List<MesProduceMergeConfigDetail> materialGroupList;
}
