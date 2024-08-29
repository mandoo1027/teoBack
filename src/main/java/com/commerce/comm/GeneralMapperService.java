package com.commerce.comm;

import com.commerce.module.MEM.vo.SMEM006RVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class GeneralMapperService {

    private final SqlSessionTemplate sqlSessionTemplate;

    public GeneralMapperService(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public List<CamelKeyMap> selectList(String namespace, String queryId, Map<String, Object> paramMap) {
        String statement = namespace + "." + queryId;
        List<Map<String, Object>> resultList = sqlSessionTemplate.selectList(statement, paramMap);
        List<CamelKeyMap> camelKeyMapList = new ArrayList<>();

        for (Map<String, Object> map : resultList) {
            camelKeyMapList.add(new CamelKeyMap(map));
        }

        return camelKeyMapList;
    }

    public CamelKeyMap selectOne(String namespace, String queryId, Map<String, Object> paramMap) {
        String statement = namespace + "." + queryId;
        Map map = sqlSessionTemplate.selectOne(statement, paramMap);
        CamelKeyMap camelKeyMap = new CamelKeyMap(map);
        return camelKeyMap;
    }


}