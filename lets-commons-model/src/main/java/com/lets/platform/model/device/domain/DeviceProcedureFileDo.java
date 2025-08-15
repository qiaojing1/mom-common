package com.lets.platform.model.device.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.base.BaseDo;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.common.entity.CommonFile;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

/**
 * 程序档案
 *
 * @version 1.0
 * @ClassName DeviceProcedureFileDo
 * @author: qiao jing
 * @create: 2023/02/17 09:07
 **/
@Data
@TableName("device_procedure_file")
public class DeviceProcedureFileDo extends BaseDo implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableField("parent_id")
    @ApiModelProperty("父级程序id")
    private String parentId;
    @TableField("name")
    @Length(min = 1, max = 30, message = "[程序名称] 长度0~30，输入：中文、字母、数字、符号", groups = {Save.class, Update.class})
    @ApiModelProperty("名称")
    private String name;
    @TableField("version")
    @Length(min = 1, max = 30, message = "[版本] 长度0~30，输入：中文、字母、数字、符号", groups = {Save.class, Update.class})
    @ApiModelProperty("版本")
    private String version;
    @TableField("controller_id")
    @NotBlank(message = "控制器不能为空", groups = {Save.class, Update.class})
    @ApiModelProperty("控制器")
    private String controllerId;
    @TableField("working_origin")
    @Length(max = 200, message = "[工件原点] 长度0~200，输入：中文、字母、数字、符号", groups = {Save.class, Update.class})
    @ApiModelProperty("工件原点")
    private String workingOrigin;
    @TableField("remark")
    @Length(max = 200, message = "[备注] 长度0~200，输入：中文、字母、数字、符号", groups = {Save.class, Update.class})
    @ApiModelProperty("备注")
    private String remark;
    @NotBlank(message = "程序文件不能为空", groups = {Save.class, Update.class})
    @ApiModelProperty("程序文件")
    @TableField("procedure_file")
    private String procedureFile;
    @TableField("drawing_file")
    @ApiModelProperty("图纸")
    private String drawingFile;
    @TableField("status")
    private String status;
    @TableField(exist = false)
    private String statusName;
    @TableField("enable")
    @ApiModelProperty("启用停用状态")
    private String enable;
    @TableField(exist = false)
    private String enableName;
    @TableField("process_instance_id")
    private String processInstanceId;
    @TableField("start_task_time")
    private Long startTaskTime;
    @TableField("tenancy_id")
    private String tenancyId;
    @TableField("create_user_name")
    private String createUserName;
    @TableField("update_user_name")
    private String updateUserName;
    @ApiModelProperty("程序档案关联设备 入参")
    @TableField(exist = false)
    private List<DeviceProcedureFileDeviceDo> devices;
    @ApiModelProperty("程序档案关联模制具 入参")
    @TableField(exist = false)
    private List<DeviceProcedureFileDieFixtureDo> dieFixtures;

    @TableField(exist = false)
    @ApiModelProperty("图纸文件名")
    private String drawingFileName;
    @TableField(exist = false)
    @ApiModelProperty("程序文件名")
    private String procedureFileName;
    @TableField(exist = false)
    @ApiModelProperty("控制器名称")
    private String controllerName;
    @TableField(exist = false)
    private List<String> originalStatusList;
    @TableField(exist = false)
    private CommonFile procedureFileDo;
    @TableField(exist = false)
    private CommonFile drawingFileDo;

}
