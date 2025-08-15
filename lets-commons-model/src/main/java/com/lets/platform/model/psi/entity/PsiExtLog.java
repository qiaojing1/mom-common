package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 第三方调用日志
 * </p>
 *
 * @author qiao jing
 * @since 2024-07-16
 */
@Getter
@Setter
@TableName("psi_ext_log")
@ApiModel(value = "PsiExtLog对象", description = "第三方调用日志")
public class PsiExtLog extends BaseEntity {

    @ApiModelProperty("第三方名称")
    @TableField("ext_name")
    @ExcelIgnore
    private String extName;

    @ApiModelProperty("请求时间")
    @TableField("request_time")
    @ColumnWidth(50)
    @ExcelProperty("调用时间")
    private LocalDateTime requestTime;

    @ApiModelProperty("接口名称")
    @TableField("interface_name")
    @ColumnWidth(20)
    @ExcelProperty("接口名称")
    private String interfaceName;

    @ApiModelProperty("结果")
    @TableField(exist = false)
    @ColumnWidth(20)
    @ExcelProperty("调用结果")
    private String resultName;
    @ApiModelProperty("备注")
    @TableField("remark")
    @ColumnWidth(30)
    @ExcelProperty("调用结果说明")
    private String remark;

    @ApiModelProperty("接口地址")
    @TableField("interface_url")
    @ColumnWidth(40)
    @ExcelProperty("接口地址")
    private String interfaceUrl;

    @ApiModelProperty("入参")
    @TableField("request")
    @ColumnWidth(100)
    @ExcelProperty("入参json")
    private String request;

    @ApiModelProperty("出参")
    @TableField("response")
    @ColumnWidth(100)
    @ExcelProperty("出参json")
    private String response;

    @ApiModelProperty("结果")
    @TableField("result")
    @ExcelIgnore
    private String result;

    @ApiModelProperty("响应时间")
    @TableField("response_time")
    @ExcelIgnore
    private LocalDateTime responseTime;
    @TableField(exist = false)
    @ExcelIgnore
    private String logDetail;
    @TableField(exist = false)
    @ColumnWidth(100)
    @ExcelProperty("详细信息")
    private String detail;
}
