package com.commerce.comm;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.SerializationFeature;
public  class UtilMapper {
    protected ObjectMapper objectMapper;
    public UtilMapper() {
        objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    }

    @Autowired
    protected GeneralMapperService generalMapper;


}
