package com.lets.platform.common.pojo.base;

import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.enums.SortByEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 分页查询条件
 * @Author DING WEI
 * @Date 2021/4/27 14:57
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "PageQuery", description = "分页查询信息")
public class PageQuery {

	@ApiModelProperty(value = "页码,默认0")
	private Integer page = GlobalConstant.ZERO;

	@ApiModelProperty(value = "页长,默认10")
	private Integer size = GlobalConstant.TEN;

	@ApiModelProperty(value = "排序字段")
	private String orderBy;

	@ValidatedEnum(enumClass = SortByEnum.class, message = "排序方式[非法][DESC|ASC]")
	@ApiModelProperty(value = "排序方式,[DESC|ASC]")
	private String sort;

}
