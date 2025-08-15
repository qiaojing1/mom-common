package com.lets.platform.model.common.domain;

import com.lets.platform.common.pojo.base.BaseDo;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @description 大屏接口维度度量表
 * @author wangjx
 * @date 2022-04-08
 */
@Data
@ApiModel("大屏接口维度度量表")
public class ReportInterfaceWdDo extends BaseDo {

    /**
     * 接口id
     */
    private String interfaceId;

    /**
     * 字段名
     */
    private String key;

    /**
     * 类型:度量/维度 0:维度 1:度量
     */
    private String type;

    /**
     * 字段名
     */
    private String name;

    /**
     * data_type为select时， 填写下拉接口的地址
     */
    private String uri;

    /**
     * data_type为select时， 填写下拉接口的查询字段(比如id)
     */
    private String uriId;

    /**
     * data_type为select时， 填写下拉接口的映射字段，一般为name
     */
    private String uriName;

    /**
     *
     */
    private String dictType;

    /**
     * 排序
     */
    private String index;

    /**
     * 数据类型，select(表示下拉)，number(表示数值)，input(表示文本框)
     */
    private String dataType;

    /**
     * 是否展示 0:展示 1:不展示
     */
    private String show;

    /**
     * 租户id
     */
    private String tenancyId;

}
