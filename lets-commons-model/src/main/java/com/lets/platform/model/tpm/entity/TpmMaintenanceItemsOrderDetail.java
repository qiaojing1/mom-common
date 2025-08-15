package com.lets.platform.model.tpm.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import com.lets.platform.model.tpm.enums.PhotographyControlMethodEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 * 保养工单明细
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-11-14
 */
@Getter
@Setter
@TableName("tpm_maintenance_items_order_detail")
@ApiModel(value = "TpmMaintenanceItemsOrderDetail对象", description = "保养工单明细")
public class TpmMaintenanceItemsOrderDetail extends BaseEntity {

    @ApiModelProperty("工单id")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("序号")
    @TableField("line_number")
    private Integer lineNumber;

    @ApiModelProperty("保养项id")
    @TableField("inspection_items_id")
    private String inspectionItemsId;

    @ApiModelProperty("点检项名称")
    @TableField("inspection_items_name")
    private String inspectionItemsName;

    @ApiModelProperty("保养项分组id")
    @TableField("inspection_items_group_id")
    private String inspectionItemsGroupId;

    @ApiModelProperty("保养项分组名称")
    @TableField("inspection_items_group_name")
    private String inspectionItemsGroupName;

    @ApiModelProperty("保养内容")
    @TableField("inspection_content")
    private String inspectionContent;

    @ApiModelProperty("保养类型")
    @TableField("maintenance_type")
    private String maintenanceType;
    @ApiModelProperty("保养类型")
    @TableField(exist = false)
    private String maintenanceTypeName;

    /**
     * @see PhotographyControlMethodEnum
     */
    @ApiModelProperty("拍照控制方式 N:不控制 Y:必须拍照")
    @TableField("photography_control_method")
    @ExcelIgnore
    private String photographyControlMethod;
    @TableField(exist = false)
    @ExcelProperty("拍照控制方式")
    private String photographyControlMethodName;

    @ApiModelProperty("图片id")
    @TableField("image_id")
    private String imageId;

    @ApiModelProperty("保养项目里上传的图片")
    @TableField("inspection_item_image_id")
    private String inspectionItemImageIds;

    @ApiModelProperty("预计保养时长(H)")
    @TableField("expected_maintenance_duration")
    @ExcelIgnore
    private BigDecimal expectedMaintenanceDuration;
    @TableField(exist = false)
    @ExcelProperty("预计保养时长(H)")
    private String expectedMaintenanceDurationStr;

    @ApiModelProperty("执行状态 1:未执行 2:已执行")
    @TableField("execute_status")
    private String executeStatus;
    @ApiModelProperty("执行状态")
    @TableField(exist = false)
    private String executeStatusName;

    @ApiModelProperty("点检结果")
    @TableField("result")
    private String result;
    @ApiModelProperty("点检结果")
    @TableField(exist = false)
    private String resultName;

    @ApiModelProperty("问题反馈")
    @TableField("remark")
    private String remark;

    @TableField(exist = false)
    private List<CommonFile> images;

    @ApiModelProperty("保养项目的图片列表")
    @TableField(exist = false)
    private List<CommonFile> inspectionItemImages;
}
