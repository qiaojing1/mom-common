package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.enums.RouteScopeEnum;
import com.lets.platform.model.common.enums.RouteTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 工艺路线
 * @author DING WEI
 * @since 2023-11-15
 */
@Getter
@Setter
@TableName("common_route")
@ApiModel(value = "CommonRoute对象", description = "工艺路线")
public class CommonRoute extends BaseEntity {

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Integer index;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String sheetName;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Boolean joinOr;

    @ApiModelProperty("编码")
    @TableField("code")
    private String code;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String excelCode;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String orCode;

    @Length(min = 1, max = 60, message = "CommonRoute.name", groups = {Save.class, Update.class})
    @ApiModelProperty("名称")
    @TableField("name")
    private String name;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String orName;

    @ValidatedEnum(enumClass = RouteScopeEnum.class, required = true, message = "CommonRoute.type", groups = {Save.class, Update.class})
    @ApiModelProperty("工艺适用范围[0分组,1物料,2物料分组,3通用]")
    @TableField("type")
    private String type;
    @TableField(exist = false)
    private String typeName;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private List<String> typeList;

    @ValidatedEnum(enumClass = RouteTypeEnum.class, message = "[工艺路线类型]非法，请选择[标准工艺、返工工艺]", groups = {Save.class, Update.class})
    @ApiModelProperty("工艺类型")
    @TableField("route_type")
    private String routeType;
    @TableField(exist = false)
    private String routeTypeName;

    @ApiModelProperty("启用WIP库存[Y/N]")
    @TableField("wip_inventory")
    private String wipInventory;


    @ApiModelProperty("物料主键")
    @TableField("material_id")
    private String materialId;
    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;
    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;
    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;
    @ApiModelProperty("物料生产单位")
    @TableField("produce_unit_id")
    private String produceUnitId;
    @ApiModelProperty("物料生产单位名称")
    @TableField("produce_unit_name")
    private String produceUnitName;
    @ApiModelProperty("物料生产单位精度")
    @TableField("produce_unit_accuracy")
    private Integer produceUnitAccuracy;
    @ApiModelProperty("物料生产单位舍入类型")
    @TableField("produce_unit_round_off_type")
    private Integer produceUnitRoundOffType;

    @ApiModelProperty("物料分组主键")
    @TableField("material_group_id")
    private String materialGroupId;
    @ApiModelProperty("物料分组编码")
    @TableField("material_group_code")
    private String materialGroupCode;
    @ApiModelProperty("物料分组名称")
    @TableField("material_group_name")
    private String materialGroupName;

    @ApiModelProperty("BOM版本主键")
    @TableField("bom_id")
    private String bomId;
    @ApiModelProperty("BOM版本名称")
    @TableField("bom_version")
    private String bomVersion;
    @ApiModelProperty("BOM版本描述")
    @TableField(exist = false)
    private String bomVersionDescribe;
    @TableField(exist = false)
    private String bomCode;

    @NotBlank(message = "CommonRoute.groupId", groups = {Save.class, Update.class})
    @ApiModelProperty("所属分组")
    @TableField("group_id")
    private String groupId;
    @TableField(exist = false)
    private String groupCode;
    @TableField(exist = false)
    private String groupName;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private List<String> groupIds;

    @ApiModelProperty("父级(分组)")
    @TableField("parent_id")
    private String parentId;

    @NotNull(message = "CommonRoute.effectiveTime", groups = {Save.class, Update.class})
    @ApiModelProperty("生效日期")
    @TableField("effective_time")
    private LocalDateTime effectiveTime;

    @NotNull(message = "CommonRoute.expiringTime", groups = {Save.class, Update.class})
    @ApiModelProperty("失效日期")
    @TableField("expiring_time")
    private LocalDateTime expiringTime;

    @Length(max = 200, message = "CommonRoute.remark", groups = {Save.class, Update.class})
    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("状态")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("是否启用[0停用1启用]")
    @TableField("enable")
    private Integer enable;
    @TableField(exist = false)
    private String enableName;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private List<String> enableList;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;
    @TableField(exist = false)
    private String auditTimeFormat;
    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;
    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private List<String> createUserIds;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String createTimeBegin;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String createTimeEnd;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private List<String> updateUserIds;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String updateTimeBegin;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String updateTimeEnd;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private List<String> auditUserIds;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String auditTimeBegin;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String auditTimeEnd;

    @ApiModelProperty(hidden = true)
    @TableField("empty_production_unit")
    private Integer emptyProductionUnit;

    @ApiModelProperty(value = "被复制数据主键", hidden = true)
    @TableField(exist = false)
    private String copyId;

    @ApiModelProperty("子级")
    @TableField(exist = false)
    private List<CommonRoute> children;

    @Valid
    @ApiModelProperty("生产单元")
    @TableField(exist = false)
    private List<CommonRouteProductionUnit> productionUnitList;

    @Valid
    @ApiModelProperty("工序信息")
    @TableField(exist = false)
    private List<CommonRouteProcessDto> processList;

    @Valid
    @ApiModelProperty("工艺文件")
    @TableField(exist = false)
    private List<CommonRouteFile> fileList;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private List<CommonRouteProcess> processDoList;

    public String parentIdNotNull() {
        if (StringUtils.isEmpty(parentId)) {
            return "-1";
        } else {
            return parentId;
        }
    }
}
