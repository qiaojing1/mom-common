package com.lets.platform.model.mes.vo;

import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

/**
 * <p>
 * 项目进度报表
 * </p>
 *
 * @author zwy
 * @since 2024-07-29
 */
@Getter
@Setter
@ApiModel(value = "项目进度报表", description = "项目进度报表")
public class MesProjectOrderProcessVo extends BaseEntity {

    private Map<String, Object> flight;

    private Map<String, Object> parkingApron;
}
