package com.lets.platform.model.common.domain;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.util.List;

@Data
public class DeepSeekResponse {
    private String id;
    private Integer code;
    private String message;
    private JSONObject data;
    private List<Choice> choices;

}