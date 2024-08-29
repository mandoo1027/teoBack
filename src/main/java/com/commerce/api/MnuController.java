package com.commerce.api;

import com.commerce.comm.ResultVO;
import com.commerce.exception.UserException;
import com.commerce.service.MNU.MnuService;
import com.commerce.service.MNU.vo.MNU0101S01R;
import com.commerce.service.MNU.vo.MNU0101S01S;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/service")
public class MnuController {

    @Autowired
    private MnuService mnuService;
    @PostMapping(value = "/MNU0101S01")
    public ResultVO menuSearch(@RequestBody MNU0101S01S req, MNU0101S01R res) throws UserException {
        boolean isResult = mnuService.MNU0101S01(req, res);
        ResultVO result = new ResultVO();
        if(isResult) {
            result.setResultData(res);
            result.setSucessCode();
        }
        return result;
    }
}
