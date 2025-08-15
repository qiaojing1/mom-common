package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.core.incrementer.DefaultIdentifierGenerator;
import lombok.Data;

import java.util.Map;

/**
 * 需要副本工艺路线的的数据
 * @author: DING WEI
 * @date: 2023/12/6 13:43
 */
@Data
public class MesNeedCopyDataDto4Route {

    private Map<String, MesNeedCopyDataDto> needCopyRouteMap;

}
