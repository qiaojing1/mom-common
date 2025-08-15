package com.lets.commons.easyexcel.utils;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.NumberUtil;
import com.alibaba.fastjson.JSON;
import com.lets.commons.easyexcel.entity.ExcelCheckInfo;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.ServiceAssert;
import com.lets.platform.common.pojo.util.IdUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;

/**
 * excel错误信息处理
 * @author: DING WEI
 * @date: 2025/1/22 15:18
 */
public class ExcelErrorMsgUtils {

    public static void writeErrorsToExcel(MultipartFile file, HttpServletResponse response, List<ExcelCheckInfo> checkInfoList) throws IOException {
        try (InputStream inputStream = file.getInputStream();
             Workbook workbook = WorkbookFactory.create(inputStream);
             OutputStream outputStream = response.getOutputStream()) {
            // 创建公共的字体和样式
            Font blackFont = workbook.createFont();
            blackFont.setColor(IndexedColors.BLACK.index);
            blackFont.setFontName("宋体");
            CellStyle cellStyle = workbook.createCellStyle();
            cellStyle.setFont(blackFont);

            // 创建红色背景样式
            CellStyle redCellStyle = workbook.createCellStyle();
            // 设置背景颜色为红色
            redCellStyle.setFillForegroundColor(IndexedColors.RED.getIndex());
            // 设置填充模式为实心
            redCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

            // 创建日期格式（备用）
            DataFormat dataFormat = workbook.getCreationHelper().createDataFormat();
            for (int i = 0; i < checkInfoList.size(); i++) {
                ExcelCheckInfo checkInfo = checkInfoList.get(i);
                Integer sheetNo = checkInfo.getSheetNo();
                if (sheetNo == null || sheetNo < 0 || sheetNo >= workbook.getNumberOfSheets()) {
                    continue; // 跳过无效的 sheetNo
                }
                Sheet sheet = workbook.getSheetAt(sheetNo);
                Drawing<?> drawing = sheet.createDrawingPatriarch();
                Map<Integer, Map<Integer, StringBuilder>> errorMap = checkInfo.getErrorMsgMap();
                if (Objects.isNull(errorMap)) {
                    errorMap = new HashMap<>();
                }

                Integer lastRowIndex = checkInfo.getLastRowIndex();
                Integer lastColIndex = checkInfo.getLastColIndex();

                if ((Objects.isNull(lastRowIndex) || lastRowIndex == 0) && CollUtil.isNotEmpty(errorMap)) {
                    Integer[] rowArr = new Integer[errorMap.size()];
                    errorMap.keySet().toArray(rowArr);
                    lastRowIndex = NumberUtil.max(rowArr);
                }

                if (lastRowIndex == null || lastColIndex == null || lastRowIndex < 2 || lastColIndex < 0) {
                    continue; // 跳过无效的行或列索引
                }

                Map<Integer, Map<Integer, String>> dateColMap = checkInfo.getDateColMap();
                if (Objects.isNull(dateColMap)) {
                    dateColMap = new HashMap<>();
                }
                for (int rowIndex = 2; rowIndex <= lastRowIndex; rowIndex++) {
                    Row row = sheet.getRow(rowIndex);
                    if (row == null) {
                        row = sheet.createRow(rowIndex);
                    }

                    for (int colIndex = 0; colIndex <= lastColIndex; colIndex++) {
                        Cell cell = row.getCell(colIndex);
                        if (Objects.isNull(cell)) {
                            // 创建一个新的 Cell
                            cell = row.createCell(colIndex);
                        }

                        StringBuilder errorMsg = errorMap.getOrDefault(rowIndex, new HashMap<>()).get(colIndex);
                        if (Objects.nonNull(errorMsg) && StringUtils.isNotBlank(errorMsg.toString())) {
                            // 添加批注、字体改为红色
                            Comment cellComment = cell.getCellComment();
                            if (cellComment != null) {
                                cell.removeCellComment();
                            }
                            ClientAnchor anchor = workbook.getCreationHelper().createClientAnchor();
                            anchor.setCol1(colIndex);
                            anchor.setRow1(rowIndex);
                            Comment comment = drawing.createCellComment(anchor);
                            comment.setString(workbook.getCreationHelper().createRichTextString(errorMsg.toString()));
                            cell.setCellComment(comment);
//                            cell.setCellStyle(redCellStyle);
                            // 设置样式（安全处理日期格式）
                            CellStyle newStyle = workbook.createCellStyle();
                            newStyle.cloneStyleFrom(redCellStyle);

                            // 检查是否是日期单元格（安全方式）
                            String dateFormat = dateColMap.getOrDefault(rowIndex, new HashMap<>()).get(colIndex);
                            if (StringUtils.isNotBlank(dateFormat)) {
                                newStyle.setDataFormat(dataFormat.getFormat(dateFormat));
                            }
                            cell.setCellStyle(newStyle);
                        } else {
                            // 删除批注、恢复默认样式
                            Comment cellComment = cell.getCellComment();
                            if (cellComment != null) {
                                cell.removeCellComment();
                                cell.setCellStyle(cellStyle);
                            }
                        }
                    }
                }
            }
            response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
            response.setHeader("Content-Disposition", "attachment; filename=" + IdUtil.getStrId() + ".xlsx");
            workbook.write(outputStream);
        }
    }

    // 安全检查日期单元格
    private static boolean isDateCell(Cell cell) {
        try {
            if (cell == null) return false;
            if (cell.getCellType() == CellType.NUMERIC) {
                return DateUtil.isCellDateFormatted(cell);
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    // 辅助方法：获取单元格值
    private static Object getCellValue(Cell cell) {
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    return cell.getDateCellValue();
                }
                return cell.getNumericCellValue();
            case BOOLEAN:
                return cell.getBooleanCellValue();
            case FORMULA:
                return cell.getCellFormula();
            default:
                return "";
        }
    }

    // 辅助方法：设置单元格值
    private static void setCellValue(Cell cell, Object value) {
        if (value instanceof Date) {
            cell.setCellValue((Date) value);
        } else if (value instanceof Number) {
            cell.setCellValue(((Number) value).doubleValue());
        } else if (value instanceof Boolean) {
            cell.setCellValue((Boolean) value);
        } else {
            cell.setCellValue(String.valueOf(value));
        }
    }

    public static void jsonByResponse(HttpServletResponse response, Integer code, String msg, Object data) {
        try {
            if (Objects.nonNull(response)) {
                response.setCharacterEncoding("UTF-8");
                response.setContentType("application/json");
                ServletOutputStream outputStream = response.getOutputStream();
                outputStream.write(JSON.toJSONString(new RespMsgBean(code, msg, data)).getBytes());
                outputStream.flush();
                outputStream.close();
            } else {
                ServiceAssert.getThrow(0, msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void jsonByResponse(HttpServletResponse response, Integer code, String msg) {
        jsonByResponse(response, code, msg, null);
    }
}
