package com.lets.platform.common.pojo.util;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.Code128Writer;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.lets.platform.common.pojo.base.BarCodeDto;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 条形码 工具类
 * @author: DING WEI
 * @date: 3/8/22 8:14 AM
 */
@Slf4j
public class LetsBarCodeUtil {

    /**
     * 设置 条形码参数
     */
    private static Map<EncodeHintType, Object> hints = new HashMap<EncodeHintType, Object>() {
        private static final long serialVersionUID = 1L;
        {
            // 设置编码方式
            put(EncodeHintType.CHARACTER_SET, "utf-8");
            //容错级别 这里选用最高级H级别
            put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
            put(EncodeHintType.MARGIN, 0);

        }
    };

    /**
     * 生成 图片缓冲
     *
     * @param barCodeDto 条形码信息
     * @return 返回BufferedImage
     * @author myc
     */
    public static BufferedImage getBarCode(BarCodeDto barCodeDto) {
        try {
            Code128Writer writer = new Code128Writer();
            // 编码内容, 编码类型, 宽度, 高度, 设置参数
            BitMatrix bitMatrix = writer.encode(barCodeDto.getCode(), BarcodeFormat.CODE_128, barCodeDto.getWidth(), barCodeDto.getHeight(), hints);
            return MatrixToImageWriter.toBufferedImage(bitMatrix);
        } catch (WriterException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 把条形码加上文字信息
     *
     * @param image   条形码图片
     * @param barCodeDto 条形码信息
     * @return 返回BufferedImage
     * @author myc
     */
    public static BufferedImage insertWords(BufferedImage image, BarCodeDto barCodeDto) {
        String word = barCodeDto.getDownWord();
        // 新的图片，把带logo的二维码下面加上文字
        if (StringUtils.isNotEmpty(word)) {
            Integer widthNotNull = barCodeDto.getWidth();
            Integer heightNotNull = barCodeDto.getHeight();
            Integer wordHeightNotNull = barCodeDto.getWordHeight();
            String rightDownFirstWord = barCodeDto.getRightDownFirstWord();
            String rightDownSecondWord = barCodeDto.getRightDownSecondWord();
            String leftDownFirstWord = barCodeDto.getLeftDownFirstWord();
            String leftDownSecondWord = barCodeDto.getLeftDownSecondWord();
            if (StringUtils.isBlank(leftDownFirstWord) && StringUtils.isBlank(leftDownSecondWord) && StringUtils.isBlank(rightDownFirstWord) && StringUtils.isBlank(rightDownSecondWord)) {
                wordHeightNotNull = 200;
            }
            BufferedImage outImage = new BufferedImage(widthNotNull, wordHeightNotNull, BufferedImage.TYPE_INT_RGB);
            Graphics2D g2d = outImage.createGraphics();
            // 抗锯齿
            setGraphics2D(g2d);
            // 设置白色
            setColorWhite(g2d);
            // 设置边框
            Integer sub = barCodeDto.getWordHeight() - wordHeightNotNull;
            setDrawRect(g2d, sub);
            // 设置虚线边框
            setDrawRectDottedLine(g2d, sub);
            // 画条形码到新的面板
            g2d.drawImage(image, 10, 40, image.getWidth() - 20, image.getHeight(), null);
            // 画文字到新的面板
            Color color = new Color(0, 0, 0);
            g2d.setColor(color);
            // 字体、字型、字号
            g2d.setFont(new Font("微软雅黑", Font.PLAIN, 12));
            // 文字长度
            String str = word.replace("", "  ").trim();
            int strWidth = g2d.getFontMetrics().stringWidth(str);
            // 总长度减去文字长度的一半  （居中显示）
//            int wordStartX=(WIDTH - strWidth) / 2;
            int wordStartX = (widthNotNull - strWidth) / 2;
            // height + (outImage.getHeight() - height) / 2 + 12
            int wordStartY = heightNotNull + 20;
            // 右上角文字长度
            Integer leftUpWordsWidth = null;
            String leftUpWord = barCodeDto.getLeftUpWord();
            String rightUpWord = barCodeDto.getRightUpWord();
            if (StringUtils.isNotBlank(leftUpWord)) {
                leftUpWordsWidth = widthNotNull - g2d.getFontMetrics().stringWidth(leftUpWord);
            }
            // 左上角文字长度
            Integer rightUpWordsWidth = null;
            if (StringUtils.isNotBlank(leftUpWord)) {
                rightUpWordsWidth = widthNotNull - g2d.getFontMetrics().stringWidth(rightUpWord);
            }
            // 左下角第一 文字长度
            Integer leftDownFirstWordsWidth = null;
            if (StringUtils.isNotBlank(leftDownFirstWord)) {
                leftDownFirstWordsWidth = widthNotNull - 20 - g2d.getFontMetrics().stringWidth(leftDownFirstWord);
            }

            // 画文字-上部分
            if (StringUtils.isNotBlank(leftUpWord)) {
                g2d.drawString(leftUpWord, 20, 30);
            }
            if (StringUtils.isNotBlank(rightUpWord)) {
                g2d.drawString(rightUpWord, rightUpWordsWidth - 20, 30);
            }

            // 文字-下部分
            g2d.drawString(str, wordStartX, wordStartY + 38);
            if (StringUtils.isNotBlank(rightDownFirstWord)) {
                g2d.drawString(rightDownFirstWord, 20, wordStartY + 56);
            }
            if (StringUtils.isNotBlank(rightDownSecondWord)) {
                g2d.drawString(rightDownSecondWord, 20, wordStartY + 76);
            }
            if (StringUtils.isNotBlank(leftDownFirstWord)) {
                g2d.drawString(leftDownFirstWord, leftDownFirstWordsWidth, wordStartY + 56);
            }
            if (StringUtils.isNotBlank(leftDownSecondWord)) {
                g2d.drawString(leftDownSecondWord, leftDownFirstWordsWidth, wordStartY + 76);
            }
            g2d.dispose();
            outImage.flush();
            return outImage;
        }
        return null;
    }

    /**
     * 设置 Graphics2D 属性  （抗锯齿）
     *
     * @param g2d Graphics2D提供对几何形状、坐标转换、颜色管理和文本布局更为复杂的控制
     */
    private static void setGraphics2D(Graphics2D g2d) {
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_DEFAULT);
        Stroke s = new BasicStroke(1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER);
        g2d.setStroke(s);
    }

    /**
     * 设置背景为白色
     * @param g2d Graphics2D提供对几何形状、坐标转换、颜色管理和文本布局更为复杂的控制
     */
    private static void setColorWhite(Graphics2D g2d) {
        g2d.setColor(Color.WHITE);
        // 填充整个屏幕
        g2d.fillRect(0, 0, 600, 600);
        // 设置笔刷
        g2d.setColor(Color.BLACK);
    }

    /**
     * 设置边框
     * @param g2d Graphics2D提供对几何形状、坐标转换、颜色管理和文本布局更为复杂的控制
     */
    private static void setDrawRect(Graphics2D g2d, Integer sub) {
        // 设置笔刷
        g2d.setColor(Color.DARK_GRAY);
        g2d.drawRect(5, 5, 425, 220 - sub);
    }

    /**
     * 设置边框虚线点
     * @param g2d Graphics2D提供对几何形状、坐标转换、颜色管理和文本布局更为复杂的控制
     */
    private static void setDrawRectDottedLine(Graphics2D g2d, Integer sub) {
        // 设置笔刷
        g2d.setColor(Color.BLUE);
        BasicStroke stroke = new BasicStroke(0.5f, BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_ROUND, 0.5f, new float[]{1, 4}, 0.5f);
        g2d.setStroke(stroke);
        g2d.drawRect(0, 0, 435, 230 - sub);
    }

    /**
     * 创建条形码 返回byte数组
     * @param barCodeDto
     * @return
     * @author DING WEI
     * @date 2022/9/14 9:48
     * @version 1.0
     */
    public static byte[] createBarCode(BarCodeDto barCodeDto) {
        BufferedImage image = insertWords(getBarCode(barCodeDto), barCodeDto);
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try {
            ImageIO.write(image, "png", os);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return os.toByteArray();
    }

    public static void main(String[] args) throws IOException {
        /** 条形码右下角第一段文字 */
        final String RIGHT_DOWN_FIRST_WORDS = "所属单位: xxx33333333xx公司";
        final String RIGHT_DOWN_SECOND_WORDS = "生产厂家: xxxxx3333xxx有限公司";
        /** 条形码左下角第一段文字 */
        final String LEFT_DOWN_FIRST_WORDS = "设备类型: xxx444444xxx";
        final String LEFT_DOWN_SECOND_WORDS = "准确度等级: xxx444444xx";
        BarCodeDto barCodeDto = new BarCodeDto();
        barCodeDto.setCode("13232323232323232323232323232");
        barCodeDto.setDownWord("1234567890");
        barCodeDto.setLeftUpWord("打印测试部");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        barCodeDto.setRightUpWord("打印日期 " + sdf.format(new Date()));
        barCodeDto.setLeftDownFirstWord(LEFT_DOWN_FIRST_WORDS);
        barCodeDto.setLeftDownSecondWord(LEFT_DOWN_SECOND_WORDS);
        barCodeDto.setRightDownFirstWord(RIGHT_DOWN_FIRST_WORDS);
        barCodeDto.setRightDownSecondWord(RIGHT_DOWN_SECOND_WORDS);
        BufferedImage image = insertWords(getBarCode(barCodeDto), barCodeDto);
        ImageIO.write(image, "png", new File("D:/8.png"));

        BarCodeDto onlyBar = new BarCodeDto();
        onlyBar.setCode("13232323232323232323232323232");
        onlyBar.setDownWord("1234567890");
        BufferedImage onlyBarImage = insertWords(getBarCode(onlyBar), onlyBar);
        ImageIO.write(onlyBarImage, "png", new File("D:/9.png"));
    }

}
