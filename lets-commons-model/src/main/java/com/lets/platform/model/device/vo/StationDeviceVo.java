package com.lets.platform.model.device.vo;

import com.lets.platform.common.pojo.base.BaseDo;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 设备
 *
 * @version 1.0
 * @ClassName DeviceDo
 * @author: DING WEI
 * @create: 2021/05/11 09:07
 **/
@Data
public class StationDeviceVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String deviceName;
    private String code;
    private String id;

    private String assetsCode;
    
    private String toleranceValue;



}
