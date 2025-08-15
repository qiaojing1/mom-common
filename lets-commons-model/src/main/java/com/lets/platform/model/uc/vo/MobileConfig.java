package com.lets.platform.model.uc.vo;

import com.lets.platform.model.common.entity.CommonInstallPackage;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MobileConfig {
    @ApiModelProperty("手持终端主标题")
    private String title;

    @ApiModelProperty("手持终端次标题")
    private String subTitle;

    @ApiModelProperty("手持终端登录页LOGO文件地址")
    private String logoUrl;

    private CommonInstallPackage installPackage;
}
