package com.lets.platform.model.base.util;

import com.lets.platform.model.adapter.util.SplitUtil;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Objects;

/**
 * LocalDateTime 工具类
 * @author: DING WEI
 * @date: 2023/11/28 19:27
 */
public class LdtUtils {

    public static LocalDateTime millToLdt(Long timeStamp) {
        if (Objects.nonNull(timeStamp)) {
            Instant epochMilli = Instant.ofEpochMilli(timeStamp);
            LocalDateTime timeStampLdt = LocalDateTime.ofInstant(epochMilli, SplitUtil.zoneOffset);
            return timeStampLdt;
        } else {
            return null;
        }
    }

    public static LocalDateTime millToLdtShangHai(Long timeStamp) {
        if (Objects.nonNull(timeStamp)) {
            // 将Instant对象转换为LocalDateTime对象
            LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(timeStamp), SplitUtil.shangHai);
            return localDateTime;
        } else {
            return null;
        }
    }

    public static Long ldtToMill(LocalDateTime ldt) {
        if (Objects.nonNull(ldt)) {
            return ldt.toInstant(SplitUtil.zoneOffset).toEpochMilli();
        } else {
            return LocalDateTime.now().toInstant(SplitUtil.zoneOffset).toEpochMilli();
        }
    }

    public static Long ldtToMillShanghai(LocalDateTime ldt) {
        if (Objects.isNull(ldt)) {
            ldt = LocalDateTime.now(SplitUtil.shangHai);
        }
        // 转换为ZonedDateTime，默认时区
        ZonedDateTime zonedDateTime = ldt.atZone(SplitUtil.shangHai);
        // 转换为Instant
        Date date = Date.from(zonedDateTime.toInstant());
        // 获取自1970年1月1日00:00:00 GMT以来的毫秒数
        return date.getTime();
    }
}
