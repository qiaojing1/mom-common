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
 * 规格型号解析规则-明细
 * </p>
 *
 * @author qiao jing
 * @since 2024-11-13
 */
@Getter
@Setter
@TableName("psi_specs_analysis_detail")
@ApiModel(value = "PsiSpecsAnalysisDetail对象", description = "规格型号解析规则-明细")
public class PsiSpecsAnalysisDetail extends BaseEntity {

    @ApiModelProperty("主表id")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("分组")
    @TableField("`group`")
    private Long group;

    @ApiModelProperty("最大长度")
    @TableField("max")
    private Long max;

    @ApiModelProperty("最小长度")
    @TableField("min")
    private Long min;

    @ApiModelProperty("字母or数字 1:字母;2:数字;4:混合")
    @TableField("type")
    private String type;

    @ApiModelProperty("用户数据字典中扩展规格属性的分组 FL1-32")
    @TableField("user_dict_type")
    private String userDictType;
    @TableField(exist = false)
    private String userDictTypeName;

    @ApiModelProperty("用户数据字典中扩展规格属性的字典项的字段; 1:代号、2:编码、3:名称")
    @TableField("user_dict_field")
    private String userDictField;
    @ApiModelProperty("不存在是否结束 0:否 1:是")
    @TableField("end")
    private String end;

}
