package com.lets.commons.easyexcel.title.style;

import com.alibaba.excel.write.handler.AbstractRowWriteHandler;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteTableHolder;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFClientAnchor;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 自定义批注处理器
 * @author: DING WEI
 * @date: 2023/3/30 11:07
 */
public class CommentWriteHandler extends AbstractRowWriteHandler {

    /**
     * sheet页名称列表
     */
    private List<String> sheetNameList;
    List<CommentModel> commentList = new ArrayList<>();

    /**
     * 自定义批注适配器构造方法
     *
     * @param commentList 批注信息
     * @param extension   文件后缀（xlsx、xls）
     */
    public CommentWriteHandler(List<CommentModel> commentList, String extension) {
        if (CollectionUtils.isEmpty(commentList)) {
            return;
        }
        // 文件不为指定的格式时，默认为Xlsx
        if (!StringUtils.equals(extension, "xlsx") && !StringUtils.equals(extension, "xls")) {
            extension = "xlsx";
        }
        this.commentList = commentList.stream().filter(x ->
                StringUtils.isNotBlank(x.getSheetName()) && x.getColIndex() >=0 && x.getRowIndex() >= 0 && StringUtils.isNotBlank(x.getCommentContent())
        ).collect(Collectors.toList());
        sheetNameList = this.commentList.stream().map(CommentModel::getSheetName).distinct().collect(Collectors.toList());
        this.extension = extension;
    }

    /**
     * 文档后缀名
     */
    private String extension;

    @Override
    public void afterRowDispose(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, Row row,
                                Integer relativeRowIndex, Boolean isHead) {
        Sheet sheet = writeSheetHolder.getSheet();
        // 不需要添加批注，或者当前sheet页不需要添加批注
        if (CollectionUtils.isEmpty(commentList) || !sheetNameList.contains(sheet.getSheetName())) {
            return;
        }
        int rowNum = row.getRowNum();
        // 获取当前行的批注信息
        List<CommentModel> rowCommentList = commentList.stream().filter(x ->
                StringUtils.equals(x.getSheetName(), sheet.getSheetName())
                        && Objects.equals(rowNum, x.getRowIndex())).collect(Collectors.toList());
        // 当前行没有批注信息
        if (CollectionUtils.isEmpty(rowCommentList)) {
            return;
        }
        for (CommentModel commentModel : rowCommentList) {
            int colIndex = commentModel.getColIndex();
            // 同一单元格的批注信息
            List<CommentModel> cellCommentList = rowCommentList.stream().filter(x ->
                    Objects.equals(colIndex, x.getColIndex())).collect(Collectors.toList());
            if (CollectionUtils.isEmpty(cellCommentList)) {
                continue;
            }
            // 批注内容拼成一条
            String commentContent = cellCommentList.stream().map(CommentModel::getCommentContent).collect(Collectors.joining());
            Cell cell = row.getCell(colIndex);
            addComment(cell, commentContent, extension);
        }
        // 删除批注信息
        commentList.remove(rowCommentList);
        // 重新获取要添加的sheet页姓名
        sheetNameList = commentList.stream().map(CommentModel::getSheetName).distinct().collect(Collectors.toList());
    }

    /**
     * 给Cell添加批注
     *
     * @param cell 单元格
     * @param value 批注内容
     * @param extension 扩展名
     */
    public static void addComment(Cell cell, String value, String extension) {
        Sheet sheet = cell.getSheet();
        cell.removeCellComment();
        if ("xls".equals(extension)) {
            ClientAnchor anchor = new HSSFClientAnchor();
            // 关键修改
            anchor.setDx1(0);
            anchor.setDx2(0);
            anchor.setDy1(0);
            anchor.setDy2(0);
            anchor.setCol1(cell.getColumnIndex());
            anchor.setRow1(cell.getRowIndex());
            anchor.setCol2(cell.getColumnIndex() + 3);
            anchor.setRow2(cell.getRowIndex() + 4);
            // 结束
            Drawing<?> drawing = sheet.createDrawingPatriarch();
            Comment comment = drawing.createCellComment(anchor);
            // 输入批注信息
            comment.setString(new HSSFRichTextString(value));
            // 将批注添加到单元格对象中
            cell.setCellComment(comment);
        } else if ("xlsx".equals(extension)) {
            ClientAnchor anchor = new XSSFClientAnchor();
            // 关键修改
            anchor.setDx1(0);
            anchor.setDx2(0);
            anchor.setDy1(0);
            anchor.setDy2(0);
            anchor.setCol1(cell.getColumnIndex());
            anchor.setRow1(cell.getRowIndex());
            anchor.setCol2(cell.getColumnIndex() + 3);
            anchor.setRow2(cell.getRowIndex() + 4);
            // 结束
            Drawing<?> drawing = sheet.createDrawingPatriarch();
            Comment comment = drawing.createCellComment(anchor);
            // 输入批注信息
            comment.setString(new XSSFRichTextString(value));
            // 将批注添加到单元格对象中
            cell.setCellComment(comment);
        }
    }

}
