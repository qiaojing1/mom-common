package com.lets.platform.model.collection.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

/**
 * @author zhangweiyan
 * @ClassName CollLeakageRateQuery
 * @Description 密封泄漏率查询Query
 * @Date 2024/2/28 13:41
 **/
@Data
@ApiModel("密封泄漏率查询Query")
@Component
public class CollLeakageRateQuery {
    @ApiModelProperty(required = true, value = "阀门类型")
    @NotEmpty(message = "阀门类型不能为空")
    private String valveType;
    @ApiModelProperty(hidden = true)
    private String valveTypeId;

    @ApiModelProperty(required = false, value = "工况")
    private String condition;
    @ApiModelProperty(hidden = true)
    private String conditionId;

    @ApiModelProperty(required = true, value = "口径值")
    @NotNull(message = "口径值不能为空")
    private BigDecimal caliberValue;

    @ApiModelProperty(required = true, value = "口径单位：DN || NPS")
    @NotEmpty(message = "口径单位不能为空")
    @Pattern(regexp = "DN|NPS", message = "口径单位只能为DN或者NPS")
    private String caliberUnit;

    @ApiModelProperty(required = true, value = "压力值")
    @NotNull(message = "压力值不能为空")
    private BigDecimal pressureValue;

    @ApiModelProperty(required = true, value = "压力单位：PN || CLASS")
    @NotEmpty(message = "压力单位不能为空")
    @Pattern(regexp = "PN|CLASS", message = "压力单位只能为PN或者CLASS")
    private String pressureUnit;

    @ApiModelProperty(required = false, value = "密封方式")
    private String sealMethod;
    @ApiModelProperty(hidden = true)
    // 枚举密封方式
    private String sealType;

    @ApiModelProperty(required = true, value = "试验标准")
    @NotEmpty(message = "试验标准不能为空")
    private String testStandard;
    @ApiModelProperty(hidden = true)
    private String testStandardId;

    @ApiModelProperty(required = true, value = "压力标准")
    private String pressureStandard = "ASME-B16.34 标准";
    @ApiModelProperty(hidden = true)
    private String pressureStandardId;

    @ApiModelProperty(required = false, value = "泄漏等级")
    private String leakageLevel;
    @ApiModelProperty(hidden = true)
    private String leakageLevelId;

    @ApiModelProperty(required = false, value = "泄漏率单位")
    private String leakageUnit;
    @ApiModelProperty(hidden = true)
    private List<String> leakageUnitId;

    @ApiModelProperty(required = false, value = "材质")
    private String materialQuality;
    @ApiModelProperty(hidden = true)
    private String materialQualityId;
    @ApiModelProperty(hidden = true)
    private String materialQualityGroupId;

    @ApiModelProperty(hidden = true)
    private String tenancyId;

    @ApiModelProperty(hidden = true)
    private Set<String> projectIds;
    @ApiModelProperty(hidden = true)
    private Set<String> valveClassifyIds;
    @ApiModelProperty(hidden = true)
    private Set<String> mediaTypes;
    @ApiModelProperty(hidden = true)
    private String mediaType;
    @ApiModelProperty("阀门分类id")
    private String valveTypeClassifyId;

    @ApiModelProperty("试验类型 1:常规性能试验 2:低温密封试验 3:洁净性能试验 4:动作试验 5:逸散性泄漏试验")
    private String testType;

    /**
     * 逸散性泄漏试验相关条件
     */
    @ApiModelProperty("是否包含逸散性泄漏试验 Y是")
    private String isEscape;
    @ApiModelProperty("逸散性泄漏试验试验标准")
    private String escapeTestStandardName;
    private String escapeTestStandard;
    @ApiModelProperty("逸散性密封试验密封方式")
    private String escapeSealTypeName;
    private String escapeSealType;
    @ApiModelProperty("逸散性密封试验泄漏等级")
    private String escapeLeakageLevelName;
    private String escapeLeakageLevel;

    /**
     * 动作试验相关
     */
    @ApiModelProperty("是否包含动作试验 Y是")
    private String isMovement;
    @ApiModelProperty("动作试验试验标准")
    private String movementTestStandardName;
    private String movementTestStandard;

    @ApiModelProperty("阀杆直径")
    private BigDecimal stemDiameter;
    @ApiModelProperty("垫片外径")
    private BigDecimal gasketOuterDiam;
    @ApiModelProperty("额定容量")
    private BigDecimal nameplateCapacity;
    @ApiModelProperty("设计扭矩")
    private BigDecimal torque;

    @Override
    public String toString() {
        return "CollRoutinePerformanceTestQuery{" +
                "valveType='" + valveType + '\'' +
                ", valveTypeId='" + valveTypeId + '\'' +
                ", condition='" + condition + '\'' +
                ", conditionId='" + conditionId + '\'' +
                ", caliberValue=" + caliberValue +
                ", caliberUnit='" + caliberUnit + '\'' +
                ", pressureValue=" + pressureValue +
                ", pressureUnit='" + pressureUnit + '\'' +
                ", sealMethod='" + sealMethod + '\'' +
                ", sealType='" + sealType + '\'' +
                ", testStandard='" + testStandard + '\'' +
                ", testStandardId='" + testStandardId + '\'' +
                ", pressureStandard='" + pressureStandard + '\'' +
                ", pressureStandardId='" + pressureStandardId + '\'' +
                ", leakageLevel='" + leakageLevel + '\'' +
                ", leakageLevelId='" + leakageLevelId + '\'' +
                ", leakageUnit='" + leakageUnit + '\'' +
                ", leakageUnitId=" + leakageUnitId +
                ", materialQuality='" + materialQuality + '\'' +
                ", materialQualityId='" + materialQualityId + '\'' +
                ", materialQualityGroupId='" + materialQualityGroupId + '\'' +
                ", tenancyId='" + tenancyId + '\'' +
                ", projectIds=" + projectIds +
                ", valveClassifyIds=" + valveClassifyIds +
                ", mediaTypes=" + mediaTypes +
                ", isEscape='" + isEscape + '\'' +
                ", escapeTestStandardName='" + escapeTestStandardName + '\'' +
                ", escapeSealTypeName='" + escapeSealTypeName + '\'' +
                ", escapeLeakageLevelName='" + escapeLeakageLevelName + '\'' +
                ", isMovement='" + isMovement + '\'' +
                ", movementTestStandardName='" + movementTestStandardName + '\'' +
                ", stemDiameter=" + stemDiameter +
                ", gasketOuterDiam=" + gasketOuterDiam +
                ", nameplateCapacity=" + nameplateCapacity +
                ", torque=" + torque +
                '}';
    }
}
