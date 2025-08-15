package com.lets.commons.easyexcel.title;

import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.data.WriteCellData;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.style.column.AbstractColumnWidthStyleStrategy;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Cell;

import java.util.List;

/**
 * @description: 自适应宽度(一般用于不确定表头)
 * @author: DING WEI
 * @date: 3/8/22 2:36 PM
 */
@Slf4j
public class CustemTitleWideHandler extends AbstractColumnWidthStyleStrategy {

    private static final int MAX_COLUMN_WIDTH = 255;
    //the maximum column width in Excel is 255 characters

    public CustemTitleWideHandler() {
    }

    @Override
    protected void setColumnWidth(WriteSheetHolder writeSheetHolder, List<WriteCellData<?>> cellDataList, Cell cell, Head head, Integer relativeRowIndex, Boolean isHead) {
        if (isHead && cell.getRowIndex() != 0) {
            int columnWidth = cell.getStringCellValue().getBytes().length;
            if (columnWidth > MAX_COLUMN_WIDTH) {
                columnWidth = MAX_COLUMN_WIDTH;
            } else {
                columnWidth = columnWidth + 3;
            }
            writeSheetHolder.getSheet().setColumnWidth(cell.getColumnIndex(), columnWidth * 256);
        }
    }

}
