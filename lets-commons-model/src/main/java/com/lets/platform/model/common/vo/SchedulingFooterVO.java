package com.lets.platform.model.common.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 * @author FZY
 **/
@Data
public class SchedulingFooterVO {

    LocalDate date;

    BigDecimal compareValue;

    BigDecimal display;

    BigDecimal standardHour;

    BigDecimal reportHour;

    List<ReportVO> reportList;
}
