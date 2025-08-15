package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.psi.vo.PsiContainerMaterialRecordGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 * 容器条码
 * </p>
 *
 * @author csy
 * @since 2024-03-19
 */
@Getter
@Setter
@TableName("psi_container_code")
@ApiModel(value = "PsiContainerCode对象", description = "容器条码")
public class PsiContainerCode extends BaseEntity {

    @ApiModelProperty("容器条码")
    @TableField("code")
    private String code;

    @ApiModelProperty("容器主键")
    @TableField("container_id")
    private String containerId;

    @ApiModelProperty("容器编码")
    @TableField("container_code")
    private String containerCode;

    @ApiModelProperty("容器名称")
    @TableField("container_name")
    private String containerName;

    @ApiModelProperty("容器类型")
    @TableField("container_type")
    private Integer containerType;
    @TableField(exist = false)
    private String containerTypeName;

    /**
     * @see com.lets.platform.model.psi.enums.ContainerCodeStatusEnum
     */
    @ApiModelProperty("使用状态")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;

    /**
     * @see com.lets.platform.model.psi.enums.BarcodeGenerateSourceEnum
     */
    @ApiModelProperty("生成来源[scanPacking:扫码装箱]")
    @TableField("generate_source")
    private String generateSource;

    @ApiModelProperty("打印模板ID")
    @TableField("export_template_id")
    private String exportTemplateId;

    @ApiModelProperty("打印模板名称")
    @TableField("export_template_name")
    private String exportTemplateName;
    @TableField(exist = false)
    private String materialCode;
    @TableField(exist = false)
    private String materialName;
    @TableField(exist = false)
    private String materialType;
    @TableField(exist = false)
    private String materialSpecs;
    @TableField(exist = false)
    private String materialCharacteristicNames;
    @TableField(exist = false)
    private String batchNumber;

    @ApiModelProperty("容器容量")
    @TableField(exist = false)
    private Integer capacity;
    @ApiModelProperty("标签数量(装箱数量)")
    @TableField("total_quantity")
    private BigDecimal totalQuantity;

    @ApiModelProperty("源单主键(装箱物料条码)")
    @TableField("source_id")
    private String sourceId;
    @ApiModelProperty("源单编码(装箱物料条码)")
    @TableField("source_code")
    private String sourceCode;
    @ApiModelProperty("源单明细主键(装箱物料条码)")
    @TableField("source_detail_id")
    private String sourceDetailId;

    @TableField(exist = false)
    private List<PsiMaterialBarcode> barcodeList;

    @TableField(exist = false)
    private List<PsiMaterialBarcode> materialList;

    @TableField(exist = false)
    private List<PsiContainerMaterialRecord> recordList;

    @TableField(exist = false)
    private List<PsiContainerMaterialRecordGroup> recordGroupList;
}
