package com.lets.platform.common.pojo.base;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.enums.ExceptionEnums;
import com.lets.platform.common.pojo.enums.RespCodeEnum;
import com.lets.platform.common.pojo.exception.LetsException;
import org.apache.commons.lang3.StringUtils;

import java.util.Collection;
import java.util.Map;

/**
 * 服务断言
 *
 * @ClassName ServiceAssert
 * @author: DING WEI
 * @create: 2021/04/23 13:50
 * @Version 1.0
 **/
public class ServiceAssert {

    /**
     * 断言服务是否正常
     *
     * @param respMsgBean    服务对象
     * @param exceptionEnums 异常枚举
     * @return
     * @throws
     * @author DING WEI
     * @date 2021/04/23 10:34
     */
    public static void serviceIsNormal(RespMsgBean respMsgBean, ExceptionEnums exceptionEnums) {
        if (!respMsgBean.isSuccess()) {
            throw new LetsException(exceptionEnums);
        }
        if (respMsgBean.getCode() != RespCodeEnum.SUCCESS.getCode()) {
            throw new LetsException(exceptionEnums);
        }
        if (RespMsgBean.FALLBACK.equals(respMsgBean.getMsg())) {
            throw new LetsException(exceptionEnums);
        }
    }

    /**
     * 直接抛出异常
     *
     * @param exceptionEnums 异常枚举
     * @return
     * @throws
     * @author DING WEI
     * @Date 2021/04/23 10:34
     */
    public static void getThrow(ExceptionEnums exceptionEnums) {
        throw new LetsException(exceptionEnums);
    }

    /**
     * 直接抛出异常
     *
     * @param code
     * @return
     * @throws
     * @author DING WEI
     * @Date 2021/04/23 10:34
     */
    public static void getThrow(Integer code, String message) {
        isTrue(false, code, message);
    }

    /**
     * 根据表达式抛出异常  表达式为true继续业务,否则抛出ExceptionEnums异常
     *
     * @param exceptionEnums 异常枚举
     * @return false 抛出异常
     * @throws
     * @author DING WEI
     * @Date 2021/04/23 10:34
     */
    public static void isTrue(boolean expression, ExceptionEnums exceptionEnums) {
        if (!expression) {
            throw new LetsException(exceptionEnums);
        }
    }

    /**
     * 根据表达式抛出异常 表达式为true继续业务,否则抛出异常信息
     *
     * @param code    异常编码
     * @param message 异常提示
     * @return false 抛出异常
     * @throws
     * @author DING WEI
     * @Date 2021/04/23 10:34
     */
    public static void isTrue(boolean expression, Integer code, String message) {
        if (!expression) {
            throw new LetsException(code, message);
        }
    }

    /**
     * 根据表达式抛出异常 表达式为true继续业务,否则抛出异常信息
     */
    public static void isTrue(boolean expression, String message) {
        isTrue(expression, GlobalConstant.ZERO, message);
    }

    /**
     * 断言是否为NULL 对象为NULL继续业务,否则抛出异常信息
     *
     * @param object  对象
     * @param code    异常编码
     * @param message 异常提示
     * @return 不是null 抛出异常
     * @throws
     * @author DING WEI
     * @Date 2021/04/23 10:34
     */
    public static void isNull(Object object, Integer code, String message) {
        if (object != null) {
            throw new LetsException(code, message);
        }
    }

    /**
     * 断言是否为NULL 对象为NULL继续业务,否则抛出ExceptionEnums异常
     *
     * @param object         对象
     * @param exceptionEnums 异常枚举
     * @return 不是null 抛出异常
     * @throws
     * @author DING WEI
     * @Date 2021/04/23 10:34
     */
    public static void isNull(Object object, ExceptionEnums exceptionEnums) {
        if (object != null) {
            throw new LetsException(exceptionEnums);
        }
    }

    /**
     * 断言是否不是NULL 对象不为NULL继续业务,否则抛出异常信息
     *
     * @param object  对象
     * @param code    异常编码
     * @param message 异常提示
     * @throws null 抛出异常
     * @author DING WEI
     * @Date 2021/04/23 10:34
     */
    public static void notNull(Object object, Integer code, String message) {
        if (object == null) {
            throw new LetsException(code, message);
        }
    }

    public static void notNull(Object object, String message) {
        notNull(object, GlobalConstant.ZERO, message);
    }

