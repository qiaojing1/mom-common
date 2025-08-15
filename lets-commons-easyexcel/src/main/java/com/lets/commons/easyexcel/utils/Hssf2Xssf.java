package com.lets.commons.easyexcel.utils;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.*;
import ro.nextreports.engine.exporter.util.CellRangeAddressWrapper;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Hssf2Xssf
 * @author: DING WEI
 * @date: 2023/10/12 15:17
 */
public class Hssf2Xssf {

    public static XSSFWorkbook convertHSSFToXSSF(HSSFWorkbook source) {
        XSSFWorkbook retVal = new XSSFWorkbook();
        for (int i = 0; i < source.getNumberOfSheets(); i++) {
            XSSFSheet xssfSheet = retVal.createSheet();
            HSSFSheet hssfsheet = source.getSheetAt(i);
            copySheets(hssfsheet, xssfSheet);
        }
        return retVal;
    }

    public static void copySheets(HSSFSheet source, XSSFSheet destination) {
        copySheets(source, destination, true);
    }

    /**
     * @param destination
     *            the sheet to create from the copy.
     *            sheet to copy.
     * @param copyStyle
     *            true copy the style.
     */
    public static void copySheets(HSSFSheet source, XSSFSheet destination, boolean copyStyle) {
        int maxColumnNum = 0;
        Map<Integer, HSSFCellStyle> styleMap = (copyStyle) ? new HashMap<Integer, HSSFCellStyle>() : null;
        for (int i = source.getFirstRowNum(); i <= source.getLastRowNum(); i++) {
            HSSFRow srcRow = source.getRow(i);
            XSSFRow destRow = destination.createRow(i);
            if (srcRow != null) {
                copyRow(source, destination, srcRow, destRow, styleMap);
                if (srcRow.getLastCellNum() > maxColumnNum) {
                    maxColumnNum = srcRow.getLastCellNum();
                }
            }
        }
        for (int i = 0; i <= maxColumnNum; i++) {
            destination.setColumnWidth(i, source.getColumnWidth(i));
        }
    }

    /**
     * @param srcSheet
     *            the sheet to copy.
     * @param destSheet
     *            the sheet to create.
     * @param srcRow
     *            the row to copy.
     * @param destRow
     *            the row to create.
     * @param styleMap
     *            -
     */
    public static void copyRow(HSSFSheet srcSheet, XSSFSheet destSheet, HSSFRow srcRow, XSSFRow destRow,
                               Map<Integer, HSSFCellStyle> styleMap) {
        // manage a list of merged zone in order to not insert two times a
        // merged zone
        Set<CellRangeAddressWrapper> mergedRegions = new TreeSet<>();
        destRow.setHeight(srcRow.getHeight());
        // pour chaque row
        for (int j = srcRow.getFirstCellNum(); j <= srcRow.getLastCellNum(); j++) {
            HSSFCell oldCell = srcRow.getCell(j); // ancienne cell
            XSSFCell newCell = destRow.getCell(j); // new cell
            if (oldCell != null) {
                if (newCell == null) {
                    newCell = destRow.createCell(j);
                }
                // copy chaque cell
                copyCell(oldCell, newCell, styleMap);
                // copy les informations de fusion entre les cellules
                // System.out.println("row num: " + srcRow.getRowNum() +
                // " , col: " + (short)oldCell.getColumnIndex());
                CellRangeAddress mergedRegion = getMergedRegion(srcSheet, srcRow.getRowNum(),
                        (short) oldCell.getColumnIndex());

                if (mergedRegion != null) {
                    // System.out.println("Selected merged region: " +
                    // mergedRegion.toString());
                    CellRangeAddress newMergedRegion = new CellRangeAddress(mergedRegion.getFirstRow(),
                            mergedRegion.getLastRow(), mergedRegion.getFirstColumn(), mergedRegion.getLastColumn());
                    // System.out.println("New merged region: " +
                    // newMergedRegion.toString());
                    CellRangeAddressWrapper wrapper = new CellRangeAddressWrapper(newMergedRegion);
                    if (isNewMergedRegion(wrapper, mergedRegions)) {
                        mergedRegions.add(wrapper);
                        destSheet.addMergedRegion(wrapper.range);
                    }
                }
            }
        }

    }

