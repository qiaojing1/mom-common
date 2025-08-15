package com.lets.commons.easyexcel.utils;

import lombok.Data;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.PictureData;

import java.util.List;

/**
 * Excel图片数据信息
 * @author: DING WEI
 * @date: 2023/10/23 14:56
 */
@Data
public class ExcelPicture {

    private ClientAnchor anchor;

    private List<PictureData> pictureDataList;

}
