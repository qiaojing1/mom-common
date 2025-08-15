package com.lets.platform.model.common.vo;

import com.lets.platform.model.common.entity.CommonCalendar;
import lombok.Data;

import java.time.LocalDate;
import java.util.Map;
import java.util.Set;

/**
 * @author FZY
 **/
@Data
public class CalendarVO {
    private Integer year;
    /**
     * 工作日[1-7]
     */
    private Set<Integer> workDays;

    private Map<LocalDate, CommonCalendar> dateMap;
}
