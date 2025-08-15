package com.lets.platform.model.base.businessEntity;

import com.lets.platform.model.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class BaseSerialEntity extends BaseEntity {

    private String parentId;

    private String prefixSerial;

    private String suffixSerial;

    private String totalSerial;
}
