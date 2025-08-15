package com.lets.commons.easyexcel.utils;

import cn.hutool.core.collection.CollUtil;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.excel.write.builder.ExcelWriterSheetBuilder;
import com.alibaba.excel.write.handler.WriteHandler;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.style.WriteCellStyle;
import com.alibaba.excel.write.style.HorizontalCellStyleStrategy;
import com.alibaba.excel.write.style.column.LongestMatchColumnWidthStyleStrategy;
import com.lets.commons.easyexcel.convert.LocalDateTimeConverter;
import com.lets.commons.easyexcel.entity.ExcelWriteConfig;
import com.lets.commons.easyexcel.entity.ExcelWriteWithMergeCellConfig;
import com.lets.commons.easyexcel.title.AutoWidthWriteHandler;
import com.lets.commons.easyexcel.title.CustemTitleWideHandler;
import com.lets.commons.easyexcel.title.TitleMultipleSheetWriteHandler;
import com.lets.commons.easyexcel.title.TitleSheetWriteHandler;
import com.lets.commons.easyexcel.title.style.BlankContentSheetHandler;
import com.lets.commons.easyexcel.title.style.CustomInsertRowWriteHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.springframework.util.CollectionUtils;

import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;

/**
 * 导出工具类
 */
@Slf4j
public class EasyExcelUtil {

    /**
     * 导出excel
     * 以前的是：EasyExcelFactory.write(out, MaterialTypeExcelVo)
     * .excelType(ExcelTypeEnum.XLSX)
     * .head(MaterialTypeExcelVo.class)
     * .relativeHeadRowIndex(1)
     * .registerWriteHandler(new TitleSheetWriteHandler(name, 4))
     * .sheet(name)
     * .doWrite(data);
     *
     * @param outputStream      输出流
     * @param dataList          导出的数据
     * @param classT            模板类
     * @param sheetName         sheetName
     * @param cellWriteHandlers 样式处理类
     */

    //请使用 writeExcelWithConfig
    public static void writeExcelWithModel(OutputStream outputStream, List<Object> dataList,
                                           Class<?> classT,
                                           String sheetName,
                                           WriteHandler... cellWriteHandlers) {
        // 头的策略
        WriteCellStyle headWriteCellStyle = new WriteCellStyle();
        // 单元格策略
        WriteCellStyle contentWriteCellStyle = new WriteCellStyle();
        // 假定默认一行有100列
        // 初始化表格样式
        HorizontalCellStyleStrategy horizontalCellStyleStrategy = new HorizontalCellStyleStrategy(headWriteCellStyle, contentWriteCellStyle);
        resetCellMaxTextLength();
        ExcelWriterSheetBuilder excelWriterSheetBuilder = EasyExcel.write(outputStream, classT)
                                                                   .excelType(ExcelTypeEnum.XLSX)
                                                                   .head(classT)
                                                                   .relativeHeadRowIndex(1)
                                                                   .sheet(sheetName)
                                                                   .registerWriteHandler(horizontalCellStyleStrategy);
        boolean hasTitleSheetWriteHandler = false;
        if (null != cellWriteHandlers) {
            for (WriteHandler cellWriteHandler : cellWriteHandlers) {
                if (cellWriteHandler instanceof TitleSheetWriteHandler) {
                    hasTitleSheetWriteHandler = true;
                }
                excelWriterSheetBuilder.registerWriteHandler(cellWriteHandler);
            }
        }
        if (!hasTitleSheetWriteHandler) {
            excelWriterSheetBuilder.registerWriteHandler(new TitleSheetWriteHandler());
        }
        // 添加空白单元格格式处理类
        BlankContentSheetHandler blankContentHandler = new BlankContentSheetHandler(classT, null, 0);
        excelWriterSheetBuilder.registerWriteHandler(blankContentHandler);
        // 开始导出
        excelWriterSheetBuilder.doWrite(dataList);
    }

