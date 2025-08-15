package com.lets.platform.common.pojo.enums;

import org.springframework.util.StringUtils;

/**
 * 扩展名 枚举
 *
 * @ClassName FileExtensionEnum
 * @author: DING WEI
 * @create: 2021/04/29 09:38
 * @Version 1.0
 **/
public enum FileExtensionEnum {

    // 文档
    PDF(".pdf", "adobe电子阅读文档"),
    XLS(".xls", "97—03的excel工作表"),
    XLSX(".xlsx", "Microsoft Office2007之后版本使excel工作表"),
    DOC(".doc", "97—03的word文档"),
    DOCX(".docx", "Microsoft Office2007之后版本使用word文档"),
    PPT(".ppt", "演示文稿"),
    PPTX(".pptx", "Microsoft Office2007之后版本使用演示文稿"),
    JSON(".json", "json文件"),

    // 图片
    BMP(".bmp", "Windows的标准图像文件格式，优点（无损压缩，图质最好），缺点（文件太大，不利于网络传输）"),
    GIF(".gif", "基于LZW算法的连续色调的无损压缩格式，优点（动画存储格式），缺点（最多256色，画质差）"),
    JPG(".jpg", "全名JPEG，以24 位颜色存储单个位图，优点（文件小，色彩比较丰富利于网络传输），缺点（不支持透明背景，不支持动态图片）"),
    JPEG(".jpeg", "JPG的全程，以24 位颜色存储单个位图，优点（文件小，色彩比较丰富利于网络传输），缺点（不支持透明背景，不支持动态图片）"),
    PNG(".png", "试图替代GIF和TIFF文件格式，优点（可保存透明背景的图片），缺点（画质中等）"),
    TIF(".tif", "印刷行业中受到支持最广的图形文件格式"),
    SWF(".swf", "Flash Player动画"),

    // 音频
    MP3(".mp3", "利用 MPEG Audio Layer 3 的技术，将音乐以1:10 甚至 1:12 的压缩率，压缩成容量较小的文件"),
    MID(".mid", "声卡声乐文件"),
    WAV(".wav", "微软公司开发的一种声音文件格式，符合RIFF(Resource Interchange File Format)文件规范"),
    WMA(".wma", "微软公司推出的一种新的音频格式的文件"),

    // 视频
    MP4(".mp4", "用于音频、视频信息的压缩编码标准"),
    RM(".rm", "RealNetworks公司开发的一种流媒体视频文件格式"),
    RMVB(".rmvb", "RealMedia多媒体数字容器格式的可变比特率（VBR）扩展版本，较上一代RM格式画面要清晰很多，降低了静态画面下的比特率"),
    MPG(".mpg", "运动图像压缩算法的视频格式"),
    MPEG(".mpeg", "mpg全称，（Moving Pictures Experts Group）即动态图像专家组"),
    AVI(".avi", "音频视频交错格式"),
    MOV(".mov", "Apple公司开发的一种音频、视频文件格式"),
    WMV(".wmv", "微软开发的一系列视频编解码和其相关的视频编码格式的统称"),

    // 压缩包
    RAR(".rar", "利文件格式，用于数据压缩与归档打包"),
    ZIP(".zip", "经过压缩的文件"),
    ARJ(".arj", "早期DOS操作系统下比较常用的压缩文件格式"),
    GZ(".gz", "Linux和OSX都可以直接解压使用的一种压缩文件"),
    TAR(".tar", "把多个文件或文件夹打包合成一个文件,本身并没有进行压缩"),
    TAR_GZ(".tar.gz", "tar打包，gzip压缩的一种压缩文件，linux和mocOS下常见"),
    SEVEN_Z(".7z", "主流高效的压缩格式");

    private String extension;
    private String describe;

    FileExtensionEnum(String extension, String describe) {
        this.extension = extension;
        this.describe = describe;
    }

    public String getExtension() {
        return extension;
    }

    public String getDescribe() {
        return describe;
    }

    public static String getDescribe(String extension) {
        if (StringUtils.isEmpty(extension)) {
            return extension;
        }
        for (FileExtensionEnum element : FileExtensionEnum.values()) {
            if (extension.equals(element.getExtension())) {
                return element.getDescribe();
            }
        }
        return null;
    }
}
