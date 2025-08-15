package com.lets.commons.easyexcel.utils;

import cn.hutool.core.collection.CollUtil;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ooxml.POIXMLDocumentPart;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlip;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTMarker;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTPicture;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.io.*;
import java.util.List;
import java.util.*;

/**
 * 读取Excel中的图片
 *
 * @author: DING WEI
 * @date: 2023/10/20 17:02
 */
public class ExcelImageUtils {

    private final static Logger LOG = LoggerFactory.getLogger(ExcelImageUtils.class);

    public static void main(String[] args) throws Exception {
        Map<String, Map<Integer, PictureData>> stringMapMap =
                parseSheetPic(new File("C:\\Users\\dell\\Desktop\\template\\megre\\XSTH-202209200000002_20220920.xls"), 0);
        System.out.println(stringMapMap);
        Map<String, List<PictureData>> sheetPicNew = parseSheetPicNew(new FileInputStream(new File("C:\\Users\\dell\\Desktop\\template\\megre\\XSTH-202209200000002_20220920.xls")), "xls", 0);
        System.out.println(sheetPicNew);
    }

    /**
     * 根据文件解析excel内图片
     *
     * @param file       文件对象
     * @param sheetIndex 第几个sheet
     * @return
     */
    public static Map<String, Map<Integer, PictureData>> parseSheetPic(File file, int sheetIndex) {
        try {
            //文件流
            InputStream input = new FileInputStream(file);
            //文件后缀
            String fileExt = FilenameUtils.getExtension(file.getName());
            //实现并返回
            return parseSheetPic(input, fileExt, sheetIndex);
        } catch (Exception e) {
            LOG.error("parseSheetPic fail , file error={}", e);
        }
        //默认
        return new HashMap<>();
    }

    /**
     * 根据文件流及文件类型解析excel内图片
     *
     * @param inputStream 文件流
     * @param fileExt     文件后缀 xls,xlsx
     * @param sheetIndex  第几个sheet
     * @return
     */
    public static Map<String, Map<Integer, PictureData>> parseSheetPic(InputStream inputStream, String fileExt, int sheetIndex) {
        try {
            //初始化
            Workbook workbook = WorkbookFactory.create(inputStream);
            //获取sheet
            Sheet sheet = workbook.getSheetAt(sheetIndex);
            //第一行作为key
            Map<Integer, String> keyMap = new HashMap<>();
            //第一行的迭代器
            Iterator<Cell> iterator = sheet.getRow(0).cellIterator();
            //指针
            int p = 0;
            //如果存在
            while (iterator.hasNext()) {
                //获取值
                String value = iterator.next().getStringCellValue();
                //如果存在
                if (StringUtils.isNotBlank(value)) {
                    //记录该key
                    keyMap.put(p, value);
                }
                //无论如何+1o
                p++;
            }
            //根据类型解析
            switch (fileExt) {
                case "xls":
                    return parseSheetPicForXLS((HSSFWorkbook) workbook, sheetIndex, keyMap);
                case "xlsx":
                    return parseSheetPicForXLSX((XSSFWorkbook) workbook, sheetIndex, keyMap);
            }
        } catch (Exception e) {
            LOG.error("parseSheetPic fail , inputStream error={}", e);
        }
        //默认
        return new HashMap<>();
    }
    public static Map<String, List<PictureData>> parseSheetPicNew(InputStream inputStream, String fileExt, int sheetIndex) {
        try {
            //初始化
            Workbook workbook = WorkbookFactory.create(inputStream);
            //根据类型解析
            switch (fileExt) {
                case "xls":
                    HSSFWorkbook hssfWorkbook = (HSSFWorkbook) workbook;
                    return getXlsPictures(hssfWorkbook.getSheetAt(sheetIndex));
                case "xlsx":
                    XSSFWorkbook xssfWorkbook = (XSSFWorkbook) workbook;
                    return getXlsxPictures(xssfWorkbook.getSheetAt(sheetIndex));
            }
        } catch (Exception e) {
            LOG.error("parseSheetPic fail , inputStream error={}", e);
        }
        //默认
        return new HashMap<>();
    }

