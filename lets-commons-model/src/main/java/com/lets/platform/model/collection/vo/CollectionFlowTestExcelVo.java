package com.lets.platform.model.collection.vo;

import cn.hutool.core.util.StrUtil;
import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;


/**
 * <p>
 * 寿命试验/流阻
 * </p>
 *
 * @author csy
 * @since 2024-10-14
 */
@Data
public class CollectionFlowTestExcelVo extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer index;

    @ExcelIgnore
    @ApiModelProperty("标准id")
    @TableField("standard_id")
    private String standardId;

    @ExcelProperty("标准")
    @ApiModelProperty("标准")
    @TableField("standard_name")
    private String standardName;

    @ExcelProperty("口径单位")
    @ApiModelProperty("口径单位")
    @TableField("caliber_unit")
    private String caliberUnit;

    @ExcelProperty("口径最小值")
    @ApiModelProperty("口径dn范围起始")
    @TableField("caliber_start")
    private String caliberStart;

    @ExcelProperty("口径最大值")
    @ApiModelProperty("口径dn范围结束")
    @TableField("caliber_end")
    private String caliberEnd;
    @ExcelIgnore
    @TableField(exist = false)
    private String caliber;

    @ExcelProperty("压力单位")
    @ApiModelProperty("压力单位")
    @TableField("pressure_unit")
    private String pressureUnit;

    @ExcelIgnore
    @ApiModelProperty("压力单位")
    @TableField("pressure_unit_id")
    private String pressureUnitId;

    @ExcelProperty("压力最小值")
    @TableField(exist = false)
    private String pressureStartStr;
    @ExcelIgnore
    @ApiModelProperty("压力最小值")
    @TableField("pressure_start")
    private BigDecimal pressureStart;

    @ExcelProperty("压力最大值")
    @TableField(exist = false)
    private String pressureEndStr;
    @ExcelIgnore
    @ApiModelProperty("压力最大值")
    @TableField("pressure_end")
    private BigDecimal pressureEnd;
    @ExcelIgnore
    @TableField(exist = false)
    private String pressure;

    @ExcelIgnore
    @ApiModelProperty("阀门分类id")
    @TableField("valve_classify_id")
    private String valveClassifyId;

    @ExcelProperty("阀门分类")
    @ApiModelProperty("阀门分类")
    @TableField("valve_classify_name")
    private String valveClassifyName;

    @ExcelIgnore
    @ApiModelProperty("项目id")
    @TableField("project_id")
    private String projectId;

    @ExcelProperty("项目")
    @ApiModelProperty("项目")
    @TableField("project_name")
    private String projectName;

    @ExcelIgnore
    @ApiModelProperty("介质分类")
    @TableField("media_type")
    private String mediaType;
    @ExcelProperty("介质分类")
    @TableField(exist = false)
    private String mediaTypeName;

    @ExcelProperty("备注")
    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ExcelIgnore
    @TableField("type")
    private String type;

    @ExcelIgnore
    @TableField(exist = false)
    private String name;

    public boolean hasSpecialCaliber() {
        return !StrUtil.isNumeric(caliberStart.replace(".", "")) || !StrUtil.isNumeric(caliberEnd.replace(".", ""));
    }
}
