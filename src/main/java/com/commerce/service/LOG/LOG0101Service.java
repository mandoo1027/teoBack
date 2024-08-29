package com.commerce.service.LOG;

import com.commerce.comm.UtilMapper;
import com.commerce.module.MEM.MemService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;


public class LOG0101Service extends UtilMapper {

    @Autowired
    private MemService memService;
    /**
     * 회원 로그인
     *
     * @param
     * @param
     * @return
     * @throws Exception
     */
    public boolean LOG0101S01(  Map<String,Object> params) throws Exception {

        //List<Map<String, Object>> list = generalMapper.selectList("MEM","selectMemberByNm",params);
        return true;
    }
}
