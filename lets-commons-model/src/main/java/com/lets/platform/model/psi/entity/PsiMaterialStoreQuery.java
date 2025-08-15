package com.lets.platform.model.psi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

/**
 * 查询物料库存
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PsiMaterialStoreQuery {
    private Collection<String> materialIds;
    private Collection<String> storeIds;
}