    /**
     * 解析XLS的图片
     *
     * @param workbook   workbook
     * @param sheetIndex 第几页sheet的图片
     * @return
     */
    private static Map<String, Map<Integer, PictureData>> parseSheetPicForXLS(HSSFWorkbook workbook, int sheetIndex, Map<Integer, String> keyMap) {
        //初始化结果
        Map<String, Map<Integer, PictureData>> result = new HashMap<>();
        //获取workbook所有图片列表
        List<HSSFPictureData> pictures = workbook.getAllPictures();
        //获取对应sheet
        HSSFSheet sheet = workbook.getSheetAt(sheetIndex);
        //如果存在图片
        if (pictures.size() > 0) {
            //获取列表
            List<HSSFShape> children = sheet.getDrawingPatriarch().getChildren();
            //循环
            for (HSSFShape shape : children) {
                //获取并强转
                HSSFClientAnchor anchor = (HSSFClientAnchor) shape.getAnchor();
                //如果是
                if (shape instanceof HSSFPicture) {
                    //强转
                    HSSFPicture pic = (HSSFPicture) shape;
                    Dimension imageDimension = pic.getImageDimension();
                    LOG.info("图片宽高{}-{}", imageDimension.getWidth(), imageDimension.getHeight());
                    //从workbook所有图片中找到该图片
                    HSSFPictureData picData = pictures.get(pic.getPictureIndex() - 1);
                    //如果存在改key
                    Integer col1 = Integer.parseInt(String.valueOf(anchor.getCol1()));
                    if (keyMap.containsKey(col1)) {
                        //获取key
                        String key = keyMap.get(col1);
                        //尝试获取mep
                        Map<Integer, PictureData> map = result.getOrDefault(key, new HashMap<>());
                        //组装
                        map.put(anchor.getRow1() - 1, picData);
                        result.put(key, map);
                    }
                }
            }

        }
        //返回
        return result;
    }

    /**
     * 这是.xls文件拿到图片位置通用方法
     */
    public static Map<String, List<PictureData>> getXlsPictures(HSSFSheet sheet) throws IOException {
        Map<String, List<PictureData>> map = new HashMap<>();
        List<HSSFShape> shapeList = sheet.getDrawingPatriarch().getChildren();
        for (HSSFShape shape : shapeList) {
            if (shape instanceof HSSFPicture) {
                HSSFPicture picture = (HSSFPicture) shape;
                HSSFClientAnchor cAnchor = (HSSFClientAnchor) picture.getAnchor();
                PictureData pData = picture.getPictureData();
                // 行号-列号
                String key = cAnchor.getRow1() + "-" + cAnchor.getCol1();
                List<PictureData> pictureDataList = map.get(key);
                if (CollectionUtils.isEmpty(pictureDataList)) {
                    List<PictureData> list = Lists.newArrayList();
                    list.add(pData);
                    map.put(key, list);
                } else {
                    pictureDataList.add(pData);
                }
            }
        }
        return map;
    }
    public static Map<String, ExcelPicture> getXlsPicturesWithObj(HSSFSheet sheet) throws IOException {
        Map<String, ExcelPicture> map = new HashMap<>();
        HSSFPatriarch drawingPatriarch = sheet.getDrawingPatriarch();
        if (Objects.nonNull(drawingPatriarch)) {
            List<HSSFShape> shapeList = drawingPatriarch.getChildren();
            for (HSSFShape shape : shapeList) {
                if (shape instanceof HSSFPicture) {
                    HSSFPicture picture = (HSSFPicture) shape;
                    HSSFClientAnchor cAnchor = (HSSFClientAnchor) picture.getAnchor();
                    PictureData pData = picture.getPictureData();
                    // 行号-列号
                    String key = cAnchor.getRow1() + "-" + cAnchor.getCol1();
                    ExcelPicture excelPicture = map.get(key);
                    if (Objects.isNull(excelPicture)) {
                        excelPicture = new ExcelPicture();
                    }
                    List<PictureData> pictureDataList = excelPicture.getPictureDataList();
                    if (CollectionUtils.isEmpty(pictureDataList)) {
                        pictureDataList = Lists.newArrayList();
                        pictureDataList.add(pData);
                        excelPicture.setAnchor(cAnchor);
                        excelPicture.setPictureDataList(pictureDataList);
                        map.put(key, excelPicture);
                    } else {
                        pictureDataList.add(pData);
                    }
                }
            }
        }
        // TODO 另外一种获取图片的方式
        return map;
    }

    /**
     * 解析XLSX图片
     *
     * @return
     */
    private static Map<String, Map<Integer, PictureData>> parseSheetPicForXLSX(XSSFWorkbook workbook, int sheetIndex, Map<Integer, String> keyMap) {
        //初始化结果
        Map<String, Map<Integer, PictureData>> result = new HashMap<>();
        //获取列表
        List<POIXMLDocumentPart> relationList = workbook.getSheetAt(sheetIndex).getRelations();
        //循环1
        for (POIXMLDocumentPart dr : relationList) {
            //如果是类型
            if (dr instanceof XSSFDrawing) {
                //强转
                XSSFDrawing drawing = (XSSFDrawing) dr;
                //获取列表
                List<XSSFShape> shapeList = drawing.getShapes();
                //循环2
                for (XSSFShape shape : shapeList) {
                    //强转
                    XSSFPicture pic = (XSSFPicture) shape;
                    //获取其可能的表格
                    CTMarker ctMarker = pic.getPreferredSize().getFrom();
                    //如果存在改key
                    if (keyMap.containsKey(ctMarker.getCol())) {
                        //获取key
                        String key = keyMap.get(ctMarker.getCol());
                        //尝试获取结果map
                        Map<Integer, PictureData> map = result.getOrDefault(key, new HashMap<>());
                        //组装
                        map.put(ctMarker.getRow() - 1, pic.getPictureData());
                        Dimension imageDimension = pic.getImageDimension();
                        double height = imageDimension.getHeight();
                        double width = imageDimension.getWidth();
                        LOG.info("宽高：{}-{}", width, height);
                        result.put(key, map);
                    }
                }
            }
        }
        //返回
        return result;
    }

