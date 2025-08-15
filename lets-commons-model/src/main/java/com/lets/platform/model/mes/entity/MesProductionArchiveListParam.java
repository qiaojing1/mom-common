package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 产品档案清单参数
 * </p>
 *
 * @author FZY
 * @since 2024-11-29
 */
@Getter
@Setter
@TableName("mes_production_archive_list_param")
@ApiModel(value = "MesProductionArchiveListParam对象", description = "产品档案清单参数")
public class MesProductionArchiveListParam extends BaseEntity {

    @TableField(exist = false)
    private Integer lineNumber;

    @ApiModelProperty("清单id")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("方案ID")
    @TableField("scheme_id")
    private String schemeId;

    @ApiModelProperty("参数编码")
    @TableField("param_code")
    private String paramCode;

    @ApiModelProperty("参数名称")
    @TableField(exist = false)
    private String paramName;

    @ApiModelProperty("值类型 0:字符型 1:数字型 2:布尔型")
    @TableField(exist = false)
    private Integer valueType;

    @ApiModelProperty("必填")
    @TableField(exist = false)
    private Integer required;

    @ApiModelProperty("参数值")
    @TableField("param_value")
    private String paramValue;

    @ApiModelProperty("缺省值")
    @TableField(exist = false)
    private String defaultValue;
}
