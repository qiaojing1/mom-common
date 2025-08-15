package com.lets.platform.model.uc.dto;

import com.lets.platform.model.uc.entity.SysMenuFieldPermission;
import lombok.Data;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.List;

@Data
public class UserMenuFieldDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String menuCode;
    private Integer tableIndex;
    @Valid
    private List<SysMenuFieldPermission> fields;

    private String sourceFieldKey;
    private String targetFieldKey;
    private Integer offsetIndex;
}
