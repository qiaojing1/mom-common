package com.lets.platform.common.pojo.iot;

import lombok.Data;

import java.io.Serializable;

/**
 * 查询协议端口可用接口
 * @author: DING WEI
 * @date: 2023/2/23 11:26
 */
@Data
public class IotInterfaceInfo implements Serializable {

    private static final long serialVersionUID = 1L;

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
