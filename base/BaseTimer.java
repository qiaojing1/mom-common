package com.lets.platform.common.pojo.base;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Author: qiao jing
 * 定时执行器，对FlowItem作用
 * @Date: 2020/5/25 11:41
 */
public class BaseTimer {

    private Timer timer;

    public BaseTimer(TimerTask task, Date firstTime, long period){
        timer = new Timer();
        if(period>0)
            timer.schedule(task, firstTime, period);
        else
            timer.schedule(task, firstTime);
    }
}
