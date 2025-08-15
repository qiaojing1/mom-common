package com.lets.commons.easyexcel.entity;

import com.alibaba.excel.write.handler.WriteHandler;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
public class ExcelWriteWithMergeCellConfig {

    private List<List<String>> head;
    private Class<?> clazz;
    private List<?> dataList;
    private Integer titleLastNo;
    private String sheetName;
    private Boolean isAutoWidth;
    private List<WriteHandler> cellWriteHandlers;

    public ExcelWriteWithMergeCellConfig(Integer titleLastNo,
                                         String sheetName,
                                         List<List<String>> head,
                                         List<?> dataList,
                                         Boolean isAutoWidth,
                                         WriteHandler... cellWriteHandlers) {
        this.titleLastNo = titleLastNo;
        this.sheetName = sheetName;
        this.head = head;
        this.clazz = null;
        this.dataList = dataList;
        this.isAutoWidth = isAutoWidth;
        this.cellWriteHandlers = Arrays.asList(cellWriteHandlers);
    }

    public ExcelWriteWithMergeCellConfig(Integer titleLastNo,
                                         String sheetName,
                                         Class<?> classT,
                                         List<?> dataList,
                                         Boolean isAutoWidth,
                                         WriteHandler... cellWriteHandlers) {
        this.titleLastNo = titleLastNo;
        this.sheetName = sheetName;
        this.head = null;
        this.clazz = classT;
        this.dataList = dataList;
        this.isAutoWidth = isAutoWidth;
        this.cellWriteHandlers = Arrays.asList(cellWriteHandlers);
    }
}
