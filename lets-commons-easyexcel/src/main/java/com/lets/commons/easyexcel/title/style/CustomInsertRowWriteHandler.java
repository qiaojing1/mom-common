package com.lets.commons.easyexcel.title.style;

import com.alibaba.excel.write.handler.SheetWriteHandler;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.util.List;


public class CustomInsertRowWriteHandler implements SheetWriteHandler {

    private final List<List<String>> rowDataList;

    public CustomInsertRowWriteHandler(List<List<String>> rowDataList) {
        this.rowDataList = rowDataList;
    }

    @Override
    public void afterSheetCreate(WriteWorkbookHolder writeWorkbookHolder, WriteSheetHolder writeSheetHolder) {

        Sheet sheet = writeSheetHolder.getSheet();

        WriteSheet writeSheet = writeSheetHolder.getWriteSheet();

        for (int i = 0; i < rowDataList.size(); i++) {

            List<String> rowData = rowDataList.get(i);

            Row row = sheet.createRow(i + 1);

            for (int j = 0; j < rowData.size(); j++) {

                row.createCell(j).setCellValue(rowData.get(j));
            }
        }

        writeSheet.setRelativeHeadRowIndex(rowDataList.size());
    }

}
