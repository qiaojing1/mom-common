package com.lets.platform.common.pojo.enums;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 单据类别-编码
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/7/12 10:37
 */
@Getter
public enum OrderCategoryCodeEnum {

    BZCG("01001", "BZCG", "标准采购订单", "68a287e8-d338-49c0-8e2e-cd4f22ea270e"),
    SHCG("01002", "SHCG", "标准采购订单(收货)", "fd24c8ca-907e-47de-9971-c1f4f6bb1662"),
    FWCG("01003", "FWCG", "服务采购订单"),
    ZCCG("01004", "ZCCG", "资产采购订单"),
    FYCG("01005", "FYCG", "费用采购订单"),
    WWCG("01006", "WWCG", "委外采购订单"),

    BZDD("00001", "BZDD", "标准销售订单", "bc6aa90b-c867-4172-bebf-365ced6c65b8"),
    CHDD("00002", "CHDD", "存货销售订单"),
    JSDD("00003", "JSDD", "寄售销售订单", "5c80ac30-f42e-48a3-8937-a66307c5f939"),
    QSDD("00004", "QSDD", "签收销售订单"),
    FWDD("00005", "FWDD", "服务销售订单"),
    BZTZ("02001", "BZTZ", "标准销售出货通知单", ""),
    JSTZ("02002", "JSTZ", "寄售销售出库通知单"),
    QSTZ("02003", "QSTZ", "签收销售出库通知单"),
    BZRK("03001", "BZRK", "标准采购入库单"),
    SHRK("03002", "SHRK", "标准采购入库单(收货)"),
    FYRK("03003", "FYRK", "费用采购入库单"),
    ZCRK("03004", "ZCRK", "资产采购入库单"),
    WWRK("03005", "WWRK", "委外采购入库单"),

    /**
     * 计划外入库
     */
    BJRK("04002", "BJRK", "计划外入库单"),
    FLRK("04003", "FLRK", "废料入库"),

    BZCGTHD("05001", "BZCGTHD", "标准采购退货单"),
    ZCCGTHD("05002", "ZCCGTHD", "资产采购退货单"),
    FYCGTHD("05003", "FYCGTHD", "费用采购退货单"),
    WWCGTHD("05004", "WWCGTHD", "委外采购退货单"),

