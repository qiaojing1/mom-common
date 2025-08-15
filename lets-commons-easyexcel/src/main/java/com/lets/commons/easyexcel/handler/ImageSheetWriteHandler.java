package com.lets.commons.easyexcel.handler;

import com.alibaba.excel.write.handler.SheetWriteHandler;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.IOUtils;
import org.apache.poi.xssf.usermodel.XSSFClientAnchor;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Objects;

/**
 * 写入图片
 * @author: DING WEI
 * @date: 2025/2/24 15:07
 */
public class ImageSheetWriteHandler implements SheetWriteHandler {

    private final byte[] imageBytes;
    private final int startRow;
    private final int startCol;
    private final int endRow;
    private final int endCol;

    public ImageSheetWriteHandler(byte[] imageBytes, int startRow, int startCol, int endRow, int endCol) {
        this.imageBytes = imageBytes;
        this.startRow = startRow;
        this.startCol = startCol;
        this.endRow = endRow;
        this.endCol = endCol;
    }

    @Override
    public void afterSheetCreate(WriteWorkbookHolder writeWorkbookHolder, WriteSheetHolder writeSheetHolder) {
        if (Objects.nonNull(imageBytes)) {
            Sheet sheet = writeSheetHolder.getSheet();
            Workbook workbook = writeWorkbookHolder.getWorkbook();
            try (ByteArrayInputStream inputStream = new ByteArrayInputStream(imageBytes)) {
                // 添加图片到工作簿
                int pictureIdx = workbook.addPicture(IOUtils.toByteArray(inputStream), Workbook.PICTURE_TYPE_PNG);
                // 创建绘图对象
                Drawing<?> drawing = sheet.createDrawingPatriarch();
                // 创建锚点
                XSSFClientAnchor anchor = new XSSFClientAnchor(0, 0, 0, 0, startCol, startRow, endCol, endRow);
                // 插入图片
                drawing.createPicture(anchor, pictureIdx);
            } catch (IOException e) {
                throw new RuntimeException("Failed to insert image into Excel", e);
            }
        }
    }

}
