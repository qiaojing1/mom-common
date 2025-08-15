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

/**
 * <p>
 * 线索商机-人员
 * </p>
 *
 * @author csy
 * @since 2024-04-30
 */
@Getter
@Setter
@TableName("psi_business_opportunity_user")
@ApiModel(value = "PsiBusinessOpportunityUser对象", description = "线索商机-人员")
public class PsiBusinessOpportunityUser extends BaseEntity {

    @ApiModelProperty("商机id")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("人员id")
    @TableField("user_id")
    private String userId;

    @ApiModelProperty("人员名称")
    @TableField("user_name")
    private String userName;
}