    JHWCK("06001", "BJCK", "计划外出库单"),
    BWRK("07001", "BWRK", "标准完工入库单"),
    HBRK("07002", "HBRK", "汇报入库单"),
    BZPY("08001", "BZPY", "标准盘盈入库单"),
    BZPK("09001", "BZPK", "标准盘亏出库单"),
    /**
     * 销售报价单
     */
    BZBJ("10001", "BZBJ", "标准销售报价单"),
    FWBJ("10002", "FWBJ", "服务销售报价单"),
    /**
     * 采购申请单
     */
    BCSQ("11001", "BCSQ", "标准采购申请单"),
    FCSQ("11002", "FCSQ", "服务采购申请单"),
    ZCSQ("11003", "ZCSQ", "资产采购申请单"),
    FYSQ("11004", "FYSQ", "费用采购申请单"),
    /**
     * 采购询价单
     */
    BZXJ("111001", "BZXJ", "标准采购询价单"),
    ZCXJ("111002", "ZCXJ", "资产采购询价单"),
    FYXJ("111003", "FYXJ", "费用采购询价单"),
    /**
     * 销售退货申请单
     */
    BZTS("12001", "BZTS", "标准销售退货申请单"),
    QSTS("12002", "QSTS", "签收销售退货申请单"),
    JSTS("12003", "JSTS", "寄售销售退货申请单"),
    /**
     * 销售退货单
     */
    BZXT("13001", "BZXT", "标准销售退货单"),
    QSXT("13002", "QSXT", "签收销售退货单"),
    JSXT("13003", "JSXT", "寄售销售退货单"),
    /**
     * 采购退货申请单
     */
    WWCS("14001", "WWCS", "委外采购退货申请单"),
    BZCS("14002", "BZCS", "标准采购退货申请单"),
    ZCCS("14003", "ZCCS", "资产采购退货申请单"),
    FYCS("14004", "FYCS", "费用采购退货申请单"),
    WCCS("14005", "WCCS", "委外采购退货申请单"),
    /**
     * 生产工单
     */
    BZGD("15001", "BZGD", "标准生产工单"),
    CGGD("15002", "CGGD", "重工生产工单"),
    YFGD("15003", "YFGD", "研发生产工单"),
    CJGD("15004", "CJGD", "拆件生产工单"),
    WWGD("15005", "WWGD", "委外生产工单"),
    /**
     * 生产变更单
     */
    BZSCBGD("16001", "BZSCBGD", "标准生产变更单"),
    /**
     * 生产领料单
     */
    BZLL("17001", "BZLL", "标准领料单"),
    DCLL("17002", "DCLL", "倒冲领料单"),
    WWLL("17004", "WWLL", "委外领料单"),
    WXLL("17005", "WXLL", "维修领料单"),
    /**
     * 计划单
     */
    CGJH("18001", "CGJH", "采购计划"),
    SCJH("18002", "SCJH", "生产计划"),
    GXJH("", "GXJH", "工序计划"),
    /**
     * 报工单
     */
    SCBG("19001", "SCBG", "生产报工单"),
    RKBG("19002", "RKBG", "入库报工单"),
    /**
     * 生产退料单
     */
    BZTL("20001", "BZTL", "标准退料单"),
    WWTL("20002", "WWTL", "委外退料单"),
    WXTL("20003", "WXTL", "维修退料单"),
    /**
     * 汇报单
     */
    GXHB("21001", "GXHB", "标准工序汇报单"),
    /**
     * 转移单
     */
    GXZY("22001", "GXZY", "标准工序转移单"),
    HCZY("22002", "HCZY", "回冲工序转移单"),
    /**
     * 生产用料清单
     */
    BZYLQD("31001", "BZYLQD", "标准用料清单"),
    WWYLQD("31002", "WWYLQD", "委外用料清单"),
    /**
     * 检验申请单
     */
    KQSQ("23001", "KQSQ", "库存检验申请单"),
    PRSQ("23002", "PRSQ", "生产退料检验申请单"),
    /**
     * 质检
     */
    IQC("24001", "IQC", "进料检验单"),
    IPQC("24002", "IPQC", "自制工序检验单"),
    SIPQC("24003", "SIPQC", "委外工序检验"),
    FQC("24004", "FQC", "完工检验单"),
    INQC("24005", "INQC", "库存检验单"),
    OQC("24006", "OQC", "发货检验单"),
    RQC("24007", "RQC", "退货检验单"),
    PRQC("24008", "PRQC", "生产退料检验单"),
    SPRQC("24009", "SPRQC", "委外退料检验单"),
    SCXJ("24010", "SCXJ", "生产巡检单"),
    QTJY("24011", "QTJY", "其他检验单"),
    FAIQC("24012", "FAIQC", "首件检验单"),
    OSQC("24013", "OSQC", "外派检验"),
    SPQC("24014", "SPQC", "工序首件检验单"),
    /**
     * 试压
     */
    SYGD("25001", "SYGD", "试压工单"),
    /**
     * 直接调拨单
     */
    JSDB("26003", "JSDB", "寄售直接调拨单"),
    QSDB("26002", "QSDB", "签收直接调拨单"),
    BZDB("26001", "BZDB", "标准直接调拨单"),
    /**
     * 分步调出单
     */
    FBDC("26004", "FBDC", "分步调出单"),
    /**
     * 分步调入单
     */
    FBDR("26005", "FBDR", "分步调入单"),
    /**
     * 销售发票登记
     */
    JSFPDJ("27001", "JSFPDJ", "寄售发票登记"),
    BZFPDJ("27002", "BZFPDJ", "标准发票登记"),
    /**
     * 销售出库单
     */
    BZCK("04001", "BZCK", "标准销售出库单"),
    JSCK("28001", "JSCK", "寄售销售出库单"),
    /**
     * 采购收货单
     */
    BZSH("29001", "BZSH", "标准采购收货单", "68a287e8-d338-49c0-8e2e-cd4f22ea270e"),
    FWSH("29002", "FWSH", "服务采购收货单"),
    ZCSH("29003", "ZCSH", "资产采购收货单"),
    FYSH("29004", "FYSH", "费用采购收货单"),
    WWSH("29005", "WWSH", "委外采购收货单"),

