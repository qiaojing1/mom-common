package com.lets.platform.model.mes.entity;

import cn.hutool.core.collection.CollUtil;
import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Pattern;
import java.util.List;

/**
 * <p>
 * 检验项目
 * </p>
 *
 * @author csy
 * @since 2023-12-18
 */
@Getter
@Setter
@TableName("mes_inspection_items")
@ApiModel(value = "MesInspectionItems对象", description = "检验项目")
public class MesInspectionItems extends BaseEntity {

    @TableField(exist = false)
    @ExcelIgnore
    private Integer index;

    @ApiModelProperty("编码")
    @TableField("code")
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_20, message = "[检验项目编码] 长度1~20，支持字母、数字和常用符号", groups = {Save.class, Update.class})
    @ExcelProperty("项目编码")
    private String code;

    @ApiModelProperty("检验项目名称")
    @TableField("name")
    @Length(max = 40, min = 1, message = "[检验项目名称] 长度1~40，输入：中文、字母、数字、符号", groups = {Save.class, Update.class})
    @ExcelProperty("检验项目名称")
    private String name;

    @ApiModelProperty("分组主键")
    @TableField("group_id")
    @ExcelIgnore
    private String groupId;

    @TableField(exist = false)
    @ExcelProperty("项目分组")
    private String groupName;

    @ApiModelProperty("缺陷等级[1严重 2轻微 3致命]")
    @TableField(value = "adverse_level",updateStrategy = FieldStrategy.ALWAYS)
    @ExcelIgnore
    private String adverseLevel;

    @TableField(exist = false)
    @ExcelProperty("缺陷等级")
    private String adverseLevelName;

    @ApiModelProperty("分析类型[1定性 2定量]")
    @TableField("analysis_type")
    @ExcelIgnore
    private String analysisType;

    @TableField(exist = false)
    @ExcelProperty("分析类型")
    private String analysisTypeName;

    @ExcelIgnore
    @ApiModelProperty("是否手动录入")
    @TableField("is_manual")
    private Integer isManual;

    @ExcelProperty("手动录入")
    @TableField(exist = false)
    private String manual;

    @ApiModelProperty("单位ID")
    @TableField("unit_id")
    @ExcelIgnore
    private String unitId;

    @ApiModelProperty("单位编码")
    @TableField("unit_code")
    @ExcelIgnore
    private String unitCode;

    @ApiModelProperty("单位名称")
    @TableField("unit_name")
    @ExcelProperty("计量单位")
    private String unitName;

    @ApiModelProperty("单位精度")
    @TableField("unit_accuracy")
    @ExcelIgnore
    private Integer unitAccuracy;

    @ApiModelProperty("单位舍入类型")
    @TableField("unit_round_off_type")
    @ExcelIgnore
    private String unitRoundOffType;

    @ApiModelProperty("重点检验 YN")
    @TableField("important")
    @ExcelProperty("重点检验")
    private String important;

    @TableField(exist = false)
    @ExcelIgnore
    private String importantName;

    @ApiModelProperty("破坏性检验 YN")
    @TableField("destruction")
    @ExcelProperty("破坏性检验")
    private String destruction;

    @TableField(exist = false)
    @ExcelIgnore
    private String destructionName;

    @ApiModelProperty("勾稽数量[Y/N]")
    @TableField("cross_check")
    @ExcelProperty("勾稽数量")
    private String crossCheck;

    @ApiModelProperty("检验要求")
    @TableField("requirement")
    @ExcelProperty("检验要求")
    private String requirement;

    @TableField(exist = false)
    @ExcelIgnore
    private String crossCheckName;

    @ApiModelProperty("抽样方案id")
    @TableField("sampling_plan_id")
    @ExcelIgnore
    private String samplingPlanId;

    @TableField(exist = false)
    @ExcelProperty("抽样方案")
    private String samplingPlanName;

    @ApiModelProperty("检验水平")
    @TableField("inspection_level")
    @ExcelIgnore
    private String inspectionLevel;

    @TableField(exist = false)
    @ExcelIgnore
    private String inspectionLevelName;

    @ApiModelProperty("严格程度")
    @TableField("strict_level")
    @ExcelIgnore
    private String strictLevel;

    @TableField(exist = false)
    @ExcelIgnore
    private String strictLevelName;

    @ApiModelProperty("AQL")
    @TableField("aql")
    @ExcelIgnore
    private String aql;

    @ApiModelProperty("检验设备id")
    @TableField("device_id")
    @ExcelIgnore
    private String deviceId;

    @TableField(exist = false)
    @ExcelProperty("检验仪器")
    private String deviceName;

    @ApiModelProperty("数据项id")
    @TableField("data_item_id")
    @ExcelIgnore
    private String dataItemId;

    @TableField(exist = false)
    @ExcelProperty("数据项")
    private String dataItemName;

    @ApiModelProperty("启用停用")
    @TableField("enable")
    @ExcelIgnore
    private Integer enable;

    @TableField(exist = false)
    @ExcelIgnore
    private String enableName;

    @ApiModelProperty("限定检验值")
    @TableField(exist = false)
    @ExcelIgnore
    private List<MesInspectionItemsValues> values;

    public void clearValues() {
        if (CollUtil.isNotEmpty(values)) {
            this.values.clear();
        }
    }
}
