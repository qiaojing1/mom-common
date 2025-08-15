package com.lets.platform.common.pojo.tools;

import cn.hutool.core.clone.CloneSupport;
import cn.hutool.core.util.ObjectUtil;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * JAVA左连接
 *
 * @author FZY
 * @date 2023/12/5 15:00
 **/
public class LeftJoiner<T extends Serializable> {
    private final List<T> currentList;

    public LeftJoiner(List<T> initialList) {
        this.currentList = new ArrayList<>(initialList);
    }

    public <R> LeftJoiner<T> leftJoin(List<R> rightList, BiPredicate<T, R> predicate, BiFunction<T, R, T> joinFunction) {
        if (rightList.isEmpty()) {
            return this;
        }
        List<T> joinedList = currentList.stream().flatMap(leftItem -> {
            boolean anyMatch = rightList.stream().anyMatch(rightItem -> predicate.test(leftItem, rightItem));
            if (anyMatch) {
                return rightList.stream().filter(rightItem -> predicate.test(leftItem, rightItem)).map(rightItem -> joinFunction.apply(ObjectUtil.cloneByStream(leftItem), rightItem));
            } else {
                return Stream.of(leftItem);
            }
        }).collect(Collectors.toList());
        return new LeftJoiner<>(joinedList);
    }

    public List<T> getResult() {
        return currentList;
    }
}