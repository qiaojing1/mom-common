package com.lets.platform.model.uc.vo;

import com.lets.platform.model.uc.entity.SysMenuFieldPermission;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 按钮字段权限 VO
 */
@Data
public class FieldTabVO implements Serializable {
    private static final long serialVersionUID = 1L;
    Integer index;
    String name;
    List<SysMenuFieldPermission> fields;
    @ApiModelProperty("类型[0:列表页字段,1:表单字段]")
    private Integer type;
}
