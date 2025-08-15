package com.lets.commons.easyexcel.title.style;

import lombok.Data;

/**
 * 批注信息
 * @author: DING WEI
 * @date: 2023/3/30 11:06
 */
@Data
public class CommentModel {

    /**
     * sheet页名称
     */
    private String sheetName;
    /**
     * 列索引
     */
    private int colIndex;
    /**
     * 行索引
     */
    private int rowIndex;
    /**
     * 行索引
     */
    private String commentContent;

    /**
     * 生成批注信息
     *
     * @param sheetName      sheet页名称
     * @param rowIndex       行号
     * @param columnIndex    列号
     * @param commentContent 批注内容
     * @return
     */
    public static CommentModel createCommentModel(String sheetName, int rowIndex, int columnIndex, String commentContent) {
        CommentModel commentModel = new CommentModel();
        // sheet页名称
        commentModel.setSheetName(sheetName);
        // 行号
        commentModel.setRowIndex(rowIndex);
        // 列号
        commentModel.setColIndex(columnIndex);
        // 批注内容
        commentModel.setCommentContent(commentContent);
        return commentModel;
    }

}
