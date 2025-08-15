package com.lets.platform.model.psi.entity;

import cn.hutool.core.util.StrUtil;
import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.psi.mrpModel.BomModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * <p>
 * mrp供需明细表
 * </p>
 *
 * @author FZY
 * @since 2023-12-26
 */
@Getter
@Setter
@TableName("psi_mrp_supply_and_demand_detail")
@ApiModel(value = "PsiMrpSupplyAndDemandDetail对象", description = "mrp供需明细表")
public class PsiMrpSupplyAndDemandDetail extends BaseEntity {

    @TableField("bom_level")
    @ExcelProperty(value = "层级", index = 0)
    private String bomLevel;

    @ApiModelProperty("物料编码")
    @TableField("material_code")
    @ExcelProperty(value = "物料编码", index = 1)
    private String materialCode;

    @ApiModelProperty("物料名称")
    @TableField("material_name")
    @ExcelProperty(value = "物料名称", index = 2)
    private String materialName;

    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    @ExcelProperty(value = "规格型号", index = 3)
    private String materialSpecs;

    @ApiModelProperty("特征属性名称")
    @TableField("material_specific_names")
    @ExcelProperty(value = "特征属性", index = 4)
    private String materialSpecificNames;

    @ApiModelProperty("bom版本")
    @TableField("bom_version")
    @ExcelProperty(value = "BOM版本", index = 5)
    private String bomVersion;

    @TableField(exist = false)
    @ExcelProperty(value = "计划跟踪号", index = 6)
    private String trackNo;

    @ApiModelProperty("供需类型[0:供应;1:需求]")
    @TableField(exist = false)
    @ExcelProperty(value = "供需类型", index = 7)
    private String typeName;

