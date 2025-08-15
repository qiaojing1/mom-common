package com.lets.commons.easyexcel.title.style;

import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.data.WriteCellData;
import com.alibaba.excel.write.handler.CellWriteHandler;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteTableHolder;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFClientAnchor;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * @description: 样式处理类
 * @author: DING WEI
 * @date: 11/5/21 2:27 PM
 */
@Slf4j
public class TitleHandler implements CellWriteHandler {

    // 操作列
    private final List<Integer> columnIndexList;
    // 颜色
    private final Short colorIndex;
    // 批注<列的下标,批注内容>
    private HashMap<Integer, String> annotationsMap = new HashMap<>();

    public TitleHandler(List<Integer> columnIndexList, Short colorIndex, HashMap<Integer, String> annotationsMap) {
        this.columnIndexList = columnIndexList;
        this.colorIndex = colorIndex;
        this.annotationsMap = annotationsMap;
    }

    public TitleHandler(List<Integer> columnIndexList, Short colorIndex) {
        this.columnIndexList = columnIndexList;
        this.colorIndex = colorIndex;
    }

    @Override
    public int order() {
        // 源码中FillStyleCellWriteHandler设置的是50000，如果不大于50000，会被源码覆盖掉
        return 50001;
    }

    @Override
    public void afterCellDispose(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, List<WriteCellData<?>> cellDataList, Cell cell, Head head, Integer relativeRowIndex, Boolean isHead) {
        if (isHead) {
            int columnIndex = cell.getColumnIndex();
            // 设置列宽
            Sheet sheet = writeSheetHolder.getSheet();
            Row row = writeSheetHolder.getSheet().getRow(0);
            if (row != null) {
                row.setHeight((short) (1.8 * 256));
            }
            Workbook workbook = writeSheetHolder.getSheet().getWorkbook();
            Drawing<?> drawing = sheet.createDrawingPatriarch();

            // 设置标题字体样式
            CellStyle cellStyle = workbook.createCellStyle();
            Font font = workbook.createFont();
            font.setFontName("宋体");
            font.setFontHeightInPoints((short) 14);
            font.setBold(true);
            if (CollectionUtils.isNotEmpty(columnIndexList) && Objects.nonNull(colorIndex) && columnIndexList.contains(columnIndex)) {
                // 设置字体颜色
                font.setColor(colorIndex);
            }
            cellStyle.setFont(font);
            // 设置背景颜色
            cellStyle.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
            cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            // 设置边框颜色
            cellStyle.setTopBorderColor(IndexedColors.BLACK.getIndex());
            cellStyle.setBorderTop(BorderStyle.THIN);
            cellStyle.setLeftBorderColor(IndexedColors.BLACK.getIndex());
            cellStyle.setBorderLeft(BorderStyle.THIN);
            cellStyle.setBottomBorderColor(IndexedColors.BLACK.getIndex());
            cellStyle.setBorderBottom(BorderStyle.THIN);
            cellStyle.setRightBorderColor(IndexedColors.BLACK.getIndex());
            cellStyle.setBorderRight(BorderStyle.THIN);
            cell.setCellStyle(cellStyle);

            // 批注内容
            String context = annotationsMap.get(columnIndex);
            if (StringUtils.isNotBlank(context)) {
                // 创建绘图对象
                Comment comment = drawing.createCellComment(new XSSFClientAnchor(1, 1, 1, 1, columnIndex, 1, columnIndex + 8, 5));
                comment.setString(new XSSFRichTextString(context));
                cell.setCellComment(comment);
            }
        }
    }

}
