package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 物料分组属性配置-物料特征项
 * @author DING WEI
 * @since 2024-07-17
 */
@Getter
@Setter
@TableName("psi_group_attr_config_material_characteristic_item")
@ApiModel(value = "PsiGroupAttrConfigMaterialCharacteristicItem对象", description = "物料分组属性配置-物料特征项")
public class PsiGroupAttrConfigMaterialCharacteristicItem extends BaseEntity {

    @ApiModelProperty("特征ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("物料分组ID")
    @TableField("group_id")
    private String groupId;

    @ApiModelProperty("特征值ID")
    @TableField("user_dict_id")
    private String userDictId;
    @TableField(exist = false)
    private String userDictName;
    @TableField(exist = false)
    private Integer isDefault;

    @ApiModelProperty("启用状态")
    @TableField("enable")
    private Integer enable;
}