    @ApiModelProperty("日期")
    @TableField("date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ExcelProperty(value = "供需日期", index = 8)
    private LocalDateTime date;

    @ApiModelProperty("单据类型")
    @TableField(exist = false)
    @ExcelProperty(value = "单据类型", index = 9)
    private String orderTypeName;

    @ApiModelProperty("单据编号")
    @TableField("order_code")
    @ExcelProperty(value = "单据编号", index = 10)
    private String orderCode;

    @ApiModelProperty("行号")
    @TableField("line_number")
    @ExcelProperty(value = "行号", index = 11)
    private Long lineNumber;

    @ApiModelProperty("数量")
    @TableField("quantity")
    @ExcelProperty(value = "数量", index = 12)
    private BigDecimal quantity;

    @ApiModelProperty("单位名称")
    @TableField("unit_name")
    @ExcelProperty(value = "单位", index = 13)
    private String unitName;

    @TableField(exist = false)
    @ExcelProperty(value = "顶级需求编号", index = 14)
    private String rootOrderCode;

    @TableField(exist = false)
    @ExcelProperty(value = "顶级需求行号", index = 15)
    private Long rootLineNumber;

    @TableField(exist = false)
    @ExcelProperty(value = "需求物料编号", index = 16)
    private String rootMaterialCode;

    @TableField(exist = false)
    @ExcelProperty(value = "需求物料名称", index = 17)
    private String rootMaterialName;

    @TableField(exist = false)
    @ExcelProperty(value = "需求物料规格型号", index = 18)
    private String rootMaterialSpecs;

    @TableField(exist = false)
    @ExcelProperty(value = "客户", index = 19)
    private String rootCustomerName;

    @ApiModelProperty("MRP任务ID")
    @TableField("task_id")
    @ExcelIgnore
    private String taskId;

    @ApiModelProperty("单据类型")
    @TableField("order_type")
    @ExcelIgnore
    private String orderType;

    @ApiModelProperty("单据ID")
    @TableField("order_id")
    @ExcelIgnore
    private String orderId;

    @ApiModelProperty("物料ID")
    @TableField("material_id")
    @ExcelIgnore
    private String materialId;

    @ApiModelProperty("物料类型")
    @TableField("material_type")
    @ExcelIgnore
    private String materialType;

    @ApiModelProperty("特征属性")
    @TableField("material_specific")
    @ExcelIgnore
    private String materialSpecific;

    @ApiModelProperty("供需类型[0:供应;1:需求]")
    @TableField("type")
    @ExcelIgnore
    private Integer type;

    @ApiModelProperty("单位ID")
    @TableField("unit_id")
    @ExcelIgnore
    private String unitId;

    @ApiModelProperty("单位ID")
    @TableField("unit_code")
    @ExcelIgnore
    private String unitCode;

    @ApiModelProperty("单位精度")
    @TableField("unit_accuracy")
    @ExcelIgnore
    private Integer unitAccuracy;

    @ApiModelProperty("单位舍入类型")
    @TableField("unit_round_off_type")
    @ExcelIgnore
    private Integer unitRoundOffType;

    @ApiModelProperty("bomID")
    @TableField("bom_id")
    @ExcelIgnore
    private String bomId;

    @ApiModelProperty("BOM版本描述")
    @TableField(exist = false)
    @ExcelIgnore
    private String bomVersionDescribe;

    @ApiModelProperty("排序")
    @TableField("sort")
    @ExcelIgnore
    private long sort;

    @ApiModelProperty("MRP生成的计划")
    @TableField(exist = false)
    @ExcelIgnore
    private Integer isGenerate;

    @TableField(exist = false)
    @ExcelIgnore
    private BomModel bomModel;

    @TableField("source_order_id")
    @ExcelIgnore
    private String sourceOrderId;

    @TableField("source_order_code")
    @ExcelIgnore
    private String sourceOrderCode;

    @TableField(exist = false)
    @ExcelIgnore
    private String sourceOrderType;

    @TableField(exist = false)
    @ExcelIgnore
    private String sourceDetailId;

    @TableField(exist = false)
    @ExcelIgnore
    private Long sourceLineNumber;

    @TableField("source_root_id")
    @ExcelIgnore
    private String sourceRootId;

    @TableField("source_root_code")
    @ExcelIgnore
    private String sourceRootCode;

    @TableField("source_root_type")
    @ExcelIgnore
    private String sourceRootType;

    @TableField("source_root_detail_id")
    @ExcelIgnore
    private String sourceRootDetailId;

    @TableField("source_root_line_number")
    @ExcelIgnore
    private Long sourceRootLineNumber;

    @TableField(exist = false)
    @ExcelIgnore
    private String rootOrderCategoryId;

    @TableField(exist = false)
    @ExcelIgnore
    private String rootMenuCode;

    @TableField(exist = false)
    @ExcelIgnore
    private String rootMaterialId;

    @TableField(exist = false)
    @ExcelIgnore
    private String rootCustomerId;

    @TableField(exist = false)
    @ExcelIgnore
    private String bomDetailId;

    @Getter
    public static class DetailModelKey {
        // Getter 方法
        private final String materialId;
        private final String materialSpecific;
        private final String bomId;
        private final BomModel bomModel;
        private final LocalDateTime date;

        public DetailModelKey(PsiMrpSupplyAndDemandDetail detail) {
            this.materialId = detail.getMaterialId();
            if (StrUtil.isNotEmpty(detail.getMaterialSpecific())) {
                this.materialSpecific = detail.getMaterialSpecific();
            } else {
                this.materialSpecific = StrUtil.EMPTY;
            }
            if (StrUtil.isNotEmpty(detail.getBomId())) {
                this.bomId = detail.getBomId();
                this.bomModel = detail.getBomModel();
            } else {
                this.bomId = StrUtil.EMPTY;
                this.bomModel = null;
            }
            this.date = detail.getDate();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {return true;}
            if (o == null || getClass() != o.getClass()) {return false;}
            PsiMrpSupplyAndDemandDetail.DetailModelKey that = (PsiMrpSupplyAndDemandDetail.DetailModelKey) o;
            return StrUtil.equals(materialId, that.getMaterialId()) && StrUtil.equals(materialSpecific, that.getMaterialSpecific()) && StrUtil.equals(bomId, that.getBomId()) && Objects.equals(date,
                                                                                                                                                                                                that.getDate());
        }

        @Override
        public int hashCode() {
            return Objects.hash(materialId, materialSpecific, bomId, date);
        }

    }

    @Getter
    public static class DetailOrderModelKey {
        // Getter 方法
        private final String sourceId;
        private final String sourceCode;
        private final String materialId;
        private final String materialSpecific;
        private final String bomId;
        private final BomModel bomModel;
        private final LocalDateTime date;

        public DetailOrderModelKey(PsiMrpSupplyAndDemandDetail detail) {
            this.sourceId = detail.getSourceOrderId();
            this.sourceCode = detail.getSourceOrderCode();
            this.materialId = detail.getMaterialId();
            if (StrUtil.isNotEmpty(detail.getMaterialSpecific())) {
                this.materialSpecific = detail.getMaterialSpecific();
            } else {
                this.materialSpecific = StrUtil.EMPTY;
            }
            if (StrUtil.isNotEmpty(detail.getBomId())) {
                this.bomId = detail.getBomId();
                this.bomModel = detail.getBomModel();
            } else {
                this.bomId = StrUtil.EMPTY;
                this.bomModel = null;
            }
            this.date = detail.getDate();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {return true;}
            if (o == null || getClass() != o.getClass()) {return false;}
            PsiMrpSupplyAndDemandDetail.DetailOrderModelKey that = (PsiMrpSupplyAndDemandDetail.DetailOrderModelKey) o;
            return StrUtil.equals(sourceId, that.getSourceId()) && StrUtil.equals(materialId, that.getMaterialId()) && StrUtil.equals(materialSpecific, that.getMaterialSpecific()) && StrUtil.equals(
                    bomId, that.getBomId()) && Objects.equals(date, that.getDate());
        }

        @Override
        public int hashCode() {
            return Objects.hash(materialId, materialSpecific, bomId, date);
        }

    }
}
