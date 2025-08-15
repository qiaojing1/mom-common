package com.lets.platform.model.common.dto;

import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.common.enums.CodeTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 编码规则配置明細
 *
 * @version 1.0
 * @ClassName CodeRuleDetailDto
 * @author: QIAO
 * @create: 2021/08/19 08:43
 **/
@Data
@ApiModel("编码规则配置明細")
public class CodeRuleDetailDto {

    @ApiModelProperty("主表id[U]")
    private String ruleId;
    @NotBlank(message = "codeRuleDetail.ruleSort", groups = {Update.class})
    @ApiModelProperty("排序")
    private String ruleSort;
    @ValidatedEnum(enumClass = CodeTypeEnum.class, message = "codeRuleDetail.codeType", groups = {Save.class, Update.class})
    @ApiModelProperty("编码类型")
    private String codeType;
    @ApiModelProperty("固定值类型的值")
    private String fixedValue;
    @ApiModelProperty("字段名称")
    private String fieldName;
    @ApiModelProperty("属性名称")
    private String fieldAliasName;
    @ApiModelProperty("长度")
    private String length;
    @ApiModelProperty("日期格式")
    private String dateFormat;
    @ApiModelProperty("重置周期 1:日 2:周 3:月 4:年")
    private String resetPeriod;

    private String currentNum;


}
