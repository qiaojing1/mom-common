package com.lets.platform.model.device.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 工厂建模
 *
 * @version 1.0
 * @ClassName DeviceFactoryModeVo
 * @author: Qiao
 * @create: 2021/08/20 22:58
 **/
@Data
public class DeviceFactoryModeVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("生产单元名称")
    private String modeName;
    private String modeId;
    private String allParentName;
    @ApiModelProperty("生产单元编码")
    private String code;
    private String modeCode;
    @ApiModelProperty("生产单元类型")
    private String modeType;
    @ApiModelProperty("生产单元类型名称")
    private String modeTypeName;
    @ApiModelProperty("上级单元")
    private String parentModeCode;
    @ApiModelProperty("上级单元名称")
    private String parentModeName;
    @ApiModelProperty("单元状态")
    private String status;
    @ApiModelProperty("单元状态名称")
    private String statusName;
    @ApiModelProperty("负责人")
    private String managerUser;
    @ApiModelProperty("负责人")
    private String managerUserName;
    @ApiModelProperty("负责人工号")
    private String managerLoginId;
    @ApiModelProperty(hidden = true)
    private String tenancyId;

    private List<DeviceFactoryModeVo> sonModes;
    private List<DeviceSimpleVo> sonDevices;

    /**
     * 主键
     * */
    private String id;

    /**
     * 创建人
     */
    public String createUser;
    public BigDecimal value;

    /**
     * 修改人
     */
    public String updateUser;

    /**
     * 创建时间
     */
    public Long createTime;

    /**
     * 修改时间
     */
    public Long updateTime;

    /**
     * 是否删除
     * */
    public String deleted;

    public Set<String> getAllDictTypes() {
        Set<String> allDictType = new HashSet<>();
        if (StringUtils.isNotBlank(modeType)) {
            allDictType.add(modeType);
        }
        if (StringUtils.isNotBlank(status)) {
            allDictType.add(status);
        }
        return allDictType;
    }
}
