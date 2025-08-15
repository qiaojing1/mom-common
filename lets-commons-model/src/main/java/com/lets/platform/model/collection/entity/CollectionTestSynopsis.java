package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 试验大纲
 * </p>
 *
 * @author csy
 * @since 2024-10-22
 */
@Getter
@Setter
@TableName("collection_test_synopsis")
@ApiModel(value = "CollectionTestSynopsis对象", description = "试验大纲")
public class CollectionTestSynopsis extends BaseEntity {

    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("版本号")
    @TableField("version")
    private String version;

    @TableField("project_code")
    private String projectCode;

    @TableField("type")
    private String type;
    @TableField(exist = false)
    private String typeName;

    @TableField("draw_no")
    private String drawNo;

    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("主题")
    @TableField("subject")
    private String subject;

    @TableField("issue_type")
    private String issueType;

    @ApiModelProperty("大纲内容")
    @TableField("content")
    private String content;

    @ApiModelProperty("状态")
    @TableField("status")
    private String status;
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("文件id")
    @TableField(exist = false)
    private List<String> fileIds;

    @ApiModelProperty("审核员")
    @TableField(value = "audit_user", updateStrategy = FieldStrategy.IGNORED)
    private String auditUser;

    @ApiModelProperty("审核员")
    @TableField(value = "audit_user_name", updateStrategy = FieldStrategy.IGNORED)
    private String auditUserName;

    @ApiModelProperty("审核时间")
    @TableField(value = "audit_time", updateStrategy = FieldStrategy.IGNORED)
    private LocalDateTime auditTime;

    @ApiModelProperty("是否通用YN")
    @TableField("general")
    private String general;

    @TableField("joint_id")
    private String jointId;

    @ApiModelProperty("清单号")
    @TableField(exist = false)
    private List<CollectionTestSynopsisListNo> listNoList;
    @ApiModelProperty("阀门类型")
    @TableField(exist = false)
    private List<CollectionTestSynopsisValveType> valveTypeList;
    @ApiModelProperty("阀门分类")
    @TableField(exist = false)
    private List<CollectionTestSynopsisValveClassify> valveClassifyList;
    @ApiModelProperty("试验类型")
    @TableField(exist = false)
    private List<CollectionTestSynopsisTestType> testTypeList;
    @ApiModelProperty("试验标准")
    @TableField(exist = false)
    private List<CollectionTestSynopsisStandard> standardList;

    @TableField(exist = false)
    private String fileId;
    @TableField(exist = false)
    private String fileName;
    @TableField(exist = false)
    private String url;

    @TableField(exist = false)
    private String listNo;

}
