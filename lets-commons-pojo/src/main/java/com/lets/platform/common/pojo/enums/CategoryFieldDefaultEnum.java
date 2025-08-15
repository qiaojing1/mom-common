package com.lets.platform.common.pojo.enums;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 单据类别-默认字段
 *
 * @author DING WEI
 * @version 1.0
 * @date 2024/4/23 14:14
 */
@Getter
public enum CategoryFieldDefaultEnum {

    /**
     * 计划外入库
     */
    BJRK_sourceOrderCode("04002", "BJRK", "废料入库", "sourceOrderCode", "", "", "Y"),
    BJRK_sourceOrderType("04002", "BJRK", "废料入库", "sourceOrderType", "", "", "Y"),
    BJRK_sourceLineNumber("04002", "BJRK", "废料入库", "sourceLineNumber", "", "", "Y"),
    /**
     * 生产领料申请
     */
    SLSQ_processNo("320001", "SLSQ", "标准生产领料申请单", "processNo", "", "", "Y"),
    SLSQ_processCode("320001", "SLSQ", "标准生产领料申请单", "processCode", "", "", "Y"),
    SLSQ_processName("320001", "SLSQ", "标准生产领料申请单", "processName", "", "", "Y"),
    /**
     * 进料检验单
     */
    IQC_customerId("24001", "IQC", "客户", "customerId", "", "", "Y"),
    IQC_factoryModeId("24001", "IQC", "生产单元", "factoryModeId", "", "", "Y"),
    IQC_storeId("24001", "IQC", "仓库", "storeId", "", "", "Y"),
    IQC_areaId("24001", "IQC", "库区", "areaId", "", "", "Y"),
    IQC_positionId("24001", "IQC", "库位", "positionId", "", "", "Y"),
    IQC_processCode("24001", "IQC", "工序编码", "processCode", "", "", "Y"),
    IQC_processName("24001", "IQC", "工序名称", "processName", "", "", "Y"),
    /**
     * 自制工序检验单
     */
    IPQC_customerId("24002", "IPQC", "客户", "customerId", "", "", "Y"),
    IPQC_supplySupplierId("24002", "IPQC", "供应商", "supplySupplierId", "", "", "Y"),
    IPQC_storeId("24002", "IPQC", "仓库", "storeId", "", "", "Y"),
    IPQC_areaId("24002", "IPQC", "库区", "areaId", "", "", "Y"),
    IPQC_positionId("24002", "IPQC", "库位", "positionId", "", "", "Y"),
    /**
     * 委外工序检验
     */
    SIPQC_customerId("24003", "SIPQC", "客户", "customerId", "", "", "Y"),
    SIPQC_supplySupplierId("24003", "SIPQC", "供应商", "supplySupplierId", "", "", "Y"),
    SIPQC_storeId("24003", "SIPQC", "仓库", "storeId", "", "", "Y"),
    SIPQC_areaId("24003", "SIPQC", "库区", "areaId", "", "", "Y"),
    SIPQC_positionId("24003", "SIPQC", "库位", "positionId", "", "", "Y"),
    /**
     * 完工检验单
     */
    FQC_customerId("24004", "FQC", "客户", "customerId", "", "", "Y"),
    FQC_factoryModeId("24004", "FQC", "供应商", "supplySupplierId", "", "", "Y"),
    FQC_storeId("24004", "FQC", "仓库", "storeId", "", "", "Y"),
    FQC_areaId("24004", "FQC", "库区", "areaId", "", "", "Y"),
    FQC_positionId("24004", "FQC", "库位", "positionId", "", "", "Y"),
    FQC_processCode("24004", "FQC", "工序编码", "processCode", "", "", "Y"),
    FQC_processName("24004", "FQC", "工序名称", "processName", "", "", "Y"),
    /**
     * 库存检验单
     */
    INQC_customerId("24005", "INQC", "客户", "customerId", "", "", "Y"),
    INQC_supplySupplierId("24005", "INQC", "供应商", "supplySupplierId", "", "", "Y"),
    INQC_factoryModeId("24005", "INQC", "生产单元", "factoryModeId", "", "", "Y"),
    INQC_processCode("24005", "INQC", "工序编码", "processCode", "", "", "Y"),
    INQC_processName("24005", "INQC", "工序名称", "processName", "", "", "Y"),
    /**
     * 发货检验单
     */
    OQC_supplySupplierId("24006", "OQC", "供应商", "supplySupplierId", "", "", "Y"),
    OQC_factoryModeId("24006", "OQC", "生产单元", "factoryModeId", "", "", "Y"),
    OQC_processCode("24006", "OQC", "工序编码", "processCode", "", "", "Y"),
    OQC_processName("24006", "OQC", "工序名称", "processName", "", "", "Y"),
    /**
     * 退货检验单
     */
    RQC_supplySupplierId("24007", "RQC", "供应商", "supplySupplierId", "", "", "Y"),
    //RQC_storeId("24007", "RQC", "仓库", "storeId", "", "", "Y"),
    //RQC_areaId("24007", "RQC", "库区", "areaId", "", "", "Y"),
    //RQC_positionId("24007", "RQC", "库位", "positionId", "", "", "Y"),
    RQC_factoryModeId("24007", "RQC", "生产单元", "factoryModeId", "", "", "Y"),
    RQC_processCode("24007", "RQC", "工序编码", "processCode", "", "", "Y"),
    RQC_processName("24007", "RQC", "工序名称", "processName", "", "", "Y"),
    /**
     * 生产退料检验单
     */
    PRQC_customerId("24008", "PRQC", "客户", "customerId", "", "", "Y"),
    PRQC_factoryModeId("24008", "PRQC", "供应商", "supplySupplierId", "", "", "Y"),
    PRQC_storeId("24008", "PRQC", "仓库", "storeId", "", "", "Y"),
    PRQC_areaId("24008", "PRQC", "库区", "areaId", "", "", "Y"),
    PRQC_positionId("24008", "PRQC", "库位", "positionId", "", "", "Y"),
    PRQC_processCode("24008", "PRQC", "工序编码", "processCode", "", "", "Y"),
    PRQC_processName("24008", "PRQC", "工序名称", "processName", "", "", "Y"),
    /**
     * 委外退料检验单
     */
    SPRQC_customerId("24009", "SPRQC", "客户", "customerId", "", "", "Y"),
    SPRQC_factoryModeId("24009", "SPRQC", "供应商", "supplySupplierId", "", "", "Y"),
    SPRQC_storeId("24009", "SPRQC", "仓库", "storeId", "", "", "Y"),
    SPRQC_areaId("24009", "SPRQC", "库区", "areaId", "", "", "Y"),
    SPRQC_positionId("24009", "SPRQC", "库位", "positionId", "", "", "Y"),
    SPRQC_processCode("24009", "SPRQC", "工序编码", "processCode", "", "", "Y"),
    SPRQC_processName("24009", "SPRQC", "工序名称", "processName", "", "", "Y"),
    /**
     * 生产巡检单
     */
    SCXJ_customerId("24010", "SCXJ", "客户", "customerId", "", "", "Y"),
    SCXJ_supplySupplierId("24010", "SCXJ", "供应商", "supplySupplierId", "", "", "Y"),
    SCXJ_storeId("24010", "SCXJ", "仓库", "storeId", "", "", "Y"),
    SCXJ_areaId("24010", "SCXJ", "库区", "areaId", "", "", "Y"),
    SCXJ_positionId("24010", "SCXJ", "库位", "positionId", "", "", "Y"),
    /**
     * 其他检验单
     */
    QTJY_customerId("24011", "QTJY", "客户", "customerId", "", "", "Y"),
    QTJY_factoryModeId("24011", "QTJY", "生产单元", "factoryModeId", "", "", "Y"),
    QTJY_supplySupplierId("24011", "QTJY", "供应商", "supplySupplierId", "", "", "Y"),
    QTJY_processCode("24011", "QTJY", "工序编码", "processCode", "", "", "Y"),
    QTJY_processName("24011", "QTJY", "工序名称", "processName", "", "", "Y"),
    /**
     * 首件检验单
     */
    FAIQC_customerId("24012", "FAIQC", "客户", "customerId", "", "", "Y"),
    FAIQC_factoryModeId("24012", "FAIQC", "供应商", "supplySupplierId", "", "", "Y"),
    FAIQC_storeId("24012", "FAIQC", "仓库", "storeId", "", "", "Y"),
    FAIQC_areaId("24012", "FAIQC", "库区", "areaId", "", "", "Y"),
    FAIQC_positionId("24012", "FAIQC", "库位", "positionId", "", "", "Y"),
    FAIQC_processCode("24012", "FAIQC", "工序编码", "processCode", "", "", "Y"),
    FAIQC_processName("24012", "FAIQC", "工序名称", "processName", "", "", "Y"),
    ;


