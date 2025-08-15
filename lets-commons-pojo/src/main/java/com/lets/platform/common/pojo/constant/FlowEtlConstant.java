package com.lets.platform.common.pojo.constant;

/**
 * 工作流-ETL-常量
 * @author: DING WEI
 * @date: 2022/7/6 17:37
 */
public class FlowEtlConstant {

    /** 流程实例 */
    public static final String PROCESS_INSTANCE_ID = "processInstanceId";

    /** 上一节点xml主键,会被覆盖 */
    public static final String PRE_XML_ID = "preXmlId";

    /** 当前节点的xml主键 */
    public static final String CURRENT_XML_ID = "currentXmlId";

    /** 是否为最有一个节点 */
    public static final String IS_LAST_ONE = "isLastOne";

    /** 设计资源主键,启动工作流的时候传入 */
    public static final String DESIGN_ID = "designId";

    /** 设计资源任务主键,启动工作流的时候传入 */
    public static final String DESIGN_JOB_ID = "designJobId";

    /** 更新回写增量记录时间节点的数据（空标识无需回写） */
    public static final String WRITE_BACK_INCREMENT = "writeBackIncrement";

}
