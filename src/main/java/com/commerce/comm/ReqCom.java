package com.commerce.comm;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class ReqCom {
    private String screenId;
    private String langCd;
    private String clientAgent;
    private String clientOS;
    private String areaCd;
    private String serviceId;
}
