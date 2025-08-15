package com.lets.commons.word.util;

import cn.hutool.core.collection.CollUtil;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import lombok.SneakyThrows;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.*;
import org.apache.poi.xwpf.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 读取Word
 *
 * @author: DING WEI
 * @date: 2022/9/19 9:51
 */
public class ReadWordUtils {

    private static Pattern DOUBLE_BIG_PARENTHESES = Pattern.compile(GlobalConstant.DOUBLE_BIG_PARENTHESES);
    private static Pattern MIDDLE_PARENTHESES = Pattern.compile(GlobalConstant.MIDDLE_PARENTHESES);

    @SneakyThrows
    public static void main(String[] args) {
//        String path = "C:\\Users\\dell\\Desktop\\template\\MaterialBarCodeReadTest.docx";
//        List<String> allVariable = getAllVariable07(new FileInputStream(new File(path)));
//        System.out.println(allVariable);
//
//        String path03 = "C:\\Users\\dell\\Desktop\\template\\MaterialBarCodeReadTest03.doc";
//        List<String> allVariable03 = getAllVariable03(new FileInputStream(new File(path03)));
//        System.out.println(allVariable03);

        String path03 = "C:\\Users\\dell\\Desktop\\template\\excel\\产品提供采购模板.doc";
        List<String> allVariable03 = getAllVariable03(new FileInputStream(new File(path03)));
        System.out.println(allVariable03);
    }

    private static List<String> handleText(String text) {
        List<String> result = new ArrayList<>();
        if (StringUtils.isNotBlank(text)) {
            text = text.replace("\u0007", "");
            Matcher matcher = DOUBLE_BIG_PARENTHESES.matcher(text);
            while (matcher.find()) {
                String group = matcher.group();
                if (!result.contains(group)) {
                    result.add(group);
                }
            }
            Matcher matcher1 = MIDDLE_PARENTHESES.matcher(text);
            while (matcher1.find()) {
                String group = matcher1.group();
                if (group.contains(".")) {
                    String[] split = group.split("\\.");
                    group = split[split.length - 1];
                }
                if (!result.contains(group)) {
                    result.add(group);
                }
            }
        }
        return result;
    }

    // 读取doc文档中表格数据示例
    public static List<String> getAllVariable03(InputStream is) {
        List<String> result = new ArrayList<>();
        try {
            // 获取文件对象
            HWPFDocument doc = new HWPFDocument(is);

            // 页眉
            Range headerStoryRange = doc.getHeaderStoryRange();
            head03(headerStoryRange, result);
            // 页脚
            Range footnoteRange = doc.getFootnoteRange();
            head03(footnoteRange, result);

            // 正文
            Range r = doc.getRange();
            head03(r, result);

            // 关闭document对象
            doc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    private static void head03(Range r, List<String> result) {
        TableIterator it = new TableIterator(r);
        for (int i = 0; i < r.numParagraphs(); i++) {
            //获取当前段落
            Paragraph p = r.getParagraph(i);
            //判断当前段落是否为表格
            if (p.isInTable()) {
                //迭代文档中的表格
                while (it.hasNext()) {
                    Table tb = (Table) it.next();
                    //迭代行，默认从0开始
                    for (int j = 0; j < tb.numRows(); j++) {
                        //当前行
                        TableRow tr = tb.getRow(j);
                        //用于存放一行数据，不需要可以不用
                        //迭代列，默认从0开始
                        for (int x = 0; x < tr.numCells(); x++) {
                            //取得单元格
                            TableCell td = tr.getCell(x);
                            //取得单元格的内容
                            Paragraph para = td.getParagraph(0);
                            String text = para.text();
                            handFields(text, result);
                        }
                    }
                }
            }
            handFields(p.text(), result);
        }
    }

    // 读取docx文档中表格数据示例
    public static List<String> getAllVariable07(InputStream is) {
        List<String> result = new ArrayList<>();
        try {
            //获取文件对象
            XWPFDocument doc = new XWPFDocument(is);
            // 获取页眉或页脚的策略对象
            List<XWPFHeader> headerList = doc.getHeaderList();
            if (CollUtil.isNotEmpty(headerList)) {
                for (XWPFHeader xwpfHeader : headerList) {
                    String text = printTextFromBodyElements(xwpfHeader.getBodyElements());
                    handFields(text, result);
                }
            }
            List<XWPFFooter> footerList = doc.getFooterList();
            if (CollUtil.isNotEmpty(footerList)) {
                for (XWPFFooter xwpfFooter : footerList) {
                    String text = printTextFromBodyElements(xwpfFooter.getBodyElements());
                    handFields(text, result);
                }
            }
            //获取文件内容对象
            List<XWPFParagraph> paragraphs = doc.getParagraphs();
            for (XWPFParagraph graph : paragraphs) {
                handFields(graph.getText(), result);
            }
            List<XWPFTable> tables = doc.getTables();
            List<XWPFTableRow> rows;
            List<XWPFTableCell> cells;
            for (XWPFTable table : tables) {
                // 获取表格对应的行
                rows = table.getRows();
                for (int j = 0; j < rows.size(); j++) {
                    XWPFTableRow row = rows.get(j);
                    // 获取行对应的单元格
                    cells = row.getTableCells();
                    for (int i = 0; i < cells.size(); i++) {
                        XWPFTableCell cell = cells.get(i);
                        handFields(cell.getText(), result);
                    }
                }
            }
            // 关闭document对象
            doc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    private static String printTextFromBodyElements(List<IBodyElement> bodyElements) {
        StringBuilder contentBuilder = new StringBuilder();
        for (IBodyElement bodyElement : bodyElements) {
            if (bodyElement instanceof XWPFTable) {
                XWPFTable table = (XWPFTable) bodyElement;
                String text = table.getText();
                contentBuilder.append(text);
            } else if (bodyElement instanceof XWPFParagraph) {
                XWPFParagraph paragraph = (XWPFParagraph) bodyElement;
                String text = paragraph.getText();
                contentBuilder.append(text);
            }
        }
        return contentBuilder.toString();
    }

    private static void handFields(String content, List<String> result) {
        if (StringUtils.isNotBlank(content) && Objects.nonNull(result)) {
            List<String> texts = handleText(content);
            if (CollUtil.isNotEmpty(texts)) {
                for (String s : texts) {
                    if (StringUtils.isNotBlank(s) && !result.contains(s)) {
                        result.add(s);
                    }
                }
            }
        }
    }

}
