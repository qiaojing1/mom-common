package com.lets.platform.common.pojo.enums;

import cn.hutool.core.util.StrUtil;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 单据类别-业务类型
 *
 * @author FZY
 * @version 1.0
 * @date 2024/6/19
 */
@Getter
public enum OrderBusinessEnum {

    /**
     * 采购申请单
     */
    BCSQ("标准采购", "79839776-942e-4458-9487-272a3632a1f1"),
    ZCSQ("资产采购", "79839776-942e-4458-9487-272a3632a1f1"),
    FYSQ("费用采购", "79839776-942e-4458-9487-272a3632a1f1"),
    /**
     * 采购询价单
     */
    BZXJ("标准采购", "c047fa69-2554-4883-8a53-dd2f7fd6d1ed"),
    ZCXJ("资产采购", "c047fa69-2554-4883-8a53-dd2f7fd6d1ed"),
    FYXJ("费用采购", "c047fa69-2554-4883-8a53-dd2f7fd6d1ed"),
    /**
     * 采购订单
     */
    BZCG("标准采购", "42e6e4a1-09bd-4cfc-ab60-29c08cd17bad"),
    ZCCG("资产采购", "42e6e4a1-09bd-4cfc-ab60-29c08cd17bad"),
    FYCG("费用采购", "42e6e4a1-09bd-4cfc-ab60-29c08cd17bad"),
    WWCG("委外采购", "42e6e4a1-09bd-4cfc-ab60-29c08cd17bad"),
    BHCG("补货采购", "42e6e4a1-09bd-4cfc-ab60-29c08cd17bad"),
    /**
     * 采购收货单
     */
    BZSH("标准采购", "13f4f037-581b-4a84-8798-e333b090d36d"),
    ZCSH("资产采购", "13f4f037-581b-4a84-8798-e333b090d36d"),
    WWSH("委外采购", "13f4f037-581b-4a84-8798-e333b090d36d"),
    /**
     * 采购退货申请单
     */
    BZCS("标准采购", "457d063c-c0c3-4326-a724-20849c182d21"),
    ZCCS("资产采购", "457d063c-c0c3-4326-a724-20849c182d21"),
    FYCS("费用采购", "457d063c-c0c3-4326-a724-20849c182d21"),
    WCCS("委外采购", "457d063c-c0c3-4326-a724-20849c182d21"),
    /**
     * 采购入库单
     */
    BZRK("标准采购", "8aa9f41d-e785-4630-b8f4-e78f7367c082"),
    ZCRK("资产采购", "8aa9f41d-e785-4630-b8f4-e78f7367c082"),
    FYRK("费用采购", "8aa9f41d-e785-4630-b8f4-e78f7367c082"),
    WWRK("委外采购", "8aa9f41d-e785-4630-b8f4-e78f7367c082"),
    /**
     * 采购发票登记
     */
    BCGP("标准采购", "41352f71-5a83-41e7-bdd8-6e1c934b8c0e"),
    WCGP("委外采购", "41352f71-5a83-41e7-bdd8-6e1c934b8c0e"),
    /**
     * 应付单
     */
    BZYF("标准应付", "8ec5c1eb-8342-41ab-8f34-2576df8ceabc"),
    ZCYF("资产应付", "8ec5c1eb-8342-41ab-8f34-2576df8ceabc"),
    FYYF("费用应付", "8ec5c1eb-8342-41ab-8f34-2576df8ceabc"),
    WWYF("委外应付", "8ec5c1eb-8342-41ab-8f34-2576df8ceabc"),
    /**
     * 应收单
     */
    BZYS("标准应收", "d74bce02-165e-4192-8e54-94b4c598bf08"),
    WXYS("维修应收", "d74bce02-165e-4192-8e54-94b4c598bf08"),
    /**
     * 采购退货单
     */
    BZCGTHD("标准采购", "0a9a63da-d496-46b9-92e2-d443b7ef1bde"),
    ZCCGTHD("资产采购", "0a9a63da-d496-46b9-92e2-d443b7ef1bde"),
    FYCGTHD("费用采购", "0a9a63da-d496-46b9-92e2-d443b7ef1bde"),
    WWCGTHD("委外采购", "0a9a63da-d496-46b9-92e2-d443b7ef1bde"),
    /**
     * 检验单申请单
     */
    OQSQ("发货检验", "2f801379-f2d4-4d8f-83ae-cf0780bd2099"),
    KQSQ("库存检验", "2f801379-f2d4-4d8f-83ae-cf0780bd2099"),
    PRSQ("生产退料检验", "2f801379-f2d4-4d8f-83ae-cf0780bd2099"),
    /**
     * 检验单
     */
    IQC("进料检验", "723674d1-0486-4ca5-aeb9-c01527bc087d"),
    IPQC("自制工序检验", "723674d1-0486-4ca5-aeb9-c01527bc087d"),
    SIPQC("委外工序检验", "723674d1-0486-4ca5-aeb9-c01527bc087d"),
    FQC("完工检验", "723674d1-0486-4ca5-aeb9-c01527bc087d"),
    INQC("库存检验", "723674d1-0486-4ca5-aeb9-c01527bc087d"),
    OQC("发货检验", "723674d1-0486-4ca5-aeb9-c01527bc087d"),
    RQC("退货检验", "723674d1-0486-4ca5-aeb9-c01527bc087d"),
    PRQC("生产退料检验", "723674d1-0486-4ca5-aeb9-c01527bc087d"),
    SPRQC("委外退料检验", "723674d1-0486-4ca5-aeb9-c01527bc087d"),
    SCXJ("生产巡检", "723674d1-0486-4ca5-aeb9-c01527bc087d"),
    QTJY("其他检验", "723674d1-0486-4ca5-aeb9-c01527bc087d"),
    FAIQC("首件检验", "723674d1-0486-4ca5-aeb9-c01527bc087d"),
    OSQC("外派检验", "723674d1-0486-4ca5-aeb9-c01527bc087d"),
    SPQC("工序首件检验", "723674d1-0486-4ca5-aeb9-c01527bc087d"),
    /**
     * 生产工单
     */
    BZGD("标准生产", "055d60ab-fb14-41d5-b4ee-ca26eb90826b"),
    CGGD("重工生产", "055d60ab-fb14-41d5-b4ee-ca26eb90826b"),
    YFGD("研发生产", "055d60ab-fb14-41d5-b4ee-ca26eb90826b"),
    CJGD("拆件生产", "055d60ab-fb14-41d5-b4ee-ca26eb90826b"),
    WWGD("委外生产", "055d60ab-fb14-41d5-b4ee-ca26eb90826b"),
    /**
     * 工单报工单
     */
    SJBG("首件报工", "6282b4de-b206-4bbe-acf3-0007d6066444"),
    SCBG("生产报工", "6282b4de-b206-4bbe-acf3-0007d6066444"),
    /**
     * 工序汇报单
     */
    GXHB("标准生产", "c58d27e0-cb77-4ebe-bc87-569115283b79"),
    /**
     * 工序委外发出
     */
    WWZYFC("工序委外", "1810b334-1e6d-4f6c-8a59-b7ce0e1a3528"),
    /**
     * 工序委外合并发出单
     */
    BZGXHFC("工序委外", "d2b0752c-eed3-4360-93dd-3e59d263ae7f"),
    /**
     * 工序委外接收
     */
    WWZYJS("工序委外", "577d51e6-64ed-44f4-9ec3-c617aceb3ac6"),
    /**
     * 工序委外合并接收单
     */
    BZGXHJS("工序委外", "27adc514-acb0-4251-915b-20584aa74a5a"),
    /**
     * 工序委外结算
     */
    GXJG("工序委外", "dbe20195-15f4-4da6-a50e-7c8a2d56a85c"),
    /**
     * 生产领料申请单
     */
    SLSQ("标准领料", "9ae723c8-3312-4e5d-8335-bea94409e9c7"),
    WLSQ("委外领料", "9ae723c8-3312-4e5d-8335-bea94409e9c7"),
    /**
     * 生产领料单
     */
    BZLL("标准领料", "2c3ccc46-8b13-43ea-adb6-b78836ddabc1"),
    DCLL("倒冲领料", "2c3ccc46-8b13-43ea-adb6-b78836ddabc1"),
    WWLL("委外领料", "2c3ccc46-8b13-43ea-adb6-b78836ddabc1"),
    WXLL("维修领料", "2c3ccc46-8b13-43ea-adb6-b78836ddabc1"),
    /**
     * 生产用料清单
     */
    BZYLQD("标准领料", "5e1f6f57-6a39-4173-9111-08922a45aba0"),
    WWYLQD("委外领料", "5e1f6f57-6a39-4173-9111-08922a45aba0"),
    /**
     * 生产退料单
     */
    BZTL("标准退料", "81a87c77-299c-42c7-8e0c-2e1e6e39e2bb"),
    WWTL("委外退料", "81a87c77-299c-42c7-8e0c-2e1e6e39e2bb"),
    WXTL("维修退料", "81a87c77-299c-42c7-8e0c-2e1e6e39e2bb"),
    /**
     * 计划订单
     */
    CGJH("MRP采购计划订单", "80a85252-71e1-4577-b7d3-ae78debba47a"),
    SCJH("MRP生产计划订单", "80a85252-71e1-4577-b7d3-ae78debba47a"),
    WWJH("MRP委外计划订单", "80a85252-71e1-4577-b7d3-ae78debba47a"),
    KCJH("MRP库存计划订单", "80a85252-71e1-4577-b7d3-ae78debba47a"),
    /**
     * MPS计划订单
     */
    MPSCGJH("MPS采购计划订单", "ddaa1959-f81b-41ba-9214-1c235988877c"),
    MPSSCJH("MPS生产计划订单", "ddaa1959-f81b-41ba-9214-1c235988877c"),
    MPSWWJH("MPS委外计划订单", "ddaa1959-f81b-41ba-9214-1c235988877c"),
    MPSKCJH("MPS库存计划订单", "ddaa1959-f81b-41ba-9214-1c235988877c"),
    /**
     * 合同管理
     */
    KJHT("框架合同", "1da0dee3-24f9-4a64-88d2-72eee381c4b7"),
    BZHT("标准合同", "1da0dee3-24f9-4a64-88d2-72eee381c4b7"),
    /**
     * 销售订单
     */
    BZDD("标准销售", "7e76eee8-c8be-411c-8a60-d522c46ad948"),
    JSDD("寄售销售", "7e76eee8-c8be-411c-8a60-d522c46ad948"),
    QSDD("签收销售", "7e76eee8-c8be-411c-8a60-d522c46ad948"),
    /**
     * 销售报价单
     */
    BZBJ("标准销售", "c6e36fe9-8aa2-4505-a7d0-9bee50643a48"),
    /**
     * 出货通知单
     */
    BZTZ("标准销售", "cacb7011-731f-492e-8c7d-8b9a0ddbb6ec"),
    JSTZ("寄售销售", "cacb7011-731f-492e-8c7d-8b9a0ddbb6ec"),
    QSTZ("签收销售", "cacb7011-731f-492e-8c7d-8b9a0ddbb6ec"),
    /**
     * 销售退货申请单
     */
    BZTS("标准销售", "0a1e2aeb-9db5-4c6d-ba96-7d63de142893"),
    JSTS("寄售销售", "0a1e2aeb-9db5-4c6d-ba96-7d63de142893"),
    QSTS("签收销售", "0a1e2aeb-9db5-4c6d-ba96-7d63de142893"),
    /**
     * 销售出库单
     */
    BZCK("标准销售", "ccd6f395-5273-4f4f-8d3a-17ed0cfdf9d9"),
    JSCK("寄售销售", "ccd6f395-5273-4f4f-8d3a-17ed0cfdf9d9"),
    QSCK("签收销售", "ccd6f395-5273-4f4f-8d3a-17ed0cfdf9d9"),
    /**
     * 销售换货申请单
     */
    BZHH("标准销售", "e4b407ef-d149-4425-b98a-438c3483ce9b"),
    /**
     * 销售退货单
     */
    BZXT("标准销售", "34dfbbaf-04cd-4142-a4fc-8f88d2fd611d"),
    JSXT("寄售销售", "34dfbbaf-04cd-4142-a4fc-8f88d2fd611d"),
    QSXT("签收销售", "34dfbbaf-04cd-4142-a4fc-8f88d2fd611d"),
    /**
     * 直接调拨单
     */
    BZDB("标准直接调拨", "bea028bb-862b-4533-9da5-4a1052fbf3ab"),
    JSDB("寄售销售", "bea028bb-862b-4533-9da5-4a1052fbf3ab"),
    QSDB("签收销售", "bea028bb-862b-4533-9da5-4a1052fbf3ab"),
    /**
     * 分步调出单
     */
    FBDC("分步调出单", "79e3fd44-e92e-4700-b8f0-8f01ea2c9afb"),
    /**
     * 分步调入单
     */
    FBDR("分步调入单", "c77a0d44-d6d0-4af3-97e8-3d73501c5e67"),
    /**
     * 销售发票登记
     */
    BZFPDJ("标准销售", "669cddcd-ff5b-47ad-90a9-21a3f6937286"),
    JSFPDJ("寄售销售", "669cddcd-ff5b-47ad-90a9-21a3f6937286"),
    /**
     * 销售预测单
     */
    YCDD("标准销售", "48441ced-ab99-4aa3-8afa-e40fcfdae5fa"),
    /**
     * 计划外入库
     */
    BJRK("标准计划外入库", "f19106e7-b98a-40d1-a49d-bedf1ad092dd"),
    FLRK("废料入库", "f19106e7-b98a-40d1-a49d-bedf1ad092dd"),
    /**
     * 盘盈入库单
     */
    BZPY("标准盘点", "bd574319-89e5-4756-a8ed-317a4ee27732"),
    /**
     * 盘亏出库
     */
    BZPK("标准盘点", "1121892d-5018-45f4-bc96-2b9a1c9d776c"),
    /**
     * 物料申请单
     */
    BZWLSQ("标准物料申请", "607d1d6f-b948-4ffc-b16f-b133fbf4f994"),
    /**
     * 工序转移单
     */
    GXZY("标准生产", "d06d0327-9e46-4afa-88e5-2ad260a31db6"),
    HCZY("标准生产", "d06d0327-9e46-4afa-88e5-2ad260a31db6"),
    /**
     * 完工入库
     */
    BWRK("标准完工入库", "a03cf895-d5e2-4755-971b-dbac1848a272"),
    HBRK("汇报入库", "a03cf895-d5e2-4755-971b-dbac1848a272"),
    /**
     * 计划外出库
     */
    BJCK("标准计划外出库", "9bda27ad-75b6-445f-9980-ff74cd9eca1c"),
    BFCK("报废出库", "9bda27ad-75b6-445f-9980-ff74cd9eca1c"),
    /**
     * 试压
     */
    SYGD("试压工单", "85221baf-b0cf-4c09-a4f3-3deb468ebe6d"),
    /**
     * 试压
     */
    SWSP("事务审批", "8c1615ba-99a4-42f0-8cbe-6d6d70d45a4d"),
    /**
     * 工序计划
     */
    BZGX("标准生产", "8c6a65c4-d157-42f6-b57d-994389ec8b11"),
    /**
     * 备件领用
     */
    WXBJLY("维修备件领用", "e0dacb65-0caf-4da9-9c8c-e10901fb93d1"),
    BYBJLY("保养备件领用", "e0dacb65-0caf-4da9-9c8c-e10901fb93d1"),
    /**
     * 资产处置单
     */
    GDZCCZ("固定资产处置", "b96c0333-8fde-4705-87e6-47a8f15ac772"),
    ZCJY("资产借用", "88f350ed-22a6-487c-9866-4838bbf884f4"),
    JLYQJZ("计量仪器校准", "58e22cca-5443-41c2-90be-c419997ed782"),
    /**
     * 协同报价单
     */
    BZXTBJD("标准协同报价", "892152c9-0617-46fc-ae36-bb6ac6d0fad1"),
    /**
     * 协同送货单
     */
    BZXTSHD("标准协同送货", "8a985e0c-8058-45c7-941b-8ed5e9e52137"),

