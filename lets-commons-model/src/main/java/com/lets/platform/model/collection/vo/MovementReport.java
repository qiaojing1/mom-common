/*
 * csy
 */

package com.lets.platform.model.collection.vo;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName MovementReport
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2024/8/16
 */
@Data
public class MovementReport {

    private List<Map<String, Object>> movementHeader;
    private List<Map<String, Object>> movementData;
    private List<Map<String, Object>> chartMap;
    private List<String> xAxis;

    public MovementReport() {
        movementHeader=new ArrayList<>();
        movementData=new ArrayList<>();
        Map<String, Object> first = new HashMap<>();
        first.put("id", 1);
        first.put("label", "project");
        first.put("needMerge", true);
        movementHeader.add(first);

        Map<String, Object> movementData1 = new HashMap<>();
        movementData1.put("project", "项目");
        Map<String, Object> movementData2 = new HashMap<>();
        movementData2.put("project", "");
        Map<String, Object> movementData3 = new HashMap<>();
        movementData3.put("project", "标准值");
        Map<String, Object> movementData4 = new HashMap<>();
        movementData4.put("project", "实际值");
        movementData.add(movementData1);
        movementData.add(movementData2);
        movementData.add(movementData3);
        movementData.add(movementData4);
    }
}
