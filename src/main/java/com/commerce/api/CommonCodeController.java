package com.commerce.api;

import com.commerce.comm.CamelKeyMap;
import com.commerce.comm.ObjectMapperUtils;
import com.commerce.comm.ResultVO;
import com.commerce.exception.UserException;
import com.commerce.module.COM.COMService;
import com.commerce.module.COM.vo.SCOM001SVO;
import com.commerce.service.COM.vo.ADM0202S01S;
import com.commerce.service.MNU.MnuService;
import com.commerce.service.MNU.vo.MNU0101S01R;
import com.commerce.service.MNU.vo.MNU0101S01S;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin/service")
public class CommonCodeController {

    @Autowired
    private COMService comService;
    @PostMapping(value = "/ADM0202S01")
    public ResultVO ADM0202S01(@RequestBody ADM0202S01S req, MNU0101S01R res) throws UserException {
        SCOM001SVO scom001SVO = ObjectMapperUtils.convertToVo(req, SCOM001SVO.class);
        List<CamelKeyMap> codeList = comService.SCOM001(scom001SVO);
        ResultVO result = new ResultVO();
        result.setResultData(res);
        result.setSucessCode(); 
        return result;
    }
}
