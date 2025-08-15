package com.lets.platform.common.pojo.constant;

/**
 * @Author: qiao jing
 * @Date: 2020/6/9 17:08
 */
public class WorkflowStepTypeEnum {
    //启动事件
    public static final int START = 1;

    //信号
    public static final int SIGNAAL = 2;
    //边界事件
    public static final int BOUNDARYEVENT = 5;

    //其他事件
    public static final int EVENT =10;
    //用户任务
    public static final int USERTASK = 50;
    //审核事件
    public static final int AUDIT = 45;
    //系统任务
    public static final int SYSTASK = 55;
    //条件
    public static final int CONDITION = 60;
    //会签
    public static final int COUNTERSIGN = 65;
    //子流程
    public static final int SUBPROCESS = 70;
    //排他网关
    public static final int EXCLUSIVEGATEWAY = 80;
    //并行网关
    public static final int PARALLELGATEWAY = 85;
    //包容网关
    public static final int INCLUSIVEGATEWAY = 90;
    //事件网关
    public static final int EVENTGATEWAY = 95;
    //结束事件
    public static final int FINISH = 100;

}
