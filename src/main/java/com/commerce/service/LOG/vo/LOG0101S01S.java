package com.commerce.service.LOG.vo;

import com.commerce.comm.RequestPayload;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Map;

@Getter
@Setter
@Component
public class LOG0101S01S extends RequestPayload {
    private String hidKeyData;
    private String hidEncData;
    private String memId;
    private String pw;
    private String type;
    private String umsCertNum;
    private String serialNo;
}
