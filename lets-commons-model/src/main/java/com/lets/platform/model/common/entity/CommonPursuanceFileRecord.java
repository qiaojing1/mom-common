package com.lets.platform.model.common.entity;

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
 * 物料条码追溯导出文件记录
 * </p>
 *
 * @author qiao jing
 * @since 2025-06-17
 */
@Getter
@Setter
@TableName("common_pursuance_file_record")
@ApiModel(value = "CommonPursuanceFileRecord对象", description = "物料条码追溯导出文件记录")
public class CommonPursuanceFileRecord extends BaseEntity {

    @ApiModelProperty("生产单元")
    @TableField("factory_mode_name")
    private String factoryModeName;

    @ApiModelProperty("文件名")
    @TableField("file_name")
    private String fileName;

    @ApiModelProperty("文件地址")
    @TableField("file_path")
    private String filePath;
    @ApiModelProperty("类型 0:内部;1:非内部")
    @TableField("type")
    private String type;
}
