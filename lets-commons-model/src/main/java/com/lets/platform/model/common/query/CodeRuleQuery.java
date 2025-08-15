package com.lets.platform.model.common.query;

import com.lets.platform.common.pojo.base.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 编码规则查询参数
 *
 * @version 1.0
 * @ClassName CodeRuleQuery
 * @author: Qiao
 * @create: 2021/08/19 111:13
 **/
@Data
@ApiModel("编码规则查询参数")
public class CodeRuleQuery extends PageQuery {

    @ApiModelProperty(hidden = true)
    private String tenancyId;

    @ApiModelProperty(hidden = true)
    private String id;

    @ApiModelProperty("规则名称")
    private String ruleName;

    @ApiModelProperty("规则编码")
    private String ruleCode;
    @ApiModelProperty(hidden = true)
    private String menuCode;
    @ApiModelProperty(hidden = true)
    private String tableName;
    @ApiModelProperty(hidden = true)
    private String fieldName;
    @ApiModelProperty(hidden = true)
    private String mainFieldName;
    @ApiModelProperty(hidden = true)
    private String ruleStatus;

    @ApiModelProperty(hidden = true)
    private String codeType;

}
