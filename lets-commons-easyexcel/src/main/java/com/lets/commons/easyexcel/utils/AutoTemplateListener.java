package com.lets.commons.easyexcel.utils;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.metadata.CellExtra;
import org.apache.commons.lang.text.StrBuilder;

import java.util.Map;

/**
 * @ClassName CommonTaxImportListener
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2023/7/4
 */
public class AutoTemplateListener extends AnalysisEventListener<Map<Integer, String>> {


    public AutoTemplateListener() {
    }

    @Override
    public void invoke(Map<Integer, String> data, AnalysisContext analysisContext) {
    }

    @Override
    public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) {
        // 获取到表头后进行处理
        StrBuilder sb = new StrBuilder();
        sb.append("{");
        String heads = "";
        int lastColumnIndex = headMap.size() - 1;
        String lastValue = headMap.get(lastColumnIndex);
        headMap.forEach((key, value) -> {
            sb.append("\"" + value + "\"");
            if (!lastValue.equals(value)) {
                sb.append(",");
            }
        });
        sb.append("}");
        System.out.println(sb);
    }

    @Override
    public void extra(CellExtra extra, AnalysisContext context) {
//        String text = extra.getText().replace("\n", "\\n");
//        if (text.endsWith("\\n")) {
//            text = text.substring(0, text.length() - 2);
//        }
//        System.out.println("annotationsMap.put(" + extra.getColumnIndex() + ", \"" + text + "\");");
    }


    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
    }
}
