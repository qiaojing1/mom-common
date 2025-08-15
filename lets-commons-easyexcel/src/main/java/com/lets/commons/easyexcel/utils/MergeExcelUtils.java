package com.lets.commons.easyexcel.utils;

import cn.hutool.core.collection.CollUtil;
import com.lets.platform.common.pojo.util.IdUtil;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.*;

/**
 * 合并Excel
 *
 * @author: DING WEI
 * @date: 2023/10/20 11:21
 */
@Slf4j
public class MergeExcelUtils {

    @SneakyThrows
    public static void main(String[] args) {
//        List<InputStream> fileLists = new ArrayList<>();
//        fileLists.add(new FileInputStream(new File("C:\\Users\\dell\\Desktop\\template\\megre\\SalesStockOutApplyGt15.xlsx")));
//        fileLists.add(new FileInputStream(new File("C:\\Users\\dell\\Desktop\\template\\megre\\SalesStockOutApplyLt15.xlsx")));
//        fileLists.add(new FileInputStream(new File("C:\\Users\\dell\\Desktop\\template\\megre\\XSTH-202209200000002_20220920.xls")));
//        fileLists.add(new FileInputStream(new File("C:\\Users\\dell\\Desktop\\template\\excel\\苏阀试验报告wps.xls")));
//        String path = "C:\\Users\\dell\\Desktop\\template\\megre\\";
//        String fileName = "合并.xlsx";
//        mergeExcel(fileLists, path, fileName);
//        Workbook mergedWorkBook = new XSSFWorkbook();
//        Sheet mergedSheet = mergedWorkBook.createSheet("Merged");
//        mergeExcel(fileLists, 0, fileLists.size() - 1, 0, Boolean.FALSE, 2, mergedWorkBook, mergedSheet);
        FileInputStream inputStream = new FileInputStream(new File("C:\\Users\\dell\\Desktop\\template\\excel\\imageHandler\\aaaa.xlsx"));
        InputStream inputStream1 = rightingImage(inputStream);
        try (OutputStream outputStream = new FileOutputStream("C:\\Users\\dell\\Desktop\\template\\excel\\imageHandler\\aaa_test_" + IdUtil.getStrId() + ".xlsx")) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream1.read(buffer)) != -1) {
                outputStream.write(buffer, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static InputStream rightingImage(InputStream inputStream) throws Exception {
        if (Objects.nonNull(inputStream)) {
            Workbook workbook = WorkbookFactory.create(inputStream);
            int sheetCount = workbook.getNumberOfSheets();
            for (int i = 0; i < sheetCount; i++) {
                Sheet sheet = workbook.getSheetAt(i);
                Map<String, ExcelPicture> pictures = new HashMap<>();
                if (workbook instanceof HSSFWorkbook) {
                    pictures = ExcelImageUtils.getXlsPicturesWithObj((HSSFSheet) sheet);
                } else {
                    pictures = ExcelImageUtils.getXlsxPicturesWithObj((XSSFWorkbook) workbook, (XSSFSheet) sheet);
                }
                if (CollUtil.isNotEmpty(pictures)) {
                    // 获取合并单元格的数量
                    int mergedRegions = sheet.getNumMergedRegions();
                    // 遍历合并单元格
                    Map<String, String> mergedRowColMap = new HashMap<>();
                    for (int z = 0; z < mergedRegions; z++) {
                        // 获取合并单元格的区域
                        CellRangeAddress cellRangeAddress = sheet.getMergedRegion(z);
                        // 获取合并单元格的起始行号
                        int firstRow = cellRangeAddress.getFirstRow();
                        // 获取合并单元格的结束行号
                        int lastRow = cellRangeAddress.getLastRow();
                        // 获取合并单元格的起始列号
                        int firstCol = cellRangeAddress.getFirstColumn();
                        // 获取合并单元格的结束列号
                        int lastCol = cellRangeAddress.getLastColumn();
                        mergedRowColMap.put(firstRow + "-" + firstCol, lastRow + "-" + lastCol);
                    }
                    int rowCount = sheet.getLastRowNum();
                    CreationHelper creationHelper = workbook.getCreationHelper();
                    ClientAnchor clientAnchor = creationHelper.createClientAnchor();
                    Drawing<?> drawingPatriarch = sheet.createDrawingPatriarch();
                    for (int j = 0; j <= rowCount; j++) {
                        Row row = sheet.getRow(j);
                        if (Objects.nonNull(row)) {
                            int cellCount = row.getLastCellNum();
                            for (int k = 0; k < cellCount; k++) {
                                String picKey = j + "-" + k;
                                ExcelPicture excelPicture = pictures.get(picKey);
                                if (Objects.nonNull(excelPicture)) {
                                    ClientAnchor anchorOld = excelPicture.getAnchor();
                                    int dx1 = anchorOld.getDx1();
                                    int dy1 = anchorOld.getDy1();
                                    int dx2 = anchorOld.getDx2();
                                    int dy2 = anchorOld.getDy2();
                                    int col1 = Integer.parseInt(String.valueOf(anchorOld.getCol1()));
                                    int row1 = anchorOld.getRow1();
                                    int col2 = Integer.parseInt(String.valueOf(anchorOld.getCol2()));
                                    int row2 = anchorOld.getRow2();
                                    Integer afterCol2 = null;
                                    Integer afterRow2 = null;
                                    List<PictureData> pictureData = excelPicture.getPictureDataList();
                                    if (CollUtil.isNotEmpty(pictureData)) {
                                        for (PictureData pictureDatum : pictureData) {
                                            if (Objects.nonNull(pictureDatum)) {
                                                String last = mergedRowColMap.get(row1 + "-" + col1);
                                                if (StringUtils.isNotBlank(last)) {
                                                    log.info("前({},{}),({},{})", row1, col1, row2, col2);
                                                    afterCol2 = Integer.parseInt(last.split("-")[1]) + 1;
                                                    afterRow2 = Integer.parseInt(last.split("-")[0]) + 1;
                                                    log.info("后({},{}),({},{})", row1, col1, afterRow2, afterCol2);
                                                }
                                                if (Objects.nonNull(afterCol2) && Objects.nonNull(afterRow2) && (afterCol2 != col2 || afterRow2 != row2)) {
                                                    clientAnchor.setDx1(dx1);
                                                    clientAnchor.setDy1(dy1);
                                                    clientAnchor.setDx2(-dx1);
                                                    clientAnchor.setDy2(-dy1);
                                                    clientAnchor.setCol1(col1);
                                                    clientAnchor.setRow1(row1);
                                                    clientAnchor.setCol2(afterCol2);
                                                    clientAnchor.setRow2(afterRow2);
                                                    int picture1 = workbook.addPicture(pictureDatum.getData(), pictureDatum.getPictureType());
                                                    drawingPatriarch.createPicture(clientAnchor, picture1);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            inputStream.close();
            ByteArrayOutputStream tempOutputStream = new ByteArrayOutputStream();
            workbook.write(tempOutputStream);
            return new ByteArrayInputStream(tempOutputStream.toByteArray());
        }
        return inputStream;
    }

    public static void mergeExcel(List<InputStream> files, int start, int end, int preRowNum,
                                  Boolean removeHead,
                                  int spaceBetweenSheets, Workbook mergedWorkBook, Sheet mergedSheet) throws Exception {
        if (start > end) {
            return;
        }
        InputStream inputStream = files.get(start);
        if (Objects.nonNull(inputStream)) {
            Workbook workbook = WorkbookFactory.create(inputStream);
            HSSFWorkbook hssfWorkbook = null;
            if (workbook instanceof HSSFWorkbook) {
                hssfWorkbook = (HSSFWorkbook) workbook;
            }
            int sheetCount = workbook.getNumberOfSheets();
            int addRowNum = preRowNum;
            for (int i = 0; i < sheetCount; i++) {
                Sheet sheet = workbook.getSheetAt(i);
                Map<String, ExcelPicture> pictures = new HashMap<>();
                if (workbook instanceof HSSFWorkbook) {
                    pictures = ExcelImageUtils.getXlsPicturesWithObj((HSSFSheet) sheet);
                } else {
                    pictures = ExcelImageUtils.getXlsxPicturesWithObj((XSSFWorkbook) workbook, (XSSFSheet) sheet);
                }
                int rowCount = sheet.getLastRowNum();
                for (int j = 0; j <= rowCount; j++) {
                    if (removeHead) {
                        continue;
                    }
                    Row row = sheet.getRow(j);
                    if (Objects.nonNull(row)) {
                        Row mergedRow = mergedSheet.createRow(addRowNum);
                        int cellCount = row.getLastCellNum();
                        for (int k = 0; k < cellCount; k++) {
                            Cell cell = row.getCell(k);
                            if (Objects.nonNull(cell)) {
                                Cell mergedCell = mergedRow.createCell(k);
                                Object cellValue = getCellValue(cell, cell.getCellType());
                                if (cellValue instanceof String) {
                                    mergedCell.setCellValue((String) cellValue);
                                } else if (cellValue instanceof Date) {
                                    mergedCell.setCellValue((Date) cellValue);
                                } else if (cellValue instanceof Boolean) {
                                    mergedCell.setCellValue((Boolean) cellValue);
                                }
                                CellStyle mergedCellStyle = mergedWorkBook.createCellStyle();
                                CellStyle cellStyle = cell.getCellStyle();
                                if (workbook instanceof HSSFWorkbook) {
                                    Hssf2Xssf.transform((XSSFWorkbook) mergedWorkBook, hssfWorkbook, (XSSFCellStyle) mergedCellStyle, (HSSFCellStyle) cellStyle);
                                } else {
//                                    Hssf2Xssf.transform((XSSFWorkbook) mergedWorkBook, (XSSFWorkbook) workbook, (XSSFCellStyle) mergedCellStyle, (XSSFCellStyle) cellStyle);
                                    mergedCellStyle.cloneStyleFrom(cellStyle);
                                }
                                mergedCell.setCellStyle(mergedCellStyle);
                            }
                            // 宽度
                            mergedSheet.setColumnWidth(k, sheet.getColumnWidth(k));
                        }
                        CellStyle rowStyle = row.getRowStyle();
                        if (Objects.nonNull(rowStyle)) {
                            CellStyle mergedRowStyle = mergedWorkBook.createCellStyle();
                            mergedRowStyle.cloneStyleFrom(rowStyle);
                            mergedRow.setRowStyle(mergedRowStyle);
                            // 高度
                            mergedRow.setHeight(row.getHeight());
                        }
                        mergedRow.setHeightInPoints(row.getHeightInPoints());
                        addRowNum = addRowNum + 1;
                    }
                }
                // 获取合并单元格的数量
                int mergedRegions = sheet.getNumMergedRegions();
                // 遍历合并单元格
                Map<String, String> mergedRowColMap = new HashMap<>();
                for (int z = 0; z < mergedRegions; z++) {
                    // 获取合并单元格的区域
                    CellRangeAddress cellRangeAddress = sheet.getMergedRegion(z);
                    Row row = sheet.getRow(cellRangeAddress.getFirstRow());
                    float heightInPoints = row.getHeightInPoints();
                    // 获取合并单元格的起始行号
                    int firstRow = cellRangeAddress.getFirstRow();
                    if (start > 0) {
                        firstRow = firstRow + preRowNum;
                    }
                    // 获取合并单元格的结束行号
                    int lastRow = cellRangeAddress.getLastRow();
                    if (start > 0) {
                        lastRow = lastRow + preRowNum;
                    }
                    // 获取合并单元格的起始列号
                    int firstCol = cellRangeAddress.getFirstColumn();
                    // 获取合并单元格的结束列号
                    int lastCol = cellRangeAddress.getLastColumn();
                    CellRangeAddress mergedRegion = new CellRangeAddress(firstRow, lastRow, firstCol, lastCol);
                    mergedSheet.addMergedRegion(mergedRegion);
                    // 获取合并区域的第一个行
                    Row mergedRegionFirstRow = mergedSheet.getRow(mergedRegion.getFirstRow());
                    // 设置行高为100
                    mergedRegionFirstRow.setHeightInPoints(heightInPoints);
                    mergedRowColMap.put(firstRow + "-" + firstCol, lastRow + "-" + lastCol);
                }
                for (int j = 0; j <= rowCount; j++) {
                    Row row = sheet.getRow(j);
                    if (Objects.nonNull(row)) {
                        int cellCount = row.getLastCellNum();
                        for (int k = 0; k < cellCount; k++) {
                            Cell cell = row.getCell(k);

                            String picKey = j + "-" + k;
                            ExcelPicture excelPicture = pictures.get(picKey);
                            if (Objects.nonNull(excelPicture)) {
                                ClientAnchor anchorOld = excelPicture.getAnchor();
                                int dx1 = anchorOld.getDx1();
                                int dy1 = anchorOld.getDy1();
                                int dx2 = anchorOld.getDx2();
                                int dy2 = anchorOld.getDy2();
                                int col1 = Integer.parseInt(String.valueOf(anchorOld.getCol1()));
                                int row1 = anchorOld.getRow1();
                                int col2 = Integer.parseInt(String.valueOf(anchorOld.getCol2()));
                                int row2 = anchorOld.getRow2();
                                List<PictureData> pictureData = excelPicture.getPictureDataList();
                                if (CollUtil.isNotEmpty(pictureData)) {
                                    CreationHelper creationHelper = mergedWorkBook.getCreationHelper();
                                    ClientAnchor clientAnchor = creationHelper.createClientAnchor();
                                    Drawing<?> drawingPatriarch = mergedSheet.createDrawingPatriarch();
                                    for (PictureData pictureDatum : pictureData) {
                                        if (Objects.nonNull(pictureDatum)) {
                                            log.info("前({},{}),({},{})", row1, col1, row2, col2);
                                            if (start > 0) {
                                                row1 = row1 + preRowNum;
                                                row2 = row2 + preRowNum;
                                            }
                                            String last = mergedRowColMap.get(row1 + "-" + col1);
                                            if (StringUtils.isNotBlank(last)) {
                                                col2 = Integer.parseInt(last.split("-")[1]) + 1;
                                                row2 = Integer.parseInt(last.split("-")[0]) + 1;
                                            }
                                            log.info("后({},{}),({},{})", row1, col1, row2, col2);

//                                        XSSFClientAnchor anchor = new XSSFClientAnchor(dx1, dy1, dx2, dy2, col1, row1, col2, row2);
//                                        Picture picture = drawingPatriarch.createPicture(anchor, mergedWorkBook.addPicture(pictureDatum.getData(), pictureDatum.getPictureType()));

                                            clientAnchor.setDx1(dx1);
                                            clientAnchor.setDy1(dy1);
                                            clientAnchor.setDx2(-dx1);
                                            clientAnchor.setDy2(-dy1);
                                            clientAnchor.setCol1(col1);
                                            clientAnchor.setRow1(row1);
                                            clientAnchor.setCol2(col2);
                                            clientAnchor.setRow2(row2);
                                            int picture1 = mergedWorkBook.addPicture(pictureDatum.getData(), pictureDatum.getPictureType());
                                            drawingPatriarch.createPicture(clientAnchor, picture1);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                for (int j = 0; j < spaceBetweenSheets; j++) {
                    mergedSheet.createRow(mergedSheet.getLastRowNum() + 1);
                }
            }
            inputStream.close();
        }
        mergeExcel(files, start + 1, end, mergedSheet.getLastRowNum(), removeHead, spaceBetweenSheets, mergedWorkBook, mergedSheet);
    }

    private static Short[] EXCEL_DATE_FORMAT = {14, 31, 57, 58};
    private static final List<Short> EXCEL_DATE_FORMAT_LIST = Arrays.asList(EXCEL_DATE_FORMAT);

    public static Object getCellValue(Cell cell, CellType cellType) {
        if (Objects.equals(cellType, CellType.STRING)) {
            return cell.getStringCellValue();
        } else if (Objects.equals(cellType, CellType.NUMERIC)) {
            if (DateUtil.isCellDateFormatted(cell)) {
                return cell.getDateCellValue();
            } else if (EXCEL_DATE_FORMAT_LIST.contains(cell.getCellStyle().getDataFormat())) {
                // 处理自定义日期格式：m月d日(通过判断单元格的格式id解决，id的值是14,31,57,58)
                double cellValue = cell.getNumericCellValue();
                return DateUtil.getJavaDate(cellValue);
            } else {
                return NumberToTextConverter.toText(cell.getNumericCellValue());
            }
        } else if (Objects.equals(cellType, CellType.BLANK)) {
            return "";
        } else if (Objects.equals(cellType, CellType.BOOLEAN)) {
            return cell.getBooleanCellValue();
        }
        return "";
    }
}
