package com.lets.platform.model.device.domain;

import com.alibaba.excel.EasyExcel;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.base.BaseDo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @ClassName DeviceProcedureBindProcessDo
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2023/2/22
 */
@Data
@ApiModel("程序绑定")
@TableName("device_procedure_bind_process_route")
public class DeviceProcedureBindProcessRouteDo {

    /**
     * 主键
     * */
    @TableField("id")
    private String id;
    /**
     * 创建人
     */
    @TableField("create_user")
    public String createUser;
    @TableField("create_user_name")
    public String createUserName;

    /**
     * 修改人
     */
    @TableField("update_user")
    public String updateUser;
    @TableField("update_user_name")
    public String updateUserName;

    /**
     * 创建时间
     */
    @TableField("create_time")
    public Long createTime;

    /**
     * 修改时间
     */
    @TableField("update_time")
    public Long updateTime;

    /**
     * 是否删除
     * */
    @TableField("deleted")
    public String deleted;

    @TableField("material_code")
    @ApiModelProperty("物料编码")
    private String materialCode;
    @TableField("material_id")
    @ApiModelProperty("物料编码")
    private String materialId;
    @TableField("process_route_code")
    @ApiModelProperty("工艺路线编码")
    private String processRouteCode;
    @TableField("route_id")
    @ApiModelProperty("工艺路线编码")
    private String routeId;
    @TableField("is_complete")
    @ApiModelProperty("是否完整")
    private String isComplete;
    @ApiModelProperty("是否完整")
    @TableField(exist = false)
    private String isCompleteName;

    @TableField("material_desc")
    @ApiModelProperty("物料描述")
    private String materialDesc;
    @TableField("process_route_category")
    @ApiModelProperty("工艺路线分类")
    private String processRouteCategory;
    @TableField(exist = false)
    private String processRouteCategoryName;

    @TableField("tenancy_id")
    private String tenancyId;

    @TableField(exist = false)
    List<DeviceProcedureBindProcessDo> processes;
}
