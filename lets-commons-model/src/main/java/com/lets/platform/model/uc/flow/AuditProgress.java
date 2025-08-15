package com.lets.platform.model.uc.flow;

import com.lets.platform.common.pojo.enums.YesOrNo;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @ClassName AuditProgress
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2024/7/11
 */
@Data
public class AuditProgress {
    @ApiModelProperty("节点状态")
    private Integer status;
    private String statusName;
    @ApiModelProperty("节点id")
    private String activityId;
    private String processInstanceId;
    @ApiModelProperty("意见")
    private String comment;
    @ApiModelProperty("审批人")
    private List<Map<String,Object>> users;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuditProgress that = (AuditProgress) o;
        return Objects.equals(activityId, that.activityId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activityId);
    }
}
