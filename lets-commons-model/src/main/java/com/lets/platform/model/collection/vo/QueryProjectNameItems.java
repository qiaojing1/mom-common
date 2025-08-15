package com.lets.platform.model.collection.vo;

import com.lets.platform.model.collection.dto.QueryProjectNameDetails;
import lombok.Data;

import java.util.List;

@Data
public class QueryProjectNameItems {

    private String leakageRate;
    private String holdTime;
    private String mediaName;
    private String projectName;
    private String testPressure;

}
