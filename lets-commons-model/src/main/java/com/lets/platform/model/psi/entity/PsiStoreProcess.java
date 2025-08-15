package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 线边库-工序
 * </p>
 *
 * @author csy
 * @since 2025-03-31
 */
@Getter
@Setter
@TableName("psi_store_process")
@ApiModel(value = "PsiStoreProcess对象", description = "线边库-工序")
public class PsiStoreProcess extends BaseEntity {

    @ApiModelProperty("仓库id")
    @TableField("store_id")
    private String storeId;

    @ApiModelProperty("工序id")
    @TableField("process_id")
    private String processId;

    @ApiModelProperty("工序名称")
    @TableField("process_name")
    private String processName;
}