    /**
     * @param oldCell
     * @param newCell
     * @param styleMap
     */
    public static void copyCell(HSSFCell oldCell, XSSFCell newCell, Map<Integer, HSSFCellStyle> styleMap) {
        if (styleMap != null) {
            int stHashCode = oldCell.getCellStyle().hashCode();
            HSSFCellStyle sourceCellStyle = styleMap.get(stHashCode);
            XSSFCellStyle destnCellStyle = newCell.getCellStyle();
            if (sourceCellStyle == null) {
                sourceCellStyle = oldCell.getSheet().getWorkbook().createCellStyle();
            }
            destnCellStyle.cloneStyleFrom(oldCell.getCellStyle());
            styleMap.put(stHashCode, sourceCellStyle);
            newCell.setCellStyle(destnCellStyle);
        }
        switch (oldCell.getCellType()) {
            case STRING:
                newCell.setCellValue(oldCell.getStringCellValue());
                break;
            case NUMERIC:
                newCell.setCellValue(oldCell.getNumericCellValue());
                break;
            case BLANK:
                newCell.setCellType(CellType.BLANK);
                break;
            case BOOLEAN:
                newCell.setCellValue(oldCell.getBooleanCellValue());
                break;
            case ERROR:
                newCell.setCellErrorValue(oldCell.getErrorCellValue());
                break;
            case FORMULA:
                newCell.setCellFormula(oldCell.getCellFormula());
                break;
            default:
                break;
        }
    }

