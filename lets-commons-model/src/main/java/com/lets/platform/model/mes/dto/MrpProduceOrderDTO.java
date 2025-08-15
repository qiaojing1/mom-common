package com.lets.platform.model.mes.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class MrpProduceOrderDTO<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private T entity;

    private T oldEntity;
}
