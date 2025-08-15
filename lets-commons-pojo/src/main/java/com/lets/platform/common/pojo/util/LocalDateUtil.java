package com.lets.platform.common.pojo.util;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.exception.LetsException;

import java.time.LocalDate;

/**
 * @version 1.0 创建时间: 2017年8月24日 下午2:47:28
 * @ClassName: DateUtil
 * @Description: 日期操作工具类
 */
public class LocalDateUtil {
    public static LocalDate parse(String dateStr) {
        if (StrUtil.isNotEmpty(dateStr)) {
            boolean byReg1 = ValidByRegUtil.isByReg(dateStr, GlobalConstant.YYYY_MM_DD);
            boolean byReg2 = ValidByRegUtil.isByReg(dateStr, GlobalConstant.YYYY_MM_DD_2);
            boolean byReg3 = ValidByRegUtil.isByReg(dateStr, GlobalConstant.DATE_FORMAT_YYYYMMDD_1);
            String[] split;
            if (byReg1) {
                split = dateStr.split(GlobalConstant.MIDDLE_LINE);
            } else if (byReg2) {
                split = dateStr.split(GlobalConstant.SLASH);
            } else if (byReg3) {
                split = new String[]{dateStr.substring(0, 4), dateStr.substring(4, 6), dateStr.substring(6, 8)};
            } else {
                throw new LetsException(0, "日期格式错误:" + dateStr);
            }
            return LocalDate.of(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        } else {
            throw new LetsException(0, "日期格式错误:" + dateStr);
        }
    }
}

