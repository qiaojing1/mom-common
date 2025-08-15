package com.lets.commons.easyexcel.entity;

import com.alibaba.excel.write.handler.WriteHandler;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
public class ExcelWriteConfig {
    private final List<List<String>> head;
    private final Class<?> clazz;
    private final List<?> dataList;
    private final String sheetName;
    private final Boolean isAutoWidth;
    private final Boolean onlyTitle;
    private final Boolean isText;
    private final List<WriteHandler> cellWriteHandlers;
    private List<List<String>> insertDatas;
    private int rowNumber = 1;

    public ExcelWriteConfig(List<List<String>> head, List<?> dataList, String sheetName, Boolean isAutoWidth, Boolean onlyTitle, Boolean isText, WriteHandler... cellWriteHandlers) {
        this.head = head;
        this.clazz = null;
        this.dataList = dataList;
        this.sheetName = sheetName;
        this.isAutoWidth = isAutoWidth;
        this.onlyTitle = onlyTitle;
        this.isText = isText;
        this.cellWriteHandlers = Arrays.asList(cellWriteHandlers);
    }

    public ExcelWriteConfig(Class<?> classT, List<?> dataList, String sheetName, Boolean isAutoWidth, Boolean onlyTitle, Boolean isText, WriteHandler... cellWriteHandlers) {
        this.head = null;
        this.clazz = classT;
        this.dataList = dataList;
        this.sheetName = sheetName;
        this.isAutoWidth = isAutoWidth;
        this.onlyTitle = onlyTitle;
        this.isText = isText;
        this.cellWriteHandlers = Arrays.asList(cellWriteHandlers);
    }

    public ExcelWriteConfig(Class<?> classT, List<?> dataList, String sheetName, Boolean isAutoWidth, Boolean onlyTitle, Boolean isText, List<List<String>> insertDatas,
                            WriteHandler... cellWriteHandlers) {
        this.head = null;
        this.clazz = classT;
        this.dataList = dataList;
        this.sheetName = sheetName;
        this.isAutoWidth = isAutoWidth;
        this.onlyTitle = onlyTitle;
        this.isText = isText;
        this.rowNumber = insertDatas.size() + 1;
        this.insertDatas = insertDatas;
        this.cellWriteHandlers = Arrays.asList(cellWriteHandlers);
    }
}
