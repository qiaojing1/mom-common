package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.annotation.ValidBigDecimal;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import com.lets.platform.model.mes.enums.BomTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * BOM管理
 * @author DING WEI
 * @since 2023-11-07
 */
@Getter
@Setter
@TableName("mes_bom")
@ApiModel(value = "MesBom对象", description = "BOM管理")
public class MesBom extends BaseEntity {

    @TableField(exist = false)
    private String bomId;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Integer index;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String sheetName;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String materialCodeAndVersion;
    /**
     * @see com.lets.platform.model.mes.enums.ReverseTypeEnum
     */
    @ApiModelProperty("反向查询方式[1逐级反查2单级反查3末级反查]")
    @TableField(exist = false)
    private String reverseType;

    @TableField(exist = false)
    private Collection<String> ids;
    @TableField(exist = false)
    private Collection<String> bomIds;
    @TableField(exist = false)
    private Collection<String> bomVersionIds;
    @TableField(exist = false)
    private Collection<String> bomOrVersionIds;
    /**
     * @see com.lets.platform.model.mes.enums.BomEffectivenessCheckTypeEnum
     */
    @ApiModelProperty("检查类型[1检查产品 2检查BOM]")
    @TableField(exist = false)
    private String effectivenessCheckType;

    @ApiModelProperty("编码")
    @TableField("code")
    private String code;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String excelCode;

    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @ValidatedEnum(enumClass = BomTypeEnum.class, required = true, message = "MesBom.type", groups = {Save.class, Update.class})
    @ApiModelProperty("BOM类型[0分组1制造BOM2订单BOM]")
    @TableField("type")
    private Integer type;
    @TableField(exist = false)
    private String typeName;

    //@NotBlank(message = "MesBom.materialId", groups = {Save.class, Update.class})
    @ApiModelProperty("物料主键")
    @TableField("material_id")
    private String materialId;
    //@NotBlank(message = "MesBom.materialCode", groups = {Save.class, Update.class})
    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;
    @NotBlank(message = "MesBom.materialName", groups = {Save.class, Update.class})
    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;
    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;
    @ApiModelProperty("物料类型[采购件、自制件、委外件、虚拟件]")
    @TableField("material_type")
    private String materialType;

    @TableField(exist = false)
    private String materialGroupId;
    @TableField(exist = false)
    private String materialGroupName;

    @ApiModelProperty(value = "必须有BOM", hidden = true)
    @TableField("must_has_bom")
    private String mustHasBom;

    @NotBlank(message = "MesBom.productUnitId", groups = {Save.class, Update.class})
    @ApiModelProperty("生产单位")
    @TableField("product_unit_id")
    private String productUnitId;
    @TableField("product_unit_name")
    private String productUnitName;
    @TableField("product_unit_accuracy")
    private Integer productUnitAccuracy;
    @TableField("product_unit_round_off_type")
    private Integer productUnitRoundOffType;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("可用库存")
    @TableField(exist = false)
    private BigDecimal storeNumber;

    @ValidBigDecimal(message = "MesBom.finishProductRate", min = "0.01", max = "100.00", includeMin = true, groups = {Save.class, Update.class})
    @ApiModelProperty("成品率")
    @TableField("finish_product_rate")
    private BigDecimal finishProductRate;

    //@Pattern(regexp = GlobalConstant.NOT_CHINESE_1_40, message = "MesBom.bomVersion", groups = {Save.class, Update.class})
    @ApiModelProperty("版本号")
    @TableField("bom_version")
    private String bomVersion;
    @TableField(exist = false)
    private String bomVersionId;
    @Length(max = 40, message = "[BOM版本描述]长度1~40，输入：中文、字母、数字、符号", groups = {Save.class, Update.class})
    @ApiModelProperty("BOM版本描述")
    @TableField("bom_version_describe")
    private String bomVersionDescribe;
    @ApiModelProperty(value = "excel导入时的版本号", hidden = true)
    @TableField(exist = false)
    private String bomVersionWhenExcel;

    @NotBlank(message = "MesBom.groupId", groups = {Save.class, Update.class})
    @ApiModelProperty("所属分组")
    @TableField("group_id")
    private String groupId;
    @TableField(exist = false)
    private String groupName;

    @ApiModelProperty(value = "父级主键", hidden = true)
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("附件")
    @TableField("enclosure_ids")
    private String enclosureIds;
    @TableField(exist = false)
    private List<CommonFile> enclosureFileList;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("状态")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;
    @ApiModelProperty("是否忽略审核状态[true忽略状态、false不忽略状态]")
    @TableField(exist = false)
    private Boolean ignoreStatus;

    @ApiModelProperty("是否启用[0停用1启用]")
    @TableField("enable")
    private Integer enable;
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;
    @TableField(exist = false)
    private String auditTimeFormat;
    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;
    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String materialMatchKey;

    @Valid
    @ApiModelProperty("子项-明细")
    @TableField(exist = false)
    private List<MesBomDetail> details;

    @ApiModelProperty("子级BOM")
    @TableField(exist = false)
    private List<MesBom> children;

    public String parentIdNotNull() {
        if (StringUtils.isEmpty(parentId)) {
            return "-1";
        } else {
            return parentId;
        }
    }
}
