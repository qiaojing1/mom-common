package com.lets.platform.model.mes.vo;

import cn.hutool.core.collection.CollUtil;
import com.lets.platform.model.psi.entity.PsiMaterial;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangweiyan
 * @ClassName MesQualityTraceVo
 * @Description TODO
 * @Date 2024/6/3 15:01
 **/
@Data
@ApiModel("质量追踪结果返回实体类")
public class MesQualityTraceVo {

    @ApiModelProperty("流程跟踪")
    private List<List<MesTraceNodeVo>> nodes;

    @ApiModelProperty("明细列表")
    private List<MesTraceDetailVo> details;

    public List<List<MesTraceNodeVo>> getNodes() {
        if (CollUtil.isEmpty(nodes)) {
            nodes=new ArrayList<>();
        }
        return nodes;
    }
}
