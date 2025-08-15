package com.lets.platform.common.pojo.base;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * 流程VO
 *
 * @author FZY
 * @since 2023-11-10
 */
@Getter
@Setter
public class Comment {
    /**
     * 任务id
     */
    protected String businessId;
    /**
     * 添加人
     */
    protected String userId;
    /**
     * 用户的名称
     */
    protected String userName;
    /**
     * 用户的头像链接
     */
    protected String userUrl;
    /**
     * 流程实例id
     */
    protected String processInstanceId;
    /**
     * 意见信息
     */
    protected String message;
    /**
     * 时间
     */
    protected LocalDateTime time;
    /**
     * 审批类型
     */
    private String type;
    /**
     * 节点名称
     */
    private String action;
    /**
     * 类型名称
     */
    private String typeName;
    /**
     * 任务名称
     */
    private String taskName;
    /**
     * 评论全信息
     */
    private String fullMsg;

    public Comment() {
    }

    public Comment(String businessId, String userId, String processInstanceId, String type, String action, String message, String fullMsg) {
        this.businessId = businessId;
        this.userId = userId;
        this.processInstanceId = processInstanceId;
        this.message = message;
        this.type = type;
        this.action = action;
        this.fullMsg = fullMsg;
    }
}
