package com.lets.platform.model.tpm.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.tpm.enums.ConfigCycle;
import com.lets.platform.model.tpm.enums.ConfigRelationTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * <p>
 * 巡检路线
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-12-09
 */
@Getter
@Setter
@TableName("tpm_inspection_project_route")
@ApiModel(value = "TpmInspectionProjectRoute对象", description = "巡检路线")
public class TpmInspectionProjectRoute extends BaseEntity {

    @ApiModelProperty("巡检项名称")
    @TableField("name")
    private String name;

    /**
     * @see ConfigCycle
     */
    @ApiModelProperty("巡检周期 1:每天 2:每周 3:每月 4:每季度 5:每半年 6:每年")
    @TableField("inspection_cycle")
    @ExcelIgnore
    private String inspectionCycle;
    @TableField(exist = false)
    @ExcelProperty("巡检周期")
    private String inspectionCycleName;

    /**
     * @see ConfigRelationTypeEnum
     */
    @ApiModelProperty("巡检方式 4:设备 5:生产单元")
    @TableField("inspection_way")
    private String inspectionWay;
    @TableField(exist = false)
    @ExcelIgnore
    private String inspectionWayName;

    @ApiModelProperty("巡检路线描述")
    @TableField("remark")
    private String remark;

    @TableField("enable")
    private Integer enable;
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("巡检路线")
    @TableField(exist = false)
    private String routeMap;
    @ApiModelProperty("巡检路线ids")
    @TableField(exist = false)
    private String routeMapIds;

    @TableField(exist = false)
    private List<TpmInspectionProjectRouteDetail> details;
}
