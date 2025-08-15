package com.lets.platform.model.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * sql查询的信息
 * @author: DING WEI
 * @date: 2022/6/23 14:59
 */
@Data
@ApiModel("sql查询信息")
public class SqlSelectInfoVo {

    @ApiModelProperty("是否查询所有字段,即SELECT *")
    private Boolean isSelectAll;

    @ApiModelProperty("所有字段")
    private Set<String> allFields;
    @ApiModelProperty("字段以及别名")
    private Map<String, String> fieldAliasMap;

    @ApiModelProperty("查询主表")
    private String selectTable;

    @ApiModelProperty("关联表")
    private List<String> joinTables;

}