    /**
     * 断言是否不是NULL 对象不为NULL继续业务,否则抛出ExceptionEnums异常
     *
     * @param object         对象
     * @param exceptionEnums 异常枚举
     * @throws null 抛出异常
     * @author DING WEI
     * @Date 2021/04/23 10:34
     */
    public static void notNull(Object object, ExceptionEnums exceptionEnums) {
        if (object == null) {
            throw new LetsException(exceptionEnums);
        }
    }

    /**
     * 判断字符的has长度
     *
     * @param text    对象
     * @param code    异常编码
     * @param message 异常提示
     * @return 为null 或者为 空 时 抛出异常
     * @throws
     * @author DING WEI
     * @Date 2021/04/23 10:34
     */
    public static void hasLength(String text, Integer code, String message) {
        if (!StringUtils.isEmpty(text)) {
            throw new LetsException(code, message);
        }
    }

    /**
     * 断言是否字符
     *
     * @param text    字符
     * @param code    异常编码
     * @param message 异常提示
     * @return
     * @throws
     * @author DING WEI
     * @Date 2021/04/23 10:34
     */
    public static void hasText(String text, Integer code, String message) {
        if (!StringUtils.isEmpty(text)) {
            throw new LetsException(code, message);
        }
    }

    /**
     * Assert that the given text does not contain the given substring.
     * <pre class="code">Assert.doesNotContain(name, "rod", "Name must not contain 'rod'");</pre>
     *
     * @param textToSearch the text to search
     * @param substring    the substring to find within the text
     * @param code         error code
     * @param message      the aspect message to use if the assertion fails
     * @throws LetsException if the text contains the substring
     */
    public static void doesNotContain(String textToSearch, String substring, Integer code, String message) {
        if (StringUtils.isEmpty(textToSearch) && StringUtils.isEmpty(substring) &&
            textToSearch.contains(substring)) {
            throw new LetsException(code, message);
        }
    }

    /**
     * 断言数组是否为空
     *
     * @param array   数组
     * @param code    编码
     * @param message 提示
     * @return null 或 0 为 true
     * @throws
     * @author DING WEI
     * @Date 2021/04/23 10:34
     */
    public static void notEmpty(Object[] array, Integer code, String message) {
        if (array == null || array.length == 0) {
            throw new LetsException(code, message);
        }
    }

    /**
     * 断言数组元素是否为null
     *
     * @param array   数组
     * @param code    编码
     * @param message 提示
     * @return null 或 0 为 true
     * @throws
     * @author DING WEI
     * @Date 2021/04/23 10:34
     */
    public static void noNullElements(Object[] array, Integer code, String message) {
        if (array != null) {
            for (Object element : array) {
                if (element == null) {
                    throw new LetsException(code, message);
                }
            }
        }
    }

    /**
     * 断言 集合是否为空
     *
     * @param collection 集合对象
     * @param message    提示
     * @author DING WEI
     */
    public static void notEmpty(Collection<?> collection, String message) {
        notEmpty(collection, GlobalConstant.ZERO, message);
    }

    /**
     * 断言 集合是否为空
     *
     * @param string  集合对象
     * @param message 提示
     * @author DING WEI
     */
    public static void notEmpty(String string, String message) {
        notEmpty(string, GlobalConstant.ZERO, message);
    }

    /**
     * 断言 字符串是否为空
     *
     * @param string  集合对象
     * @param message 提示
     * @author DING WEI
     */
    public static void notBlank(String string, String message) {
        notBlank(string, GlobalConstant.ZERO, message);
    }

    /**
     * 断言 集合是否为空
     *
     * @param string  集合对象
     * @param message 提示
     * @author DING WEI
     */
    public static void notBlank(String string, Integer code, String message) {
        if (StrUtil.isBlank(string)) {
            throw new LetsException(code, message);
        }
    }

    /**
     * 断言 集合是否为空
     *
     * @param string  集合对象
     * @param message 提示
     * @author DING WEI
     */
    public static void notEmpty(String string, Integer code, String message) {
        if (StrUtil.isEmpty(string)) {
            throw new LetsException(code, message);
        }
    }

