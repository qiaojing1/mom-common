package com.lets.platform.model.common.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 * @author FZY
 **/
@Data
public class SchedulingVO {

    LocalDate date;

    BigDecimal standardHour;

    BigDecimal reportHour;

    BigDecimal display;

    List<ReportVO> reportList;
}
