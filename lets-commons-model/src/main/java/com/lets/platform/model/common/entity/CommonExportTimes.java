package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 导出(打印)-打印次数
 * @author DING WEI
 * @since 2023-10-25
 */
@Getter
@Setter
@TableName("common_export_times")
@ApiModel(value = "CommonExportTimes对象", description = "导出(打印)-打印次数")
public class CommonExportTimes extends BaseEntity {

    @ApiModelProperty("菜单编码(功能)")
    @TableField("menu_code")
    private String menuCode;

    @ApiModelProperty("单据类别主键")
    @TableField("order_category_id")
    private String orderCategoryId;

    @ApiModelProperty("打印数据主键")
    @TableField("data_id")
    private String dataId;

    @ApiModelProperty("打印次数")
    @TableField("times")
    private Long times;
}
