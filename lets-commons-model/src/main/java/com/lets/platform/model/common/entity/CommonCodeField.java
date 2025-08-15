package com.lets.platform.model.common.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * 编码规则字段维护表
 * @author FZY
 * @since 2023-07-05
 */
@Getter
@Setter
@TableName("common_code_field")
@ApiModel(value = "CommonCodeField对象", description = "编码规则字段维护表")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommonCodeField {
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    @ExcelIgnore
    private String id;

    @ApiModelProperty("菜单编码")
    @TableField("menu_code")
    private String menuCode;

    @ApiModelProperty("菜单名称")
    @TableField(exist = false)
    private String menuName;

    @ApiModelProperty("菜单类型[0:web 1:小程序 2:工位机]")
    @TableField("menu_type")
    private Integer menuType;

    @ApiModelProperty("表名")
    @TableField("table_name")
    private String tableName;

    @ApiModelProperty("表中文名")
    @TableField("table_display_name")
    private String tableDisplayName;

    @ApiModelProperty("关联字段")
    @TableField("field")
    private String field;

    @ApiModelProperty("字段显示名称")
    @TableField("field_name")
    private String fieldName;

    @ApiModelProperty("字段总长度")
    @TableField("length")
    private Integer length;

    @ApiModelProperty("是否目标字段 [0:否;1:是]")
    @TableField("is_target")
    private Integer isTarget;

    @ApiModelProperty("是否日期字段 [0:否;1:是]")
    @TableField("is_datetime")
    private Integer isDatetime;

    @ApiModelProperty("是否批号编码")
    @TableField("is_batch_code")
    private Integer isBatchCode;

}
