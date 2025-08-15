package com.lets.platform.model.mes.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.businessEntity.BaseSerialEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 生产工单明细关联序列号
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-08-19
 */
@Getter
@Setter
@TableName("mes_produce_order_detail_serial")
@ApiModel(value = "MesProduceOrderDetailSerial对象", description = "生产工单明细关联序列号")
public class MesProduceOrderDetailSerialExcelVo{

    @ApiModelProperty("物料编码")
    @TableField("material_code")
    @ExcelProperty("物料编码")
    private String materialCode;

    @ApiModelProperty("物料名称")
    @TableField("material_name")
    @ExcelProperty("物料名称")
    private String materialName;

    @ApiModelProperty("完整序列号编码")
    @TableField("total_serial")
    @ExcelProperty("序列号")
    private String totalSerial;
}
