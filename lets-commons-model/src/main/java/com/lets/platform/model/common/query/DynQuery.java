package com.lets.platform.model.common.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author QIAO JING
 * @description
 * @since date 2022/04/07 17:02
 * {
 *     "listwd":[
 *         {
 *             "label":"材质",
 *             "key":"partMaterial"
 *         }
 *     ],
 *     "listdl":[
 *         {
 *             "label":"钢板总重",
 *             "key":"partshareweight",
 *             "aggmode":"sum"
 *         },
 *         {
 *             "label":"零件净重",
 *             "key":"partweight",
 *             "aggmode":"sum"
 *         }
 *     ],
 *     "dlfilter":[
 *         {
 *             "type":"dl",
 *             "key":"rate",
 *             "dlmax":"4",
 *             "dlmin":"2"
 *         }
 *     ],
 *     "listfilter":[
 *         {
 *             "type":"wd",
 *             "key":"nestuser",
 *             "listselectfilter":"in",
 *             "value":"'584cc09a-527f-4cab-a5da-9645007b89a9','1ea629ca-6f9d-473b-8545-8384c26f085a'"
 *         }
 *     ],
 *     "textfilter":[
 *         {
 *             "type":"wd",
 *             "key":"partMaterial",
 *             "join":"or",
 *             "values":[
 *                 {
 *                     "value":"1",
 *                     "type":"in"
 *                 }
 *             ]
 *         }
 *     ],
 *     "sortfilter":{
 *         "sorttype":"desc",
 *         "sortkey":"partMaterial"
 *     }
 * }
 */
@Data
@ApiModel("大屏查询")
public class DynQuery {
    //页面选择维度集合
    @ApiModelProperty(value = "页面选择维度集合")
    private List<Map<String, String>> listwd;
    //页面选择的度量集合
    @ApiModelProperty(value = "页面选择的度量集合")
    private List<Map<String, String>> listdl;
    //页面对数值类型的字段进行筛选
    @ApiModelProperty(value = "页面对数值类型的字段进行筛选")
    private List<Map<String, String>> dlfilter;
    //页面对select类型的字段进行筛选
    @ApiModelProperty(value = "页面对select类型的字段进行筛选")
    private List<Map<String, String>> listfilter;
    //页面对input类型的字段进行筛选
    @ApiModelProperty(value = "页面对input类型的字段进行筛选")
    private List<TextFilterQuery> textfilter;
    //页面对排序字段选择
    @ApiModelProperty(value = "页面对排序字段选择")
    private Map<String, String> sortfilter;
    @ApiModelProperty(value = "页面对date类型的字段进行筛选")
    private List<DateFilterQuery> dateFilter;
    @ApiModelProperty(value = "租户id")
    private String tenancyId;
    private String mainWd;


}
