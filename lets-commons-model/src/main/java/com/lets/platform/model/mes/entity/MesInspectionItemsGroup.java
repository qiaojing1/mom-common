package com.lets.platform.model.mes.entity;

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
import java.util.List;

/**
 * <p>
 * 检验项目
 * </p>
 *
 * @author csy
 * @since 2023-12-18
 */
@Getter
@Setter
@TableName("mes_inspection_items_group")
@ApiModel(value = "MesInspectionItemsGroup对象", description = "检验项目")
public class MesInspectionItemsGroup extends BaseEntity {

    @ApiModelProperty("分组编码")
    @TableField("code")
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_40, message = "[检验项目分组编码] 长度1~40，支持字母、数字和常用符号", groups = {Save.class, Update.class})
    private String code;

    @ApiModelProperty("分组名称")
    @TableField("name")
    @Length(max = 40, min = 1, message = "[检验项目分组名称] 长度1~40，输入：中文、字母、数字、符号", groups = {Save.class, Update.class})
    private String name;


    @TableField(exist = false)
    private List<MesInspectionItemsGroup> children;
}
