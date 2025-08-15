package com.lets.platform.model.collection.vo;

import com.lets.platform.model.collection.dto.QueryProjectNameDetails;
import lombok.Data;

import java.util.List;

@Data
public class QueryProjectNameVO {
    private Integer number;
    private String materialCode;
    private String testStandardName;
    private List<QueryProjectNameItems> items;
    private List<QueryProjectNameDetails> proDetails;
}
