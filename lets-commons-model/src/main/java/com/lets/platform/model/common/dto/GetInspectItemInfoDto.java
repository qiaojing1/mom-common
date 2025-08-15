/*
 * csy
 */

package com.lets.platform.model.common.dto;

import com.lets.platform.model.common.vo.MaterialSpecific;
import com.lets.platform.model.psi.entity.PsiMaterial;
import lombok.Data;

import java.util.List;

/**
 * @ClassName ExtractOrderInfoDto
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2025/6/9
 */
@Data
public class GetInspectItemInfoDto {
    private String materialId;

    private PsiMaterial material;
    //特征属性
    private List<MaterialSpecific> specifics;
}
