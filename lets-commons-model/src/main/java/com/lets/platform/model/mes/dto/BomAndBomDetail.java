package com.lets.platform.model.mes.dto;

import com.lets.platform.model.mes.entity.MesBom;
import com.lets.platform.model.mes.entity.MesBomDetail;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BomAndBomDetail {

    private List<MesBom> bomList;

    private List<MesBomDetail> bomDetailList;
}
