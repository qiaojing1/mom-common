package com.lets.platform.common.pojo.base;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * 打印模板-功能数据
 * @author: DING WEI
 * @date: 2022/9/26 9:17
 */
@Data
public class Date4ExportTemplateVo {

    private Map<String, Object> mainData;

    private List<Map<String, Object>> detailData;

    private String fileName;
    private String factoryModeName;

    //单价实验报告所用的图标数据
    private Map<String,Object> chartData;
}
