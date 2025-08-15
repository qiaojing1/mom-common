package com.lets.platform.common.pojo.base;

import lombok.Data;

/**
 * 条形码生成参数
 * @author: DING WEI
 * @date: 2022/9/14 8:47
 */
@Data
public class BarCodeDto {

    /** 条形码宽度 */
    private final Integer width = 440;
    /** 条形码高度 */
    private final Integer height = 100;
    /** 加文字 条形码 */
    private final Integer wordHeight = 240;

    /** VA码 */
    private String code;
    /** 正下方文字 */
    private String downWord;

    /** 左上 */
    private String leftUpWord;
    /** 左下(可以有多个) */
    private String leftDownFirstWord;
    private String leftDownSecondWord;
    /** 右上 */
    private String rightUpWord;
    /** 右下(可以有多个) */
    private String rightDownFirstWord;
    private String rightDownSecondWord;

}
