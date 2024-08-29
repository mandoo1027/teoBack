package com.commerce.comm;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service("CommonSaveManager")
public class CommonSaveManager {
    private Map<String, List<CamelKeyMap>> commonSaveMap = new HashMap<>();

    public void setSaveData(String category, List<CamelKeyMap> codes) {
        commonSaveMap.put(category, codes);
    }

    public List<CamelKeyMap> getSaveData(String category) {
        return commonSaveMap.get(category);
    }

}
