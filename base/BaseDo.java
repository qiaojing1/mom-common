package com.lets.platform.common.pojo.base;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;

/**
 * 实体对象通用基类
 * @Author DING WEI
 * @Date 2021/04/23 13:50
 * @Version 1.0
 **/
@Data
public class BaseDo implements Serializable {

    private static final long serialVersionUID = 1994713910863964594L;

    /**
     * 主键
     * */
    @TableField("id")
    private String id;

    /**
     * 唯一编码
     * */
    @TableField("code")
    private String code;

    /**
     * 创建人
     */
    @TableField("create_user")
    public String createUser;
    public String createUserName;

    /**
     * 修改人
     */
    @TableField("update_user")
    public String updateUser;
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

    public BaseDo() {
    }

    public BaseDo(String createUser, String updateUser, Long createTime, Long updateTime, String deleted) {
        this.createUser = createUser;
        this.updateUser = updateUser;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.deleted = deleted;
    }

}