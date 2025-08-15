package com.lets.commons.easyexcel.merge;

import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.write.handler.context.CellWriteHandlerContext;
import com.alibaba.excel.write.merge.AbstractMergeStrategy;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;

import java.util.*;

/**
 * 合并单元格
 * int[] mergeColumnIndex = {0, 1, 2, 3};
 * registerWriteHandler(new MergeStrategyNew(2, mergeColumnIndex, 0))
 *
 * @version 1.0
 * @ClassName MergeStrategy
 * @author: DING WEI
 * @create: 2021/06/01 11:06
 **/
public class MergeStrategyNew extends AbstractMergeStrategy {

    /**
     * 合并的列编码，从0开始，指定的index或自己按字段顺序数
     **/
    private Set<Integer> mergeCellIndex = new HashSet<>();

    /**
     * 数据集大小，用于区别结束行位置
     **/
    private Integer maxRow = 0;

    private int[] mergeColumnIndex;
    private int mergeRowIndex;
    private int standardColumnIndex;

    public MergeStrategyNew(int mergeRowIndex, int[] mergeColumnIndex, int standardColumnIndex) {
        this.mergeRowIndex = mergeRowIndex;
        this.mergeColumnIndex = mergeColumnIndex;
        this.standardColumnIndex = standardColumnIndex;
    }

    /**
     * 禁止无参声明
     **/
    private MergeStrategyNew() {
    }

    public MergeStrategyNew(Integer maxRow, int... mergeCellIndex) {
        Arrays.stream(mergeCellIndex).forEach(item -> {
            this.mergeCellIndex.add(item);
        });
        this.maxRow = maxRow;
    }

    /**
     * 记录上一次合并的信息
     **/
    private Map<Integer, MergeRange> lastRow = new HashedMap();

    @Override
    protected void merge(Sheet sheet, Cell cell, Head head, Integer integer) {

    }

    @Override
    public void afterCellDispose(CellWriteHandlerContext context) {
        WriteSheetHolder writeSheetHolder = context.getWriteSheetHolder();
        Cell cell = context.getCell();
        // 当前行
        int curRowIndex = cell.getRowIndex();
        // 当前列
        int curColIndex = cell.getColumnIndex();
        if (curRowIndex > mergeRowIndex) {
            for (int i = 0; i < mergeColumnIndex.length; i++) {
                if (curColIndex == mergeColumnIndex[i]) {
                    mergeWithPrevRow(writeSheetHolder, cell, curRowIndex, curColIndex);
                    break;
                }
            }
        }
    }

    private void mergeWithPrevRow(WriteSheetHolder writeSheetHolder, Cell cell, int curRowIndex, int curColIndex) {
        Object curData = cell.getCellType() == CellType.STRING ? cell.getStringCellValue() : cell.getNumericCellValue();
        Cell preCell = cell.getSheet().getRow(curRowIndex - 1).getCell(curColIndex);
        Object preData = preCell.getCellType() == CellType.STRING ? preCell.getStringCellValue() : preCell.getNumericCellValue();
        // 获取上一行第0列单元格和本行第0列单元格
        Cell preRowFirstCell = cell.getSheet().getRow(curRowIndex - 1).getCell(standardColumnIndex);
        Object preRowFirstData = preRowFirstCell.getCellType() == CellType.STRING ? preRowFirstCell.getStringCellValue() : preRowFirstCell.getNumericCellValue();
        Cell curRowFirstCell = cell.getSheet().getRow(curRowIndex).getCell(standardColumnIndex);
        if (Objects.nonNull(curRowFirstCell)) {
            Object curRowFirstData = curRowFirstCell.getCellType() == CellType.STRING ? curRowFirstCell.getStringCellValue() : curRowFirstCell.getNumericCellValue();
            // 当前列不为标杆列，根据标杆列上下两个单元格值是否一致来合并
            // 当前列为标杆列并且上下两个单元格一致则合并
            if ((curColIndex == standardColumnIndex && preData.equals(curData)) || (curColIndex != standardColumnIndex && preRowFirstData.equals(curRowFirstData) && preData.equals(curData))) {
                Sheet sheet = writeSheetHolder.getSheet();
                List mergeRegions = sheet.getMergedRegions();
                boolean isMerged = false;
                for (int i = 0; i < mergeRegions.size() && !isMerged; i++) {
                    CellRangeAddress cellRangeAddr = (CellRangeAddress) mergeRegions.get(i);
                    // 若上一个单元格已经被合并，则先移出原有的合并单元，再重新添加合并单元
                    if (cellRangeAddr.isInRange(curRowIndex - 1, curColIndex)) {
                        sheet.removeMergedRegion(i);
                        cellRangeAddr.setLastRow(curRowIndex);
                        sheet.addMergedRegion(cellRangeAddr);
                        isMerged = true;
                    }
                }
                // 若上一个单元格未被合并，则新增合并单元
                if (!isMerged) {
                    CellRangeAddress cellRangeAddress = new CellRangeAddress(curRowIndex - 1, curRowIndex, curColIndex, curColIndex);
                    sheet.addMergedRegion(cellRangeAddress);
                }
            }
        }
    }
}
