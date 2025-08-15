package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 工艺文件管理表体关联关系
 * </p>
 *
 * @author zhangweiyan
 * @since 2023-11-06
 */
@Getter
@Setter
@TableName("common_process_file_association")
@ApiModel(value = "CommonProcessFileAssociation对象", description = "工艺文件管理表体关联关系")
public class CommonProcessFileAssociation extends BaseEntity  {

    @ApiModelProperty("关联id")
    @TableField("relation_id")
    private String relationId;

    @ApiModelProperty("对应编码（如表头中保存的适用范围为【物料】时，这里的编码就对应物料编码）")
    @TableField("code")
    private String code;

    @ApiModelProperty("对应名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("关联的工艺文档id")
    @TableField("process_file_id")
    private String processFileId;

    @ApiModelProperty("描述")
    @TableField("remark")
    private String remark;

    @TableField(exist = false)
    private String specs = "";

    @TableField(exist = false)
    private String materialGroupName = "";


}
