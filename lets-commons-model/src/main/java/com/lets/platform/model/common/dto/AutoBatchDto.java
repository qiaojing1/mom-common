package com.lets.platform.model.common.dto;

import com.lets.platform.model.common.entity.CommonBatchCodeRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Map;

/**
 * 批号-自动编码
 * @author: DING WEI
 * @date: 2023/11/23 10:13
 */
@Data
@ApiModel("自动编码批号")
public class AutoBatchDto {

    @ApiModelProperty("需要自动编码的数据")
    @NotEmpty(message = "AutoBatch.dataList.NotEmpty")
    private List<Map<String, Object>> dataList;

    @ApiModelProperty("菜单编码")
    @NotBlank(message = "AutoBatch.menuCode.NotBlank")
    private String menuCode;

    @ApiModelProperty("表名称")
    @NotBlank(message = "AutoBatch.tableName.NotBlank")
    private String tableName;

    @ApiModelProperty("规则")
    private CommonBatchCodeRule rule;
}
