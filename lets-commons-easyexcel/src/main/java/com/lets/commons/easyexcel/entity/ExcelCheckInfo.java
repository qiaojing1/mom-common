package com.lets.commons.easyexcel.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Excel校验信息
 * @author: DING WEI
 * @date: 2025/1/23 8:36
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExcelCheckInfo {

    /** Sheet序号 */
    private Integer sheetNo;
    /** 最大列数 */
    private Integer lastRowIndex;
    /** 最大行数 */
    private Integer lastColIndex;

    /** 错误信息 */
    private Map<Integer, Map<Integer, StringBuilder>> errorMsgMap = new HashMap<>();
    /** 日期位置以及日期格式 */
    private Map<Integer, Map<Integer, String>> dateColMap = new HashMap<>();

    public ExcelCheckInfo append(String msg, Integer rowIndex, Integer colIndex) {
        if (Objects.nonNull(rowIndex) && Objects.nonNull(colIndex)) {
            if (Objects.isNull(errorMsgMap)) {
                errorMsgMap = new HashMap<>();
            }
            Map<Integer, StringBuilder> rowMap = errorMsgMap.getOrDefault(rowIndex, new HashMap<>());
            StringBuilder oldMsg = rowMap.getOrDefault(colIndex, new StringBuilder());
            if (oldMsg.length() > 0) {
                oldMsg.append("\n");
            }
            oldMsg.append(msg);
            rowMap.put(colIndex, oldMsg);
            errorMsgMap.put(rowIndex, rowMap);
        }
        return this;
    }

    public ExcelCheckInfo appendDate(String dateFormat, Integer rowIndex, Integer colIndex) {
        if (Objects.nonNull(rowIndex) && Objects.nonNull(colIndex)) {
            if (Objects.isNull(dateColMap)) {
                dateColMap = new HashMap<>();
            }
            Map<Integer, String> rowMap = dateColMap.getOrDefault(rowIndex, new HashMap<>());
            rowMap.put(colIndex, dateFormat);
            dateColMap.put(rowIndex, rowMap);
        }
        return this;
    }


    public ExcelCheckInfo isTrue(boolean expression, Integer rowIndex, Integer colIndex,String msg) {
        if (!expression) {
            return append(msg,rowIndex,colIndex);
        }
        return this;
    }
}
