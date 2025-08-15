package com.lets.commons.easyexcel.title.style;

import com.alibaba.excel.write.handler.SheetWriteHandler;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteWorkbookHolder;
import org.apache.poi.xssf.streaming.SXSSFSheet;

import java.util.UUID;

/**
 * 锁定Sheet
 * @author: DING WEI
 * @date: 2023/3/31 13:47
 */
@Deprecated
public class LockSheetWriteHandler implements SheetWriteHandler {

    @Override
    public void beforeSheetCreate(WriteWorkbookHolder writeWorkbookHolder, WriteSheetHolder writeSheetHolder) {

    }

    @Override
    public void afterSheetCreate(WriteWorkbookHolder writeWorkbookHolder, WriteSheetHolder writeSheetHolder) {
        // 设置保护密码
        writeSheetHolder.getSheet().protectSheet(UUID.randomUUID().toString());
        // 锁定单元格不可选中(防止别人直接复制内容到其他excel修改)
        ((SXSSFSheet) writeSheetHolder.getSheet()).lockSelectLockedCells(true);
    }

}
