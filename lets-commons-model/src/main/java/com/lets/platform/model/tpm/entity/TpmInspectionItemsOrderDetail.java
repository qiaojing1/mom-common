package com.lets.platform.model.tpm.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import com.lets.platform.model.tpm.enums.ConfigNature;
import com.lets.platform.model.tpm.enums.ExecuteStatusEnum;
import com.lets.platform.model.tpm.enums.JudgeTypeEnum;
import com.lets.platform.model.tpm.enums.PhotographyControlMethodEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 * 点检工单明细
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-11-12
 */
@Getter
@Setter
@TableName("tpm_inspection_items_order_detail")
@ApiModel(value = "TpmInspectionItemsOrderDetail对象", description = "点检工单明细")
public class TpmInspectionItemsOrderDetail extends BaseEntity {

    @ApiModelProperty("工单id")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("工单id")
    @TableField("line_number")
    private Integer lineNumber;

    @ApiModelProperty("点检项id")
    @TableField("inspection_items_id")
    private String inspectionItemsId;

    @ApiModelProperty("点检项分组名称")
    @TableField("inspection_items_group_id")
    private String inspectionItemsGroupId;

    @ApiModelProperty("点检项分组名称")
    @TableField("inspection_items_group_name")
    private String inspectionItemsGroupName;

    @ApiModelProperty("点检项名称")
    @TableField("inspection_items_name")
    private String inspectionItemsName;

    @ApiModelProperty("点检内容")
    @TableField("inspection_content")
    private String inspectionContent;

    @ApiModelProperty("点检类型 1:人工 2:自动")
    @TableField("inspection_type")
    private String inspectionType;
    @ApiModelProperty("点检类型 1:人工 2:自动")
    @TableField(exist = false)
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
    @TableField("data_item_name")
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
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal stdQuantity;

    @ApiModelProperty("实际值")
    @TableField("actual_quantity")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal actualQuantity;

    @ApiModelProperty("上限值")
    @TableField("upper_limit_quantity")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal upperLimitQuantity;

    @ApiModelProperty("下限值")
    @TableField("lower_limit_quantity")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal lowerLimitQuantity;

    @ApiModelProperty("单位id")
    @TableField("unit_id")
    private String unitId;

    @ApiModelProperty("单位编码")
    @TableField("unit_code")
    private String unitCode;

    @ApiModelProperty("单位名称")
    @TableField("unit_name")
    private String unitName;

    @ApiModelProperty("单位精度")
    @TableField("unit_accuracy")
    private Integer unitAccuracy;

    @ApiModelProperty("单位舍入方式")
    @TableField("unit_round_off_type")
    private Integer unitRoundOffType;

    @ApiModelProperty("图片id")
    @TableField("image_id")
    private String imageId;

    @ApiModelProperty("点检项目里上传的图片")
    @TableField("inspection_item_image_id")
    private String inspectionItemImageIds;

    @ApiModelProperty("点检结果 1:正常 2:异常")
    @TableField("result")
    private String result;
    @ApiModelProperty("点检结果")
    @TableField(exist = false)
    private String resultName;

    /**
     * @see ExecuteStatusEnum
     */
    @ApiModelProperty("执行状态 1:未执行 2:已执行")
    @TableField("execute_status")
    private String executeStatus;
    @ApiModelProperty("执行状态 1:未执行 2:已执行")
    @TableField(exist = false)
    private String executeStatusName;

    @ApiModelProperty("问题反馈")
    @TableField("remark")
    private String remark;

    @TableField(exist = false)
    private List<CommonFile> images;

    @ApiModelProperty("点检项目的图片列表")
    @TableField(exist = false)
    private List<CommonFile> inspectionItemImages;
}
