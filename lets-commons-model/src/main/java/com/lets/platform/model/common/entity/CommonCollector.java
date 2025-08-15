package com.lets.platform.model.common.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.collection.enums.CollectorTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 采集器管理表
 * </p>
 *
 * @author csy
 * @since 2023-10-30
 */
@Getter
@Setter
@TableName("common_collector")
@ApiModel(value = "CommonCollector对象", description = "采集器管理表")
public class CommonCollector extends BaseEntity {

    @ApiModelProperty("采集器编码")
    @TableField("code")
    @Pattern(regexp = GlobalConstant.LETTER_NUMBER_UNDERLINE_DASH_1_50, message = "CommonCollector.code", groups = {Save.class, Update.class})
    @ExcelProperty(value = "采集器编码",index = 0)
    private String code;

    @ApiModelProperty("采集器名称")
    @TableField("name")
    @Length(min = 1,max=20,message = "CommonCollector.name", groups = {Save.class, Update.class})
    @ExcelProperty(value = "采集器名称",index = 1)
    private String name;

    @ApiModelProperty("采集器类型")
    @ValidatedEnum(enumClass = CollectorTypeEnum.class, required = true, message = "CommonCollector.type", groups = {Save.class, Update.class})
    @TableField("type")
    @ExcelProperty(value = "采集器类型",index = 3)
    private String type;

    @TableField(exist = false)
    @ExcelIgnore
    private String typeName;

    @ApiModelProperty("网关ID")
    @TableField("gate_way_id")
    @ExcelProperty(value = "网关ID",index = 2)
    private String gateWayId;

    @ExcelIgnore
    @TableField(exist = false)
    private String gateWayIdName;

    @ApiModelProperty("掉线时长")
    @TableField(value = "offline_duration",fill = FieldFill.UPDATE )
    @Min(value = 1, message = "CommonCollector.offlineDuartion", groups = {Save.class, Update.class})
    @Max(value = 999, message = "CommonCollector.offlineDuartion", groups = {Save.class, Update.class})
    @ExcelIgnore
    private Integer offlineDuration;

    @TableField(exist = false)
    @ExcelIgnore
    @ApiModelProperty("关联对象Id")
    private String associatedDeviceId;
    @TableField(exist = false)
    @ExcelIgnore
    @ApiModelProperty("关联对象名称")
    private String associatedDeviceName;

    @ExcelProperty(value = "掉线时长（min）",index = 4)
    @TableField(exist = false)
    private String offlineDurationStr;

    @TableField(exist = false)
    @ExcelIgnore
    private List<CommonDataItem> dataItems;

    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty("分组后的数据项列表")
    private List<Map<String, Object>> dataItemsAfterGroup;

    @TableField(exist = false)
    @ExcelIgnore
    private Integer index;

    @ApiModelProperty(hidden = true)
    @ExcelIgnore
    @TableField(exist = false)
    private String shutdownTime;

    @ApiModelProperty(hidden = true)
    @ExcelIgnore
    @TableField(exist = false)
    private String deviceId;
}
