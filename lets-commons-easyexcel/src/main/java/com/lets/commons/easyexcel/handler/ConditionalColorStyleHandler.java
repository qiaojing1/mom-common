package com.lets.commons.easyexcel.handler;

import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.metadata.data.WriteCellData;
import com.alibaba.excel.write.handler.CellWriteHandler;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteTableHolder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFColor;

import java.awt.Color;
import java.util.List;
import java.util.Objects;

/**
 * 指定单元格字体颜色
 * @author: DING WEI
 * @date: 2025/2/25 17:29
 */
@Data
@NoArgsConstructor
public class ConditionalColorStyleHandler implements CellWriteHandler {

    // 定义颜色（#02A7F0 和 #D9001B 的 RGB 值）
    private static final XSSFColor BLUE = createXSSFColor("#02A7F0");
    private static final XSSFColor RED = createXSSFColor("#D9001B");

    private Integer startRow;
    private List<Integer> colRange;
    private Integer accuracy;
    private String numberFormat;

    public ConditionalColorStyleHandler(Integer startRow, List<Integer> colRange, Integer accuracy) {
        this.startRow = startRow;
        this.colRange = colRange;
        this.accuracy = accuracy;
        if (Objects.nonNull(accuracy)) {
            StringBuilder formatStr = new StringBuilder("#,##0");
            if (accuracy > 0) {
                formatStr.append(".");
            }
            for (int i = 0; i < accuracy; i++) {
                formatStr.append("0");
            }
            numberFormat = formatStr.toString();
        } else {
            numberFormat = "#,##0.00";
        }
    }

    public ConditionalColorStyleHandler(Integer startRow, List<Integer> colRange) {
        this.startRow = startRow;
        this.colRange = colRange;
    }

    @Override
    public int order() {
        // 源码中FillStyleCellWriteHandler设置的是50000，如果不大于50000，会被源码覆盖掉
        return 50001;
    }

    @Override
    public void afterCellDispose(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, List<WriteCellData<?>> cellDataList,
                                 Cell cell, Head head, Integer relativeRowIndex, Boolean isHead) {
        if (isHead || cell == null) return; // 跳过表头处理

        int rowNum = cell.getRowIndex(); // 物理行号（从0开始）
        int colNum = cell.getColumnIndex(); // 物理列号（从0开始）

        // 检查是否在目标行和列范围内
        if (rowNum >= startRow) {
            Workbook workbook = writeSheetHolder.getSheet().getWorkbook();
            CellStyle newStyle = workbook.createCellStyle();
            newStyle.cloneStyleFrom(cell.getCellStyle()); // 保留原有样式

            CellType cellType = cell.getCellType();
            // 检查单元格内容是否为数字
            Double value = null;
            if (cellType == CellType.NUMERIC) {
                value = cell.getNumericCellValue();
            } else if (cellType == CellType.STRING) {
                try {
                    value = Double.parseDouble(cell.getStringCellValue());
                } catch (NumberFormatException ignored) {
                    // 非数字字符串跳过处理
                }
            }

            // 根据数字值设置颜色
            if (Objects.nonNull(value)) {
                // 强制设置单元格为数字格式
                DataFormat format = workbook.createDataFormat();
                cell.setCellType(CellType.NUMERIC);
                // 设置数字格式为 "#,##0.00"：千位分隔符 + 两位小数
                newStyle.setDataFormat(format.getFormat(numberFormat));
                cell.setCellValue(value);
                if (colRange.contains(colNum)) {
                    Font font = workbook.createFont();
                    font.setColor(value < 0 ? IndexedColors.RED.getIndex() : IndexedColors.SKY_BLUE.getIndex());
                    newStyle.setFont(font);
                }
            }
            cell.setCellStyle(newStyle);
        }
    }

    /**
     * 将十六进制颜色字符串转换为 XSSFColor 对象
     */
    private static XSSFColor createXSSFColor(String hexColor) {
        // 解析十六进制颜色值
        Color awtColor = Color.decode(hexColor);
        byte[] rgb = new byte[3];
        rgb[0] = (byte) awtColor.getRed();
        rgb[1] = (byte) awtColor.getGreen();
        rgb[2] = (byte) awtColor.getBlue();
        return new XSSFColor(rgb, null); // 第二个参数为索引颜色表，传 null 表示默认
    }
}
