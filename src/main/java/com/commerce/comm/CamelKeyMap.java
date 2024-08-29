package com.commerce.comm;
import org.apache.commons.collections4.map.ListOrderedMap;
import org.apache.commons.text.CaseUtils;

import java.util.Map;

public class CamelKeyMap extends ListOrderedMap<String, Object>  {
    Map<String, Object> map;
    private static final long serialVersionUID = -5625967100966652284L;

    public CamelKeyMap(Map<String, Object> map) {
        this.map = map;
        if(map != null){
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                this.put(entry.getKey(), entry.getValue());
            }
        }

    }


    @Override
    public Object put(String key, Object value) {
        // 키를 카멜 케이스로 변환한 후 저장
        String camelKey = CaseUtils.toCamelCase(key, false, '_');
        return super.put(camelKey, value);
    }
}
