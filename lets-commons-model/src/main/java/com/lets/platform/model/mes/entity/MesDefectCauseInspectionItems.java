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

/**
 * <p>
 * 缺陷原因-检验项目/分组
 * </p>
 *
 * @author csy
 * @since 2023-12-19
 */
@Getter
@Setter
@TableName("mes_defect_cause_inspection_items")
@ApiModel(value = "MesDefectCauseInspectionItems对象", description = "缺陷原因-检验项目/分组")
public class MesDefectCauseInspectionItems extends BaseEntity {

    @ApiModelProperty("检验项目id")
    @TableField("inspection_item_id")
    private String inspectionItemId;
    @TableField(exist = false)
    private String inspectionItemName;
    @TableField(exist = false)
    private String inspectionItemCode;

    @ApiModelProperty("检验项目分组id")
    @TableField("inspection_item_group_id")
    private String inspectionItemGroupId;
    @TableField(exist = false)
    private String inspectionItemGroupName;
    @TableField(exist = false)
    private String inspectionItemGroupCode;

    @ApiModelProperty("检验值id")
    @TableField("defect_cause_id")
    private String defectCauseId;
    @TableField(exist = false)
    private String defectCauseCode;
    @TableField(exist = false)
    private String defectCauseName;
}
