package com.lets.platform.common.pojo.enums;

/**
 * 处理状态枚举类
 *
 * @Author DING WEI
 * @Date 2021/04/23 13:50
 * @Version 1.0
 **/
public enum FiledNameEnums implements EnumUnit<FiledNameEnums> {

    CURRENCY( "","currencyExportName"),
    CURRENCY_NAME( "","currencyNameExport"),
    CURRENCY_CODE( "","currencyCodeExport"),
    CURRENCY_UNIT( "","currencyUnitExport"),
    PRICE_DECIMAL_NUM( "","priceDecimalNumExport"),
    AMOUNT_DECIMAL_NUM( "","amountDecimalNumExport"),
    EXCHANGE_RATE_DECIMAL_NUM( "","exchangeRateDecimalNumExport"),
    COST_PRICE_DECIMAL_NUM( "","costPriceDecimalNumExport"),
    COST_AMOUNT_DECIMAL_NUM( "","costAmountDecimalNumExport"),
    DICT("","dictExportName"),
    DICT_NAME("","dictName"),
    DICT_CODE("","dictCode"),
    DICT_REMARK("","dictRemark"),
    DICT_DEFAULT_SELECTED("","dictDefaultSelected"),
    DICT_ENABLE("","dictEnable"),
    OPERATION_LOG("","operationLog"),
    PROCESS_DEFINITION("","processDefinition"),
    PROCESS_CODE_RULE("","processCodeRule"),
    PROCESS_NAME_RULE("","processNameRule"),
    PREPARATION_TIME_RULE("","preparationTimeRule"),
    STANDARD_TIME_RULE("","standardTimeRule"),
    REPORT_TYPE_RULE("","reportTypeRule"),
    CHECK_STANDARD_CODE_RULE("","checkStandardCodeRule"),
    PROCESS_MANAGE("","processManage"),
    RELATION_DEVICE("","relationDevice"),
    KBDATA("","kbDataExportName"),
    TAX("","taxExportName"),
    TAX_NAME_RULE("","taxNameRule"),
    TAX_CODE_RULE("","taxCodeRule"),
    TAX_TYPE_RULE("","taxTypeRule"),
    TAX_RATE_RULE("","taxRateRule"),
    PRICE_CONTAIN_TAX("","priceContainTax"),
    TAX_STATUS_RULE("","taxStatusRule"),
    FACTORY_MODELING("","factoryModeling"),
    FACTORY_MODEL_NAME("","factoryModelName"),
    FACTORY_MODEL_CODE("","factoryModelCode"),
    FACTORY_MODEL_TYPE("","factoryModelType"),
    SUPERIOR_MODEL("","superiorModel"),
    FACTORY_MODEL_STATUS("","taxStatusRule"),
    CHARGE_MAN_CODE("","chargeMan"),
    DEVICE_ACCOUNT("","deviceAccount"),
    DEVICE_NAME_IMPORT_RULE("","deviceNameImportRule"),
    DEVICE_CODE_IMPORT_RULE("","deviceCodeImportRule"),
    ASSET_CODE_IMPORT_RULE("","assetCodeImportRule"),
    USER_ORG_IMPORT_RULE("","useOrgImportRule"),
    MAINTAIN_DEP_IMPORT_RULE("","maintainDepImportRule"),
    MAINTAIN_LEVEL_IMPORT_RULE("","maintainLevelImportRule"),
    IOT_STATUS("","iotStatus"),
    DEVICE_GRADE("","deviceGrade"),
    TOLERANCE_IMPORT_RULE("","toleranceImportRule"),
    RATE_IMPORT_RULE("","rateImportRule"),
    ENERGY_SUB_ITEM("","energySubItem"),
    IF_SUMMARY_DEVICE("","isSummaryDevice"),
    METER_RANGE("","meterRange"),
    DIFFERANCES("","differances"),
    ASSET_STATUS_IMPORT_RULE("","assetStatusImportRule"),
    UNIT_CODE("","unitCode"),
    INSTALLATION_LOCATION("","installationLocation"),
    DEVICE_MODEL_IMPORT_RULE("","deviceModelImportRule"),
    DEVICE_TYPE_IMPORT_RULE("","deviceTypeImportRule"),
    CONTROLLER_IMPORT_RULE("","controllerImportRule"),
    PRODUCE_FACTORY_IMPORT_RULE("","produceFactoryImportRule"),
    SUPPLIER_IMPORT_RULE("","supplierImportRule"),
    PURCHASE_DATE("","purchaseDate"),
    PURCHASE_AMOUNT("","purchaseAmount"),
    ENTRY_DATE("","entryDate"),
    WARRANTY_DATE("","warrantyDate"),
    DEVICE_REMARK("","deviceRemark")



    ;
    private String desc;
    private String code;

    private FiledNameEnums(String code ,String desc) {
        this.desc = desc;
        this.code = code;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getDescription() {
        return desc;
    }

}
