package com.lets.platform.model.mes.vo;

import cn.hutool.core.collection.CollUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.psi.entity.PsiOrderTrack;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangweiyan
 * @ClassName MesTraceNodeVo
 * @Description TODO
 * @Date 2024/6/3 15:05
 **/
@ApiModel("流程追踪节点")
@Data
public class MesTraceNodeVo {
    @ApiModelProperty("当前节点id")
    private String nodeId;

    @ApiModelProperty("当前节点名称")
    private String nodeName;

    @ApiModelProperty("父节点id")
    private String parentNodeId;

    private String menuCode;

    private String orderCode;

    private String orderCategoryName;
    private String orderCategoryCode;

    private String materialId;

    @ApiModelProperty("归属于当前节点的单据编码")
    private List<String> belongCurrentNodeOrderCodes;

    private List<MesTraceNodeVo> child;

    private String sourceOrderDetailId;
    private String orderId;
    private String detailId;

    @ApiModelProperty("代表是否被选中的单据,Y是N否")
    private String isChosen;

    @ApiModelProperty("单据日期")
    private String orderTime;

    public MesTraceNodeVo(String nodeName, ArrayList<String> strings) {
        this.nodeName = nodeName;
        this.belongCurrentNodeOrderCodes = strings;
    }

    public MesTraceNodeVo() {
    }

    public String getNodeId() {
        return StringUtils.isBlank(nodeId) ? "" : nodeId;
    }

    public String getParentNodeId() {
        return StringUtils.isBlank(parentNodeId) ? "" : parentNodeId;
    }
}
