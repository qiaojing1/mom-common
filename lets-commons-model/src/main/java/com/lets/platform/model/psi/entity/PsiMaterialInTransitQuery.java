package com.lets.platform.model.psi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Collection;

/**
 * 查询物料库存
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PsiMaterialInTransitQuery {
    private Collection<String> materialIds;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}
