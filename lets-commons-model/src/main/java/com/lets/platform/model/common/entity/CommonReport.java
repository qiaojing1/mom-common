package com.lets.platform.model.common.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;

/**
 * <p>
 * 报表
 * </p>
 *
 * @author qiao jing
 * @since 2024-03-13
 */
@Getter
@Setter
@TableName("jimu_report")
@ApiModel(value = "CommonReport对象", description = "报表")
public class CommonReport {
    @ApiModelProperty("id")
    @TableField("id")
    private String id;
    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("名称")
    @TableField("name")
    private String name;
    @ApiModelProperty("说明")
    @TableField("note")
    private String note;
    @ApiModelProperty("状态")
    @TableField("status")
    private String status;
    @ApiModelProperty("类型")
    @TableField("type")
    private String type;
    @ApiModelProperty("json字符串")
    @TableField("json_str")
    private String jsonStr;
    @ApiModelProperty("请求地址")
    @TableField("api_url")
    private String apiUrl;
    @ApiModelProperty("缩略图")
    @TableField("thumb")
    private String thumb;


}
