/*
 * csy
 */

package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Pattern;
import java.util.List;

/**
 * <p>
 * 计量仪器台账分组
 * </p>
 *
 * @author csy
 * @since 2025-02-18
 */
@Getter
@Setter
@TableName("common_meter_group")
@ApiModel(value = "CommonMeterGroup对象", description = "计量仪器台账分组")
public class CommonMeterGroup extends BaseEntity {

    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("描述")
    @TableField("description")
    private String description;

    @ApiModelProperty("父级分组")
    @TableField("parent_id")
    private String parentId;

    @TableField(exist = false)
    private List<CommonMeterGroup>  children;
}
