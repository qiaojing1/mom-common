package com.lets.platform.model.device.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.base.BaseDo;
import lombok.Data;

import java.io.Serializable;

/**
 * 程序档案关联设备
 *
 * @version 1.0
 * @ClassName DeviceProcedureFileDeviceDo
 * @author: qiao jing
 * @create: 2023/02/17 09:07
 **/
@Data
@TableName("device_procedure_file_device")
public class DeviceProcedureFileDeviceDo extends BaseDo implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableField("device_id")
    private String deviceId;
    @TableField("tenancy_id")
    private String tenancyId;
    @TableField("create_user_name")
    private String createUserName;
    @TableField("update_user_name")
    private String updateUserName;
    @TableField("procedure_id")
    private String procedureId;
    @TableField(exist = false)
    private String deviceName;
    @TableField(exist = false)
    private String typeName;
    @TableField(exist = false)
    private String modelName;
    @TableField(exist = false)
    private String deviceCode;

}
