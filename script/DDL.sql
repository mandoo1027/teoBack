
CREATE TABLE MEMBER (
    MEM_ID               VARCHAR(50) PRIMARY KEY,             -- 회원ID
    MEM_DIV_CD           VARCHAR(10) NOT NULL,                -- 회원구분
    NLTY_DIV_CD          VARCHAR(10) NOT NULL,                -- 내외국인구분
    MEM_NM               VARCHAR(100) NOT NULL,               -- 회원성명
    MEM_PW               VARCHAR(255) NOT NULL,               -- 비밀번호
    MEM_BRTH             VARCHAR(8) NOT NULL,                 -- 생년월일 (YYYYMMDD 형식)
    MEM_SE_CD            VARCHAR(1) NOT NULL,                 -- 성별 (M/F)
    MOBL_TELNO1          VARCHAR(4),                          -- 전화번호1
    MOBL_TELNO2          VARCHAR(4),                          -- 전화번호2
    MOBL_TELNO3          VARCHAR(4),                          -- 전화번호3
    UMSMAIL              VARCHAR(100),                        -- 이메일주소
    NTCN_CHNL_DIV_CD     VARCHAR(10),                         -- 알림채널구분
    MEM_JOIN_STAT_CD     VARCHAR(10),                         -- 회원가입상태
    MEM_JOIN_DATE        VARCHAR(8) DEFAULT TO_CHAR(NOW(), 'YYYYMMDD'), -- 회원가입일자
    MEM_CNCL_DATE        VARCHAR(8) DEFAULT '99991231',       -- 회원탈회일자
    MEM_CERT_DIV_CD      VARCHAR(10),                         -- 회원인증방법
    MEM_CNCL_RESN        TEXT,                                -- 탈회사유
    REMARK               TEXT,                                -- 비고
    PRVC_OGCR_VRIFY_DT   VARCHAR(14),                         -- 개인인증서검증일시 (YYYYMMDDHH24MISS 형식)
    LAST_CHNL_CERT_DT    VARCHAR(14),                         -- 최종채널인증일시 (YYYYMMDDHH24MISS 형식)
    LAST_LOGIN_DT        VARCHAR(14),                         -- 최종로그인일시 (YYYYMMDDHH24MISS 형식)
    LOGIN_ERR_CNT        INT DEFAULT 0,                       -- 로그인오류횟수
    RGTR_USER_ID         VARCHAR(50),                         -- 등록자ID
    RGTR_DT              VARCHAR(14) DEFAULT TO_CHAR(NOW(), 'YYYYMMDDHH24MISS'),  -- 등록일시
    LAST_USER_ID         VARCHAR(50),                         -- 변경자ID
    LAST_CHG_DT          VARCHAR(14) DEFAULT TO_CHAR(NOW(), 'YYYYMMDDHH24MISS'),  -- 변경일시
    MEM_PW_CHG_DATE      VARCHAR(8)                           -- 패스워드변경일시 (YYYYMMDD 형식)
);

COMMENT ON TABLE MEMBER IS '회원 테이블';

COMMENT ON COLUMN MEMBER.MEM_ID IS '회원ID';
COMMENT ON COLUMN MEMBER.MEM_DIV_CD IS '회원구분';
COMMENT ON COLUMN MEMBER.NLTY_DIV_CD IS '내외국인구분';
COMMENT ON COLUMN MEMBER.MEM_NM IS '회원성명';
COMMENT ON COLUMN MEMBER.MEM_PW IS '비밀번호';
COMMENT ON COLUMN MEMBER.MEM_BRTH IS '생년월일 (YYYYMMDD 형식)';
COMMENT ON COLUMN MEMBER.MEM_SE_CD IS '성별 (M/F)';
COMMENT ON COLUMN MEMBER.MOBL_TELNO1 IS '전화번호1';
COMMENT ON COLUMN MEMBER.MOBL_TELNO2 IS '전화번호2';
COMMENT ON COLUMN MEMBER.MOBL_TELNO3 IS '전화번호3';
COMMENT ON COLUMN MEMBER.UMSMAIL IS '이메일주소';
COMMENT ON COLUMN MEMBER.NTCN_CHNL_DIV_CD IS '알림채널구분';
COMMENT ON COLUMN MEMBER.MEM_JOIN_STAT_CD IS '회원가입상태';
COMMENT ON COLUMN MEMBER.MEM_JOIN_DATE IS '회원가입일자';
COMMENT ON COLUMN MEMBER.MEM_CNCL_DATE IS '회원탈회일자';
COMMENT ON COLUMN MEMBER.MEM_CERT_DIV_CD IS '회원인증방법';
COMMENT ON COLUMN MEMBER.MEM_CNCL_RESN IS '탈회사유';
COMMENT ON COLUMN MEMBER.REMARK IS '비고';
COMMENT ON COLUMN MEMBER.PRVC_OGCR_VRIFY_DT IS '개인인증서검증일시 (YYYYMMDDHH24MISS 형식)';
COMMENT ON COLUMN MEMBER.LAST_CHNL_CERT_DT IS '최종채널인증일시 (YYYYMMDDHH24MISS 형식)';
COMMENT ON COLUMN MEMBER.LAST_LOGIN_DT IS '최종로그인일시 (YYYYMMDDHH24MISS 형식)';
COMMENT ON COLUMN MEMBER.LOGIN_ERR_CNT IS '로그인오류횟수';
COMMENT ON COLUMN MEMBER.RGTR_USER_ID IS '등록자ID';
COMMENT ON COLUMN MEMBER.RGTR_DT IS '등록일시';
COMMENT ON COLUMN MEMBER.LAST_USER_ID IS '변경자ID';
COMMENT ON COLUMN MEMBER.LAST_CHG_DT IS '변경일시';
COMMENT ON COLUMN MEMBER.MEM_PW_CHG_DATE IS '패스워드변경일시 (YYYYMMDD 형식)';




