package com.lets.platform.model.collection.entity;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.collection.enums.CollDetectDictTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.util.List;
import java.util.Objects;

/**
 * <p>
 * 试压数据字典
 * </p>
 *
 * @author csy
 * @since 2024-01-08
 */
@Getter
@Setter
@TableName("collection_detect_dict")
@ApiModel(value = "CollectionDetectDict对象", description = "试压数据字典")
public class CollectionDetectDict extends BaseEntity {

    @ApiModelProperty("字段名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("第二名称（压力Class 口径NPS）")
    @TableField("name2")
    private String name2;

    @TableField(exist = false)
    private String dnValue;
    @TableField(exist = false)
    private String npsValue;

    /**
     * @see com.lets.platform.model.collection.enums.CollDetectDictTypeEnum
     */
    @ApiModelProperty("菜单类型 1:阀门类型 2:阀门分类 3:口径 4:标准 5:压力 6:介质 7:工况 8:材质 9:试验项目 10:不良原因 11:泄漏等级 12: 泄漏率单位 ")
    @TableField("type")
    private String type;

    @ApiModelProperty("应用范围")
    @TableField("scope")
    private String scope;
    @TableField(exist = false)
    private String scopeName;

    @ApiModelProperty("介质分类")
    @TableField("media_type")
    private String mediaType;
    @TableField(exist = false)
    private String mediaTypeName;

    @ApiModelProperty("泄漏率单位")
    @TableField("leakage_unit_id")
    private String leakageUnitId;
    @TableField(exist = false)
    private String leakageUnitName;

    @ApiModelProperty("YN 考察泄漏率")
    @TableField("is_check_leakage")
    private String isCheckLeakage;
    @TableField(exist = false)
    private String isCheckLeakageName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("关联标准")
    @TableField("standard_id")
    private String standardId;
    @TableField(exist = false)
    private String standardName;

    @ApiModelProperty("材质分组")
    @TableField("valve_material_group_id")
    private String valveMaterialGroupId;

    @ApiModelProperty("计量方法")
    @TableField("measurement_method")
    private String measurementMethod;

    @ApiModelProperty("实验方向")
    @TableField("detect_direction")
    private String detectDirection;

    @TableField("step")
    private Integer step;

    @ApiModelProperty("阀门类型 代号")
    @TableField("type_code")
    private String code;

    @ApiModelProperty("阀门类型 结构代号")
    @TableField("struct_code")
    private String structCode;


    @ApiModelProperty("导入列表内的行数")
    @TableField(exist = false)
    private Integer excelRowIndex;
    @TableField(exist = false)
    private String valveMaterialGroupName;

    @TableField(exist = false)
    private List<CollectionValveClassifyDetail> valveClassifyDetails;

    @TableField(exist = false)
    private Long lineNumber;
    @TableField(exist = false)
    private String valveTypeName;
    @TableField(exist = false)
    private String valveTypeId;
    @TableField(exist = false)
    private String typeName;
    @TableField(exist = false)
    private String valveClassifyId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CollectionDetectDict that = (CollectionDetectDict) o;
        return Objects.equals(getName(), that.getName()) && Objects.equals(getName2(), that.getName2()) && Objects.equals(getType(), that.getType()) && Objects.equals(getScope(), that.getScope()) && Objects.equals(getScopeName(), that.getScopeName()) && Objects.equals(getMediaType(), that.getMediaType()) && Objects.equals(getMediaTypeName(), that.getMediaTypeName()) && Objects.equals(getLeakageUnitId(), that.getLeakageUnitId()) && Objects.equals(getLeakageUnitName(), that.getLeakageUnitName()) && Objects.equals(getIsCheckLeakage(), that.getIsCheckLeakage()) && Objects.equals(getIsCheckLeakageName(), that.getIsCheckLeakageName()) && Objects.equals(getRemark(), that.getRemark()) && Objects.equals(getStandardId(), that.getStandardId()) && Objects.equals(getStandardName(), that.getStandardName()) && Objects.equals(getValveMaterialGroupId(), that.getValveMaterialGroupId()) && Objects.equals(getMeasurementMethod(), that.getMeasurementMethod()) && Objects.equals(getDetectDirection(), that.getDetectDirection()) && Objects.equals(getValveMaterialGroupName(), that.getValveMaterialGroupName()) && Objects.equals(getValveClassifyDetails(), that.getValveClassifyDetails()) && Objects.equals(getValveTypeName(), that.getValveTypeName()) && Objects.equals(getValveTypeId(), that.getValveTypeId()) && Objects.equals(getTypeName(), that.getTypeName()) && Objects.equals(getValveClassifyId(), that.getValveClassifyId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getName(), getName2(), getType(), getScope(), getScopeName(), getMediaType(), getMediaTypeName(), getLeakageUnitId(), getLeakageUnitName(), getIsCheckLeakage(), getIsCheckLeakageName(), getRemark(), getStandardId(), getStandardName(), getValveMaterialGroupId(), getMeasurementMethod(), getDetectDirection(), getValveMaterialGroupName(), getValveTypeName(), getValveTypeId(), getTypeName(), getValveClassifyId());
    }

    public String getSortKey(){
        if(StrUtil.isEmpty(name)){
            return GlobalConstant.ZERO_STR;
        }
        if(CollDetectDictTypeEnum.CALIBER.getValue().equals(type)||CollDetectDictTypeEnum.PRESSURE.getValue().equals(type)) {
            if (StrUtil.isNumeric(name.replace(".", ""))) {
                return name;
            } else {
                return name.replaceAll("[^0-9.]", "@").split("@")[0];
            }
        }
        return name;
    }

}
