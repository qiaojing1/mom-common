package com.lets.platform.model.common.vo;

import com.lets.platform.model.common.entity.CommonUserDict;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class MaterialExtAttrUpdateVO {
    List<CommonUserDict> dict;
    Map<String, Map<String, String>> keyMap;
}
