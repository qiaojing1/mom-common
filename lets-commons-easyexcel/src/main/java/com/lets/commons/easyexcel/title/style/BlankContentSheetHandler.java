package com.lets.commons.easyexcel.title.style;

import cn.hutool.core.collection.CollectionUtil;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.write.handler.SheetWriteHandler;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @description: 空白单元格样式处理类
 * @author: zhangweiyan
 * @date: 2024-04-10
 */
@Slf4j
public class BlankContentSheetHandler implements SheetWriteHandler {
    private final int sheetNo;
    private final Class<?> classT;
    private final List<List<String>> head;

    /**
     * 需要设置为数字的列包含的字，只需添加这个，便可判断当前列是否为常规类型，否则都为文本类型
     */
    private static final List<String> NUMBER_CONTENT_MATCH_LIST = Arrays.asList("量", "价", "额", "时长", "工时", "值", "（mm）", "（ml/m³）", "（N*M）");
    private static final List<String> NUMBER_CONTENT_UNMATCH_LIST = Arrays.asList("编码", "名称");

    public BlankContentSheetHandler(Class<?> classT, List<List<String>> head, int sheetNo) {
        this.classT = classT;
        this.head = head;
        this.sheetNo = sheetNo;
    }

    @Override
    public void afterSheetCreate(WriteWorkbookHolder writeWorkbookHolder, WriteSheetHolder writeSheetHolder) {
        Workbook wb = writeWorkbookHolder.getWorkbook();
        Sheet sheet = writeSheetHolder.getSheet();
        if(Objects.isNull(writeSheetHolder)){
            return;
        }
        if ((Objects.isNull(writeSheetHolder.getSheetNo()) ? 0 : writeSheetHolder.getSheetNo()) != sheetNo) {
            return;
        }
        boolean skipColumn = false;
        if (classT != null) {
            Field[] fields = classT.getDeclaredFields();
            if (fields != null) {
                List<Field> list = Arrays.asList(fields);
                // 过滤未被ExcelProperty修饰的字段
                list = list.stream().filter(e -> Objects.nonNull(e.getAnnotation(ExcelProperty.class))).collect(Collectors.toList());
                for (int i = 0; i < list.size(); i++) {
                    int columnIndex = i;
                    // 使用反射获取所有被@ExcelProperty注解修饰的字段
                    ExcelProperty excelProperty = list.get(i).getAnnotation(ExcelProperty.class);
                    if (excelProperty != null && excelProperty.value().length > 0) {
                        String propertyName = excelProperty.value()[0];
                        // order在导出时的优先级大于index
                        int index = excelProperty.index();
                        if (index != -1) {
                            columnIndex = index;
                        }
                        int order = excelProperty.order();
                        if (Integer.MAX_VALUE != order) {
                            columnIndex = order;
                        }
                        skipColumn = isMatchTargetStr(propertyName);
                    }

                    CellStyle cellStyle = writeWorkbookHolder.getWorkbook().createCellStyle();
                    if (skipColumn) {
                        cellStyle.setDataFormat(wb.createDataFormat().getFormat("General"));
                    } else {
                        cellStyle.setDataFormat((short) 49);
                    }

                    sheet.setDefaultColumnStyle(columnIndex, cellStyle);
                }
            }
        } else if (head != null) {
            for (int i = 0; i < head.size(); i++) {
                // 遍历head列表
                List<String> headColumn = head.get(i);
                for (String headName : headColumn) {
                    skipColumn = isMatchTargetStr(headName);
                }

                CellStyle cellStyle = writeWorkbookHolder.getWorkbook().createCellStyle();
                if (skipColumn) {
                    cellStyle.setDataFormat(wb.createDataFormat().getFormat("General"));
                } else {
                    cellStyle.setDataFormat((short) 49);
                }

                sheet.setDefaultColumnStyle(i, cellStyle);
            }
        }
    }

    private boolean isMatchTargetStr(String name) {
        for (String match : NUMBER_CONTENT_MATCH_LIST) {
            if (name.contains(match) && notMatchTargetStr(name)) {
                return true;
            }
        }
        return false;
    }

    private boolean notMatchTargetStr(String name) {
        for (String s : NUMBER_CONTENT_UNMATCH_LIST) {
            if (name.contains(s)) {
                return false;
            }
        }
        return true;
    }
}
