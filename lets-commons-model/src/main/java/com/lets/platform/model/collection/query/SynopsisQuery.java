/*
 * csy
 */

package com.lets.platform.model.collection.query;

import lombok.Data;

import java.util.List;
import java.util.Set;

/**
 * @ClassName SynopsisQuery
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2024/10/22
 */
@Data
public class SynopsisQuery {

    private String listNo;
    private String valveType;
    private Set<String> valveClassify;
    private String testType;
    private String valveTypeId;
    private String standard;
    private String status;
    private String tenancyId;
    private boolean onlyFiles;
}
