package com.lets.platform.model.tpm.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import com.lets.platform.model.tpm.enums.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 * 点检项目
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-11-01
 */
@Getter
@Setter
@TableName("tpm_inspection_items")
@ApiModel(value = "TpmInspectionItems对象", description = "点检项目")
public class TpmInspectionItems extends BaseEntity {

    @ApiModelProperty("点检项名称")
    @TableField("name")
    @ExcelProperty("点检项名称")
    private String name;

    @ApiModelProperty("点检项分组编码")
    @TableField("code")
    @ExcelIgnore
    private String code;

    @ApiModelProperty("点检项分组id（如果当前数据是分组则该字段为0）")
    @TableField("group_id")
    @ExcelIgnore
    private String groupId;
    @TableField(exist = false)
    @ExcelProperty("点检项分组")
    private String groupName;

    @ApiModelProperty("是否为分组数据 Y是N否")
    @TableField("is_group")
    @ExcelIgnore
    private String isGroup;

    /**
     * @see ConfigCycle
     */
    @ApiModelProperty("点检周期 1:每天 2:每周 3:每月 4:每季度 5:每半年 6:每年")
    @TableField("inspection_cycle")
    @ExcelIgnore
    private String inspectionCycle;
    @TableField(exist = false)
    @ExcelProperty("点检周期")
    private String inspectionCycleName;

    @ApiModelProperty("点检内容")
    @TableField("inspection_content")
    @ExcelProperty("点检内容")
    private String inspectionContent;

    /**
     * @see SpotOrderSource
     */
    @ApiModelProperty("点检类型 1:人工 2:自动")
    @TableField("inspection_type")
    @ExcelIgnore
    private String inspectionType;
    @TableField(exist = false)
    @ExcelProperty("点检类型")
    private String inspectionTypeName;

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

    @ApiModelProperty("关联数据项id")
    @TableField("data_item_id")
    @ExcelIgnore
    private String dataItemId;
    @TableField(exist = false)
    @ExcelProperty("关联数据项")
    private String dataItemName;

    /**
     * @see ConfigNature
     * 前端数据字典为 natureType
     */
    @ApiModelProperty("点检性质 1:定性 2:定量")
    @TableField("inspection_property")
    @ExcelIgnore
    private String inspectionProperty;
    @TableField(exist = false)
    @ExcelProperty("点检性质")
    private String inspectionPropertyName;

    /**
     * @see JudgeTypeEnum
     * 前端数据字典为 judgeTypeEnum
     */
    @ApiModelProperty("判断类型 1:标准值 2:区间")
    @TableField("judge_type")
    @ExcelIgnore
    private String judgeType;
    @TableField(exist = false)
    @ExcelProperty("判断类型")
    private String judgeTypeName;

    @ApiModelProperty("标准值")
    @TableField("std_quantity")
    @ExcelIgnore
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal stdQuantity;
    @TableField(exist = false)
    @ExcelProperty("标准值")
    private String stdQuantityStr;

    @ApiModelProperty("上限值")
    @TableField("upper_limit_quantity")
    @ExcelIgnore
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal upperLimitQuantity;
    @TableField(exist = false)
    @ExcelProperty("上限值")
    private String upperLimitQuantityStr;

    @ApiModelProperty("下限值")
    @TableField("lower_limit_quantity")
    @ExcelIgnore
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal lowerLimitQuantity;
    @TableField(exist = false)
    @ExcelProperty("下限值")
    private String lowerLimitQuantityStr;

    @ApiModelProperty("单位id")
    @TableField("unit_id")
    @ExcelIgnore
    private String unitId;

    @ApiModelProperty("单位编码")
    @TableField("unit_code")
    @ExcelIgnore
    private String unitCode;

    @ApiModelProperty("单位名称")
    @TableField("unit_name")
    @ExcelProperty("单位")
    private String unitName;

    @ApiModelProperty("单位精度")
    @TableField("unit_accuracy")
    @ExcelIgnore
    private Integer unitAccuracy;

    @ApiModelProperty("单位舍入方式")
    @TableField("unit_round_off_type")
    @ExcelIgnore
    private Integer unitRoundOffType;

    @ApiModelProperty("图片id")
    @TableField("image_id")
    @ExcelIgnore
    private String imageIds;

    /**
     * @see ConfigRelationTypeEnum
     */
    @ApiModelProperty("适用设备范围 1:通用 2:设备类型 3:设备型号 4:设备(该参数仅在当前数据为分组数据时有效)")
    @TableField("suit_device_range")
    @ExcelIgnore
    private String suitDeviceRange;
    @TableField(exist = false)
    @ExcelIgnore
    private String suitDeviceRangeName;

    @ApiModelProperty("点检项目分组关联适用范围")
    @TableField(exist = false)
    @ExcelIgnore
    private List<TpmInspectionItemsGroupSuitableRange> suitableRanges;

    @ApiModelProperty("图片文件列表")
    @TableField(exist = false)
    @ExcelIgnore
    private List<CommonFile> files;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    @ExcelIgnore
    private Integer excelIndex;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    @ExcelIgnore
    private List<TpmInspectionItems> children;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    @ExcelIgnore
    private String deviceId;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    @ExcelIgnore
    private String inspectUserId;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    @ExcelIgnore
    private String inspectUserName;
}
