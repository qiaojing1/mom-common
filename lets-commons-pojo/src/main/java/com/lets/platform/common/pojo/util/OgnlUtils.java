package com.lets.platform.common.pojo.util;

import lombok.extern.slf4j.Slf4j;
import ognl.Ognl;
import ognl.OgnlContext;

import java.util.Map;
import java.util.Objects;

/**
 * Ognl 工具类
 * @author: DING WEI
 * @date: 2024/5/30 8:45
 */
@Slf4j
public class OgnlUtils {

    /**
     * {
     *   "a1":{
     *     "b1":{
     *       "c1":{
     *         "d1":"d1"
     *       }
     *     }
     *   },
     *   "a2":{
     *     "b2":{
     *       "c2":{
     *         "d2":["i1","i2","i3"]
     *       }
     *     }
     *   }
     * }
     * String s = OgnlUtils.getValue(map, "a1.b1.c1.d1", String.class);
     * List<String> list = OgnlUtils.getValue(map, "a2.b2.c2.d2", List.class);
     * @param
     * @return
     * @author DING WEI
     * @date 2024/5/30 8:47
     * @version 1.0
     */
    public static <T> T getValue(Map map, String path, Class<T> klass) throws Exception {
        OgnlContext ctx = new OgnlContext();
        ctx.setRoot(map);
        Object value1 = Ognl.getValue(path, ctx, ctx.getRoot());
        if (Objects.nonNull(value1)) {
            return (T) value1;
        }
        return null;
    }

}
