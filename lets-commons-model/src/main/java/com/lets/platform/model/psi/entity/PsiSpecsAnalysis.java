package com.lets.platform.model.psi.entity;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * <p>
 * 规格型号解析规则
 * </p>
 *
 * @author qiao jing
 * @since 2024-11-13
 */
@Getter
@Setter
@TableName("psi_specs_analysis")
@ApiModel(value = "PsiSpecsAnalysis对象", description = "规格型号解析规则")
public class PsiSpecsAnalysis extends BaseEntity {

    @ApiModelProperty("规则编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("规则名称")
    @TableField("name")
    private String name;
    @ApiModelProperty("规格类型 0:用户数据字典; 1:试压")
    @TableField("type")
    private String type;
    @ApiModelProperty("是否预置[YN]")
    @TableField("is_presets")
    private String isPresets;

    @ApiModelProperty("成功数量")
    @TableField("sucess_count")
    private Long sucessCount;

    @ApiModelProperty("失败数量")
    @TableField("fail_count")
    private Long failCount;

    @ApiModelProperty("结果文件")
    @TableField("fail_file")
    private String failFile;
    @ApiModelProperty("结果文件")
    @TableField("sucess_file")
    private String sucessFile;
    @ApiModelProperty("分隔符")
    @TableField("`separator`")
    private String separator;
    @TableField(exist = false)
    private List<CommonFile> sucessFileF;
    @TableField(exist = false)
    private List<CommonFile> failFileF;
    @TableField(exist = false)
    private List<PsiSpecsAnalysisDetail> details;
}
