package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 盘点仓库
 * </p>
 *
 * @author FZY
 * @since 2023-10-07
 */
@Getter
@Setter
@TableName("psi_inventory_check_scheme_store")
@ApiModel(value = "PsiInventoryCheckSchemeStore对象", description = "盘点仓库")
public class PsiInventoryCheckSchemeStore extends BaseEntity {

    @ApiModelProperty("盘点方案ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("序号")
    @TableField("sort")
    private Integer sort;

    @ApiModelProperty("仓库ID")
    @TableField("store_id")
    private String storeId;

    @ApiModelProperty("仓库CODE")
    @TableField("store_code")
    private String storeCode;

    @ApiModelProperty("仓库名称")
    @TableField("store_name")
    private String storeName;

    @ApiModelProperty("库区ID")
    @TableField("area_id")
    private String areaId;

    @ApiModelProperty("库区CODE")
    @TableField("area_code")
    private String areaCode;

    @ApiModelProperty("库区名称")
    @TableField("area_name")
    private String areaName;

    @ApiModelProperty("库位ID")
    @TableField("position_id")
    private String positionId;

    @ApiModelProperty("库位CODE")
    @TableField("position_code")
    private String positionCode;

    @ApiModelProperty("库位名称")
    @TableField("position_name")
    private String positionName;

}