    /**
     * 这是.xlsx文件拿到图片位置通用方法
     */
    public static Map<String, List<PictureData>> getXlsxPictures(XSSFSheet sheet) throws IOException {
        Map<String, List<PictureData>> map = new HashMap<>();
        List<POIXMLDocumentPart> list = sheet.getRelations();
        for (POIXMLDocumentPart part : list) {
            if (part instanceof XSSFDrawing) {
                XSSFDrawing drawing = (XSSFDrawing) part;
                List<XSSFShape> shapes = drawing.getShapes();
                for (XSSFShape shape : shapes) {
                    XSSFPicture picture = (XSSFPicture) shape;
                    XSSFClientAnchor anchor = picture.getPreferredSize();
                    CTMarker marker = anchor.getFrom();
                    // 行号-列号
                    String key = marker.getRow() + "-" + marker.getCol();
                    List<PictureData> pictureDataList = map.get(key);
                    if (CollectionUtils.isEmpty(pictureDataList)) {
                        List<PictureData> newList = Lists.newArrayList();
                        newList.add(picture.getPictureData());
                        map.put(key, newList);
                    } else {
                        pictureDataList.add(picture.getPictureData());
                    }
                }
            }
        }
        return map;
    }

    public static Map<String, ExcelPicture> getXlsxPicturesWithObj(XSSFWorkbook workbook, XSSFSheet sheet) throws IOException {
        Map<String, ExcelPicture> map = new HashMap<>();
        List<POIXMLDocumentPart> list = sheet.getRelations();
        if (CollUtil.isEmpty(list)) {
            List<XSSFPictureData> allPictures = workbook.getAllPictures();
            if (CollUtil.isNotEmpty(allPictures)) {
                // TODO 目前获取不到,待优化
                for (XSSFPictureData pictureData : allPictures) {
                    List<POIXMLDocumentPart> relations = pictureData.getRelations();
                    handle(relations, map);
                }
            }
        } else {
            handle(list, map);
        }
        return map;
    }

    private static void handle(List<POIXMLDocumentPart> list, Map<String, ExcelPicture> map) {
        for (Object part : list) {
            if (part instanceof XSSFDrawing) {
                XSSFDrawing drawing = (XSSFDrawing) part;
                List<XSSFShape> shapes = drawing.getShapes();
                for (XSSFShape shape : shapes) {
                    if (Objects.nonNull(shape) && shape instanceof XSSFPicture) {
                        XSSFPicture picture = (XSSFPicture) shape;
//                        XSSFClientAnchor anchor = picture.getPreferredSize();
                        CTPicture ctPicture = picture.getCTPicture();
                        CTBlip blip = ctPicture.getBlipFill().getBlip();
                        if (Objects.nonNull(blip)) {
                            XSSFClientAnchor anchor = (XSSFClientAnchor) shape.getAnchor();
                            CTMarker marker = anchor.getFrom();
                            // 行号-列号
                            String key = marker.getRow() + "-" + marker.getCol();
                            ExcelPicture pictureData = map.get(key);
                            if (Objects.isNull(pictureData)) {
                                pictureData = new ExcelPicture();
                            }
                            List<PictureData> pictureDataList = pictureData.getPictureDataList();
                            if (CollectionUtils.isEmpty(pictureDataList)) {
                                pictureDataList = Lists.newArrayList();
                                pictureDataList.add(picture.getPictureData());
//                        writeImage(picture);
                                pictureData.setAnchor(anchor);
                                pictureData.setPictureDataList(pictureDataList);
                                map.put(key, pictureData);
                            } else {
                                pictureDataList.add(picture.getPictureData());
                            }
                        }
                    }
                }
            }
        }
    }

    public static void writeImage(XSSFPicture picture) {
        try {
            // 写入文件
            String path = "C:\\Users\\dell\\Desktop\\template\\megre\\image\\" + UUID.randomUUID().toString() + ".png";
            FileOutputStream out = new FileOutputStream(path);// 流写入
            out.write(picture.getPictureData().getData());
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
