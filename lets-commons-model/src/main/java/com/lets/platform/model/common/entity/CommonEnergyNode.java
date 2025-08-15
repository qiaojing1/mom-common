package com.lets.platform.model.common.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
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
 * 节点管理表
 * </p>
 *
 * @author FZY
 * @since 2023-10-30
 */
@Getter
@Setter
@TableName("common_energy_node")
@ApiModel(value = "CommonEnergyNode对象", description = "节点管理表")
public class CommonEnergyNode extends BaseEntity {

    @ApiModelProperty("上级节点ID")
    @TableField("parent_id")
    @ExcelIgnore
    private String parentId;

    @ApiModelProperty("上级节点名称")
    @TableField(exist = false)
    @ExcelProperty(value = "上级节点", index = 3)
    private String parentName;

    @ApiModelProperty("节点编码")
    @TableField("code")
    @ExcelProperty(value = "节点编码", index = 0)
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_20, message = "[节点编码]长度 1~20，支持字母、数字和常用符号", groups = {Save.class, Update.class})
    private String code;

    @ApiModelProperty("节点名称")
    @TableField("name")
    @Length(min = 1, max = 20, message = "[节点名称]长度 1~20，输入：中文、字母、数字、符号", groups = {Save.class, Update.class})
    @ExcelProperty(value = "节点名称", index = 1)
    private String name;

    @ApiModelProperty("节点类型")
    @TableField("type")
    @ExcelIgnore
    private String type;

    @ApiModelProperty("节点类型名称")
    @TableField(exist = false)
    @ExcelProperty(value = "节点类型名称", index = 2)
    private String typeName;

    @ApiModelProperty("是否启用[0停用1启用]")
    @TableField("enable")
    @ExcelIgnore
    private Integer enable;

    @TableField(exist = false)
    @ExcelIgnore
    private String enableName;

    @TableField(exist = false)
    @ExcelIgnore
    private List<CommonEnergyNode> children;
}
