package com.lets.commons.easyexcel.title.style;

import com.alibaba.excel.write.handler.WorkbookWriteHandler;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

/**
 * @ClassName TextWriteHandler
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2023/7/15
 */
public class TextWriteHandler implements WorkbookWriteHandler {


    private final Integer column;

    public TextWriteHandler() {
        this.column = null;
    }

    public TextWriteHandler(Integer column) {
        this.column = column;
    }

    @Override
    public void beforeWorkbookCreate() {

    }

    @Override
    public void afterWorkbookCreate(WriteWorkbookHolder writeWorkbookHolder) {

    }

    @Override
    public void afterWorkbookDispose(WriteWorkbookHolder writeWorkbookHolder) {
        int sheetNumber = writeWorkbookHolder.getWorkbook().getNumberOfSheets();
        for (int sheetIndex = 0; sheetIndex < sheetNumber; sheetIndex++) {
            Sheet sheet = writeWorkbookHolder.getWorkbook().getSheetAt(sheetIndex);
            Integer lastColumnNum = this.column;
            if (lastColumnNum == null) {
                Row row = sheet.getRow(sheet.getLastRowNum());
                lastColumnNum = (int) row.getLastCellNum();
            }
            for (int i = 0; i <= lastColumnNum - 1; i++) {
                // 设置为文本格式
                CellStyle cellStyle = writeWorkbookHolder.getWorkbook().createCellStyle();
                cellStyle.setDataFormat((short) 49);
                sheet.setDefaultColumnStyle(i, cellStyle);
            }
        }
//
    }
}
