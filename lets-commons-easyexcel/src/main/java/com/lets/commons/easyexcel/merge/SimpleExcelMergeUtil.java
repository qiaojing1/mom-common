package com.lets.commons.easyexcel.merge;

import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.data.CellData;
import com.alibaba.excel.metadata.data.WriteCellData;
import com.alibaba.excel.write.handler.CellWriteHandler;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteTableHolder;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;

import java.util.ArrayList;
import java.util.List;

/**
 * 合并单元格工具类
 * @author: DING WEI
 * @date: 2024/3/6 15:10
 */
public class SimpleExcelMergeUtil implements CellWriteHandler {

    private int mergeStartRowIndex;
    private int[] mergeColumns;
    private List<Integer> mergeColumnList;
    public SimpleExcelMergeUtil() {
    }
    public SimpleExcelMergeUtil(int mergeStartRowIndex, int[] mergeColumns) {
        this.mergeStartRowIndex = mergeStartRowIndex;
        this.mergeColumns = mergeColumns;
        mergeColumnList = new ArrayList<>();
        for (int i : mergeColumns) {
            mergeColumnList.add(i);
        }
    }
    /**
     * 创建每个单元格之前执行
     *
     * @param writeSheetHolder
     * @param writeTableHolder
     * @param row
     * @param head
     * @param columnIndex
     * @param relativeRowIndex
     * @param isHead
     */
    @Override
    public void beforeCellCreate(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, Row row, Head head, Integer columnIndex, Integer relativeRowIndex, Boolean isHead) {
    }
    /**
     * 创建每个单元格之后执行
     *
     * @param writeSheetHolder
     * @param writeTableHolder
     * @param cell
     * @param head
     * @param relativeRowIndex
     * @param isHead
     */
    @Override
    public void afterCellCreate(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, Cell cell, Head head, Integer relativeRowIndex, Boolean isHead) {
    }
    /**
     * 每个单元格数据内容渲染之后执行
     *
     * @param writeSheetHolder
     * @param writeTableHolder
     * @param cellData
     * @param cell
     * @param head
     * @param relativeRowIndex
     * @param isHead
     */

    public void afterCellDataConverted(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, CellData cellData, Cell cell, Head head, Integer relativeRowIndex, Boolean isHead) {
    }
    /**
     * 每个单元格完全创建完之后执行
     *
     * @param writeSheetHolder
     * @param writeTableHolder
     * @param cellDataList
     * @param cell
     * @param head
     * @param relativeRowIndex
     * @param isHead
     */

    public void afterCellDispose(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, List<WriteCellData<?>> cellDataList, Cell cell, Head head, Integer relativeRowIndex, Boolean isHead) {
        // 当前行
        int curRowIndex = cell.getRowIndex();
        // 当前列
        int curColIndex = cell.getColumnIndex();
        if (!isHead) {
            if (curRowIndex > mergeStartRowIndex && mergeColumnList.contains(curColIndex)) {
                // 从第二行数据行开始,获取当前行第二列数据
                Object curData = cell.getCellTypeEnum() == CellType.STRING ? cell.getStringCellValue() : cell.getNumericCellValue();
                // 获取上一行第二列数据
                Cell preCell = cell.getSheet().getRow(curRowIndex - 1).getCell(curColIndex);
                Object preData = preCell.getCellTypeEnum() == CellType.STRING ? preCell.getStringCellValue() : preCell.getNumericCellValue();
                if (curData.equals(preData)) {
                    Sheet sheet = writeSheetHolder.getSheet();
                    List<CellRangeAddress> mergedRegions = sheet.getMergedRegions();
                    boolean isMerged = false;
                    for (int i = 0; i < mergedRegions.size() && !isMerged; i++) {
                        CellRangeAddress cellRangeAddr = mergedRegions.get(i);
                        // 若上一个单元格已经被合并，则先移出原有的合并单元，再重新添加合并单元
                        if (cellRangeAddr.isInRange(curRowIndex - 1, curColIndex)) {
                            sheet.removeMergedRegion(i);
                            cellRangeAddr.setLastRow(curRowIndex);
                            sheet.addMergedRegion(cellRangeAddr);
                            isMerged = true;
                        }
                    }
                    // 若上一个单元格未被合并，则新增合并单元
                    if (!isMerged) {
                        CellRangeAddress cellRangeAddress = new CellRangeAddress(curRowIndex - 1, curRowIndex, curColIndex, curColIndex);
                        sheet.addMergedRegion(cellRangeAddress);
                    }
                }
            }
        }
    }

}
