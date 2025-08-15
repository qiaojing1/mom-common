package com.lets.platform.model.common.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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

import javax.validation.constraints.Pattern;

/**
 * <p>
 * 网关管理
 * </p>
 *
 * @author qiaojing
 * @since 2023-10-26
 */
@Getter
@Setter
@TableName("common_gateway")
@ApiModel(value = "CommonGateway对象", description = "网关管理")
public class CommonGateway extends BaseEntity {
    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private Integer index;
    @ApiModelProperty("网关编号")
    @ExcelIgnore
    @TableField("code")
    private String code;

    @ColumnWidth(20)
    @ExcelProperty(value="网关ID",index = 0)
    @ApiModelProperty("网关ID")
    @TableField("gateway_id")
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_20, message = "Gateway.gatewatId", groups = {Save.class, Update.class})
    private String gatewayId;

    @ColumnWidth(20)
    @ExcelProperty(value="网关名称",index = 1)
    @ApiModelProperty("网关名称")
    @TableField("name")
    @Length(min = 1, max = 20, message = "Gateway.name", groups = {Save.class, Update.class})
    private String name;


    @ApiModelProperty("是否启用[0停用1启用]")
    @TableField("enable")
    @ExcelIgnore
    private Integer enable;

    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty("启用状态名称")
    private String enableName;

    @ApiModelProperty("是否删除[N否Y是]")
    @TableField(value = "deleted", fill = FieldFill.INSERT)
    @ExcelIgnore
    private String deleted;

    @ColumnWidth(20)
    @ExcelProperty(value="ip地址",index = 2)
    @ApiModelProperty("ip地址")
    @TableField("ip")
    private String ip;
}
