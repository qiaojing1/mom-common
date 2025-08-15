package com.lets.platform.model.device.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.List;
import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * 工厂建模
 *
 * @author FZY
 * @since 2023-03-14
 */
@Data
@TableName("lets_device_factory_mode")
@Alias("device_lets_device_factory_mode")
public class LetsDeviceFactoryMode {

  private static final long serialVersionUID = 1L;

  @TableField(exist = false)
  List<LetsDevice> deviceList;
  /** 工厂建模id */
  @TableId(value = "mode_id", type = IdType.INPUT)
  private String modeId;
  /** 生产单元名称 */
  private String modeName;
  /** 生产单元编号 */
  private String modeCode;
  /** 生产单元类型 */
  private String modeType;
  /** 上级单元 */
  private String parentModeCode;
  /** 状态 0:停用 1:启用 */
  private String status;
  /** 负责人 */
  private String managerUser;
  /** 租户主键 */
  private String tenancyId;
  /** 是否删除[N否Y是] */
  private String deleted;
  /** 创建时间 */
  private Long createTime;
  /** 创建者 */
  private String createUser;
  /** 更新时间 */
  private Long updateTime;
  /** 更新者 */
  private String updateUser;
}