    /**
     * 导出excel
     */
    public static void writeExcelWithConfig(OutputStream outputStream, ExcelWriteConfig... configs) {
        resetCellMaxTextLength();
        ExcelWriter excelWriter = EasyExcel.write(outputStream).excelType(ExcelTypeEnum.XLSX).build();
        // 头的策略
        WriteCellStyle headWriteCellStyle = new WriteCellStyle();
        // 单元格策略
        WriteCellStyle contentWriteCellStyle = new WriteCellStyle();
        contentWriteCellStyle.setHorizontalAlignment(HorizontalAlignment.CENTER);
        contentWriteCellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        // 初始化表格样式
        HorizontalCellStyleStrategy horizontalCellStyleStrategy = new HorizontalCellStyleStrategy(headWriteCellStyle, contentWriteCellStyle);
        if (configs != null) {
            for (int i = 0; i < configs.length; i++) {
                ExcelWriteConfig config = configs[i];
                String sheetName = config.getSheetName();
                Class<?> clazz = config.getClazz();
                List<List<String>> head = config.getHead();
                List<?> dataList = config.getDataList();
                boolean isText = config.getIsText();
                boolean isAutoWidth = config.getIsAutoWidth();
                boolean onlyTitle = config.getOnlyTitle();
                int rowNumber = config.getRowNumber();
                List<List<String>> insertDataList = config.getInsertDatas();
                List<WriteHandler> writeHandler = config.getCellWriteHandlers();

                ExcelWriterSheetBuilder excelWriterSheetBuilder = EasyExcel.writerSheet(i, sheetName)
                                                                           .relativeHeadRowIndex(rowNumber)
                                                                           .needHead(true)
                                                                           .registerConverter(new LocalDateTimeConverter())
                                                                           .registerWriteHandler(horizontalCellStyleStrategy);
                if (clazz != null) {
                    excelWriterSheetBuilder.head(clazz);
                } else {
                    excelWriterSheetBuilder.head(head);
                }
                boolean hasTitleSheetWriteHandler = false;
                if (writeHandler != null) {
                    for (WriteHandler cellWriteHandler : writeHandler) {
                        if (cellWriteHandler instanceof TitleSheetWriteHandler) {
                            hasTitleSheetWriteHandler = true;
                        }
                        excelWriterSheetBuilder.registerWriteHandler(cellWriteHandler);
                    }
                }
                if (!hasTitleSheetWriteHandler) {
                    excelWriterSheetBuilder.registerWriteHandler(new TitleSheetWriteHandler());
                }
                if (CollUtil.isNotEmpty(insertDataList)) {
                    excelWriterSheetBuilder.registerWriteHandler(new CustomInsertRowWriteHandler(insertDataList));
                }
                if (isAutoWidth) {
                    excelWriterSheetBuilder.registerWriteHandler(new AutoWidthWriteHandler(onlyTitle));
                }
                //                if (isText) {
                //                    excelWriterSheetBuilder.registerWriteHandler(new TextWriteHandler());
                //                }

                // 设置每一列单元格格式为文本 当匹配到 量、价、额时会将该列设置为数字
                BlankContentSheetHandler blankContentHandler = new BlankContentSheetHandler(clazz, head, i);
                excelWriterSheetBuilder.registerWriteHandler(blankContentHandler);
                WriteSheet writeSheet = excelWriterSheetBuilder.build();
                resetCellMaxTextLength();
                excelWriter.write(dataList, writeSheet);
            }
        }
        // 开始导出
        excelWriter.finish();
    }

    public static void writeExcelWithConfigWithMergeCell(OutputStream outputStream, ExcelWriteWithMergeCellConfig... configs) {
        resetCellMaxTextLength();
        ExcelWriter excelWriter = EasyExcel.write(outputStream).excelType(ExcelTypeEnum.XLSX).build();
        if (Objects.nonNull(configs) && configs.length > 0) {
            for (int i = 0; i < configs.length; i++) {
                ExcelWriteWithMergeCellConfig config = configs[i];
                String sheetName = config.getSheetName();
                Integer titleLastNo = config.getTitleLastNo();
                Class<?> clazz = config.getClazz();
                List<List<String>> head = config.getHead();
                List<?> dataList = config.getDataList();
                boolean isAutoWidth = config.getIsAutoWidth();
                List<WriteHandler> writeHandler = config.getCellWriteHandlers();
                ExcelWriterSheetBuilder excelWriterSheetBuilder = EasyExcel.writerSheet(i, sheetName);
                if (Objects.nonNull(clazz)) {
                    excelWriterSheetBuilder.head(clazz);
                } else {
                    excelWriterSheetBuilder.head(head);
                }
                excelWriterSheetBuilder.relativeHeadRowIndex(1).needHead(Boolean.TRUE);
                excelWriterSheetBuilder.registerConverter(new LocalDateTimeConverter());
                if (Objects.isNull(clazz) || isAutoWidth) {
                    excelWriterSheetBuilder.registerWriteHandler(new LongestMatchColumnWidthStyleStrategy());
                    excelWriterSheetBuilder.registerWriteHandler(new CustemTitleWideHandler());
                }
                boolean hasTitleSheetWriteHandler = Boolean.FALSE;
                if (!CollectionUtils.isEmpty(writeHandler)) {
                    for (WriteHandler cellWriteHandler : writeHandler) {
                        if (cellWriteHandler instanceof TitleMultipleSheetWriteHandler) {
                            hasTitleSheetWriteHandler = Boolean.TRUE;
                        }
                        excelWriterSheetBuilder.registerWriteHandler(cellWriteHandler);
                    }
                }
                if (!hasTitleSheetWriteHandler) {
                    excelWriterSheetBuilder.registerWriteHandler(new TitleMultipleSheetWriteHandler(sheetName, titleLastNo, i));
                }
                WriteSheet writeSheet = excelWriterSheetBuilder.build();
                resetCellMaxTextLength();
                excelWriter.write(dataList, writeSheet);
            }
        }
        // 开始导出
        excelWriter.finish();
    }

    public static void resetCellMaxTextLength() {
        SpreadsheetVersion excel2007 = SpreadsheetVersion.EXCEL2007;
        if (Integer.MAX_VALUE != excel2007.getMaxTextLength()) {
            Field field;
            try {
                field = excel2007.getClass().getDeclaredField("_maxTextLength");
                field.setAccessible(true);
                field.set(excel2007,Integer.MAX_VALUE);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
