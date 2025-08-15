package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 物料特征项
 * </p>
 *
 * @author FZY
 * @since 2023-07-18
 */
@Getter
@Setter
@TableName("psi_material_characteristic_item")
@ApiModel(value = "PsiMaterialCharacteristicItem对象", description = "物料特征项")
public class PsiMaterialCharacteristicItem extends MaterialBaseEntity {

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    @ApiModelProperty("特征ID")
    @TableField(value = "parent_id")
    private String parentId;

    @ApiModelProperty("物料ID")
    @TableField(value = "material_id")
    private String materialId;

    @ApiModelProperty("特征值编码")
    @TableField("user_dict_id")
    private String userDictId;

    @ApiModelProperty("特征值名称")
    @TableField(exist = false)
    private String userDictName;

    @ApiModelProperty("是否默认")
    @TableField(exist = false)
    private Integer isDefault;

    @ApiModelProperty("启用状态")
    @TableField("enable")
    private Integer enable;
}
