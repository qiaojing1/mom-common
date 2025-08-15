package com.lets.platform.model.mes.vo;

import lombok.Data;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhangweiyan
 * @ClassName MesReportRecordAnalyzeVo
 * @Description 工时汇总报表返回实体
 * @Date 2024/7/26 09:10
 **/
@Data
public class MesReportRecordAnalyzeVo {
    private String loginId;

    private String name;

    private String orgId;

    private String orgName;

    // 合计
    private String total;
    private int year;
    private int month;
    private List<String> months;
    private LinkedHashMap<String,String> maps;
    // 1~12月
    private String january1;
    private String january2;
    private String january3;
    private String january4;
    private String january5;
    private String february1;
    private String february2;
    private String february3;
    private String february4;
    private String february5;
    private String march1;
    private String march2;
    private String march3;
    private String march4;
    private String march5;
    private String april1;
    private String april2;
    private String april3;
    private String april4;
    private String april5;
    private String may1;
    private String may2;
    private String may3;
    private String may4;
    private String may5;
    private String june1;
    private String june2;
    private String june3;
    private String june4;
    private String june5;
    private String july1;
    private String july2;
    private String july3;
    private String july4;
    private String july5;
    private String august1;
    private String august2;
    private String august3;
    private String august4;
    private String august5;
    private String september1;
    private String september2;
    private String september3;
    private String september4;
    private String september5;
    private String october1;
    private String october2;
    private String october3;
    private String october4;
    private String october5;
    private String november1;
    private String november2;
    private String november3;
    private String november4;
    private String november5;
    private String december1;
    private String december2;
    private String december3;
    private String december4;
    private String december5;

    private List<String> values;
    private Map<String,String> map;

}
