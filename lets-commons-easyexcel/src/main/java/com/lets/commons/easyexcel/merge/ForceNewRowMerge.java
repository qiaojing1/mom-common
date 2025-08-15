package com.lets.commons.easyexcel.merge;

import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.write.merge.AbstractMergeStrategy;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.RegionUtil;

import java.util.List;

/**
 * 创建行时合并每一行的单元格
 * @author: DING WEI
 * @date: 2022/8/5 8:55
 */
public class ForceNewRowMerge extends AbstractMergeStrategy {

    @Override
    protected void merge(Sheet sheet, Cell cell, Head head, Integer relativeRowIndex) {
        if (relativeRowIndex == null || relativeRowIndex == 0) {
            return;
        }
        int rowIndex = cell.getRowIndex();
        int colIndex = cell.getColumnIndex();
        sheet = cell.getSheet();
        Row preRow = sheet.getRow(rowIndex - 1);
        // 获取上一行的该格
        Cell preCell = preRow.getCell(colIndex);
        List<CellRangeAddress> list = sheet.getMergedRegions();
//        CellStyle cs = cell.getCellStyle();
//        cs.setTopBorderColor(IndexedColors.BLACK.getIndex());
//        cs.setBorderTop(BorderStyle.THIN);
//        cs.setLeftBorderColor(IndexedColors.BLACK.getIndex());
//        cs.setBorderLeft(BorderStyle.THIN);
//        cs.setBottomBorderColor(IndexedColors.BLACK.getIndex());
//        cs.setBorderBottom(BorderStyle.THIN);
//        cs.setRightBorderColor(IndexedColors.BLACK.getIndex());
//        cs.setBorderRight(BorderStyle.THIN);
//        cell.setCellStyle(cs);
        for (int i = 0; i < list.size(); i++) {
            CellRangeAddress cellRangeAddress = list.get(i);
            if (cellRangeAddress.containsRow(preCell.getRowIndex()) && cellRangeAddress.containsColumn(preCell.getColumnIndex())) {
                int lastColIndex = cellRangeAddress.getLastColumn();
                int firstColIndex = cellRangeAddress.getFirstColumn();
                CellRangeAddress cra = new CellRangeAddress(cell.getRowIndex(), cell.getRowIndex(), firstColIndex, lastColIndex);
                sheet.addMergedRegion(cra);
                RegionUtil.setBorderBottom(BorderStyle.THIN, cra, sheet);
                RegionUtil.setBorderLeft(BorderStyle.THIN, cra, sheet);
                RegionUtil.setBorderRight(BorderStyle.THIN, cra, sheet);
                RegionUtil.setBorderTop(BorderStyle.THIN, cra, sheet);
                break;
            }
        }
    }
}
