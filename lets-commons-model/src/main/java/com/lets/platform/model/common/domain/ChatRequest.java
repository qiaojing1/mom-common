package com.lets.platform.model.common.domain;

import lombok.Data;

@Data // Lombok 注解，自动生成 getter/setter
public class ChatRequest {
    /**
     * 用户输入的聊天内容
     * 示例: "Java中如何实现线程安全？"
     */
    private String content;
    
    // 可选扩展字段（根据业务需求添加）
    // private String sessionId;
    // private Long userId;
}