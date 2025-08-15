package com.lets.commons.easyexcel.title.style;

import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.data.WriteCellData;
import com.alibaba.excel.write.handler.SheetWriteHandler;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteTableHolder;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;
import com.alibaba.excel.write.style.column.LongestMatchColumnWidthStyleStrategy;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * 锁定单元格
 * @author: DING WEI
 * @date: 2023/3/31 13:40
 */
public class LockCellWriteHandler extends LongestMatchColumnWidthStyleStrategy implements SheetWriteHandler {

    private List<CommentModel> lockCellList = new ArrayList<>();
    private List<String> lockCellXyList = new ArrayList<>();

    public LockCellWriteHandler(List<CommentModel> lockCellList) {
        this.lockCellList = lockCellList;
        if (!CollectionUtils.isEmpty(lockCellList)) {
            this.lockCellXyList = lockCellList.stream().map(x->x.getRowIndex() + "@" + x.getColIndex()).collect(Collectors.toList());
        }
    }

    @Override
    public void afterCellDispose(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, List<WriteCellData<?>> cellDataList, Cell cell, Head head, Integer relativeRowIndex, Boolean isHead) {
        super.afterCellDispose(writeSheetHolder, writeTableHolder, cellDataList, cell, head, relativeRowIndex, isHead);
        if (isHead) {
            headerStyle(cell);
        } else {
            contentStyle(cell);
        }
    }

    private void contentStyle(Cell cell) {
        Workbook workbook = cell.getSheet().getWorkbook();
        CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setLocked(Boolean.FALSE);
        cell.setCellStyle(cellStyle);
        int rowIndex = cell.getRowIndex();
        int columnIndex = cell.getColumnIndex();
        String key = rowIndex + "@" + columnIndex;
        if (lockCellXyList.contains(key)) {
            cellStyle.setLocked(Boolean.TRUE);
            cell.setCellStyle(cellStyle);
        }
    }

    private static void headerStyle(Cell cell) {
        int colWidth = cell.getStringCellValue().length() * 1000;
        // 根据表头文字设置列宽
        cell.getSheet().setColumnWidth(cell.getColumnIndex(), colWidth);
        // 冻结表头
        cell.getSheet().createFreezePane(1, 2);
    }

    @Override
    public void beforeSheetCreate(WriteWorkbookHolder writeWorkbookHolder, WriteSheetHolder writeSheetHolder) {

    }

    @Override
    public void afterSheetCreate(WriteWorkbookHolder writeWorkbookHolder, WriteSheetHolder writeSheetHolder) {
        // 设置保护密码
        writeSheetHolder.getSheet().protectSheet(UUID.randomUUID().toString());
        // 锁定单元格不可选中(防止别人直接复制内容到其他excel修改)
        ((SXSSFSheet) writeSheetHolder.getSheet()).lockSelectLockedCells(true);
    }
}
