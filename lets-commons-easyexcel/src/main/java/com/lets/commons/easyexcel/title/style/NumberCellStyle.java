package com.lets.commons.easyexcel.title.style;

import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.write.handler.CellWriteHandler;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteTableHolder;
import org.apache.poi.ss.usermodel.*;

import java.util.List;

public class NumberCellStyle  implements CellWriteHandler {

    String filedName ;
    public NumberCellStyle(String filedName){
        this.filedName = filedName;
    }

    @Override
    public void beforeCellCreate(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, Row row, Head head, Integer columnIndex, Integer relativeRowIndex, Boolean isHead) {
    }

    @Override
    public void afterCellCreate(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, Cell cell, Head head, Integer integer, Boolean aBoolean) {
        Workbook workbook = writeSheetHolder.getSheet().getWorkbook();
        CellStyle cellStyle = workbook.createCellStyle();
        // 如果字段过多，可以考虑使用枚举，这里不做阐述
        List<String> headNameList = head.getHeadNameList();
        for(String filedName1 : headNameList) {
            int i = filedName1.indexOf(filedName);
            if (filedName1.indexOf(filedName) > -1){
                cell.setCellType(CellType.NUMERIC);
                cellStyle.setDataFormat((short)4);
                cell.setCellStyle(cellStyle);
            }
        }
    }

}