package com.lets.platform.model.common.dto;

import com.lets.platform.common.pojo.base.BaseDo;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

/**
 * 编码规则配置传参对象
 *
 * @version 1.0
 * @ClassName CodeRuleDto
 * @author: QIAO
 * @create: 2021/08/18 08:32
 **/
@Data
@ApiModel("编码规则配置传参对象")
public class CodeRuleDto extends BaseDo {
    @NotBlank(message = "codeRule.id", groups = {Update.class})
    @ApiModelProperty("编码规则配置主键[U]")
    private String id;
    @Length(min = 1, max = 20, message = "codeRule.ruleCode", groups = {Save.class, Update.class})
    @ApiModelProperty(value = "规则编码",required = true)
    private String ruleCode;
    @Length(min = 1, max = 20, message = "codeRule.ruleName", groups = {Save.class, Update.class})
    @ApiModelProperty(value = "规则名称",required = true)
    private String ruleName;
    @Pattern(regexp = GlobalConstant.CHINESE_LETTER_NUMBER_UNDERLINE_0_200, message = "ruleCode.menuCode", groups = {Save.class, Update.class})
    @ApiModelProperty("菜单编码")
    private String menuCode;
    @ApiModelProperty("编码预览")
    private String codeView;

    private String tableName;
    @Length(min = 1, max = 20, message = "ruleCode.fieldName", groups = {Save.class, Update.class})
    @ApiModelProperty(value = "字段名称",required = true)
    private String fieldName;
    @Length(max = 200, message = "codeRule.ruleRemark", groups = {Save.class, Update.class})
    @ApiModelProperty("描述")
    private String ruleRemark;
    @Length(max = 20, message = "codeRule.fieldLength", groups = {Save.class, Update.class})
    @ApiModelProperty("字段长度")
    private String fieldLength;
    @Length(max = 20, message = "codeRule.maxLength", groups = {Save.class, Update.class})
    @ApiModelProperty("最大长度")
    private String maxLength;
    @ApiModelProperty("编码规则明细数据")
    @NotNull(message = "codeRule.codeRuleDetailDtoList")
    private List<CodeRuleDetailDto> codeRuleDetailDtoList;
}
