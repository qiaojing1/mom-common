package com.lets.platform.model.collection.entity;

import cn.hutool.core.util.StrUtil;
import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;

import java.math.BigDecimal;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 压力试验
 * </p>
 *
 * @author csy
 * @since 2024-05-14
 */
@Getter
@Setter
@TableName("collection_pressure_test")
@ApiModel(value = "CollectionPressureTest对象", description = "压力试验")
public class CollectionPressureTest extends BaseEntity {

    @TableField(exist = false)
    @ExcelIgnore
    private Integer index;

    @TableField(exist = false)
    @ExcelIgnore
    private String name;

    @ApiModelProperty("标准id")
    @TableField("standard_id")
    @ExcelIgnore
    private String standardId;
    @ExcelProperty("标准")
    @TableField("standard_name")
    private String standardName;
    @ApiModelProperty("压力标准id")
    @TableField("pressure_standard_id")
    @ExcelIgnore
    private String pressureStandardId;
    @ExcelProperty("压力标准")
    @TableField("pressure_standard_name")
    private String pressureStandardName;


    @ExcelIgnore
    @ApiModelProperty("阀门分类id")
    @TableField("valve_classify_id")
    private String valveClassifyId;
    @ExcelProperty("阀门分类")
    @TableField("valve_classify_name")
    private String valveClassifyName;

    @ApiModelProperty("项目id")
    @TableField("project_id")
    @ExcelIgnore
    private String projectId;
    @ExcelProperty("试验项目")
    @TableField("project_Name")
    private String projectName;


    @ExcelIgnore
    @ApiModelProperty("介质分类")
    @TableField("media_type")
    private String mediaType;
    @ExcelProperty("介质分类")
    @TableField(exist = false)
    private String mediaTypeName;

    @ExcelIgnore
    @ApiModelProperty("材质分组id")
    @TableField("material_group_id")
    private String materialGroupId;
    @ExcelProperty("材质分组")
    @TableField("material_group_name")
    private String materialGroupName;


    @ApiModelProperty("口径dn范围起始")
    @TableField("caliber_dn_start")
    @ExcelIgnore
    private String caliberDnStart;
    @TableField(exist = false)
    @ExcelProperty("口径（DN）最小值")
    private String caliberDnStartStr;


    @ApiModelProperty("口径dn范围结束")
    @TableField("caliber_dn_end")
    @ExcelIgnore
    private String caliberDnEnd;
    @TableField(exist = false)
    @ExcelProperty("口径（DN）最大值")
    private String caliberDnEndStr;

    @ExcelIgnore
    @TableField(exist = false)
    private String dn;

    @ExcelIgnore
    @ApiModelProperty("口径nps范围起始")
    @TableField("caliber_nps_start")
    private String caliberNpsStart;
    @TableField(exist = false)
    @ExcelProperty("口径（NPS）最小值")
    private String caliberNpsStartStr;

    @ExcelIgnore
    @ApiModelProperty("口径nps范围结束")
    @TableField("caliber_nps_end")
    private String caliberNpsEnd;
    @TableField(exist = false)
    @ExcelProperty("口径（NPS）最大值")
    private String caliberNpsEndStr;

    @ExcelIgnore
    @TableField(exist = false)
    private String nps;


    @ExcelIgnore
    @ApiModelProperty("压力符号")
    @TableField("pressure_sign_id")
    private String pressureSignId;

    @ExcelProperty("压力符号")
    @ApiModelProperty("压力符号")
    @TableField("pressure_sign_name")
    private String pressureSignName;

    @ExcelIgnore
    @ApiModelProperty("压力")
    @TableField("pressure_value")
    private BigDecimal pressureValue;

    @ExcelProperty("压力")
    @TableField(exist = false)
    private String pressureValueStr;

    @ExcelIgnore
    @ApiModelProperty("压力")
    @TableField("pressure_Id")
    private String pressureId;

    @ExcelIgnore
    @ApiModelProperty("试验压力（MPa）")
    @TableField("test_pressure_value")
    private BigDecimal testPressureValue;
    @ExcelProperty("试验压力（MPa）")
    @TableField(exist = false)
    private String testPressureValueStr;


    @ExcelProperty("是否限制最大压力")
    @ApiModelProperty("是否限制最大压力")
    @TableField("is_max_pressure")
    private String isMaxPressure;

    @ExcelProperty("超过最大压力判定不合格")
    @ApiModelProperty("超过最大压力判定不合格")
    @TableField("exceed_max_pressure_unqualified")
    private String exceedMaxPressureUnqualified;


    @ExcelIgnore
    @ApiModelProperty("最大压力")
    @TableField("max_pressure_value")
    private BigDecimal maxPressureValue;
    @ExcelProperty("最大试验压力（MPa）")
    @TableField(exist = false)
    private String maxPressureValueStr;

    @ExcelIgnore
    @ApiModelProperty("保压时长")
    @TableField("holding_time")
    private String holdingTime;
    @ExcelProperty("保压时长")
    @TableField(exist = false)
    private String holdingTimeStr;

    @ExcelIgnore
    @ApiModelProperty("泄漏率")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @TableField("leakage_rate")
    private BigDecimal leakageRate;
    @ExcelProperty("泄漏率")
    @TableField(exist = false)
    private String leakageRateStr;


    @ExcelIgnore
    @ApiModelProperty("泄漏率单位")
    @TableField("leakage_unit_id")
    private String leakageUnitId;

    @ExcelProperty("泄漏率单位")
    @ApiModelProperty("泄漏率单位")
    @TableField("leakage_unit_name")
    private String leakageUnitName;

    @ExcelProperty("试验类型")
    @ApiModelProperty("是否必做")
    @TableField("required")
    private String required;
    @ExcelIgnore
    @TableField(exist = false)
    private String requiredName;

    @ExcelProperty("备注")
    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;


    @ApiModelProperty("试验方向（取试验项目里）")
    @TableField(exist = false)
    @ExcelIgnore
    private String testDirection;

    @ApiModelProperty("计量方法（取试验项目里）")
    @TableField(exist = false)
    @ExcelIgnore
    private String meteringMethod;

    @ApiModelProperty("顺序")
    @TableField(exist = false)
    @ExcelIgnore
    private Integer step;

    @TableField(exist = false)
    @ExcelIgnore
    private String isCheckLeakage;


    public boolean hasSpecialDn() {
        return !StrUtil.isNumeric(caliberDnStart.replace(".", "")) || !StrUtil.isNumeric(caliberDnStart.replace(".", ""));
    }

    public boolean hasSpecialNps() {
        return !StrUtil.isNumeric(caliberNpsStart.replace(".", "")) || !StrUtil.isNumeric(caliberNpsStart.replace(".", ""));
    }

    public BigDecimal maxPressureNotNull() {
        if (Objects.nonNull(maxPressureValue)) {
            return maxPressureValue;
        }
        return BigDecimal.ZERO;
    }


    public void setNull() {
        if (Objects.isNull(pressureId)) {
            pressureId = "";
        }
        if (Objects.isNull(remark)) {
            remark = "";
        }
    }
}
