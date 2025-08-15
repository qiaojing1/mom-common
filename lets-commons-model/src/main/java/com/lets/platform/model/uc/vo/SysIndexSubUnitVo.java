package com.lets.platform.model.uc.vo;

import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.uc.entity.SysIndexSubUnit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 首页组件
 * @author DING WEI
 * @since 2024-01-04
 */
@Data
@ApiModel(value = "SysIndexSubUnitVo", description = "首页组件展示对象")
public class SysIndexSubUnitVo extends BaseEntity {

    @ApiModelProperty("菜单编码")
    private String menuCode;
    @ApiModelProperty("菜单编码名称")
    private String menuCodeName;

    @ApiModelProperty("组件列表")
    private List<SysIndexSubUnit> unitList;
}
