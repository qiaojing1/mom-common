package com.lets.platform.util;

import cn.hutool.core.collection.CollUtil;
import com.lets.platform.model.base.businessEntity.BaseSerialEntity;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SerialUtil {

    public static <T extends BaseSerialEntity> String toSimpleString(List<T> serialList) {

        if (CollUtil.isEmpty(serialList)) {
            return "";
        }

        serialList = serialList.stream().filter(Objects::nonNull).sorted(Comparator.comparing(T::getPrefixSerial).thenComparingInt(item -> Integer.parseInt(item.getSuffixSerial())))
                               .collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();
        T previous = null;
        boolean isRange = false;

        for (int i = 0; i < serialList.size(); i++) {
            T current = serialList.get(i);

            if (previous == null) {
                sb.append(current.getTotalSerial());
            } else {
                boolean isConsecutive = previous.getPrefixSerial().equals(current.getPrefixSerial()) && Integer.parseInt(current.getSuffixSerial()) - Integer.parseInt(previous.getSuffixSerial()) == 1;

                if (isConsecutive) {
                    isRange = true;
                    if (i == serialList.size() - 1) {
                        sb.append("-").append(current.getSuffixSerial());
                    }
                } else {
                    if (isRange) {
                        sb.append("-").append(previous.getSuffixSerial());
                        isRange = false;
                    }
                    sb.append(",").append(current.getTotalSerial());
                }
            }

            previous = current;
        }

        return sb.toString();
    }

    public static boolean isDecimal(BigDecimal value) {
        return value.scale() > 0 && value.stripTrailingZeros().scale() > 0;
    }
}
