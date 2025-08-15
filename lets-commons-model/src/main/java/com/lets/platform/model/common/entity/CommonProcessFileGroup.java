package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.util.List;

/**
 * <p>
 * 工艺文件分组
 * </p>
 *
 * @author zhangweiyan
 * @since 2023-11-06
 */
@Getter
@Setter
@TableName("common_process_file_group")
@ApiModel(value = "CommonProcessFileGroup对象", description = "工艺文件分组")
public class CommonProcessFileGroup extends BaseEntity {

    @ApiModelProperty("分组编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("分组名称")
    @TableField("name")
    @Length(min = 1, max = 40, message = "CommonProcessFileGroup.name.notNull")
    private String name;

    @ApiModelProperty("上级id")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("描述")
    @TableField("description")
    private String remark;

    @TableField(exist = false)
    @ApiModelProperty("子节点")
    private List<CommonProcessFileGroup> children;
}
