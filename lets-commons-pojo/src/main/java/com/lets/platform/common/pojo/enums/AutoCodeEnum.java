package com.lets.platform.common.pojo.enums;

import lombok.Getter;

/**
 * 自动编码
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/7/12 10:37
 */
@Getter
public enum AutoCodeEnum {

    SYS_USER_LOGIN_ID("5ad84ed4-88b5-4a00-8409-d6e24f4a3c53", "sys_user", "loginId"),
    SUPPLIER_SYS_USER_LOGIN_ID("7e9bdc37-628c-4b9b-9dcd-b06e8fd0c156", "sys_user", "loginId"),
    SUPPLIER_SYS_USER_GROUP("7e9bdc37-628c-4b9b-9dcd-b06e8fd0c156", "sys_user_group", "code"),
    SYS_USER_EMPLOYEE_NUMBER("5ad84ed4-88b5-4a00-8409-d6e24f4a3c53", "sys_user", "employeeNumber"),
    SUPPLIER_SYS_USER_EMPLOYEE_NUMBER("7e9bdc37-628c-4b9b-9dcd-b06e8fd0c156", "sys_user", "employeeNumber"),
    SYS_POST_CODE("713f1319-ead2-44ac-8b40-9cd53a0266f3", "sys_post", "code"),
    SYS_ORG_CODE("cc0b2cdb-3401-4a7a-86d6-9b4b71d22cef", "sys_org", "code"),
    SYS_ROLE_CODE("2a1089cd-a13a-4d4c-9f18-7c1b7b6bd112", "sys_role", "code"),
    SUPPLIER_SYS_ROLE_CODE("1669c0e0-8b3d-45cd-a1e6-d438f51ed3d7", "sys_role", "code"),
    SUPPLIER_SYS_ROLE_GROUP_CODE("1669c0e0-8b3d-45cd-a1e6-d438f51ed3d7", "sys_role_group", "code"),
    SYS_ROLE_GROUP_CODE("2a1089cd-a13a-4d4c-9f18-7c1b7b6bd112", "sys_role_group", "code"),
    COMMON_CURRENCY_CODE("dfc71d87-ad34-4229-91ce-44822f515e5f", "common_currency", "code"),
    COMMON_TAX_CODE("297c570b-4daf-4866-aa93-7f1f2bf71eb6", "common_tax", "code"),
    PSI_UNIT_CODE("83ef2ff5-ec88-45b8-8d0c-2075bb217a98", "psi_unit", "code"),
    PSI_UNIT_GROUP_CODE("83ef2ff5-ec88-45b8-8d0c-2075bb217a98", "psi_unit_group", "code"),
    PSI_LIFE_CYCLE_CODE("68af71b5-0f34-495f-b650-b4e1f54d4276", "psi_life_cycle", "code"),
    COMMON_PRODUCTION_UNIT_CODE("69f17e8b-76b4-412c-99f9-ae4ead46fc80", "common_production_unit", "code"),
    COMMON_USER_DICT_CODE("b84036c6-ef9b-4b2f-b1e1-1e0edcc3b18b", "common_user_dict", "code"),
    COMMON_PROCESS_PARAMS("44d6c4d0-2d35-43f2-be09-5a8cf05589b2", "common_process_parameters", "code"),
    COMMON_HMI_SETTINGS("d6942b91-68f2-4395-b642-b19690206407", "common_hmi_settings", "code"),
    COMMON_PROCESS_FILE("d1d545cd-d570-410f-8145-ec32f46a8d57", "common_process_file", "code"),
    COMMON_USER_DICT_GROUP_CODE("b84036c6-ef9b-4b2f-b1e1-1e0edcc3b18b", "common_user_dict_group", "code"),
    PSI_MATERIAL_SPECIFIC_CODE("988ca1ed-5e09-4ee8-8f2a-5d5cad8d0d5c", "psi_material_specific", "code"),
    PSI_STORAGE_STORE_CODE("5dcf0060-384a-491a-b7c5-0bd6041eda5a", "psi_storage_store", "code"),
    PSI_STORAGE_AREA_CODE("0cbdf837-91b3-4788-9be9-eab8801151e8", "psi_storage_area", "code"),
    PSI_STORAGE_POSITION_CODE("cc2eb0d2-c497-4721-a284-25c8776e440c", "psi_storage_position", "code"),
    PSI_MATERIAL_GROUP_CODE("ade39416-a9c4-4ebd-8d56-871319295106", "psi_material_group", "code"),
    PSI_MATERIAL_CODE("b4845c32-23e5-4995-834e-8bf4c98a3f2d", "psi_material", "code"),
    PSI_MATERIAL_SPECS("b4845c32-23e5-4995-834e-8bf4c98a3f2d", "psi_material", "specs"),
    PSI_MATERIAL_NAME("b4845c32-23e5-4995-834e-8bf4c98a3f2d", "psi_material", "name"),
    PSI_CUSTOM_GROUP_CODE("b074a943-c464-4504-b7b1-73b513137a6c", "psi_custom_group", "code"),
    PSI_CUSTOM_CODE("1f05328a-108a-4033-a9ed-44deaa106b0e", "psi_custom", "code"),
    PSI_SUPPLIER_CODE("a34b6097-4df9-4144-b13a-368d0c0dc663", "psi_supplier", "code"),
    PSI_SUPPLIER_GROUP_CODE("5004d4f9-7328-4c90-9f79-8ff9b636d3eb", "psi_supplier", "code"),
    PSI_ORDER_CATEGORY_CODE("32b1d99c-13f1-4a19-9e77-10ee6ab6f6ee", "psi_order_category", "code"),
    PSI_PURCHASE_ORDER_CODE("b5bf98d7-efe9-4b8d-9d8d-6ac2476c8e63", "psi_purchase_order", "code"),
    PSI_PURCHASE_STOCK_IN_ORDER_CODE("68a287e8-d338-49c0-8e2e-cd4f22ea270e", "psi_purchase_stock_in_order", "code"),
    PSI_PURCHASE_STOCK_IN_ORDER_DETAIL_BATCH_CODE("68a287e8-d338-49c0-8e2e-cd4f22ea270e", "psi_purchase_stock_in_order_detail", "batchNumber"),
    PSI_SALE_ORDER_CODE("321ac6d7-52a0-4429-8029-4bb9706ea332", "psi_sale_order", "code"),
    PSI_SALE_ORDER_TRACK_NO("321ac6d7-52a0-4429-8029-4bb9706ea332", "psi_sale_order_material_track", "trackNo"),
    PSI_SALE_REPLACEMENT_ORDER("520ae0c6-14e4-45d9-95c9-6616edab7a6e", "psi_sale_replacement_order", "code"),
    PSI_SALE_PREDICTION_ORDER_CODE("78ad89fe-f472-469a-a448-e237c9b0184e", "psi_sale_prediction_order", "code"),
    PSI_SALE_PREDICTION_ORDER_TRACK_NO("78ad89fe-f472-469a-a448-e237c9b0184e", "psi_sale_prediction_order_detail_track", "track_no"),
    PSI_PURCHASE_RETURN_STOCK_IN_ORDER_CODE("7c1c8ac7-a610-4013-b3b8-45079e1cfad3", "psi_purchase_return_stock_in_order", "code"),
    PSI_PURCHASE_AP_DOC_RED("7199727d-957c-4df7-b400-4c57d1d100ab", "psi_purchase_ap_doc_red", "code"),
    PSI_PURCHASE_AP_DOC("7199727d-957c-4df7-b400-4c57d1d100ab", "psi_purchase_ap_doc", "code"),
    PSI_PURCHASE_RETURN_STOCK_IN_ORDER_DETAIL_BATCH_CODE("7c1c8ac7-a610-4013-b3b8-45079e1cfad3", "psi_purchase_return_stock_in_order_detail", "batchNumber"),
    PSI_UNPLANNED_STOCK_IN_CODE("f19106e7-b98a-40d1-a49d-bedf1ad092dd", "psi_unplanned_stock_in_order", "code"),
    PSI_UNPLANNED_STOCK_OUT_CODE("9bda27ad-75b6-445f-9980-ff74cd9eca1c", "psi_unplanned_stock_out_order", "code"),
    INVENTORY_CHECK_CODE("64a39ab6-aada-4a2c-a17a-bee67227a7e4", "psi_inventory_check_order", "code"),
    PSI_WIP_COMPLETION_CODE("6bcc2b52-1789-4f36-af97-5bb5a5cc36ea", "psi_wip_completion_stock_in_order", "code"),
    PSI_SALE_PRICE_SETTING_CODE("972d59f3-0d92-47f9-9070-949e952686a6", "psi_sale_price_setting", "code"),
    PSI_TRANSFER_ORDER_CODE("5c80ac30-f42e-48a3-8937-a66307c5f939", "psi_transfer_order", "code"),
    PSI_STEP_TRANSFER_ORDER_CODE("a36145b1-f085-4b1a-9567-90d2cac5fc01", "psi_step_transfer_order", "code"),
    PSI_STEP_TRANSFER_IN_ORDER_CODE("48d580a0-65ae-4d11-9b83-c7274c6e9e8d", "psi_step_transfer_in_order", "code"),
    PSI_CONTRACT_ORDER_CODE("e547f7f0-1fd2-4dcf-a7d3-cd63497d5a0c", "psi_contract_order", "code"),
    PSI_SALE_STOCK_ORDER_CODE("4c4c22e2-3482-45b3-88d5-7d9ddd277510", "psi_sale_stock_out_order", "code"),
    PSI_SALE_INVOICE("8b89026a-b604-4aed-b97a-26c881e0bb37", "psi_sale_invoice_registration", "code"),
    PSI_PURCHASE_PRICE_SETTING_CODE("972d59f3-0d92-47f9-9070-949e952686a6", "psi_pruchase_price_setting", "code"),
    PSI_PURCHASE_INQUIRY("c047fa69-2554-4883-8a53-dd2f7fd6d1ed", "psi_purchase_inquiry", "code"),
    MES_INSPECTION_VALUES("0e71f510-65f9-4a7d-a496-0a2f645e4da3", "mes_inspection_values", "code"),
    MES_SHIFT_SYSTEM("b559072b-384d-4462-b266-6a7b95e43f51", "mes_shift_system", "code"),
    /**
     * 盘盈入库
     */
    PSI_INVENTORY_STOCK_IN_ORDER("56c14ab0-ccb3-49eb-885d-c0a6a62173a7", "psi_inventory_stock_in_order", "code"),
    /**
     * 盘亏出库
     */
    PSI_INVENTORY_STOCK_OUT_ORDER("58bbf88f-0cef-44d3-9baa-df45f559e83e", "psi_inventory_stock_out_order", "code"),
    COMMON_DEVICE_MANUFACTURER("17f6ad41-3b95-4e4a-9d9b-eb651e784dc7", "common_device_manufacturer", "code"),
    COMMON_DEVICE_SUPPLIER("493a9fa5-0e7b-4027-b235-4d70c8e43826", "common_device_supplier", "code"),
    COMMON_PROCESS("2a52335f-506f-48b9-8a4a-3de59edca52c", "common_process", "code"),
    COMMON_PROCESS_GROUP("8f3af0f2-fe44-4c1d-a9a9-9ca3a2905f3a", "common_process_group", "code"),
    MES_BOM("a3e554f0-0d59-4a68-ade8-40fb12ae1b2b", "mes_bom", "code"),
    BOM_DETAIL_VERSION("a3e554f0-0d59-4a68-ade8-40fb12ae1b2b", "mes_bom_detail", "bomVersion"),
    MES_PRODUCE_ORDER("9b8b834e-63c4-42e4-a9c0-e8640db9bcfb", "mes_produce_order", "code"),
    MES_PRODUCE_ORDER_CHANGE("3b8aed3d-39f3-4d7f-aef5-63079243ae4b", "mes_produce_order_change", "code"),
    MES_PRODUCE_PICKING_APPLY("17605773-db98-41e1-b7d0-4a4e9a434dbb", "mes_produce_picking_apply", "code"),
    MES_PRODUCE_PICKING("91979f44-7b5f-41aa-a9e9-c431c336608e", "mes_produce_picking", "code"),
    MES_PRODUCE_RETURN("2c121d49-a229-4304-9765-eadcb75efc12", "mes_produce_return", "code"),
    MES_PROCESS_PLAN("7377bcb5-e6e0-4d2b-93f2-c4019d284357", "mes_process_plan", "code"),
    MES_PROCESS_TRANSFER("8aa4949e-df66-461d-816e-2e581e1bdf15", "mes_process_transfer", "code"),
    MES_PROCESS_REPORT("3b329dac-a729-4935-a73e-927ddc47590b", "mes_process_report", "code"),
    MES_PRODUCE_REPORT_ORDER("f6fa059b-4630-4483-9760-9050579f9bdb", "mes_produce_report_order", "code"),
    // 工序委外发出单
    MES_PROCESS_OUTSOURCING_OUT("e21d20f3-74a3-48d5-a283-b5af851e24fb", "mes_process_outsourcing_out", "code"),
    // 工序委外接收单
    MES_PROCESS_OUTSOURCING_IN("b55bd30c-b1d5-4ff9-82b0-94f038b4fc27", "mes_process_outsourcing_in", "code"),
    // 工序委外结算单
    MES_PROCESS_OUTSOURCING_SETTLEMENT("07e28baa-9992-47aa-ac08-b7b0b20d8e53", "mes_process_outsourcing_settlement", "code"),
    MES_PROCESS_OUTSOURCING_OUT_BATCH("85801f5c-801c-4665-ad4f-bb120b429773", "mes_process_outsourcing_batch_1", "code"),
    MES_PROCESS_OUTSOURCING_IN_BATCH("0b4dbd1c-f128-465c-825f-8fc5454f872a", "mes_process_outsourcing_batch_2", "code"),
    // 生产正向追溯
    MES_PRODUCE_FORWARD_TRACING("9cb13525-2ea1-4904-bdc6-6dfbdc0b9b8c", "", ""),
    // 单件产品平衡率
    MES_SINGLE_BALANCE_RATING("aff44e7b-db59-11ee-a53e-0242ac1c0002", "", ""),
    MES_INSPECTION_ITEMS("a810c8a3-421f-4772-813d-96c6a26da9f3", "mes_inspection_items", "code"),
    // 检验单管理
    MES_INSPECTION_ORDER("2f7bd5e4-ddd5-4a5d-9c48-1f36d8b6e971", "mes_inspection_order", "code"),
    // 生产用料清单管理
    MES_PRODUCE_MATERIAL_BILL_ORDER("140e760c-ff45-49e8-aa17-cf1168664f1c", "mes_produce_material_bill_order", "code"),