CREATE TABLE MENU (
    SYS_DIV_CD VARCHAR(10),                                  -- 시스템구분 : EFM, ADM 
    MENU_SCR_DEV VARCHAR(1),                                 -- 메뉴화면구분 : M 메뉴, S 화면, N 네비게이션 
    MENU_CODE VARCHAR(10),                                   -- 메뉴코드 : M + 업무구분(3) + 순번(3)
    MENU_NAME VARCHAR(100),                                  -- 메뉴_화면명
    MENU_DEPTH INT,                                          -- 메뉴단계
    MENU_SEQ INT,                                            -- 메뉴노출순서 : 메뉴 depth 내 순서 
    UPPER_MENU_CODE VARCHAR(10),                             -- 상위메뉴코드
    FILE_PATH VARCHAR(255),                                  -- 화면경로 : /COM/COM002M00
    LOGIN_YN CHAR(1),                                        -- 로그인여부
    SCR_CTN TEXT,                                            -- 화면설명
    MENU_CSS VARCHAR(255),                                   -- 메뉴CSS
    USE_END_DATE VARCHAR(8),                                       -- 사용종료일자
    USE_STRT_DATE VARCHAR(8),                                      -- 사용시작일자
    USE_YN CHAR(1),                                          -- 사용여부
    RGTR_USER_ID VARCHAR(50),                                -- 등록자ID
    RGTR_DT VARCHAR(14) DEFAULT TO_CHAR(NOW(), 'YYYYMMDDHH24MISS'), -- 등록일시
    LAST_USER_ID VARCHAR(50),                                -- 변경자ID
    LAST_CHG_DT VARCHAR(14) DEFAULT TO_CHAR(NOW(), 'YYYYMMDDHH24MISS'), -- 변경일시
    PRIMARY KEY (SYS_DIV_CD, MENU_CODE)                      -- 시스템구분과 메뉴코드를 복합키로 설정
);

-- 테이블에 대한 주석
COMMENT ON TABLE MENU IS '시스템 메뉴 ';

-- 컬럼에 대한 주석
COMMENT ON COLUMN MENU.SYS_DIV_CD IS '시스템 구분 코드: 예) EFM, ADM';
COMMENT ON COLUMN MENU.MENU_SCR_DEV IS '메뉴 화면 구분: M(메뉴), S(화면), N(네비게이션)';
COMMENT ON COLUMN MENU.MENU_CODE IS '메뉴 코드: M + 업무구분(3자리) + 순번(3자리)';
COMMENT ON COLUMN MENU.MENU_NAME IS '메뉴 또는 화면 이름';
COMMENT ON COLUMN MENU.MENU_DEPTH IS '메뉴의 깊이 또는 레벨';
COMMENT ON COLUMN MENU.MENU_SEQ IS '메뉴 노출 순서: 동일 메뉴 깊이 내에서의 순서';
COMMENT ON COLUMN MENU.UPPER_MENU_CODE IS '상위 메뉴 코드';
COMMENT ON COLUMN MENU.FILE_PATH IS '화면 경로: 예) /COM/COM002M00';
COMMENT ON COLUMN MENU.LOGIN_YN IS '로그인 필요 여부: Y(예), N(아니오)';
COMMENT ON COLUMN MENU.SCR_CTN IS '화면 설명';
COMMENT ON COLUMN MENU.MENU_CSS IS '메뉴에 적용될 CSS 스타일';
COMMENT ON COLUMN MENU.USE_END_DATE IS '메뉴 사용 종료일';
COMMENT ON COLUMN MENU.USE_STRT_DATE IS '메뉴 사용 시작일';
COMMENT ON COLUMN MENU.USE_YN IS '메뉴 사용 여부: Y(사용), N(미사용)';
COMMENT ON COLUMN MENU.RGTR_USER_ID IS '메뉴를 등록한 사용자 ID';
COMMENT ON COLUMN MENU.RGTR_DT IS '메뉴가 등록된 날짜와 시간';
COMMENT ON COLUMN MENU.LAST_USER_ID IS '메뉴를 마지막으로 수정한 사용자 ID';
COMMENT ON COLUMN MENU.LAST_CHG_DT IS '메뉴가 마지막으로 수정된 날짜와 시간';