    /**
     * 断言 集合是否为空
     *
     * @param collection 集合对象
     * @param code       编码
     * @param message    提示
     * @author DING WEI
     */
    public static void notEmpty(Collection<?> collection, Integer code, String message) {
        if (CollUtil.isEmpty(collection)) {
            throw new LetsException(code, message);
        }
    }

    /**
     * 断言 map 是否为空
     *
     * @param map     集合对象
     * @param code    编码
     * @param message 提示
     * @return null 或 0 为 true
     * @throws
     * @author DING WEI
     * @Date 2021/04/23 10:34
     */
    public static void notEmpty(Map<?, ?> map, Integer code, String message) {
        if (map == null || map.isEmpty()) {
            throw new LetsException(code, message);
        }
    }

    /**
     * 断言是否子类
     *
     * @param type    类对象
     * @param code    编码
     * @param obj     对象
     * @param message 消息
     * @return
     * @throws
     * @author DING WEI
     * @Date 2021/04/23 10:34
     */
    public static void isInstanceOf(Class<?> type, Object obj, Integer code, String message) {
        notNull(type, code, "Type to check against must not be null");
        if (!type.isInstance(obj)) {
            instanceCheckFailed(type, obj, message);
        }
    }


    /**
     * 断言是否子类
     *
     * @param type 类对象
     * @param code 编码
     * @param obj  对象
     * @return
     * @throws
     * @author DING WEI
     * @Date 2021/04/23 10:34
     */
    public static void isInstanceOf(Class<?> type, Object obj, Integer code) {
        isInstanceOf(type, obj, code, "");
    }

    /**
     * Assert that {@code superType.isAssignableFrom(subType)} is {@code true}.
     * <pre class="code">Assert.isAssignable(Number.class, myClass, "Number expected");</pre>
     *
     * @param superType the super type to check against
     * @param subType   the sub type to check
     * @param code      error code
     * @param message   a message which will be prepended to provide further context.
     *                  If it is empty or ends in ":" or ";" or "," or ".", a full aspect message
     *                  will be appended. If it ends in a space, the name of the offending sub type
     *                  will be appended. In any other case, a ":" with a space and the name of the
     *                  offending sub type will be appended.
     * @throws LetsException if the classes are not assignable
     */
    public static void isAssignable(Class<?> superType, Class<?> subType, Integer code, String message) {
        notNull(superType, code, "Super type to check against must not be null");
        if (subType == null || !superType.isAssignableFrom(subType)) {
            assignableCheckFailed(superType, subType, code, message);
        }
    }

    /**
     * Assert that {@code superType.isAssignableFrom(subType)} is {@code true}.
     * <pre class="code">Assert.isAssignable(Number.class, myClass);</pre>
     *
     * @param superType the super type to check
     * @param subType   the sub type to check
     * @param code      error code
     * @throws LetsException if the classes are not assignable
     */
    public static void isAssignable(Class<?> superType, Class<?> subType, Integer code) {
        isAssignable(superType, subType, code, "");
    }

    private static void instanceCheckFailed(Class<?> type, Object obj, String msg) {
        String className = (obj != null ? obj.getClass().getName() : "null");
        String result = "";
        boolean defaultMessage = true;
        if (StringUtils.isNotEmpty(msg)) {
            if (endsWithSeparator(msg)) {
                result = msg + " ";
            } else {
                result = messageWithTypeName(msg, className);
                defaultMessage = false;
            }
        }
        if (defaultMessage) {
            result = result + ("Object of class [" + className + "] must be an instance of " + type);
        }
        throw new IllegalArgumentException(result);
    }

    private static void assignableCheckFailed(Class<?> superType, Class<?> subType, Integer code, String msg) {
        String result = "";
        boolean defaultMessage = true;
        if (StringUtils.isNotEmpty(msg)) {
            if (endsWithSeparator(msg)) {
                result = msg + " ";
            } else {
                result = messageWithTypeName(msg, subType);
                defaultMessage = false;
            }
        }
        if (defaultMessage) {
            result = result + (subType + " is not assignable to " + superType);
        }
        throw new LetsException(code, result);
    }

    private static boolean endsWithSeparator(String msg) {
        return (msg.endsWith(":") || msg.endsWith(";") || msg.endsWith(",") || msg.endsWith("."));
    }

    private static String messageWithTypeName(String msg, Object typeName) {
        return msg + (msg.endsWith(" ") ? "" : ": ") + typeName;
    }

}
