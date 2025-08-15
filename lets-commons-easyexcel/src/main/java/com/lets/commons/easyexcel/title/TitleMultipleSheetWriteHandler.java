package com.lets.commons.easyexcel.title;

import com.alibaba.excel.write.handler.SheetWriteHandler;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;
import lombok.Getter;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;

/**
 * 多个sheet页标题
 *
 * @version 1.0
 * @ClassName TitleMultipleSheetWriteHandler
 * @author: Qiao
 **/
public class TitleMultipleSheetWriteHandler implements SheetWriteHandler {

    private String title;
    @Getter
    private int lastCol;
    private int sheetNum;
    public TitleMultipleSheetWriteHandler(String title, int lastCol,int sheetNum){
        this.title = title;
        this.lastCol = lastCol;
        this.sheetNum = sheetNum;
    }

    @Override
    public void beforeSheetCreate(WriteWorkbookHolder writeWorkbookHolder, WriteSheetHolder writeSheetHolder) {

    }

    @Override
    public void afterSheetCreate(WriteWorkbookHolder writeWorkbookHolder, WriteSheetHolder writeSheetHolder) {
        Workbook workbook = writeWorkbookHolder.getWorkbook();
        Sheet sheet = workbook.getSheetAt(sheetNum);
        // 设置标题
        Row row = sheet.createRow(0);
        row.setHeight((short) 800);
        Cell cell = row.createCell(0);
        cell.setCellValue(title);
        CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        cellStyle.setAlignment(HorizontalAlignment.CENTER);
        Font font = workbook.createFont();
        font.setBold(true);
        font.setFontHeight((short) 400);
        cellStyle.setFont(font);
        cell.setCellStyle(cellStyle);
        sheet.addMergedRegionUnsafe(new CellRangeAddress(0, 0, 0, lastCol));
    }

}