    public static void transform(XSSFWorkbook workbookNew, HSSFWorkbook workbookOld, XSSFCellStyle styleNew, HSSFCellStyle styleOld) {
        styleNew.setAlignment(styleOld.getAlignmentEnum());
        styleNew.setBottomBorderColor(styleOld.getBottomBorderColor());
        styleNew.setBorderBottom(styleOld.getBorderBottomEnum());
        styleNew.setLeftBorderColor(styleOld.getLeftBorderColor());
        styleNew.setBorderLeft(styleOld.getBorderLeftEnum());
        styleNew.setRightBorderColor(styleOld.getRightBorderColor());
        styleNew.setBorderRight(styleOld.getBorderRightEnum());
        styleNew.setTopBorderColor(styleOld.getTopBorderColor());
        styleNew.setBorderTop(styleOld.getBorderTopEnum());
        styleNew.setDataFormat(transform(workbookNew, workbookOld, styleOld.getDataFormat()));
        styleNew.setFillBackgroundColor(styleOld.getFillBackgroundColor());
        styleNew.setFillForegroundColor(styleOld.getFillForegroundColor());
        styleNew.setFillPattern(styleOld.getFillPatternEnum());
        styleNew.setFont(transform(workbookNew, styleOld.getFont(workbookOld)));
        styleNew.setHidden(styleOld.getHidden());
        styleNew.setIndention(styleOld.getIndention());
        styleNew.setLocked(styleOld.getLocked());
        styleNew.setVerticalAlignment(styleOld.getVerticalAlignmentEnum());
        styleNew.setWrapText(styleOld.getWrapText());
    }
    public static void transform(XSSFWorkbook workbookNew, XSSFWorkbook workbookOld, XSSFCellStyle styleNew, XSSFCellStyle styleOld) {
        styleNew.setAlignment(styleOld.getAlignmentEnum());
        styleNew.setBottomBorderColor(styleOld.getBottomBorderColor());
        styleNew.setBorderBottom(styleOld.getBorderBottomEnum());
        styleNew.setLeftBorderColor(styleOld.getLeftBorderColor());
        styleNew.setBorderLeft(styleOld.getBorderLeftEnum());
        styleNew.setRightBorderColor(styleOld.getRightBorderColor());
        styleNew.setBorderRight(styleOld.getBorderRightEnum());
        styleNew.setTopBorderColor(styleOld.getTopBorderColor());
        styleNew.setBorderTop(styleOld.getBorderTopEnum());
        styleNew.setDataFormat(transform(workbookNew, workbookOld, styleOld.getDataFormat()));
        styleNew.setFillBackgroundColor(styleOld.getFillBackgroundColor());
        styleNew.setFillForegroundColor(styleOld.getFillForegroundColor());
        styleNew.setFillPattern(styleOld.getFillPatternEnum());
        styleNew.setFont(transform(workbookNew, styleOld.getFont()));
        styleNew.setHidden(styleOld.getHidden());
        styleNew.setIndention(styleOld.getIndention());
        styleNew.setLocked(styleOld.getLocked());
        styleNew.setVerticalAlignment(styleOld.getVerticalAlignmentEnum());
        styleNew.setWrapText(styleOld.getWrapText());
    }
    private static short transform(XSSFWorkbook workbookNew, HSSFWorkbook workbookOld, short index) {
        DataFormat formatOld = workbookOld.createDataFormat();
        DataFormat formatNew = workbookNew.createDataFormat();
        return formatNew.getFormat(formatOld.getFormat(index));
    }
    private static short transform(XSSFWorkbook workbookNew, XSSFWorkbook workbookOld, short index) {
        DataFormat formatOld = workbookOld.createDataFormat();
        DataFormat formatNew = workbookNew.createDataFormat();
        return formatNew.getFormat(formatOld.getFormat(index));
    }
    private static XSSFFont transform(XSSFWorkbook workbookNew, HSSFFont fontOld) {
        XSSFFont fontNew = workbookNew.createFont();
        fontNew.setBold(fontOld.getBold());
        fontNew.setCharSet(fontOld.getCharSet());
        fontNew.setColor(fontOld.getColor());
        fontNew.setFontName(fontOld.getFontName());
        fontNew.setFontHeight(fontOld.getFontHeight());
        fontNew.setItalic(fontOld.getItalic());
        fontNew.setStrikeout(fontOld.getStrikeout());
        fontNew.setTypeOffset(fontOld.getTypeOffset());
        fontNew.setUnderline(fontOld.getUnderline());
        return fontNew;
    }
    private static XSSFFont transform(XSSFWorkbook workbookNew, XSSFFont fontOld) {
        XSSFFont fontNew = workbookNew.createFont();
        fontNew.setBold(fontOld.getBold());
        fontNew.setCharSet(fontOld.getCharSet());
        fontNew.setColor(fontOld.getColor());
        fontNew.setFontName(fontOld.getFontName());
        fontNew.setFontHeight(fontOld.getFontHeight());
        fontNew.setItalic(fontOld.getItalic());
        fontNew.setStrikeout(fontOld.getStrikeout());
        fontNew.setTypeOffset(fontOld.getTypeOffset());
        fontNew.setUnderline(fontOld.getUnderline());
        return fontNew;
    }

    /**
     * Récupère les informations de fusion des cellules dans la sheet source
     * pour les appliquer à la sheet destination... Récupère toutes les zones
     * merged dans la sheet source et regarde pour chacune d'elle si elle se
     * trouve dans la current row que nous traitons. Si oui, retourne l'objet
     * CellRangeAddress.
     *
     * @param sheet
     *            the sheet containing the data.
     * @param rowNum
     *            the num of the row to copy.
     * @param cellNum
     *            the num of the cell to copy.
     * @return the CellRangeAddress created.
     */
    public static CellRangeAddress getMergedRegion(HSSFSheet sheet, int rowNum, short cellNum) {
        for (int i = 0; i < sheet.getNumMergedRegions(); i++) {
            CellRangeAddress merged = sheet.getMergedRegion(i);
            if (merged.isInRange(rowNum, cellNum)) {
                return merged;
            }
        }
        return null;
    }

    /**
     * Check that the merged region has been created in the destination sheet.
     *
     * @param newMergedRegion
     *            the merged region to copy or not in the destination sheet.
     * @param mergedRegions
     *            the list containing all the merged region.
     * @return true if the merged region is already in the list or not.
     */
    private static boolean isNewMergedRegion(CellRangeAddressWrapper newMergedRegion,
                                             Set<CellRangeAddressWrapper> mergedRegions) {
        return !mergedRegions.contains(newMergedRegion);
    }
}
