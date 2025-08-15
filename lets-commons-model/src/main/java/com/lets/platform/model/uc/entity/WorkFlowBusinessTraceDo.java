package com.lets.platform.model.uc.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("work_flow_business_trace")
public class WorkFlowBusinessTraceDo {
    @TableField("id")
    private String id;
    @TableField("tenancy_id")
    private String tenancyId;
    @TableField("business_id")  //业务id
    private String businessId;
    @TableField("menu_code")
    private String menuCode;
    @TableField("business_key")
    private String businessKey;
    @TableField("activity_id")  //节点id
    private String activityId;
    @TableField("execution_id")  //执行实例 ID
    private String executionId;
    @TableField("process_instance_id")
    private String processInstanceId;
    @TableField("status")
    private String status;
    @TableField("reason")
    private String reason;

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
    @TableField(exist = false)
    private String assignee;
}
