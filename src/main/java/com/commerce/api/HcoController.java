package com.commerce.api;

import ch.qos.logback.core.util.StringUtil;
import com.commerce.comm.ResultVO;
import com.commerce.comm.UserVO;
import com.commerce.exception.UserException;
import com.commerce.module.MEM.vo.SMEM006RVO;
import com.commerce.service.HCO.HCO0101Service;
import com.commerce.service.HCO.vo.AdminVO;
import com.commerce.service.HCO.vo.HCO0101S01S;
import com.commerce.service.LOG.vo.LOG0101S01S;
import com.commerce.service.MNU.vo.MNU0101S01R;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin/service")
public class HcoController {

    @Autowired
    HCO0101Service hco0101Service;

    // 로그인
    @PostMapping(value = "/HCO0101S01")
    public ResultVO login(@RequestBody HCO0101S01S req, HttpSession session) throws UserException {

        ResultVO result = new ResultVO();
        boolean isPass = true;
        if (StringUtil.isNullOrEmpty(req.getId())) {
           throw new UserException("MEM001");//"아이디를 입력하세요.");
        }
        if (StringUtil.isNullOrEmpty(req.getPwd())) {
            throw new UserException("MEM002");//"비밀번호를 입력하세요.");
        }
        List<AdminVO> rvo = hco0101Service.HCO0101S01(req);
        AdminVO getData ;
        if(rvo.size() == 0 ){
            throw new UserException("MEM002");//"아이디 또는 비밀번호가 일치하지 않습니다.");
        }else{
            getData = rvo.get(0);
            if(!getData.getPwd().equals(req.getPwd())){
                throw new UserException("MEM002");//"아이디 또는 비밀번호가 일치하지 않습니다.");
            }
        }


        String newSessionId = session.getId();
        getData.setCurrentSessionId(newSessionId);
        getData.setPwd("");

        session.setAttribute("user", getData);
        result.setResultData(getData);
        result.setSucessCode();
        return result;
    }



    //로그인 체크
    @PostMapping(value = "/HCO0101S02")
    public ResultVO healthCheck(@RequestBody LOG0101S01S req,HttpSession session) throws UserException{

        AdminVO userVo =  (AdminVO) session.getAttribute("user");
        ResultVO resultVo = new ResultVO();
        if(userVo != null){
            resultVo.setSucessCode();
            resultVo.setResultData(userVo);
        }else{
            resultVo.setFailCode();
            String data = "세션이 만료되어 로그아웃 상태입니다.";
            resultVo.setResultData(data);
        }

        return resultVo;
    }

    // 로그아웃
    @PostMapping(value = "/HCO0101S03")
    public ResultVO logout(@RequestBody LOG0101S01S req,HttpSession session) throws UserException{

        ResultVO resultVo = new ResultVO();
        resultVo.setSucessCode();
        resultVo.setResultData(true);
        session.invalidate();
        return resultVo;
    }
}
