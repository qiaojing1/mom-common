package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * <p>
 * 报警拦截规则表头
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-04-16
 */
@Getter
@Setter
@TableName("coll_interception_rules")
@ApiModel(value = "CollInterceptionRules对象", description = "报警拦截规则表头")
public class CollInterceptionRules extends BaseEntity {

    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("拦截规则名称")
    @TableField("name")
    @NotBlank(message = "拦截规则名称不能为空")
    @Size(max = 20, message = "拦截规则名称长度不能超过20个字符")
    private String name;

    @ApiModelProperty("拦截报警码，,分割，~代表区间,区间报警码仅支持数字")
    @TableField("interception_code")
    @NotBlank(message = "拦截报警码不能为空")
    @Size(max = 1000, message = "拦截报警码长度不能超过1000个字符")
    private String interceptionCode;

    @ApiModelProperty("拦截规则说明")
    @TableField("remark")
    @NotBlank(message = "拦截规则说明不能为空")
    @Size(max = 200, message = "拦截规则说明长度不能超过200个字符")
    private String remark;

    @TableField("enable")
    private String enable;
    @TableField(exist = false)
    private String enableName;

    @TableField(exist = false)
    private List<CollInterceptionRulesDetail> details;
}
