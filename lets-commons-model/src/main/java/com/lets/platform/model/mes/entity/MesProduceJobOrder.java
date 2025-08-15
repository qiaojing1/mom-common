package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.annotation.ValidBigDecimal;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.base.enums.ProduceJobStatusEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 生产作业单
 *
 * @author DING WEI
 * @since 2024-02-21
 */
@Getter
@Setter
@TableName("mes_produce_job_order")
@ApiModel(value = "MesProduceJobOrder对象", description = "生产作业单")
public class MesProduceJobOrder extends BaseEntity {

    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_40, message = "MesProduceJobOrder.code", groups = {Save.class, Update.class})
    @ApiModelProperty("作业编号")
    @TableField("code")
    private String code;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "MesProduceJobOrder.orderTime", groups = {Save.class, Update.class})
    @ApiModelProperty("作业单日期")
    @TableField("order_time")
    private LocalDateTime orderTime;

    @NotBlank(message = "MesProduceJobOrder.materialId", groups = {Save.class, Update.class})
    @ApiModelProperty("物料主键")
    @TableField("material_id")
    private String materialId;

    @NotBlank(message = "MesProduceJobOrder.materialCode", groups = {Save.class, Update.class})
    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;

    @NotBlank(message = "MesProduceJobOrder.materialName", groups = {Save.class, Update.class})
    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;

    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;

    @ApiModelProperty("物料分组主键")
    @TableField("material_group_id")
    private String materialGroupId;

    @NotBlank(message = "MesProduceJobOrder.bomId", groups = {Save.class, Update.class})
    @ApiModelProperty("BOM版本")
    @TableField("bom_id")
    private String bomId;
    @ApiModelProperty("BOM编码")
    @TableField("bom_code")
    private String bomCode;
    @NotBlank(message = "MesProduceJobOrder.bomVersion", groups = {Save.class, Update.class})
    @ApiModelProperty("BOM版本")
    @TableField("bom_version")
    private String bomVersion;

    @NotBlank(message = "MesProduceJobOrder.routeId", groups = {Save.class, Update.class})
    @ApiModelProperty("工艺路线")
    @TableField("route_id")
    private String routeId;
    @ApiModelProperty("工艺编码")
    @TableField("route_code")
    private String routeCode;
    @NotBlank(message = "MesProduceJobOrder.routeName", groups = {Save.class, Update.class})
    @ApiModelProperty("工艺路线名称")
    @TableField("route_name")
    private String routeName;

    @ApiModelProperty("生产单元")
    @TableField("factory_mode_id")
    private String factoryModeId;
    @ApiModelProperty("生产单元名称")
    @TableField("factory_mode_name")
    private String factoryModeName;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ValidBigDecimal(message = "MesProduceJobOrder.number", required = true, min = "1", max = "9999", includeMin = true, groups = {Save.class, Update.class})
    @ApiModelProperty("数量")
    @TableField("number")
    private BigDecimal number;

    @NotBlank(message = "MesProduceJobOrder.drawingNo", groups = {Save.class, Update.class})
    @Length(max = 40, message = "MesProduceJobOrder.drawingNo", groups = {Save.class, Update.class})
    @ApiModelProperty("图号")
    @TableField("drawing_no")
    private String drawingNo;
    @Length(max = 40, message = "MesProduceJobOrder.drawingVersion", groups = {Save.class, Update.class})
    @ApiModelProperty("图纸版本")
    @TableField("drawing_version")
    private String drawingVersion;

    @ValidatedEnum(enumClass = ProduceJobStatusEnum.class, message = "MesProduceJobOrder.status", groups = {Save.class, Update.class})
    @ApiModelProperty("单据状态")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @Pattern(regexp = GlobalConstant.NOT_CHINESE_10_40, message = "[起始批号]长度10-40，支持字母、数字及常用符号", groups = {Save.class, Update.class})
    @ApiModelProperty("起始批号")
    @TableField("first_batch_number")
    private String firstBatchNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("完成数量")
    @TableField(exist = false)
    private BigDecimal finishNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("生产进度")
    @TableField(exist = false)
    private BigDecimal productSchedule;

    @NotEmpty(message = "MesProduceJobOrder.detail", groups = {Save.class, Update.class})
    @ApiModelProperty("明细")
    @TableField(exist = false)
    private List<MesProduceJobOrderDetail> details;
}
