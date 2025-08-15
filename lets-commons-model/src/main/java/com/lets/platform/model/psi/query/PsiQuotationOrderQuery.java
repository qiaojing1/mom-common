package com.lets.platform.model.psi.query;

import lombok.Data;

import java.util.List;

/**
 * @author zhangweiyan
 * @ClassName PsiQuotationOrderQuery
 * @Description TODO
 * @Date 2024/7/11 19:05
 **/
@Data
public class PsiQuotationOrderQuery {
    private List<String> materialIds;
    private String orderCustomerDefaultTaxId;

    private String orderCustomerId;
}
