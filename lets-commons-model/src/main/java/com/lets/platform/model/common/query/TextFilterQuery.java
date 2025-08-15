package com.lets.platform.model.common.query;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author QIAO JING
 * @description
 * @since date 2022/04/07 17:02
 */
@Data
public class TextFilterQuery {

    private String key;

    private String join;

    private List<Map<String, String>> values;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key=key;
    }

    public String getJoin() {
        return join;
    }

    public void setJoin(String join) {
        this.join=join;
    }

    public List<Map<String,String>> getValues() {
        return values;
    }

    public void setValues(List<Map<String,String>> values) {
        this.values=values;
    }
}
