package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * <p>
 * 产品档案方案
 * </p>
 *
 * @author FZY
 * @since 2024-11-26
 */
@Getter
@Setter
@TableName("mes_production_archive_scheme")
@ApiModel(value = "MesProductionArchiveScheme对象", description = "产品档案方案")
public class MesProductionArchiveScheme extends BaseEntity {

    @ApiModelProperty("方案编码（允许自动编码）")
    @TableField("code")
    private String code;

    @ApiModelProperty("方案名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("适用物料范围 0:通用 1:物料 2:物料分组")
    @TableField("material_range")
    private String materialRange;

    @TableField(exist = false)
    private String materialRangeName;

    @ApiModelProperty("适用客户范围 0:通用 1:客户 2:客户分组")
    @TableField("customer_range")
    private String customerRange;

    @TableField(exist = false)
    private String customerRangeName;

    @ApiModelProperty("产品档案维度 1:条码")
    @TableField("type")
    private String type;

    @TableField(exist = false)
    private String typeName;

    @ApiModelProperty("是否启用 0：未启用；1：已启用")
    @TableField("enable")
    private Integer enable;

    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @TableField(exist = false)
    private List<MesProductionArchiveSchemeDetail> detailList;

    @TableField(exist = false)
    private List<MesProductionArchiveSchemeRange> rangeList;
}
