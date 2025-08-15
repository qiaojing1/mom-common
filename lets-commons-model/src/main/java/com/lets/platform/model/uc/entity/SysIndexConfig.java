package com.lets.platform.model.uc.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.uc.enums.IndexSourceEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Pattern;
import java.util.List;

/**
 * 首页配置
 * @author DING WEI
 * @since 2024-01-04
 */
@Getter
@Setter
@TableName("sys_index_config")
@ApiModel(value = "SysIndexConfig对象", description = "首页配置")
public class SysIndexConfig extends BaseEntity {

    @ApiModelProperty("角色主键")
    @TableField("role_id")
    private String roleId;
    @TableField(exist = false)
    private String roleName;

    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_20, message = "SysIndexConfig.code", groups = {Save.class, Update.class})
    @ApiModelProperty("方案编号")
    @TableField("code")
    private String code;
    @Length(max = 20, message = "SysIndexConfig.name", groups = {Save.class, Update.class})
    @ApiModelProperty("方案名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("组件主键集合")
    @TableField("sub_unit_ids")
    private String subUnitIds;
    @ApiModelProperty("组件个数")
    @TableField("sub_unit_number")
    private Integer subUnitNumber;

    /**
     * @see com.lets.platform.model.common.enums.DeployStatusEnum
     */
    @ApiModelProperty("[0:未发布;1:已发布]")
    @TableField("deploy_status")
    private Integer deployStatus;
    @TableField(exist = false)
    private String deployStatusName;

    /**
     * @see com.lets.platform.model.uc.enums.IndexSourceEnum
     */
    @ValidatedEnum(enumClass = IndexSourceEnum.class, required = true, message = "SysIndexConfig.indexSource", groups = {Save.class, Update.class})
    @ApiModelProperty("首页来源[1:方案设计,2:工具配置]")
    @TableField("index_source")
    private String indexSource;
    @TableField(exist = false)
    private String indexSourceName;

    @ApiModelProperty("菜单编码")
    @TableField("menu_code")
    private String menuCode;
    @TableField(exist = false)
    private String menuName;

    @ApiModelProperty("大屏工具的URL")
    @TableField("url")
    private String url;

    @ApiModelProperty("组件")
    @TableField(exist = false)
    private List<SysIndexConfigUnit> subUnitList;
}
