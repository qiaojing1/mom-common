package com.lets.platform.common.pojo.iot;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * 查询协议端口可用接口
 * @author: DING WEI
 * @date: 2023/2/23 11:26
 */
@Data
public class IotPortInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 端口ID（对应业务层设备编号） */
    private String id;
    /** 端口名称 */
    private String name;
    /** 是否启用，非启用状态下业务层无法使用此端口通道传输NC文件 */
    private Boolean active;
    /** 协议名称 */
    private String protocol;
    /** 其它参数和端口协议相关，不通协议参数不一样，业务应用层不需要关注 */
    private String ftpHost;
    private Integer ftpPort;
    private String ftpUsername;
    private String ftpPassword;
    private String ftpHostCharset;
    /** 是否支持读取NC目录 */
    private Boolean readDirectoryList;
    /** 是否支持下载文件（NC文件传输到业务应用） */
    private Boolean downloadFile;
    /** 是否支持上传文件（业务应用传输到NC目录） */
    private Boolean uploadFile;
    /** 是否支持删除NC文件 */
    private Boolean removeFile;
    /** 是否支持创建NC目录 */
    private Boolean createDirectory;
    /** 是否支持删除NC目录 */
    private Boolean removeDirectory;
    /** 是否支持NC目录重命名 */
    private Boolean renameDirectory;
    /** 是否支持NC文件重命名 */
    private Boolean renameFile;
}
