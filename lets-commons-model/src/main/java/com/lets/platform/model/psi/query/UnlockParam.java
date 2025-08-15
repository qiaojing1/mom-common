package com.lets.platform.model.psi.query;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.model.psi.entity.PsiReservationRelationship;
import lombok.Data;

import java.util.Optional;

/**
 * 预留关系分页查询参数
 *
 * @author fzy
 * @since 2023-04-04
 */
@Data
public class UnlockParam {
    private String materialId;
    private String materialSpecific;
    private String materialSpecificName;
    private String batchNumber;
    private String storeId;
    private String areaId;
    private String positionId;

    public String getKey() {
        return Optional.ofNullable(materialId).orElse(StrUtil.EMPTY)
               + "-"
               + Optional.ofNullable(materialSpecific).orElse(StrUtil.EMPTY)
               + "-"
               + Optional.ofNullable(batchNumber).orElse(StrUtil.EMPTY)
               + "-"
               + Optional.ofNullable(storeId).orElse(StrUtil.EMPTY)
               + "-"
               + Optional.ofNullable(areaId).orElse(StrUtil.EMPTY)
               + "-"
               + Optional.ofNullable(positionId).orElse(StrUtil.EMPTY);
    }

    public static String getKey(PsiReservationRelationship relationship) {
        return Optional.ofNullable(relationship.getMaterialId()).orElse(StrUtil.EMPTY)
               + "-"
               + Optional.ofNullable(relationship.getMaterialSpecific()).orElse(StrUtil.EMPTY)
               + "-"
               + Optional.ofNullable(relationship.getBatchNumber()).orElse(StrUtil.EMPTY)
               + "-"
               + Optional.ofNullable(relationship.getStoreId()).orElse(StrUtil.EMPTY)
               + "-"
               + Optional.ofNullable(relationship.getAreaId()).orElse(StrUtil.EMPTY)
               + "-"
               + Optional.ofNullable(relationship.getPositionId()).orElse(StrUtil.EMPTY);
    }
}
