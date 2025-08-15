package com.lets.platform.model.common.domain;

import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Data;

import java.util.List;

@Data
public class DeepSeekRequest {
    private String model;
    private String question;
    private Boolean stream;
    private String session_id;
    private String user_id;
    private String name;

    public DeepSeekRequest(String model) {
        this.model = model;
    }
    public DeepSeekRequest(String question,Boolean stream,String session_id,String user_id) {
        this.question = question;
        this.stream = stream;
        this.session_id = session_id;
        this.user_id = user_id;
    }

    public DeepSeekRequest() {
    }
}

