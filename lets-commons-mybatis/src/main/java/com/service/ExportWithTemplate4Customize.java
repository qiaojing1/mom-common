package com.service;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 根据模板导出(定制化开发接口)
 * @author: DING WEI
 * @date: 2022/11/30 14:34
 */
public interface ExportWithTemplate4Customize {

    String whichCustomize(String tenancyId);

    void doExport(String id, String menuCode, HttpServletResponse response);

    ExportWithTemplate4Customize getInstance(List<ExportWithTemplate4Customize> service);

}
