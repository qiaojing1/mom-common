package com.lets.platform.model.collection.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
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
 * 工装-清单号
 * </p>
 *
 * @author csy
 * @since 2024-11-08
 */
@Getter
@Setter
@TableName("collection_fixture_list_no")
@ApiModel(value = "CollectionFixtureListNo对象", description = "工装-清单号")
public class CollectionFixtureListNo extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer rowIndex;

    @ApiModelProperty("工装编号")
    @TableField("fixture_id")
    @ExcelIgnore
    private String fixtureId;
    @ExcelProperty("工装编号")
    @TableField(exist = false)
    private String fixtureCode;

    @ApiModelProperty("清单号")
    @TableField("list_no")
    @ExcelProperty("清单号")
    private String listNo;
}
