package com.lets.platform.model.common.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author zhangweiyan
 * @ClassName AutoCodeQuery
 * @Description 自动编码查询类
 * @Date 2024/8/15 11:43
 **/
@Data
@ApiModel("自动编码查询类")
public class AutoCodeQuery {
    @ApiModelProperty("数据列表")
    private List<Map<String, Object>> dataList;

    @ApiModelProperty("菜单编码")
    private String menuCode;

    @ApiModelProperty("表名")
    private String tableName;

    @ApiModelProperty("物料+客户的组合")
    private List<MaterialPlusCustom> queryDetails;

    @ApiModelProperty("明细id")
    private String detailId;

    @ApiModelProperty("明细流水id")
    private String detailSerialId;

    @ApiModelProperty("当前流水号最小流水值")
    private Integer currentMinSerialNumber;

    @ApiModelProperty("当前流水号要回退的流水值")
    private Integer currentMaxSerialNumber;

    @Data
    public static class MaterialPlusCustom {
        private String materialId;

        private String customerId;

        private boolean isAutoSerial;

        // 满足条件的编码id
        private String ruleId;
    }
}
