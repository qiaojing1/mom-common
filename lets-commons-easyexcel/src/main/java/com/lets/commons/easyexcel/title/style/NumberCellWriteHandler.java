package com.lets.commons.easyexcel.title.style;


import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.write.handler.CellWriteHandler;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteTableHolder;
import org.apache.poi.ss.usermodel.*;


/**
 * @ClassName TextWriteHandler
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2023/7/15
 */
public class NumberCellWriteHandler implements CellWriteHandler {

    private Integer column;

    public NumberCellWriteHandler(Integer column){
        this.column=column;
    }
    public NumberCellWriteHandler(){

    }
    @Override
    public void beforeCellCreate(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, Row row, Head head, Integer integer, Integer integer1, Boolean aBoolean) {

    }

    @Override
    public void afterCellCreate(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, Cell cell, Head head, Integer integer, Boolean aBoolean) {
        if (!aBoolean) {
            int columnIndex = cell.getColumnIndex();
            // 判断是第一列，你可以按你的需要来选择列
            if (0 != cell.getRowIndex()) {
                if (columnIndex == column) {
                    CellStyle cellStyle = writeSheetHolder.getSheet().getWorkbook().createCellStyle();
                    // 这里把它设置为数字格式
                    cell.setCellType(CellType.NUMERIC);
                    cellStyle.setDataFormat((short) 4);
                    cell.setCellStyle(cellStyle);
                }
            }
        }
    }


}
