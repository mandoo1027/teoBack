package com.commerce.service.HCO.vo;

import com.commerce.comm.RequestPayload;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class HCO0101S01S extends RequestPayload {
    private String id;
    private String pwd;
}
