package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lets.platform.common.pojo.config.StringArrayToStringDeserialize;
import com.lets.platform.common.pojo.config.StringToStringArraySerializer;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 零件检验尺寸库
 * </p>
 *
 * @author csy
 * @since 2025-07-08
 */
@Getter
@Setter
@TableName("mes_parts_inspection_size")
@ApiModel(value = "MesPartsInspectionSize对象", description = "零件检验尺寸库")
public class MesPartsInspectionSize extends BaseEntity {

    @ApiModelProperty("图号")
    @TableField("draw_no")
    private String drawNo;

    @TableField(exist = false)
    private String code;

    @ApiModelProperty("图纸版本")
    @TableField("version")
    private String version;

    @ApiModelProperty("制图人")
    @TableField("maker_id")
    private String makerId;

    @ApiModelProperty("制图人")
    @TableField("maker_name")
    private String makerName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("检验类型")
    @TableField("inspect_type")
    @JsonSerialize(using = StringToStringArraySerializer.class)
    @JsonDeserialize(using = StringArrayToStringDeserialize.class)
    private String inspectType;
    @ApiModelProperty("检验类型")
    @TableField(exist = false)
    private String inspectTypeName;

    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;
    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;
    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @TableField("enable")
    private Integer enable;
    @TableField(exist = false)
    private String enableName;

    @TableField(exist = false)
    private List<MesPartsInspectionSizeDetail> details;

    @TableField(exist = false)
    private List<MesPartsInspectionSizeMaterial> materials;

    @TableField(exist = false)
    private List<CommonFile> fileList;

    @TableField(exist = false)
    private String orderId;

    @TableField(exist = false)
    private String detailId;

    @ApiModelProperty("尺寸类型")
    @TableField(exist = false)
    private String sizeType;
    @TableField(exist = false)
    private String sizeTypeName;

    @ApiModelProperty("尺寸名称")
    @TableField(exist = false)
    private String sizeName;

    @ApiModelProperty("尺寸代号")
    @TableField(exist = false)
    private String sizeMark;

    @ApiModelProperty("标准")
    @TableField(exist = false)
    private BigDecimal standard;

    @ApiModelProperty("下公差")
    @TableField(exist = false)
    private BigDecimal min;

    @ApiModelProperty("上公差")
    @TableField(exist = false)
    private BigDecimal max;

    @ApiModelProperty("计量仪器")
    @TableField(exist = false)
    private String meterId;

    @ApiModelProperty("计量仪器")
    @TableField(exist = false)
    private String meterName;
}
