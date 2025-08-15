package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.enums.NoticeTypeEnum;
import com.lets.platform.model.common.enums.NoticeUrgentEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.List;

/**
 * <p>
 * 预警规则表
 * </p>
 *
 * @author csy
 * @since 2023-11-15
 */
@Getter
@Setter
@TableName("common_notice_rule")
@ApiModel(value = "CommonNoticeRule对象", description = "预警规则表")
public class CommonNoticeRule extends BaseEntity {

    @ApiModelProperty("规则名称")
    @TableField("name")
    @Length(max = 20, min = 1, message = "[规则名称] 长度1~20、支持中文、字母、数字和常用符号", groups = {Save.class, Update.class})
    private String name;

    @ApiModelProperty("规则备注")
    @TableField("remark")
    @Length(max = 40, min = 0, message = "[规则备注] 长度1~40、支持中文、字母、数字和常用符号", groups = {Save.class, Update.class})
    private String remark;

    @ApiModelProperty("预警类型 1：设备 2：能源 3:单据")
    @TableField("type")
    @ValidatedEnum(enumClass = NoticeTypeEnum.class, message = "[预警类型] 非法", groups = {Save.class, Update.class})
    private String type;
    @TableField(exist = false)
    private String typeName;

    @ApiModelProperty("预警等级[1高,2低]")
    @TableField("level")
    @ValidatedEnum(enumClass = NoticeUrgentEnum.class, message = "[预警等级] 非法", groups = {Save.class, Update.class})
    private String level;
    @TableField(exist = false)
    private String levelName;

    @ApiModelProperty("预警频率")
    @TableField("notice_rate")
    @Max(value = 1440, message = "[预警频率] 范围1-1440", groups = {Save.class, Update.class})
    @Min(value = 1, message = "[预警频率] 范围1-1440", groups = {Save.class, Update.class})
    private Integer noticeRate;

    @TableField("enable")
    @ApiModelProperty("启用/停用")
    private Integer enable;
    @TableField(exist = false)
    private String enableName;

    @TableField("is_todo")
    @ApiModelProperty("任务待办")
    private String isTodo;

    @TableField(exist = false)
    private String timesStr;

    @TableField(exist = false)
    private List<CommonNoticeTime> times;
    @TableField(exist = false)
    private List<CommonNoticeCondition> conditions;
}
