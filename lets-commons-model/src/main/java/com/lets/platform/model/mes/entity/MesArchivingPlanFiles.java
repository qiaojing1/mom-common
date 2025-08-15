package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 产品档案打印所有附件明细
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-09-23
 */
@Getter
@Setter
@TableName("mes_archiving_plan_files")
@ApiModel(value = "MesArchivingPlanFiles对象", description = "产品档案打印所有附件明细")
public class MesArchivingPlanFiles extends BaseEntity {

    @ApiModelProperty("方案主表id")
    @TableField("plan_id")
    private String planId;

    @ApiModelProperty("方案目录id")
    @TableField("catalogue_id")
    private String catalogueId;

    @ApiModelProperty("方案目录id")
    @TableField("catalogue_name")
    private String catalogueName;

    @ApiModelProperty("销售出库单明细id")
    @TableField("sale_stock_out_detail_id")
    private String saleStockOutDetailId;

    @ApiModelProperty("文件id")
    @TableField("file_id")
    private String fileId;

    @ApiModelProperty("文件名称")
    @TableField("file_name")
    private String fileName;

    @ApiModelProperty("上传时间")
    @TableField("upload_time")
    private LocalDateTime uploadTime;

    @ApiModelProperty("上传人员")
    @TableField("upload_user")
    private String uploadUser;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;
}
