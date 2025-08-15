package com.lets.platform.model.collection.entity;

import com.lets.platform.common.pojo.annotation.ValidBigDecimal;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.enums.YesOrNo;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.collection.enums.SealTypeEnum;
import com.lets.platform.model.collection.enums.TestTypeEnum;
import com.lets.platform.model.psi.enums.CaliberUnitEnum;
import com.lets.platform.model.psi.enums.PressureUnitEnum;
import com.lets.platform.model.psi.enums.SpotOrDetectEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * <p>
 * 试压工单
 * </p>
 *
 * @author csy
 * @since 2024-02-20
 */
@Getter
@Setter
@ApiModel(value = "CollectionDetectOrder对象", description = "试压工单")
public class CollectionDetectExtOrder extends BaseEntity {



    @ApiModelProperty("工单类型 抽压 试压")
    private String type;

    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_40, message = "生产令号长度 1~40，支持除中文外的所有字符", groups = {Save.class})
    @ApiModelProperty("生产令号")
    private String lrpNo;

    @NotBlank(message = "数量 不能为空",groups = {Save.class})
    @NotNull(message = "数量 不能为空",groups = {Save.class})
    @Pattern(regexp = GlobalConstant.RANGE_1_1000, message = "数量 范围1~1000的数值", groups = {Save.class})
    @ApiModelProperty("数量")
    private String number;

    @Length(min=0,max=40,message = "订单编号，长度0-40",groups = {Save.class})
    @ApiModelProperty("订单编号")
    private String orderCode;


    @Length(min=0,max=40,message = "行号，长度0-40",groups = {Save.class})
    @ApiModelProperty("行号")
    private String lineNumber;

    @Length(min=0,max=40,message = "图号，长度0-40",groups = {Save.class})
    @ApiModelProperty("图号")
    private String drawNo;


    @ApiModelProperty("阀门类型")
    private String valveTypeName;

    @Length(min=0,max=40,message = "型号，长度0-40",groups = {Save.class})
    @ApiModelProperty("型号")
    private String model;


    @ValidatedEnum(enumClass = CaliberUnitEnum.class,message = "口径单位 非法", groups = {Save.class})
    @ApiModelProperty("口径单位")
    private String caliberUnit;

    @ApiModelProperty("口径值")
    private String caliberValue;

    @ApiModelProperty("口径（用于第三方直接传单位+口径过来，通过单位转换关系解析口径）")
    private String caliber;

    @ValidatedEnum(enumClass = PressureUnitEnum.class,message = "压力单位 非法", groups = {Save.class})
    @ApiModelProperty("压力单位")
    private String pressureUnit;
    private String pressureUnitId;

    @ApiModelProperty("压力值")
    private String pressureValue;

    @ApiModelProperty("压力（用于第三方直接传单位+口径过来，通过单位转换关系解析口径）")
    private String pressure;

    @ApiModelProperty("阀门材质")
    private String valveMaterialName;

    @Length(min=0,max=20,message = "工况，长度1-20",groups = {Save.class})
    @ApiModelProperty("工况")
    private String workConditionName;


    @ApiModelProperty("压力标准")
    private String pressureStandardName;
    private String pressureStandardId;


    @ApiModelProperty("试验类型")
    private String testType;


    @ApiModelProperty("试验标准")
    private String testStandardName;

    @ApiModelProperty("常规/低温/洁净 泄漏等级")
    private String routineLeakageLevelName;

    @ApiModelProperty("是否包含逸散性泄漏试验")
    private String isEscape;

    @Length(min=0,max=20,message = "逸散性泄漏试验试验标准长度0-20",groups = {Save.class})
    @ApiModelProperty("逸散性泄漏试验试验标准")
    private String escapeTestStandardName;

    @Length(min=0,max=20,message = "逸散性密封试验密封方式，长度0-20",groups = {Save.class})
    @ApiModelProperty("逸散性密封试验密封方式")
    private String escapeSealTypeName;

    @Length(min=0,max=20,message = "逸散性密封试验泄漏等级，长度0-20",groups = {Save.class})
    @ApiModelProperty("逸散性密封试验泄漏等级")
    private String escapeLeakageLevelName;

    @ApiModelProperty("是否包含动作试验")
    private String isMovement;

    @Length(min=0,max=20,message = "逸散性密封试验泄漏等级，长度0-20",groups = {Save.class})
    @ApiModelProperty("动作试验试验标准")
    private String movementTestStandardName;

    @ApiModelProperty("密封方式")
    private String sealMethod;

    @Pattern(regexp = GlobalConstant.FLOAT_RANGE_0_dot_001_999999_dot_999_WITH_EMPTY_STRING,message = "阀杆直径 范围0.001~999999.999的数值",groups = {Save.class})
    @ApiModelProperty("阀杆直径")
    private String stemDiameter;

    @Pattern(regexp = GlobalConstant.FLOAT_RANGE_0_dot_001_999999_dot_999_WITH_EMPTY_STRING,message = "垫片外径 范围0.001~999999.999的数值",groups = {Save.class})
    @ApiModelProperty("垫片外径")
    private String gasketOuterDiam;

    @Pattern(regexp = GlobalConstant.FLOAT_RANGE_0_dot_001_999999_dot_999_WITH_EMPTY_STRING,message = "额定容量 范围0.001~999999.999的数值",groups = {Save.class})
    @ApiModelProperty("额定容量")
    private String nameplateCapacity;

    @Pattern(regexp = GlobalConstant.FLOAT_RANGE_0_dot_001_999999_dot_999_WITH_EMPTY_STRING,message = "设计扭矩 范围0.001~999999.999的数值",groups = {Save.class})
    @ApiModelProperty("设计扭矩")
    private String torque;

    @Length(min=0,max=40,message = "清单号，长度0-40",groups = {Save.class})
    @ApiModelProperty("清单号")
    private String listNo;

    @ApiModelProperty("执行标准")
    private String executeStandardName;
    private String executeStandardId;

    @ApiModelProperty("产品编号")
    private String productCode;

    @ApiModelProperty("工序名称")
    private String processName;

    @Length(min=0,max=200,message = "阀门名称，长度0-200",groups = {Save.class})
    @ApiModelProperty("阀门名称")
    private String productName;

    @Length(min=0,max=100,message = "客户名称，长度0-100",groups = {Save.class})
    @ApiModelProperty("客户名称")
    private String customerName;

    @Length(min=0,max=50,message = "连接标准，长度0-50",groups = {Save.class})
    @ApiModelProperty("连接标准")
    private String linkStandard;

    @Length(min=0,max=50,message = "客户型号，长度0-50",groups = {Save.class})
    @ApiModelProperty("客户型号")
    private String customerModel;

    @Length(min=0,max=50,message = "阀杆材质，长度0-50",groups = {Save.class})
    @ApiModelProperty("阀杆材质")
    private String stemMaterial;

    @Length(min=0,max=50,message = "阀芯材质，长度0-50",groups = {Save.class})
    @ApiModelProperty("阀芯材质")
    private String spoolMaterial;

    @Length(min=0,max=50,message = "阀座材质，长度0-50",groups = {Save.class})
    @ApiModelProperty("阀座材质")
    private String seatMaterial;

    private String deviceCodes;
}