    /**
     * 付款单
     */
    QTFK("其他业务付款单", "e79337d7-216e-4605-8ac3-a241729bbdc7"),
    FYFK("费用报销付款单", "e79337d7-216e-4605-8ac3-a241729bbdc7"),
    CGFK("采购付款单", "e79337d7-216e-4605-8ac3-a241729bbdc7"),
    /**
     * 收款单
     */
    QTSK("其他业务收款单", "d9436eab-854f-4db5-95d1-8e371ba17ced"),
    BZJSK("保证金收款单", "d9436eab-854f-4db5-95d1-8e371ba17ced"),
    XSSK("销售收款单", "d9436eab-854f-4db5-95d1-8e371ba17ced"),
    /**
     * 付款退款单
     */
    CGTK("采购退款", "637f8ff2-b930-4d1f-9b16-620212d391be"),
    FYTK("费用报销退款", "637f8ff2-b930-4d1f-9b16-620212d391be"),
    QTTK("其他业务退款", "637f8ff2-b930-4d1f-9b16-620212d391be"),
    /**
     * 产品维修工单
     */
    BZWX("标准维修", "ec3bbe11-b7e8-4968-a731-069851404c5a"),
    /**
     * 产品维修工单
     */
    QDJL("签到记录", "726758a6-0636-4912-8aa5-6c24f4729809"),
    /**
     * 派工单
     */
    BZPGD("标准派工单", "09675237-5773-4c3b-905d-aaa88d444e15"),
    ;