    BCGP("30001", "BCGP", "标准采购发票登记"),
    WCGP("30002", "WCGP", "委外采购发票登记"),
    /**
     * 工序委外发出单
     */
    WWZYFC("40001", "WWZYFC", "标准工序委外转移单(发出)"),
    /**
     * 工序委外接收单
     */
    WWZYJS("50001", "WWZYJS", "标准工序委外转移单(接收)", "07e28baa-9992-47aa-ac08-b7b0b20d8e53"),
    /**
     * 工序委外结算单
     */
    GXJG("60001", "GXJG", "工序加工结算单"),

    KJHT("70001", "KJHT", "框架合同"),
    BZHT("70002", "BZHT", "标准合同"),
    SJBG("19003", "SJBG", "首件报工单"),
    BFCK("06002", "BFCK", "报废出库单"),
    /**
     * MRP
     */
    YMRP("", "YMRP", "一级MRP计划"),

    /**
     * 领料申请单
     */
    SLSQ("32001", "SLSQ", "标准领料申请单"),
    WLSQ("32003", "WLSQ", "委外领料申请单"),

    YCDD("33001", "YCDD", "标准预测单"),
    BZGX("80001", "BZGX", "标准工序计划单"),

    /**
     * 工序委外合并发出单
     */
    BZGXHFC("90001", "BZGXHFC", "标准工序委外合并发出单"),
    /**
     * 工序委外合并接收单
     */
    BZGXHJS("90050", "BZGXHJS", "标准工序委外合并接收单"),
    /**
     * 资产处置单
     */
    GDZCCZ("90060", "GDZCCZ", "固定资产处置单"),
    /**
     * 协同报价单
     */
    BZXTBJD("90090", "BZXTBJD", "标准协同报价单"),
    /**
     * 协同送货单
     */
    BZXTSHD("90100", "BZXTSHD", "标准协同送货单"),
    /**
     * 应付单
     */
    BZYF("188001", "BZYF", "标准应付"),
    FYYF("188002", "FFYF", "费用应付"),
    ZCYF("188003", "ZCYF", "资产应付"),
    WWYF("188004", "WWYF", "委外应付"),
    /**
     * 应收单
     */
    BZYS("188005", "BZYS", "标准应收"),
    WXYS("188006", "WXYS", "维修服务应收单"),
    /**
     * 产品维修工单
     */
    BZWX("90200", "BZWX", "标准产品维修工单"),
    /**
     * 签到记录
     */
    QDJL("90300", "BZWX", "签到记录"),
    /**
     * 派工单明细
     */
    BZPGD("90400", "BZPGD", "标准派工单"),
    ;

    private String no;
    private String code;
    private String name;
    private String postDetailMenuCode;

    OrderCategoryCodeEnum() {
    }

    OrderCategoryCodeEnum(String no, String code, String name) {
        this.no = no;
        this.name = name;
        this.code = code;
    }

    OrderCategoryCodeEnum(String no, String code, String name, String postDetailMenuCode) {
        this.no = no;
        this.name = name;
        this.code = code;
        this.postDetailMenuCode = postDetailMenuCode;
    }

    public static String getNameByCode(String code) {
        if (StringUtils.isBlank(code)) {
            return null;
        }
        for (OrderCategoryCodeEnum value : values()) {
            if (code.equals(value.getCode())) {
                return value.getName();
            }
        }
        return null;
    }

    public static OrderCategoryCodeEnum getSelfByCode(String code) {
        if (StringUtils.isBlank(code)) {
            return null;
        }
        for (OrderCategoryCodeEnum value : values()) {
            if (code.equals(value.getCode())) {
                return value;
            }
        }
        return null;
    }

    public static List<String> getAllNo() {
        List<String> allNo = new ArrayList<>();
        for (OrderCategoryCodeEnum value : values()) {
            allNo.add(value.getNo());
        }
        return allNo;
    }

}
