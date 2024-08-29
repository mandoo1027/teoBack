package com.commerce.module.MEM;


import com.commerce.comm.CamelKeyMap;
import com.commerce.comm.ObjectMapperUtils;
import com.commerce.comm.UtilMapper;
import com.commerce.exception.UserException;
import com.commerce.module.MEM.vo.SMEM001SVO;
import com.commerce.module.MEM.vo.SMEM006RVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@Service("MemberService")
public class MemService extends UtilMapper {

    public List<SMEM006RVO> SMEM001(SMEM001SVO req) throws UserException {
        Map<String, Object> map = objectMapper.convertValue(req, Map.class);

        List<CamelKeyMap> result = generalMapper.selectList("MEM","selectMemberByNm",map);

        return ObjectMapperUtils.convertToList(result, SMEM006RVO.class);
    }
}
