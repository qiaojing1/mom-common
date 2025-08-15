package com.lets.platform.model.mes.vo;

import com.lets.platform.model.mes.entity.MesBomTree;
import com.lets.platform.model.psi.vo.BomMaterialQueryParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * CAD提取结果-展示对象
 * @author: DING WEI
 * @date: 2025/4/11 17:00
 */
@Data
@ApiModel("CAD提取结果-展示对象")
public class CadExtractVo {

    @ApiModelProperty("BOM数据")
    private List<MesBomTree> treeList;

    @ApiModelProperty("物料提取-查询条件")
    private BomMaterialQueryParam queryParam;

    @ApiModelProperty("保存到BOM分组主键")
    private String groupId;

}
