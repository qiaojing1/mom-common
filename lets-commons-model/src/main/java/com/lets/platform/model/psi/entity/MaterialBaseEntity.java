package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 物料特征信息
 * </p>
 *
 * @author FZY
 * @since 2023-07-18
 */
@Data
public class MaterialBaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("物料ID")
    @TableId(value = "material_id")
    private String materialId;

}
