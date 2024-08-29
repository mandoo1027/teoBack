package com.commerce.service.HCO;

import com.commerce.comm.CamelKeyMap;
import com.commerce.comm.ObjectMapperUtils;
import com.commerce.comm.UtilMapper;
import com.commerce.exception.UserException;
import com.commerce.module.MEM.MemService;
import com.commerce.module.MEM.vo.SMEM001SVO;
import com.commerce.module.MEM.vo.SMEM006RVO;
import com.commerce.service.HCO.vo.AdminVO;
import com.commerce.service.HCO.vo.HCO0101S01S;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


@Transactional
@Service("HcoService")
public class HCO0101Service extends UtilMapper {

    /**
     * 관리자 로그인
     *
     * @param
     * @param
     * @return
     * @throws Exception
     */

    public List<AdminVO> HCO0101S01(HCO0101S01S req) throws UserException {
        Map<String, Object> map = objectMapper.convertValue(req, Map.class);

        List<CamelKeyMap> result = generalMapper.selectList("HCO", "selectAdmin", map);

        return ObjectMapperUtils.convertToList(result, AdminVO.class);
    }
}