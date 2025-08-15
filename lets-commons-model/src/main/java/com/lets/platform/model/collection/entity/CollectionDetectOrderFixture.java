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

/**
 * <p>
 * 试验项目
 * </p>
 *
 * @author csy
 * @since 2024-12-02
 */
@Getter
@Setter
@TableName("collection_detect_order_fixture")
@ApiModel(value = "CollectionDetectOrderFixture对象", description = "试验项目")
public class CollectionDetectOrderFixture extends BaseEntity {

    @ApiModelProperty("工单id")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("工装Id")
    @TableField("fixture_id")
    private String fixtureId;

    @ApiModelProperty("工装编码")
    @TableField("fixture_code")
    private String fixtureCode;

    @ApiModelProperty("工装图号")
    @TableField("fixture_draw_no")
    private String fixtureDrawNo;

    @ApiModelProperty("工装名称")
    @TableField("fixture_name")
    private String fixtureName;
    @ApiModelProperty("工装名称")
    @TableField("fixture_name_id")
    private String fixtureNameId;

    @ApiModelProperty("工装类型")
    @TableField("fixture_type")
    private String fixtureType;
    @ApiModelProperty("工装类型")
    @TableField("fixture_type_Name")
    private String fixtureTypeName;

    @ApiModelProperty("工装尺寸")
    @TableField("fixture_size")
    private String fixtureSize;

    @ApiModelProperty("工装用途")
    @TableField("fixture_purpose")
    private String fixturePurpose;
}
