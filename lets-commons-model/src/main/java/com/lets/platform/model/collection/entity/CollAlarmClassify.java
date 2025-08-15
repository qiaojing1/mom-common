package com.lets.platform.model.collection.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.collection.enums.SolveTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * <p>
 * 报警分类配置表
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-12-02
 */
@Getter
@Setter
@TableName("coll_alarm_classify")
@ApiModel(value = "CollAlarmClassify对象", description = "报警分类配置表")
public class CollAlarmClassify extends BaseEntity {

    @ApiModelProperty("报警分类编码")
    @TableField("code")
    @ExcelProperty("报警分类编码")
    private String code;

    @ApiModelProperty("报警分类名称")
    @TableField("name")
    @ExcelProperty("报警分类名称")
    private String name;

    /**
     * @see SolveTypeEnum
     */
    @ApiModelProperty("报警处理方式 1:维修 2:保养 3:不做处理")
    @TableField("solve_type")
    @ExcelIgnore
    private String solveType;
    @ApiModelProperty("报警处理方式 1:维修 2:保养 3:不做处理")
    @TableField(exist = false)
    @ExcelProperty("报警处理方式")
    private String solveTypeName;

    @ApiModelProperty("备注")
    @TableField("remark")
    @ExcelProperty("备注")
    private String remark;

    @ApiModelProperty("启用停用")
    @TableField("enable")
    @ExcelIgnore
    private Integer enable;
    @ApiModelProperty("启用停用")
    @TableField(exist = false)
    @ExcelIgnore
    private String enableName;

    @TableField(exist = false)
    @ExcelIgnore
    private List<CollAlarmClassifyWarnCode> details;

    @ApiModelProperty(hidden = true)
    @ExcelIgnore
    @TableField(exist = false)
    private Integer excelIndex;

}
