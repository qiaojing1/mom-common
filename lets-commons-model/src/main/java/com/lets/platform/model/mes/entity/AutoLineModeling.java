package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.enums.AutoLineTypeEnum;
import com.lets.platform.model.psi.enums.IsOrNotEnum;
import com.lets.platform.model.psi.enums.PickStrategyEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * 自动线建模
 * @author DING WEI
 * @since 2024-07-02
 */
@Getter
@Setter
@TableName("mes_auto_line_modeling")
@ApiModel(value = "AutoLineModeling对象", description = "自动线建模")
public class AutoLineModeling extends BaseEntity {

    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @Length(min = 1, max = 20, message = "[自动线名称]长度1~20，支持中文、字母、数字和常用符号", groups = {Save.class, Update.class})
    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @ValidatedEnum(enumClass = AutoLineTypeEnum.class, required = true, message = "[自动线类型]非法，请选择单工序产线、流水产线、混合产线", groups = {Save.class, Update.class})
    @ApiModelProperty("类型[1单工序产线、2流水产线、3混合产线]")
    @TableField("type")
    private String type;
    @TableField(exist = false)
    private String typeName;

    @NotBlank(message = "[所属生产单元]不能为空", groups = {Save.class, Update.class})
    @ApiModelProperty("生产单元主键")
    @TableField("factory_mode_id")
    private String factoryModeId;
    @ApiModelProperty("生产单元名称")
    @TableField("factory_mode_name")
    private String factoryModeName;

    @NotBlank(message = "[关联控制中心]不能为空", groups = {Save.class, Update.class})
    @ApiModelProperty("关联控制中心主键")
    @TableField("relation_control_id")
    private String relationControlId;
    @ApiModelProperty("关联控制中心编码")
    @TableField("relation_control_code")
    private String relationControlCode;
    @ApiModelProperty("关联控制中心名称")
    @TableField("relation_control_name")
    private String relationControlName;

    @Min(value = 1, message = "[待加工缓存区]正整数，1-999", groups = {Save.class, Update.class})
    @Max(value = 999, message = "[待加工缓存区]正整数，1-999", groups = {Save.class, Update.class})
    @ApiModelProperty("待加工缓存区数量[正整数，默认值为1；1-999]")
    @TableField("pending_buffer_area_number")
    private Integer pendingBufferAreaNumber;

    @NotBlank(message = "[首道工序]不能为空", groups = {Save.class, Update.class})
    @ApiModelProperty("首道工序主键")
    @TableField("first_process_id")
    private String firstProcessId;
    @ApiModelProperty("首道工序编码")
    @TableField("first_process_code")
    private String firstProcessCode;
    @ApiModelProperty("首道工序名称")
    @TableField("first_process_name")
    private String firstProcessName;

    @Length(max = 200, message = "[备注]长度1-200，支持中文、字母、数字及常用符号", groups = {Save.class, Update.class})
    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ValidatedEnum(enumClass = IsOrNotEnum.class, required = true, message = "[是否有输送线]非法", groups = {Save.class, Update.class})
    @ApiModelProperty("是否有输送线[0否1是]")
    @TableField("has_conveyor_line")
    private Integer hasConveyorLine;

    /**
     * @see PickStrategyEnum
     */
    @ApiModelProperty("输送线流转规则[1先进先出，2后进先出]")
    @TableField("conveyor_strategy")
    private String conveyorStrategy;
    @TableField(exist = false)
    private String conveyorStrategyName;

    @ApiModelProperty("输送线传送完成数据项主键")
    @TableField("conveyor_finish_item_id")
    private String conveyorFinishItemId;
    @ApiModelProperty("输送线传送完成数据项key")
    @TableField("conveyor_finish_item_key")
    private String conveyorFinishItemKey;
    @ApiModelProperty("输送线传送完成数据项名称")
    @TableField("conveyor_finish_item_name")
    private String conveyorFinishItemName;

    @ApiModelProperty("取料完成数据项主键")
    @TableField("take_finish_item_id")
    private String takeFinishItemId;
    @ApiModelProperty("取料完成数据项key")
    @TableField("take_finish_item_key")
    private String takeFinishItemKey;
    @ApiModelProperty("取料完成数据项名称")
    @TableField("take_finish_item_name")
    private String takeFinishItemName;

    /**
     * @see com.lets.platform.model.common.enums.RunModeEnum
     */
    @ApiModelProperty(value = "自动线运行方式[1自动、2手动]", hidden = true)
    @TableField("run_mode")
    private String runMode;
    @TableField(exist = false)
    private String runModeName;

    @NotEmpty(message = "[设备明细]不能为空", groups = {Save.class, Update.class})
    @ApiModelProperty("设备明细")
    @TableField(exist = false)
    private List<AutoLineModelingDetail> details;
}
