package com.lets.commons.easyexcel.title;

import com.alibaba.excel.write.handler.SheetWriteHandler;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;
import lombok.Getter;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;

/**
 * 标题
 * @version 1.0
 * @ClassName TitleSheetWriteHandler
 * @author: DING WEI
 * @create: 2021/05/12 15:41
 **/
public class TitleSheetWriteHandler implements SheetWriteHandler {

    private final String title;
    private final Integer lastCol;

    public TitleSheetWriteHandler() {
        this.title = null;
        this.lastCol = null;
    }

    public TitleSheetWriteHandler(String title) {
        this.title = title;
        this.lastCol = null;
    }

    public TitleSheetWriteHandler(String title, int lastCol) {
        this.title = title;
        this.lastCol = lastCol;
    }

    @Override
    public void afterSheetCreate(WriteWorkbookHolder writeWorkbookHolder, WriteSheetHolder writeSheetHolder) {
        Workbook workbook = writeWorkbookHolder.getWorkbook();
        Sheet sheet = writeSheetHolder.getSheet();
        // 设置标题
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue(title != null ? title : writeSheetHolder.getSheetName());
        CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        Font font = workbook.createFont();
        font.setBold(true);
        font.setFontHeight((short) 400);
        cellStyle.setFont(font);
        cell.setCellStyle(cellStyle);
        if (lastCol == null) {
            if (writeSheetHolder.getExcelWriteHeadProperty().getHeadMap().size() - 1 > 0) {
                sheet.addMergedRegionUnsafe(new CellRangeAddress(0, 0, 0, writeSheetHolder.getExcelWriteHeadProperty().getHeadMap().size() - 1));
            }
        } else if (lastCol != 0) {
            sheet.addMergedRegionUnsafe(new CellRangeAddress(0, 0, 0, lastCol));
        }
    }
}
