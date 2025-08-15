package com.lets.platform.model.common.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.baomidou.mybatisplus.annotation.FieldFill;
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
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.List;

/**
 * <p>
 * 数据项分组
 * </p>
 *
 * @author zhangweiyan
 * @since 2023-10-31
 */
@Getter
@Setter
@TableName("common_data_item_group")
@ApiModel(value = "CommonDataItemGroup对象", description = "数据项分组")
public class CommonDataItemGroup extends BaseEntity {

    @ApiModelProperty("分组编码")
    @TableField("code")
    @NotBlank
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_20, message = "CommonItemGroup.code", groups = {Save.class, Update.class})
    private String code;

    @ApiModelProperty("分组名称")
    @TableField("name")
    @NotBlank
    @Length(min = 1, max = 20, message = "CommonItemGroup.name", groups = {Save.class, Update.class})
    private String name;

    @ApiModelProperty("是否删除 0：未删除；1：已删除")
    @TableField(value = "deleted", fill = FieldFill.INSERT)
    private String deleted;

    @ApiModelProperty("子节点")
    @TableField(exist=false)
    private List<CommonDataItemGroup> children;

    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty(value = "后端没有实际用处,只是前端不好展示用到", hidden = true)
    private String parentId;

    @ApiModelProperty("描述")
    @TableField("description")
    private String description;


}
