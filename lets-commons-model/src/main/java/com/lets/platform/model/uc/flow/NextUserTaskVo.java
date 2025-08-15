package com.lets.platform.model.uc.flow;

import com.lets.platform.model.uc.entity.SysUser;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: qiao jing @Date: 2020/6/6 9:24
 */
@Data
public class NextUserTaskVo implements Serializable {
  private String nextUserTaskId;
  private String nextUserTaskName;
  private String choiceSelf;
  private List<SysUser> userList;
  private Set<String> userIds;

  public NextUserTaskVo() {
    this.nextUserTaskId = "";
    this.choiceSelf = "N";
    this.userList = new ArrayList<>();
    this.userIds = new HashSet<>();
  }
}
