package com.lets.platform.common.pojo.util;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeException;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;
import com.google.zxing.BarcodeFormat;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * 二维码 工具类
 * @author: DING WEI
 * @date: 3/8/22 8:14 AM
 */
@Slf4j
public class LetsQrCodeUtil {

    // 自定义参数，这部分是HuTool工具封装的
    private static QrConfig initQrConfig() {
        QrConfig config = new QrConfig(150, 150);
        // 设置边距，既二维码和背景之间的边距
        config.setMargin(1);
        // 设置前景色，既二维码颜色（黑色）
        config.setForeColor(Color.BLACK);
        // 设置背景色（白色）
        config.setBackColor(Color.WHITE);
        return config;
    }

    /**
     * 生成到字节数组
     * @param content
     */
    public static byte[] createQRCode2Bytes(String content) {
        if(StringUtils.isEmpty(content)) {
            return null;
        }
        try {
            byte[] bytes = QrCodeUtil.generatePng(content, initQrConfig());
            log.info("生成二维码成功!");
            return bytes;
        } catch (QrCodeException e) {
            log.error("发生错误！ {}！", e.getMessage());
        }
        return null;
    }

    public static BufferedImage createQRCode2BufferedImage(String content, int width, int height) {
        try {
            BufferedImage image = QrCodeUtil.generate(content, BarcodeFormat.QR_CODE, width, height);
            log.info("生成二维码成功!");
            return image;
        } catch (QrCodeException e) {
            log.error("发生错误！ {}！", e.getMessage());
        }
        return null;
    }

    /**
     * 生成到文件
     * @param content
     * @param filepath
     */
    public static void createQRCode2File(String content, String filepath) {
        try {
            QrCodeUtil.generate(content, QrConfig.create().setImg("C:\\Users\\as2i\\Pictures\\bigData.jpg"), FileUtil.file(filepath));
            log.info("生成二维码成功, 位置在：{}！", filepath);
        } catch (QrCodeException e) {
            log.error("发生错误！ {}！", e.getMessage());
        }
    }

}