    COMMON_ROUTE("37952675-7380-47fb-bd58-99edba986bb0", "common_route", "code"),
    COMMON_ROUTE_NAME("37952675-7380-47fb-bd58-99edba986bb0", "common_route", "name"),
    COMMON_ROUTE_GROUP("910c73c4-5d7f-4396-97e2-97c39a4e36aa", "common_route_group", "code"),
    PSI_SALE_QUOTATION("c6e36fe9-8aa2-4505-a7d0-9bee50643a48", "psi_sale_quotation_order", "code"),
    PSI_PURCHASE_PRICE_LIST("a5df4eb1-7c62-4615-a25a-cc098f3c025a", "psi_purchase_price_list", "code"),
    PSI_OUTSOURCING_PRICE_LIST("8ad85db3-47a3-4d62-8085-74ee27e34958", "psi_outsourcing_price_list", "code"),
    PSI_SALE_PRICE_LIST("50f3705d-4d13-4fe4-bae7-f33e5e9389a5", "psi_sale_price_list", "code"),
    PSI_PURCHASE_APPLY_ORDER("f298957b-4c45-4942-bc85-e48ec5326e8c", "psi_purchase_apply_order", "code"),
    PSI_SALE_RETURN_APPLICATION_ORDER("41451fa5-8777-4eec-a361-693f5920d51f", "psi_sale_return_application_order", "code"),
    PSI_SALE_RETURN_ORDER("7c2c1663-f9bb-4c8f-a7e8-38ace9259844", "psi_sale_return_order", "code"),
    PSI_PRODUCE_PLAN("94069830-fa36-4f61-92f2-9dddca198d91", "psi_produce_plan", "code"),
    DEFECT_CAUSE("6bc84129-60d3-4363-9157-8cf3521834a6", "mes_defect_cause", "code"),
    PLAN_CALCULATION_TASK("d60a249c-b979-4aaa-a236-c93ba9363b95", "psi_plan_calculation_task", "code"),
    DISPATCH_ORDER("09675237-5773-4c3b-905d-aaa88d444e15", "mes_dispatch_detail", "code"),
    BAT_DISPATCH("cd3a19c4-0772-45c7-9b43-5b92303276d5", "mes_process_plan", ""),
    DETECT_REPORT("364d5d6e-f8b7-44ad-b940-27c101dc7f8c", "collection_detect_report", "code"),
    MATERIAL_SOURCE_INSPECTION_STANDARD_CONFIG("a06cc410-857e-4120-8504-0f5f30afe4ec", "material_source_inspection_standard_config", "code"),
    COMMON_METER("2a6844dc-ed11-439c-ac98-a4b3062ec3db", "common_meter", "code"),
    PROGRAM_FILE("8b49d3f3-72a4-4cce-ab29-7f390a223f05", "mes_dnc_program_file", "code"),
    PSI_SUPPLIER_RECOMMEND_PLAN("1516af7b-b08a-4351-9ad5-57dd970aa385", "psi_supplier_recommend_plan", "code"),
    PSI_DELIVERY_NOTIFY_ORDER("bc6aa90b-c867-4172-bebf-365ced6c65b8", "psi_delivery_notify_order", "code"),
    PSI_CONTAINER("6bf0e04d-ddaa-4f05-9d97-5c79dbc538bd", "psi_container", "code"),
    PSI_CONTAINER_CODE("ffd3b70d-c88c-4262-89ca-d288449a4f26", "psi_container_code", "code"),
    PSI_PURCHASE_DELIVERY_ORDER("fd24c8ca-907e-47de-9971-c1f4f6bb1662", "psi_purchase_delivery_order", "code"),
    CUSTOMER_FOLLOW_UP("1d8e1308-8099-4d32-932e-2d0cfea7e924", "psi_customer_follow_up", "code"),
    BUSINESS_OPPORTUNITY("6abd634a-8b90-4439-a647-35f183dd7559", "psi_business_opportunity", "code"),
    MRP_PLAN_CODE("3ba58b0f-4dcb-49c6-8fbf-1f0f03e57563", "psi_mrp_plan", "code"),
    MPS_PLAN_CODE("5de3b9e6-c77f-49ae-992e-274775b3b504", "psi_mps_plan", "code"),
    MRP_PLAN_TRACK_NO("e70bd464-d7a0-4ba9-999e-b451f55817f1", "psi_mrp_plan", "trackNo"),
    INSPECT_ORDER("2f7bd5e4-ddd5-4a5d-9c48-1f36d8b6e971", "mes_inspection_order", "code"),
    MATERIAL_APPLY("10053974-bf76-4f77-b0a1-b187a699588d", "psi_material_apply", "code"),
    MES_QUALITY_TRACE("", "mes_quality_trace", "code"),
    MES_KITTING_ANALYSIS_RESULT("535c691e-5fca-417c-83b8-3946f15f91bd", "mes_kitting_analysis_result", "code"),
    PSI_CUSTOMER_MATERIAL("f8c118df-7b2a-409c-9abe-ea96a073e857", "psi_customer_material", "code"),
    PSI_CUSTOMER_MATERIAL_NAME("f8c118df-7b2a-409c-9abe-ea96a073e857", "psi_customer_material", "name"),
    MES_INSPECTION_APPLY_ORDER("b5e39ea9-20cb-4076-8f83-30e69dd74cea", "mes_inspection_application_order", "code"),
    MES_NAMEPLATE_HOUR("2fd09959-6f61-45fd-8821-e3cc4527c104", "mes_nameplate_hour", "code"),
    MES_NAMEPLATE_HOUR_DEVICE("2fd09959-6f61-45fd-8821-e3cc4527c104", "mes_nameplate_hour_device", "code"),
    MES_NAMEPLATE_HOUR_PROCESS("2fd09959-6f61-45fd-8821-e3cc4527c104", "mes_nameplate_hour_process", "code"),
    MES_NON_PROJECT_HOUR("cdf3b05f-c493-4ad7-8829-f5275e197b68", "mes_non_project_hour", "code"),
    MES_NON_PROJECT_HOUR_GROUP("cdf3b05f-c493-4ad7-8829-f5275e197b68", "mes_non_project_hour_group", "code"),
    MES_NON_PROJECT_HOUR_TASK("cdf3b05f-c493-4ad7-8829-f5275e197b68", "mes_non_project_hour_task", "code"),
    PACKAGE_ORDER("f7918272-b96e-4c7c-a99f-b36e361c7444", "psi_package_order", "code"),
    SHIP_ORDER("2a2c1c4d-1a81-4e72-8a83-09fd41bfe018", "psi_ship_order", "code"),
    ARCHIVING_PLAN("f07b189b-3814-4eda-a92a-a09f37fd7386", "mes_archiving_plan", "code"),
    TEST_SYNOPSIS("b6c5ee18-09bb-4533-940c-18336e6cdaf6", "collection_test_synopsis", "version"),
    TPM_INSPECTION_ITEMS_ORDER("d3c95660-e441-45d4-8390-147b06aebe6a", "tpm_inspection_items_order", "code"),
    TPM_INSPECTION_PROJECT_ORDER("61b16cc2-0596-4cb5-b8a6-d77fc7d7bf02", "tpm_inspection_project_order", "code"),
    TPM_MAINTENANCE_ITEMS_ORDER("b8fcb0ab-52a4-4314-bfb8-fa80ad7356c9", "tpm_maintenance_items_order", "code"),
    PURCHASE_AP_DOC("7199727d-957c-4df7-b400-4c57d1d100ab", "psi_purchase_ap_doc", "code"),
    SALE_AR_DOC("612b746b-770c-453b-b644-4add56ef3d40", "psi_sale_ar_doc", "code"),
    SALE_AR_DOC_RED("612b746b-770c-453b-b644-4add56ef3d40", "psi_sale_ar_doc_red", "code"),
    COLL_ALARM_CLASSIFY("f3d7c9ec-394d-41a1-9517-39fdd61b9884", "coll_alarm_classify", "code"),

