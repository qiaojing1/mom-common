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
import java.util.List;

/**
 * @ClassName DeviceProcedureFileChangeDo
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2023/2/20
 */
@Data
@TableName("device_procedure_file_change")
public class DeviceProcedureFileChangeDo extends BaseDo {

    @TableField("name")
    @ApiModelProperty("程序名称")
    @Length(min = 1, max = 30, message = "[程序名称] 长度0~30，输入：中文、字母、数字、符号", groups = {Save.class, Update.class})
    private String name;
    @TableField("version")
    @ApiModelProperty("版本")
    @Length(min = 1, max = 30, message = "[版本] 长度0~30，输入：中文、字母、数字、符号", groups = {Save.class, Update.class})
    private String version;
    @TableField("controller_id")
    @ApiModelProperty("控制器id")
    @NotBlank(message = "控制器不能为空", groups = {Save.class, Update.class})
    private String controllerId;
    @TableField("working_origin")
    @ApiModelProperty("工作原点")
    @Length(max = 200, message = "[工件原点] 长度0~200，输入：中文、字母、数字、符号", groups = {Save.class, Update.class})
    private String workingOrigin;
    @TableField("remark")
    @Length(max = 200, message = "[备注] 长度0~200，输入：中文、字母、数字、符号", groups = {Save.class, Update.class})
    private String remark;
    @TableField("procedure_file")
    @ApiModelProperty("程序文件id")
    @NotBlank(message = "程序文件不能为空", groups = {Save.class, Update.class})
    private String procedureFile;
    @TableField("drawing_file")
    @ApiModelProperty("图纸文件id")
    private String drawingFile;
    @TableField("status")
    @ApiModelProperty("审核状态")
    private String status;
    @TableField(exist = false)
    private String statusName;
    @TableField("procedure_code")
    @ApiModelProperty("产品编码")
    private String procedureCode;
    @TableField("process_instance_id")
    private String processInstanceId;
    @TableField("start_task_time")
    private Long startTaskTime;
    @TableField("tenancy_id")
    private String tenancyId;

    @TableField(exist = false)
    private List<String> originalStatusList;
    @ApiModelProperty("程序档案关联设备 入参")
    @TableField(exist = false)
    private List<DeviceProcedureFileChangeDeviceDo> devices;
    @ApiModelProperty("程序档案关联模制具 入参")
    @TableField(exist = false)
    private List<DeviceProcedureFileChangeDieFixtureDo> dieFixtures;

    @TableField("procedure_id")
    @ApiModelProperty("程序id")
    private String procedureId;

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
    @ApiModelProperty("单据日期")
    private String date;

    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private CommonFile procedureFileDo;
    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private CommonFile drawingFileDo;
}
