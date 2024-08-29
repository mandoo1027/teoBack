package com.commerce.comm;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ReqDat {
    private String hidKeyData;
    private String hidEncData;
    private String id;
    private String pw;
    private String type;
    private String umsCertNum;
    private String serialNo;
}
