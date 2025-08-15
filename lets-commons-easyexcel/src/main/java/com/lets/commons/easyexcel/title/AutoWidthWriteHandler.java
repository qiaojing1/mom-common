package com.lets.commons.easyexcel.title;

import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.data.WriteCellData;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.style.column.AbstractColumnWidthStyleStrategy;
import org.apache.poi.ss.usermodel.Cell;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 自适应宽度(一般用于不确定表头)
 */
public class AutoWidthWriteHandler extends AbstractColumnWidthStyleStrategy {

    static final int MAX_WIDTH = 65280;

    final boolean onlyTitle;
    final Map<Integer, Integer> columMaxWidthMap = new HashMap<>();

    public AutoWidthWriteHandler(boolean onlyTitle) {
        this.onlyTitle = onlyTitle;
    }

    private static boolean isChinese(int c) {
        return c >= 0x4E00 && c <= 0x9FA5;
    }


    @Override
    public void setColumnWidth(WriteSheetHolder writeSheetHolder, List<WriteCellData<?>> cellDataList, Cell cell, Head head, Integer relativeRowIndex, Boolean isHead) {
        if (onlyTitle && !isHead) {
            return;
        }
        short fontSize = (short) (isHead ? 14 : 11);
        int columnIndex = cell.getColumnIndex();
        String columnContent;
        switch (cell.getCellType()) {
            case STRING:
                columnContent = cell.getStringCellValue();
                break;
            case NUMERIC:
                double value = cell.getNumericCellValue();
                columnContent = String.valueOf(value);
                break;
            default:
                columnContent = "";
                break;
        }
        int chineseCount = 0;
        int numberCount = 0;
        int lowerCaseCount = 0;
        int upperCaseCount = 0;
        for (char c : columnContent.toCharArray()) {
            if (isChinese(c)) {
                chineseCount++;
            } else if (Character.isLowerCase(c)) {
                lowerCaseCount++;
            } else if (Character.isDigit(c)) {
                numberCount++;
            } else {
                upperCaseCount++;
            }
        }
        int width = fontSize * 48 * chineseCount + fontSize * 28 * numberCount + fontSize * 28 * lowerCaseCount + fontSize * 32 * upperCaseCount + 1000;
        if (width > MAX_WIDTH) {
            width = MAX_WIDTH;
        }
        if (columMaxWidthMap.get(columnIndex) == null || columMaxWidthMap.get(columnIndex) < width) {
            columMaxWidthMap.put(columnIndex, width);
            writeSheetHolder.getSheet().setColumnWidth(cell.getColumnIndex(), width);
        }
    }
}