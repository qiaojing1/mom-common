package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpEntity;

import java.io.InputStream;

/**
 * <p>
 * 文件表
 * </p>
 *
 * @author FZY
 * @since 2023-06-08
 */
@Getter
@Setter
@TableName("common_file")
@ApiModel(value = "CommonFile对象", description = "文件表")
public class CommonFile extends BaseEntity {

    @ApiModelProperty("唯一编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("文件上传时的名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("业务类型")
    @TableField("buss_type")
    private String bussType;

    @ApiModelProperty("业务ID")
    @TableField("buss_id")
    private String bussId;

    @ApiModelProperty("文件mime类型")
    @TableField("content_type")
    private String contentType;

    @ApiModelProperty("图片宽度")
    @TableField("image_width")
    private Integer imageWidth;

    @ApiModelProperty("图片高度")
    @TableField("image_height")
    private Integer imageHeight;

    @ApiModelProperty("文件大小,单位字节")
    @TableField("size")
    private Long size;

    @ApiModelProperty("文件地址")
    @TableField("url")
    private String url;

    @ApiModelProperty("缩略图地址")
    @TableField("thumb_url")
    private String thumbUrl;

    @ApiModelProperty("本地地址")
    @TableField("local_path")
    private String localPath;

    @ApiModelProperty("文件时长")
    @TableField("play_time")
    private Long playTime;

    @ApiModelProperty("是否启用[0:禁用;1:启用]")
    @TableField(exist = false)
    private Integer enable;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;
    @TableField(exist = false)
    private byte[] input;
}
