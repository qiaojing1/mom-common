package com.lets.commons.redis.constant;

/**
 * redis常量
 * @ClassName RedisConstant
 * @author: DING WEI
 * @create: 2021/04/23 13:50
 * @Version 1.0
 **/
public class RedisConstant {

    /** url-role缓存key */
    public static final String RBAC_URL_ROLES = "RBAC:RBAC_URL_ROLES:";

    /** user-role缓存key */
    public static final String RBAC_USER_ROLES = "RBAC:RBAC_USER_ROLES";

    /** user-data缓存key */
    public static final String RBAC_USER_DATA = "RBAC:RBAC_USER_DATA";

    /** 角色字段 */
    public static final String ROLE_FIELD_KEYS = "RBAC:RBAC_ROLE_FIELD_KEYS";
    public static final String ROLE_FIELD = "RBAC:RBAC_ROLE_FIELD:";

    /** user缓存key */
    public static final String LETS_USER_DO = "LETS:USER:DO:";
    public static final String LETS_USER_DO_CODE = "LETS:USER:CODE:";

    /** org缓存key */
    public static final String LETS_ORG_DO = "LETS:ORG:DO:";

    /** 设备缓存key */
    public static final String LETS_DEVICE_DO = "LETS:DEVICE:DO:";
    public static final String LETS_DEVICE_CHANNEL = "LETS:DEVICE:CHANNEL:";
    /** 生产单元key */
    public static final String LETS_FACTORY_MODE = "LETS:FACTORY_MODE:DO:";
    /**设备量程**/
    public static final String LETS_DEVICE_RANGE_CONFIG = "LETS:COLLECTION:RANGE:CONFIG:";
    public static final String LETS_OFFLINE_TIME = "LETS:OFFLINE:";
    public static final String LETS_OFFLINE_TIME_CLOSE = "LETS:OFFLINE:CLOSE";
    public static final String LETS_RELAYED_SEND = "LETS:RELAYED:";
    public static final String LETS_RELAYED_SEND_CLOSE = "LETS:RELAYED:CLOSE";
    /** 设备-工序：绑定关系 key */
    public static final String LETS_DEVICE_PROCESS = "LETS:DEVICE:PROCESS:";

    /** 工艺路线-工序-物料：绑定关系 key */
    public static final String LETS_ROUTE_PROCESS_MATERIAL = "LETS:ROUTE:PROCESS_MATERIAL:";

    /** 物料缓存 key */
    public static final String LETS_MATERIAL = "LETS:MATERIAL:";

    /** 设备状态缓存key */
    public static final String LETS_DEVICE_STATUS_CONFIG = "LETS:DEVICE_STATUS_CONFIG:";

    /** HMI配置 缓存key */
    public static final String LETS_HMI_SETTING = "LETS:HMI_SETTING:";
    /** HMI-设备绑定关系 缓存key */
    public static final String LETS_HMI_DEVICE = "LETS:HMI_DEVICE:";
    /** 系统参数配置 缓存key */
    public static final String LETS_SYS_PARAM = "LETS:SYS_PARAM:";
    /** 工位机-设备运行参数 缓存key */
    public static final String LETS_DEVICE_RUN_PARAM = "LETS:MES_DEVICE_RUN_PARAM:";

    /** tenancy缓存key */
    public static final String LETS_TENANCY_VO = "LETS:TENANCY:VO";

    /** tenancy缓存key */
    public static final String LETS_TENANCY_DO = "LETS:TENANCY:DO";

    /** 数据源下的所有表信息 */
    public static final String DATASOURCE_TABLE_LIST = "LETS:DATASOURCE:TABLE_LIST:";
    /** WORK-Flow缓存key */
    public static final String LETS_WORK_FLOW = "LETS:WORK_FLOW:";

    /** 异常掉线消息配置 */
    public static final String ERROR_OFFLINE_MSG_CONFIG = "ERROR_OFFLINE_MSG_CONFIG:";

    /** 采集器信息 */
    public static final String COLLECTOR_DO = "LETS:COLLECTION:COLLECTOR_DO:";

    public static final String RTZ = "RETURN_TO_ZERO:";

    /** 协议端口信息 */
    public static final String IOT_PORT = "IOT:PORT:";
    /** 协议端口可用接口 */
    public static final String IOT_INTERFACE = "IOT:INTERFACE:";

