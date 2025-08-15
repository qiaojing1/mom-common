package com.lets.platform.model.psi.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 结算方式类型
 */
public enum SettlementMethodTypeEnum implements IEnum<Object> {

    Cash("0", "现金"),
    Cheque("1", "支票"),
    CommercialAcceptanceBill("2", "商业承兑汇票"),
    BankerAcceptance("3", "银行承兑汇票"),
    PromissoryNote("4", "本票"),
    Exchange("5", "汇兑"),
    LetterOfCredit("6", "信用证"),
    DelegatedCollection("7", "委托收款"),
    CollectionCommitment("8", "托收承付"),
    BillsOfExchange("9", "汇票"),
    BankDraft("10", "银行汇票"),
    ElectronicPayment("11", "电子支付"),
    LightTicketCollection("12", "光票托收"),
    DA("13", "承兑交单"),
    ForwardPaymentDoc("14", "远期付款交单"),
    DPAtSight("15", "即期付款交单"),
    Remittance("16", "票汇"),
    CreditCard("17", "信用卡"),
    ;

    private final String value;

    @Getter
    private final String name;

    SettlementMethodTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (SettlementMethodTypeEnum element : values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (SettlementMethodTypeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getValues() {
        List<String> values = new ArrayList<>();
        for (SettlementMethodTypeEnum element : values()) {
            values.add(element.getValue());
        }
        return values;
    }

    @Override
    public String getValue() {
        return value;
    }

    public boolean equals(String value) {
        return this.value.equals(value);
    }
}
