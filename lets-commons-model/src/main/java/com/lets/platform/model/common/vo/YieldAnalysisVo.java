package com.lets.platform.model.common.vo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author zhangweiyan
 * @ClassName YieldAnalysisVo
 * @Description  设备产量分析返回实体类
 * @Date 2024/07/03 11:45
 **/
@Data
@ApiModel("设备产量分析返回实体类")
public class YieldAnalysisVo {
    @ApiModelProperty("设备id")
    private String deviceId;
    @ApiModelProperty("设备编码")
    private String deviceCode;

    @ApiModelProperty("设备名称")
    private String deviceName;
    private String factoryModeId;
    private String factoryModeName;
    @ApiModelProperty("列名称列表")
    private List<String> titles;

    @ApiModelProperty("图表列表")
    private Map<String, Object> chartList;

    @ApiModelProperty("下方表格值")
    private List<Map<String, Object>> dataList;
}
