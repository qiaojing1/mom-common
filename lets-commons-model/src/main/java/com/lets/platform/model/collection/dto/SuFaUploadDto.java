package com.lets.platform.model.collection.dto;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @ClassName SufaUploadDto
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2024/2/22
 */
@Data
public class SuFaUploadDto {
    private Map<String,String> context;
    private String args;
    private String action;

}
