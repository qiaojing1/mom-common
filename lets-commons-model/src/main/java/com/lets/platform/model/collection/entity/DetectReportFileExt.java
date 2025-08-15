package com.lets.platform.model.collection.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 第三方系统获取试压报告文件实体
 * </p>
 *
 * @author csy
 * @since 2024-01-27
 */
@Getter
@Setter
public class DetectReportFileExt extends BaseEntity {
    private String fileStream;
    private List<DetectReportFileExtDetail> info;
    private String result;
}
