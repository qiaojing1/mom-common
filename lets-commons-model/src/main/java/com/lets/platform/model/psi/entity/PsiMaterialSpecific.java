package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.psi.enums.MaterialSpecificValueSourceEnum;
import com.lets.platform.model.psi.enums.MaterialSpecificValueTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Pattern;
import java.util.List;

/**
 * <p>
 * 物料特征管理
 * </p>
 *
 * @author DING WEI
 * @since 2023-07-14
 */
@Getter
@Setter
@TableName("psi_material_specific")
@ApiModel(value = "PsiMaterialSpecific对象", description = "物料特征管理")
public class PsiMaterialSpecific extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer index;

    @ColumnWidth(30)
    @ExcelProperty("物料特征编码")
    @ApiModelProperty("物料特征编码")
    @TableField("code")
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_20, message = "PsiMaterialSpecific.code", groups = {Save.class, Update.class})
    private String code;

    @ColumnWidth(30)
    @ExcelProperty("物料特征名称")
    @ApiModelProperty("物料特征名称")
    @TableField("name")
    @Length(min = 1, max = 20, message = "PsiMaterialSpecific.name", groups = {Save.class, Update.class})
    private String name;

    /**
     * @see MaterialSpecificValueSourceEnum
     */
    @ExcelIgnore
    @ApiModelProperty("值来源[1用户数据字典,2手工输入]")
    @TableField("value_source")
    @ValidatedEnum(enumClass = MaterialSpecificValueSourceEnum.class, required = true, message = "PsiMaterialSpecific.valueSource", groups = {Save.class, Update.class})
    private String valueSource;
    @ColumnWidth(20)
    @ExcelProperty("值来源")
    @TableField(exist = false)
    private String valueSourceName;

    @ExcelIgnore
    @ApiModelProperty("用户数据字典分组主键")
    @TableField("user_dict_id")
    private String userDictId;
    @ColumnWidth(30)
    @ExcelProperty("用户数据字典分组")
    @TableField(exist = false)
    private String userDictCode;
    @ExcelIgnore
    @TableField(exist = false)
    private String userDictName;

    /**
     * @see MaterialSpecificValueTypeEnum
     */
    @ExcelIgnore
    @ApiModelProperty("值类型[字符串:string;数字:number;枚举:enumeration;日期:date interval;日期时间:date time interval;布尔:boolean]")
    @TableField("value_type")
    private String valueType;
    @ColumnWidth(20)
    @ExcelProperty("值类型")
    @TableField(exist = false)
    private String valueTypeName;

    @ExcelIgnore
    @ApiModelProperty("启用状态[0停用1启用]")
    @TableField("enable")
    private Integer enable;
    @ExcelIgnore
    @TableField(exist = false)
    private String enableName;

    @ExcelIgnore
    @ApiModelProperty("是否删除[N否Y是]")
    @TableField(value = "deleted", fill = FieldFill.INSERT)
    private String deleted;
}
