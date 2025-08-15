package com.lets.platform.model.uc.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("work_flow_business_assignee")
public class WorkFlowBusinessAssigneeDo {
    @TableField("id")
    private String id;
    @TableField("tenancy_id")
    private String tenancyId;
    @TableField("trace_id")  //业务id
    private String traceId;
    @TableField("assignee")
    private String assignee;
    @TableField("status")
    private String status;
    @TableField(exist = false)
    private String flowName;

    @TableField("create_time")
    private LocalDateTime createTime;
    @TableField("update_time")
    private LocalDateTime updateTime;
    @TableField("create_user")
    private String createUser;
    @TableField("create_user_name")
    private String createUserName;
    @TableField("update_user")
    private String updateUser;
    @TableField("update_user_name")
    private String updateUserName;
}