    /** 单据类别被引用次数KEY */
    public static final String ORDER_CATEGORY_QUOTE = "ORDER_CATEGORY_QUOTE";

    /** 掉线并关机 */
    public static final String LETS_SHUTDOWN_TIME = "LETS:SHUTDOWN:";
    public static final String LETS_SHUTDOWN_TIME_CLOSE = "LETS:SHUTDOWN:CLOSE";

    /** 实时点位 */
    public static final String REAL_TIME_ITEM = "LETS:REAL_TIME_ITEM:";

    /** findRealtimeStatus接口 */
    public static final String FIND_REALTIME_STATUS = "LETS:findRealtimeStatus:";

    /** 设备解锁：人员登录 key */
    public static final String MES_UNLOCK_USER_LOGIN = "MES_UNLOCK:USER_LOGIN:";

    /** 待开始设备 key */
    public static final String MES_UNLOCK_WAIT_START = "MES_UNLOCK:WAIT_START:";
    /** 待开始设备(多工步) key */
    public static final String MES_UNLOCK_WAIT_START_MULTI_STEP = "MES_UNLOCK:WAIT_START:MULTI_STEP:";
    /** 待报工设备 key */
    public static final String MES_UNLOCK_WAIT_REPORT = "MES_UNLOCK:WAIT_REPORT:";
    /** 待报工设备(多工步) key */
    public static final String MES_UNLOCK_WAIT_REPORT_MULTI_STEP = "MES_UNLOCK:WAIT_REPORT:MULTI_STEP:";
    /** 设备锁机状态 key */
    public static final String MES_UNLOCK_DEVICE_STATUS = "MES_UNLOCK:DEVICE_STATUS:";

    /** 试压实时点位**/
    public static final String DETECT_REAL_TIME="DETECT:REAL_TIME:";

    /** 报警原因 缓存key */
    public static final String LETS_ALARM_REASON_DO = "LETS:ALARM_REASON:DO:";

    /** 产线设备-开线时间 缓存key */
    public static final String LETS_PRODUCE_START_LINE = "LETS:PRODUCE_DEVICE:START_LINE:";
    /** 产线设备-开工时间 缓存key */
    public static final String LETS_PRODUCE_START_WORK = "LETS:PRODUCE_DEVICE:START_WORK:";

    /** 等价符号配置 缓存key */
    public static final String LETS_EQUALS_SYMBOL_CONFIG = "LETS:EQUALS_SYMBOL_CONFIG:";
    public static final String LETS_EQUALS_SYMBOL_CONFIG_ALL = "LETS:EQUALS_SYMBOL_CONFIG_ALL:";

    /** 胜捷 生产单元下生产设备 缓存key */
    public static final String SJ_PRODUCE_DEVICE = "SJ:DEVICE:PRODUCE:";
    /** 胜捷 设备是否自动线设备 缓存key 1在自动线中否则不在 */
    public static final String SJ_AUTO_LINE_DEVICE = "SJ:DEVICE:IS_AUTO_LINE:";
    /** 胜捷 条码-采集值 信息 */
    public static final String SJ_CODE_CHECK_PACKAGE = "SJ:CHECK_PACKAGE:VALUE:";
    /** 胜捷 扫码上料日志 信息 */
    public static final String SJ_SCAN_FEEDING_LOG = "SJ:SCAN_FEEDING:LOG:";
    /** 胜捷 扫码执行日志 信息 */
    public static final String SJ_SCAN_PURSUANCE_LOG = "SJ:SCAN_PURSUANCE:LOG:";
    /** 胜捷 扫码上料校验TXT文件内容key */
    public static final String LETS_SCAN_CHECK_TXT = "SJ:SCAN_CHECK_TXT:";
    /** 胜捷外部码缓存key */
    public static final String SJ_EXTERNAL_KEY = "SJ:EXTERNAL_KEY:";

    /** E9 token */
    public static final String LETS_E9_TOKEN = "LETS:TOKEN:E9";
    /** 通过经纬度获取地址key */
    public static final String LETS_ADDRESS_BY_GEOGRAPHIC = "LETS:ADDRESS:BY_GEOGRAPHIC:";
    /** 通过IP获取地址key */
    public static final String LETS_ADDRESS_BY_IP = "LETS:ADDRESS:BY_IP:";

    /** 停机手动结束报警设备key */
    public static final String LETS_MANUAL_END_WARN = "LETS:MANUAL_END_WARN:";

}
