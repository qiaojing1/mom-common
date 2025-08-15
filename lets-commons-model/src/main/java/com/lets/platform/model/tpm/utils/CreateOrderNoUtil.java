package com.lets.platform.model.tpm.utils;

import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateOrderNoUtil {
    /**
     * BJCG + 20 + 12 + 04 +0001
     * * 备件采购+年份后两位+月+日+四位流水号
     *
     * @param equipmentType
     *              备件类型前缀  BJCG
     * @param equipmentNo
     *              最新设备编号
     * @return
     *
     */
    public static String getNewEquipmentNo(String equipmentType, String equipmentNo){
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        String date = sdf.format(new Date());
        String newEquipmentNo = equipmentType + date + "001";
        if(equipmentNo != null && !equipmentNo.isEmpty()){
            Long newEquipment = Long.parseLong(equipmentNo) + 1;
            String format = String.format("%03d", newEquipment);
            newEquipmentNo = equipmentType + date  + format;
        }

        return newEquipmentNo;
    }

    public static String getEquipmentNo(String equipmentType, String equipmentNo){
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        String date = sdf.format(new Date());
        String newEquipmentNo = equipmentType + date + "001";
        if(!StringUtils.isEmpty(equipmentNo)){
            Long newEquipment = Long.parseLong(equipmentNo) + 1;
            String format = String.format("%03d", newEquipment);
            newEquipmentNo = equipmentType + format;
        }
        return newEquipmentNo;
    }

    public static void main(String[] args) {
        System.out.println(getEquipmentNo("GD",""));
    }

}
