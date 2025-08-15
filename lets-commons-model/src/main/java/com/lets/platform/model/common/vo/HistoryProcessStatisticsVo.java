package com.lets.platform.model.common.vo;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lets.platform.model.common.entity.CommonDataItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@ApiModel("历史加工参数查询对象")
public class HistoryProcessStatisticsVo {

    @ApiModelProperty("参数列表")
    private List<ParamsVo> parameter = new ArrayList<>();

    @ApiModelProperty("提示语")
    private String remark;

    @ApiModelProperty("参数集合")
    private List<Long> time = new ArrayList<>();

    /**
     * 历史加工参数
     */
    @ApiModel("参数实体类")
    @Data
    public static class ParamsVo {
        @ApiModelProperty("参数归属采集器")
        private String collectorId;
        private String collectorCode;
        private String collectorName;

        private String code;

        @ApiModelProperty("源数据项标识")
        private String sourceField;

        @ApiModelProperty("参数id")
        private String id;

        @ApiModelProperty("参数单位")
        private String unit;

        @ApiModelProperty("参数名称")
        private String fieldName;
        @ApiModelProperty("映射出当前系统显示数据项标识")
        private String field;

        @ApiModelProperty("参数id")
        private String itemValue;

        @ApiModelProperty("时间")
        private Long time;

        private List<String> parameterList = new ArrayList<>();
        private List<String> parameterTempList = new ArrayList<>();
        private Page<ParamsVo> parameterVoList;

        private Long collectionTime;

        private String collectionTimeFormat;

        private List<CollectionUseEnergySubVo> energySubVos;

        private List<CommonDataItem> itemValueList = new ArrayList<>();

    }
}
