package com.lets.platform.model.common.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 计量仪器
 * </p>
 *
 * @author csy
 * @since 2024-03-01
 */
@Getter
@Setter
@TableName("common_meter")
@ApiModel(value = "CommonMeter对象", description = "计量仪器")
public class CommonMeter extends BaseEntity {

    @TableField(exist = false)
    @ExcelIgnore
    private Integer rowIndex;

    @ApiModelProperty("编码")
    @ExcelProperty("计量编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("仪器名称")
    @ExcelProperty("仪器名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("资产编码")
    @ExcelProperty("资产编码")
    @TableField("asset_code")
    private String assetCode;

    @ApiModelProperty("仪器分组")
    @ExcelIgnore
    @TableField("group_id")
    private String groupId;
    @ExcelProperty("仪器分组")
    @TableField(exist = false)
    private String groupName;

    @ApiModelProperty("仪器类型")
    @ExcelIgnore
    @TableField("type")
    private String type;
    @ExcelProperty("仪器类型")
    private String typeName;


    @ApiModelProperty("仪器型号")
    @ExcelIgnore
    @TableField("model")
    private String model;
    @ExcelProperty("仪器型号")
    private String modelName;

    @ApiModelProperty("使用组织")
    @ExcelIgnore
    @TableField("use_org_id")
    private String useOrgId;

    @ApiModelProperty("使用组织")
    @ExcelProperty("使用部门")
    @TableField("use_org_name")
    private String useOrgName;

    @ApiModelProperty("使用人")
    @ExcelIgnore
    @TableField("user_id")
    private String userId;

    @ApiModelProperty("使用人")
    @ExcelProperty("使用人")
    @TableField("user_name")
    private String userName;

    @ApiModelProperty("维保组织")
    @ExcelIgnore
    @TableField("maintain_org_id")
    private String maintainOrgId;

    @ApiModelProperty("维保组织")
    @ExcelProperty("维保部门")
    @TableField("maintain_org_name")
    private String maintainOrgName;

    @ApiModelProperty("仪器等级")
    @ExcelProperty("仪器等级")
    private String level;

    @ApiModelProperty("物联状态")
    @ExcelIgnore
    private String internetStatus;
    @ExcelProperty("物联状态")
    @TableField(exist = false)
    private String internetStatusName;

    @ApiModelProperty("资产状态")
    @ExcelIgnore
    private String assetStatus;
    @ExcelIgnore
    @TableField(exist = false)
    private String assetStatusName;

    @ApiModelProperty("测量范围")
    @ExcelProperty("测量范围")
    private String measurementScale;

    @ApiModelProperty("测量精度")
    @ExcelProperty("测量精度")
    private String measurementAccuracy;

    @ApiModelProperty("生产商")
    @ExcelIgnore
    private String manufacturerId;
    @ExcelProperty("仪器生产商")
    private String manufacturerName;

    @ApiModelProperty("供应商")
    @ExcelIgnore
    private String supplierId;
    @ExcelProperty("仪器供应商")
    private String supplierName;

    @ApiModelProperty("购置日期")
    @ExcelIgnore
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime purchaseTime;
    @ExcelProperty("购置日期")
    @TableField(exist = false)
    private String purchaseTimeStr;

    @ApiModelProperty("入场日期")
    @ExcelIgnore
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime admissionTime;
    @ExcelProperty("入场日期")
    @TableField(exist = false)
    private String admissionTimeStr;

    @ApiModelProperty("出场编号")
    @ExcelProperty("出场编号")
    private String serialNumber;

    @ApiModelProperty("质保日期")
    @ExcelIgnore
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime warrantyTime;
    @ExcelProperty("质保日期")
    @TableField(exist = false)
    private String warrantyTimeStr;


    @ApiModelProperty("图片id")
    @ExcelIgnore
    private String picId;

    @TableField(exist = false)
    @ExcelIgnore
    private CommonFile imageFile;

    @ExcelIgnore
    private Integer enable;
    @ExcelIgnore
    @TableField(exist = false)
    private String enableName;
    @ExcelIgnore
    private Integer status;
    @ExcelIgnore
    @TableField(exist = false)
    private String statusName;

    @ExcelIgnore
    @ApiModelProperty("借用状态")
    private String borrowStatus;
    @TableField(exist = false)
    @ExcelIgnore
    private String borrowStatusName;

    @ExcelIgnore
    @ApiModelProperty("校准状态")
    private String checkStatus;
    @TableField(exist = false)
    @ExcelIgnore
    private String checkStatusName;

    @ExcelIgnore
    @ApiModelProperty("借用人")
    private String borrowUserId;
    @ExcelIgnore
    private String borrowUserName;

    @ExcelIgnore
    @ApiModelProperty("借用组织")
    private String borrowOrgId;
    @ExcelIgnore
    private String borrowOrgName;

    @ExcelIgnore
    @ApiModelProperty("校准有效期")
    private Integer checkPeriod;
    @ExcelIgnore
    @ApiModelProperty("校准日期")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime checkDate;
    @ExcelIgnore
    @ApiModelProperty("证书有效期")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime certExpiration;
    @ExcelIgnore
    @ApiModelProperty("证书编号")
    private String certCode;
    @ExcelIgnore
    @ApiModelProperty("上次更新的校准单创建日期")
    private LocalDateTime checkCreateTime;

    @ExcelIgnore
    private String auditUser;
    @ExcelIgnore
    private String auditUserName;
    @ExcelIgnore
    private LocalDateTime auditTime;

    @TableField(exist = false)
    @ExcelIgnore
    private List<CommonFile> enclosureFileList;

    @ExcelIgnore
    private String enclosureIds;

    @ApiModelProperty("备注")
    @ExcelProperty("备注")
    @TableField("remark")
    private String remark;
}
