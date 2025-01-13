package com.commerce.service.COM.vo;

import com.commerce.comm.RequestPayload;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class ADM0202S01S extends RequestPayload {
    private String grpCode;
    private String etcCodeOrName;
}
