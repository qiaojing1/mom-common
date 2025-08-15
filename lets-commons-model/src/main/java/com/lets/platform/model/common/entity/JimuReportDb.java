package com.lets.platform.model.common.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.baomidou.mybatisplus.annotation.*;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author qiaojing
 * @since 2024-04-07
 */
@Getter
@Setter
@TableName("jimu_report_db")
@ApiModel(value = "JimuReportDb对象", description = "")
public class JimuReportDb extends BaseEntity{
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    @OrderBy(sort = 1)
    @ExcelIgnore
    private String id;
    @ApiModelProperty("主键字段")
    @TableField("jimu_report_id")
    private String jimuReportId;

    @ApiModelProperty("创建人登录名称")
    @TableField("create_by")
    private String createBy;

    @ApiModelProperty("更新人登录名称")
    @TableField("update_by")
    private String updateBy;

    @ApiModelProperty("数据集编码")
    @TableField("db_code")
    private String dbCode;

    @ApiModelProperty("数据集名字")
    @TableField("db_ch_name")
    private String dbChName;

    @ApiModelProperty("数据源类型")
    @TableField("db_type")
    private String dbType;

    @ApiModelProperty("数据库表名")
    @TableField("db_table_name")
    private String dbTableName;

    @ApiModelProperty("动态查询SQL")
    @TableField("db_dyn_sql")
    private String dbDynSql;

    @ApiModelProperty("数据源KEY")
    @TableField("db_key")
    private String dbKey;

    @ApiModelProperty("填报数据源")
    @TableField("tb_db_key")
    private String tbDbKey;

    @ApiModelProperty("填报数据表")
    @TableField("tb_db_table_name")
    private String tbDbTableName;

    @ApiModelProperty("java类数据集  类型（spring:springkey,class:java类名）")
    @TableField("java_type")
    private String javaType;

    @ApiModelProperty("java类数据源  数值（bean key/java类名）")
    @TableField("java_value")
    private String javaValue;

    @ApiModelProperty("请求地址")
    @TableField("api_url")
    private String apiUrl;

    @ApiModelProperty("请求方法0-get,1-post")
    @TableField("api_method")
    private String apiMethod;

    @ApiModelProperty("是否是列表0否1是 默认0")
    @TableField("is_list")
    private String isList;

    @ApiModelProperty("是否作为分页,0:不分页，1:分页")
    @TableField("is_page")
    private String isPage;

    @ApiModelProperty("数据源")
    @TableField("db_source")
    private String dbSource;

    @ApiModelProperty("数据库类型 MYSQL ORACLE SQLSERVER")
    @TableField("db_source_type")
    private String dbSourceType;

    @ApiModelProperty("json数据，直接解析json内容")
    @TableField("json_data")
    private String jsonData;

    @ApiModelProperty("api转换器")
    @TableField("api_convert")
    private String apiConvert;
    @TableField(exist = false)
    private String tenancyId;
    @TableField(exist = false)
    private String createUser;
    @TableField(exist = false)
    private String createUserName;
    @TableField(exist = false)
    private String updateUser;
    @TableField(exist = false)
    private String updateUserName;
}
