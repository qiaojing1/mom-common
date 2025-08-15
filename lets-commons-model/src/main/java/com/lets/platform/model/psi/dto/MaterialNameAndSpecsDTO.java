package com.lets.platform.model.psi.dto;

import lombok.Data;

@Data
public class MaterialNameAndSpecsDTO {
    private String id;
    private String code;
    private String name;
    private String specs;

    public MaterialNameAndSpecsDTO() {
    }

    public MaterialNameAndSpecsDTO(String id, String code, String name, String specs) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.specs = specs;
    }
}