    private final String name;
    private final String menuCode;

    OrderBusinessEnum(String name, String menuCode) {
        this.name = name;
        this.menuCode = menuCode;
    }

    public static String getNameByCode(String code) {
        if (StrUtil.isBlank(code)) {
            return null;
        }
        for (OrderBusinessEnum businessEnum : values()) {
            if (code.equals(businessEnum.toString())) {
                return businessEnum.getName();
            }
        }
        return null;
    }

    public static String getCodeByName(String name) {
        if (StrUtil.isBlank(name)) {
            return null;
        }
        for (OrderBusinessEnum businessEnum : values()) {
            if (name.equals(businessEnum.getName())) {
                return businessEnum.getCode();
            }
        }
        return null;
    }

    public static String getCodeByNameLike(String name) {
        if (StrUtil.isBlank(name)) {
            return null;
        }
        for (OrderBusinessEnum businessEnum : values()) {
            if (businessEnum.getName().indexOf(name) > -1) {
                return businessEnum.getCode();
            }
        }
        return null;
    }

    public static List<OrderBusinessEnum> getList(String menuCode) {
        return Arrays.stream(values()).filter(e -> StrUtil.isEmpty(menuCode) || StrUtil.equals(e.getMenuCode(), menuCode)).collect(Collectors.toList());
    }

    public String getCode() {
        return this.toString();
    }

    public boolean equals(String businessCode) {
        return this.toString().equals(businessCode);
    }
}
