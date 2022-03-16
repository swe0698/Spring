package com.example.spring.basics.springin5steps.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class sweprop {

    @Value("${external.call.url}")
    private String url;

    public String sendUrl(){
        return url;
    }
}
