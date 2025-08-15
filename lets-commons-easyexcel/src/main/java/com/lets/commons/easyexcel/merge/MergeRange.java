package com.lets.commons.easyexcel.merge;

import lombok.Data;

/**
 * 合并
 *
 * @version 1.0
 * @ClassName MergeRange
 * @author: DING WEI
 * @create: 2021/06/01 11:08
 **/
@Data
public class MergeRange {

    public int startRow;
    public int endRow;
    public int startCell;
    public int endCell;
    public String lastValue;

    public MergeRange() {
    }

    public MergeRange(String lastValue, int startRow, int endRow, int startCell, int endCell) {
        this.startRow = startRow;
        this.endRow = endRow;
        this.startCell = startCell;
        this.endCell = endCell;
        this.lastValue = lastValue;
    }

}
