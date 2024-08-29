package com.commerce.comm;

import lombok.Data;

@Data
public class UserVO {
    private String memId;                // 회원ID
    private String memDivCd;             // 회원구분
    private String nltyDivCd;            // 내외국인구분
    private String memNm;                // 회원성명
    private String memPw;                // 비밀번호
    private String memBrth;              // 생년월일
    private String memSeCd;              // 성별
    private String moblTelno1;           // 전화번호1
    private String moblTelno2;           // 전화번호2
    private String moblTelno3;           // 전화번호3
    private String email;                // 이메일주소
    private String ntcnChnlDivCd;        // 알림채널구분
    private String memJoinStatCd;        // 회원가입상태
    private String memJoinDate;          // 회원가입일자
    private String memCnclDate;          // 회원탈회일자
    private String memCertDivCd;         // 회원인증방법
    private String memCnclResn;          // 탈회사유
    private String remark;               // 비고
    private String prvcOgcrVrifyDt;      // 개인인증서검증일시
    private String lastChnlCertDt;       // 최종채널인증일시
    private String lastLoginDt;          // 최종로그인일시
    private int loginErrCnt;             // 로그인오류횟수
    private String currentSessionId;     // 현재 세션 ID
}
