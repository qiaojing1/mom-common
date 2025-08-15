package com.lets.platform.model.psi.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * <p>
 * VIEW
 * </p>
 *
 * @author FZY
 * @since 2025-03-10
 */
@Getter
@Setter
public class CalculateDTO {
    private List<String> ids;
    private String orderType;
    private String type;
    private String programId;
}