CREATE TABLE ADMIN (
    ID VARCHAR(50) PRIMARY KEY,                        -- 사용자 ID (기본 키)
    PWD VARCHAR(100) NOT NULL,                         -- 비밀번호 (암호화된 형태로 저장)
    NAME VARCHAR(100) NOT NULL,                        -- 사용자 이름
    IDNO VARCHAR(20),                                  -- 주민등록번호 또는 식별 번호
    IP VARCHAR(45),                                    -- 접속 IP 주소 (IPv6까지 고려해 45자 설정)
    MOBL_TELNO1 VARCHAR(3),                            -- 모바일 전화번호 앞자리
    MOBL_TELNO2 VARCHAR(4),                            -- 모바일 전화번호 중간자리
    MOBL_TELNO3 VARCHAR(4),                            -- 모바일 전화번호 끝자리
    EMAIL VARCHAR(100),                                -- 이메일 주소
    USE_STAT_CD VARCHAR(10) NOT NULL,                  -- 사용 상태 코드 (1: 승인, 9: 승인요청, 3: 거부)
    USE_STRT_DATE VARCHAR(8) NOT NULL,                 -- 사용 시작일 (YYYYMMDD 형식)
    USE_END_DATE VARCHAR(8) NOT NULL,                  -- 사용 종료일 (YYYYMMDD 형식, 예: 99991231)
    MENU_AUTH TEXT,                                    -- 메뉴 권한 정보
    DEPT_CD VARCHAR(10),                               -- 부서 코드
    DEPT_NM VARCHAR(100),                              -- 부서 이름
    MEMO TEXT,                                         -- 메모
    OTP_SKEY VARCHAR(50),                              -- OTP 시크릿 키
    RGTR_USER_ID VARCHAR(50),                          -- 등록자 ID
    RGTR_DT VARCHAR(14) DEFAULT TO_CHAR(NOW(), 'YYYYMMDDHH24MISS'), -- 등록 일시
    LAST_USER_ID VARCHAR(50),                          -- 마지막 수정자 ID
    LAST_CHG_DT VARCHAR(14) DEFAULT TO_CHAR(NOW(), 'YYYYMMDDHH24MISS'), -- 마지막 수정 일시
    LOGIN_ERR_CNT INT DEFAULT 0                        -- 로그인 오류 횟수 (초기값 0)
);

-- 테이블 주석
COMMENT ON TABLE ADMIN IS '시스템 관리자 ';

-- 컬럼 주석
COMMENT ON COLUMN ADMIN.ID IS '사용자 ID (기본 키)';
COMMENT ON COLUMN ADMIN.PWD IS '비밀번호 (암호화된 형태로 저장)';
COMMENT ON COLUMN ADMIN.NAME IS '사용자 이름';
COMMENT ON COLUMN ADMIN.IDNO IS '주민등록번호 또는 기타 식별 번호';
COMMENT ON COLUMN ADMIN.IP IS '사용자가 접속한 IP 주소';
COMMENT ON COLUMN ADMIN.MOBL_TELNO1 IS '모바일 전화번호의 앞자리';
COMMENT ON COLUMN ADMIN.MOBL_TELNO2 IS '모바일 전화번호의 중간자리';
COMMENT ON COLUMN ADMIN.MOBL_TELNO3 IS '모바일 전화번호의 끝자리';
COMMENT ON COLUMN ADMIN.EMAIL IS '사용자의 이메일 주소';
COMMENT ON COLUMN ADMIN.USE_STAT_CD IS '사용 상태 코드 (1: 활성화 상태)';
COMMENT ON COLUMN ADMIN.USE_STRT_DATE IS '사용 시작일 (YYYYMMDD 형식)';
COMMENT ON COLUMN ADMIN.USE_END_DATE IS '사용 종료일 (YYYYMMDD 형식, 예: 99991231)';
COMMENT ON COLUMN ADMIN.MENU_AUTH IS '관리자가 접근할 수 있는 메뉴 권한 정보';
COMMENT ON COLUMN ADMIN.DEPT_CD IS '관리자가 소속된 부서 코드';
COMMENT ON COLUMN ADMIN.DEPT_NM IS '관리자가 소속된 부서 이름';
COMMENT ON COLUMN ADMIN.MEMO IS '관리자에 대한 메모 또는 추가 정보';
COMMENT ON COLUMN ADMIN.OTP_SKEY IS 'OTP 시크릿 키';
COMMENT ON COLUMN ADMIN.RGTR_USER_ID IS '관리자 정보를 등록한 사용자 ID';
COMMENT ON COLUMN ADMIN.RGTR_DT IS '관리자 정보가 등록된 날짜와 시간';
COMMENT ON COLUMN ADMIN.LAST_USER_ID IS '관리자 정보를 마지막으로 수정한 사용자 ID';
COMMENT ON COLUMN ADMIN.LAST_CHG_DT IS '관리자 정보가 마지막으로 수정된 날짜와 시간';
COMMENT ON COLUMN ADMIN.LOGIN_ERR_CNT IS '로그인 실패 횟수 (초기값 0)';