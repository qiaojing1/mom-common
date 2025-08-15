package com.lets.platform.model.device.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.base.BaseDo;
import lombok.Data;

import java.io.Serializable;

/**
 * 程序档案关联模制具
 *
 * @version 1.0
 * @ClassName DeviceProcedureFileDieFixtureDo
 * @author: qiao jing
 * @create: 2023/02/17 09:07
 **/
@Data
@TableName("device_procedure_file_change_die_fixture")
public class DeviceProcedureFileChangeDieFixtureDo extends BaseDo implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableField("die_fixture_id")
    private String dieFixtureId;
    @TableField("tenancy_id")
    private String tenancyId;
    @TableField("create_user_name")
    private String createUserName;
    @TableField("update_user_name")
    private String updateUserName;

    @TableField("procedure_id")
    private String procedureId;

    @TableField("change_id")
    private String changeId;

    @TableField(exist = false)
    private String name;
    @TableField(exist = false)
    private String categoryName;
}
