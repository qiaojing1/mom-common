package com.lets.platform.model.psi.query;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
public class TaskDetailQuery {
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean withoutCalculatedOrder;
    private Set<String> orderCategoryIds;
    private Set<String> materialIds;
}
