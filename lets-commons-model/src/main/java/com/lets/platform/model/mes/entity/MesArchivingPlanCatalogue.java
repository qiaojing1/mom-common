package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * <p>
 * 产品档案方案目录
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-09-20
 */
@Getter
@Setter
@TableName("mes_archiving_plan_catalogue")
@ApiModel(value = "MesArchivingPlanCatalogue对象", description = "产品档案方案目录")
public class MesArchivingPlanCatalogue extends BaseEntity {

    @ApiModelProperty("方案主表id")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("目录名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("目录标识id")
    @TableField("mark_id")
    private String markId;

    @ApiModelProperty("数据来源 0:自动生成 1:手动上传")
    @TableField("source_type")
    private String sourceType;

    @ApiModelProperty("目录类型 0:目录 1:其他")
    @TableField("type")
    private String type;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("文件id")
    @TableField("enclosure_ids")
    private String enclosureIds;

    @ApiModelProperty("明细数组")
    @TableField(exist = false)
    private List<MesArchivingPlanDetail> detailList;

    @ApiModelProperty("附件数组")
    @TableField(exist = false)
    private List<CommonFile> enclosureFileList;
}