    private String no;
    private String code;
    private String name;
    private String field;
    private String isNotNull;
    private String isReadOnly;
    private String isHide;

    CategoryFieldDefaultEnum() {
    }

    CategoryFieldDefaultEnum(String no, String code, String name) {
        this.no = no;
        this.code = code;
        this.name = name;
    }

    CategoryFieldDefaultEnum(String no, String code, String name, String field, String isNotNull, String isReadOnly, String isHide) {
        this.no = no;
        this.code = code;
        this.name = name;
        this.field = field;
        this.isNotNull = isNotNull;
        this.isReadOnly = isReadOnly;
        this.isHide = isHide;
    }

    CategoryFieldDefaultEnum(String no, String code, String field, String isNotNull, String isReadOnly, String isHide) {
        this.no = no;
        this.code = code;
        this.field = field;
        this.isNotNull = isNotNull;
        this.isReadOnly = isReadOnly;
        this.isHide = isHide;
    }

    public static Map<String, CategoryFieldDefaultEnum> getEnumMapByCode(String code) {
        Map<String, CategoryFieldDefaultEnum> result = new HashMap<>();
        if (StringUtils.isBlank(code)) {
            return null;
        }
        for (CategoryFieldDefaultEnum value : values()) {
            if (code.equals(value.getCode())) {
                result.put(value.getField(), value);
            }
        }
        return result;
    }

}
