package com.lets.common.mybatis.controller;

import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.enums.ExceptionEnums;
import com.lets.platform.common.pojo.message.I18nUtils;
import com.lets.platform.model.uc.entity.InitTenancyConfigDto;
import com.service.Init4TenancyService;
import io.swagger.annotations.Api;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 预置数据 控制器
 * @author DING WEI
 * @since 2023-07-04
 */
@RestController
@Api(tags = "预置数据 控制器", value = "PresetDataController")
public class PresetDataController extends BaseController {

    @Resource
    private Init4TenancyService init4TenancyService;

    @PostMapping("/presetData")
    @Transactional(rollbackFor = Exception.class)
    public RespMsgBean<Boolean> presetData(@RequestBody InitTenancyConfigDto configDto) {
        return success(I18nUtils.getKey(ExceptionEnums.OPERATE_SUCCESS), init4TenancyService.presetData(configDto));
    }

}
