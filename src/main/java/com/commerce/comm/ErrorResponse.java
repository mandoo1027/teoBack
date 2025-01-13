package com.commerce.comm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ErrorResponse {
    private String errorMsg;
    private String errorCode;
    public ErrorResponse(String message, String code) {
        this.errorMsg = message;
        this.errorCode = code;
    }
}