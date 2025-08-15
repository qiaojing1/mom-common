package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.annotation.ValidBigDecimal;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.constant.GlobalConstant;
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
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * BOM模板管理
 * @author DING WEI
 * @since 2025-03-05
 */
@Getter
@Setter
@TableName("mes_bom_template")
@ApiModel(value = "MesBomTemplate对象", description = "BOM模板管理")
public class MesBomTemplate extends BaseEntity {

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

    @ApiModelProperty("物料主键")
    @TableField("material_id")
    private String materialId;
    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;
    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;
    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;
    @ApiModelProperty("物料类型[采购件、自制件、委外件、虚拟件]")
    @TableField("material_type")
    private String materialType;

    @ApiModelProperty("物料分组主键")
    @TableField("material_group_id")
    private String materialGroupId;
    @ApiModelProperty("物料分组名称")
    @TableField("material_group_name")
    private String materialGroupName;

    @ApiModelProperty(value = "必须有BOM", hidden = true)
    @TableField("must_has_bom")
    private String mustHasBom;

    @ApiModelProperty("生产单位")
    @TableField("product_unit_id")
    private String productUnitId;
    @TableField("product_unit_name")
    private String productUnitName;
    @TableField("product_unit_accuracy")
    private Integer productUnitAccuracy;
    @TableField("product_unit_round_off_type")
    private Integer productUnitRoundOffType;

    @ValidBigDecimal(message = "MesBom.finishProductRate", min = "0.01", max = "100.00", includeMin = true, groups = {Save.class, Update.class})
    @ApiModelProperty("成品率")
    @TableField("finish_product_rate")
    private BigDecimal finishProductRate;

    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_40, message = "MesBom.bomVersion", groups = {Save.class, Update.class})
    @ApiModelProperty("版本号")
    @TableField("bom_version")
    private String bomVersion;
    @Length(max = 40, message = "[BOM版本描述]长度1~40，输入：中文、字母、数字、符号", groups = {Save.class, Update.class})
    @ApiModelProperty("BOM版本描述")
    @TableField("bom_version_describe")
    private String bomVersionDescribe;
    @ApiModelProperty(value = "excel导入时的版本号", hidden = true)
    @TableField(exist = false)
    private String bomVersionWhenExcel;

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

    @ApiModelProperty("扩展规格属性分类")
    @TableField(exist = false)
    private List<MesBomTemplateDetailEsa> extFlList;
    @ApiModelProperty("扩展规格属性分类一")
    @TableField("ext_fl1")
    private String extFl1;
    @ApiModelProperty("扩展规格属性分类二")
    @TableField("ext_fl2")
    private String extFl2;
    @ApiModelProperty("扩展规格属性分类三")
    @TableField("ext_fl3")
    private String extFl3;
    @ApiModelProperty("扩展规格属性分类四")
    @TableField("ext_fl4")
    private String extFl4;
    @ApiModelProperty("扩展规格属性分类五")
    @TableField("ext_fl5")
    private String extFl5;
    @ApiModelProperty("扩展规格属性分类六")
    @TableField("ext_fl6")
    private String extFl6;
    @ApiModelProperty("扩展规格属性分类七")
    @TableField("ext_fl7")
    private String extFl7;
    @ApiModelProperty("扩展规格属性分类八")
    @TableField("ext_fl8")
    private String extFl8;
    @ApiModelProperty("扩展规格属性分类九")
    @TableField("ext_fl9")
    private String extFl9;
    @ApiModelProperty("扩展规格属性分类十")
    @TableField("ext_fl10")
    private String extFl10;
    @ApiModelProperty("扩展规格属性分类十一")
    @TableField("ext_fl11")
    private String extFl11;
    @ApiModelProperty("扩展规格属性分类十二")
    @TableField("ext_fl12")
    private String extFl12;
    @ApiModelProperty("扩展规格属性分类十三")
    @TableField("ext_fl13")
    private String extFl13;
    @ApiModelProperty("扩展规格属性分类十四")
    @TableField("ext_fl14")
    private String extFl14;
    @ApiModelProperty("扩展规格属性分类十五")
    @TableField("ext_fl15")
    private String extFl15;
    @ApiModelProperty("扩展规格属性分类十六")
    @TableField("ext_fl16")
    private String extFl16;
    @ApiModelProperty("扩展规格属性分类十七")
    @TableField("ext_fl17")
    private String extFl17;
    @ApiModelProperty("扩展规格属性分类十八")
    @TableField("ext_fl18")
    private String extFl18;
    @ApiModelProperty("扩展规格属性分类十九")
    @TableField("ext_fl19")
    private String extFl19;
    @ApiModelProperty("扩展规格属性分类二十")
    @TableField("ext_fl20")
    private String extFl20;
    @ApiModelProperty("扩展规格属性分类二十一")
    @TableField("ext_fl21")
    private String extFl21;
    @ApiModelProperty("扩展规格属性分类二十二")
    @TableField("ext_fl22")
    private String extFl22;
    @ApiModelProperty("扩展规格属性分类二十三")
    @TableField("ext_fl23")
    private String extFl23;
    @ApiModelProperty("扩展规格属性分类二十四")
    @TableField("ext_fl24")
    private String extFl24;
    @ApiModelProperty("扩展规格属性分类二十五")
    @TableField("ext_fl25")
    private String extFl25;
    @ApiModelProperty("扩展规格属性分类二十六")
    @TableField("ext_fl26")
    private String extFl26;
    @ApiModelProperty("扩展规格属性分类二十七")
    @TableField("ext_fl27")
    private String extFl27;
    @ApiModelProperty("扩展规格属性分类二十八")
    @TableField("ext_fl28")
    private String extFl28;
    @ApiModelProperty("扩展规格属性分类二十九")
    @TableField("ext_fl29")
    private String extFl29;
    @ApiModelProperty("扩展规格属性分类三十")
    @TableField("ext_fl30")
    private String extFl30;
    @ApiModelProperty("扩展规格属性分类三十一")
    @TableField("ext_fl31")
    private String extFl31;
    @ApiModelProperty("扩展规格属性分类三十二")
    @TableField("ext_fl32")
    private String extFl32;
    @ApiModelProperty("备注一")
    @TableField("remark1")
    private String remark1;
    @ApiModelProperty("备注二")
    @TableField("remark2")
    private String remark2;

    @ApiModelProperty("拓展规格属性哈希")
    @TableField("ext_hash")
    private Integer extHash;

    @ApiModelProperty("展示拓展规格属性")
    @TableField("show_ext")
    private String showExt;

    @ApiModelProperty("状态")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;

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

    @Valid
    @ApiModelProperty("子项-明细")
    @TableField(exist = false)
    private List<MesBomTemplateDetail> details;

    @ApiModelProperty("子级BOM")
    @TableField(exist = false)
    private List<MesBomTemplate> children;

    public String parentIdNotNull() {
        if (StringUtils.isEmpty(parentId)) {
            return "-1";
        } else {
            return parentId;
        }
    }

}