    TPM_CALL_REPAIR_ORDER("9cd83409-e4a5-4f2e-ae82-975f12f0884f", "tpm_call_repair_order", "code"),
    TPM_REPAIR_ORDER("7427965b-ddbb-419b-8be7-e8173faae0e8", "tpm_repair_order", "code"),
    TPM_OUTSOURCING_REPAIR_ORDER("7afe60b7-e5e8-44d0-bc8a-f8b2788010f9", "tpm_outsourcing_repair_order", "code"),
    TPM_REPEAT_INSPECT_ORDER("ccd49ef3-b48d-4bf6-a757-3ee55abf491d", "tpm_repeat_inspect_order", "code"),
    // 备件领用分析报表(没有自动编码，只使用菜单编码)
    TPM_SPARE_PARTS_REPORT_ANALYSIS("2fea7acc-d152-4d2f-a8eb-1f65994b9b6c", "", "code"),
    PSI_STOCK_TRANSFER_ORDER("6720e9c5-0c5e-4fbb-82a3-9d18f61d09e5", "psi_stock_transfer_order", "code"),
    // 备件领用分析报表(没有自动编码，只使用菜单编码)
    TPM_MAIN_REPORT_ANALYSIS("dbb33316-6d9f-42fc-be30-c6ba7b2d27a3", "", "code"),
    PSI_KITTING_ANALYSIS_RESULT("0fb58c69-236d-4be5-b45e-f7edfe1a2e5a", "psi_kitting_analysis_result", "code"),
    PSI_SOURCE_LIST("ba747151-df82-4c75-a60b-c6812b00086f", "psi_source_list", "code"),
    COOPERATE_QUOTE_ORDER("ed2483b4-5ff2-4bb6-9239-b857a5380ba1", "psi_cooperate_quote_order", "code"),
    QUANTITY_CERTIFICATION("83903df3-39b3-4ec1-8bdd-d2949bdce70c", "collection_quality_certification", "code"),
    PSI_COOPERATE_DELIVER_ORDER("8a985e0c-8058-45c7-941b-8ed5e9e52137", "psi_cooperate_deliver_order", "code"),
    PSI_ACCOUNT_TERM("4b595684-3894-4811-ac46-86e2cad99a6f", "psi_account_term", "name"),
    PAINTING_PLAN("28e16b93-21f4-47c8-8263-fc384dc6c4b1", "mes_painting_plan", "code"),
    ;

    private final String menuCode;

    private final String tableName;

    private final String field;

    AutoCodeEnum(String menuCode, String tableName, String field) {
        this.menuCode = menuCode;
        this.tableName = tableName;
        this.field = field;
    }

}
