package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import feign.Param;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * <p>
 * 预警参数配置
 * </p>
 *
 * @author csy
 * @since 2023-11-14
 */
@Getter
@Setter
@TableName("common_notice_parameter")
@ApiModel(value = "CommonNoticeParameter对象", description = "预警参数配置")
public class CommonNoticeParameter extends BaseEntity {

    @ApiModelProperty("参数名称")
    @TableField("name")
    @Length(max =20,min = 1, message = "[参数名称] 长度1~20、支持中文、字母、数字和常用符号", groups = {Save.class, Update.class})
    private String name;

    @ApiModelProperty("参数说明")
    @TableField("param_desc")
    @Length(max =40,min = 1, message = "[参数说明] 长度1~40、支持中文、字母、数字和常用符号", groups = {Save.class, Update.class})
    private String paramDesc;

    @ApiModelProperty("参数查询数据sql")
    @TableField("sql_parameter")
    @Length(max =5000,min = 1, message = "[数据来源] 长度1~1000", groups = {Save.class, Update.class})
    private String sqlParameter;

    @ApiModelProperty("参数单位")
    @TableField("unit")
    @Length(max =20,min = 0, message = "[规则单位] 长度0~20、支持中文、字母、数字和常用符号", groups = {Save.class, Update.class})
    private String unit;

    @ApiModelProperty("参考值")
    @TableField("reference")
    @Length(max =20,min = 0, message = "[参考值] 长度0~20、支持中文、字母、数字和常用符号", groups = {Save.class, Update.class})
    private String reference;

    @ApiModelProperty("菜单")
    @TableField(value = "menu_code",updateStrategy = FieldStrategy.ALWAYS )
    private String menuCode;

    @ApiModelProperty("菜单")
    @TableField("menu_name")
    private String menuName;

}
