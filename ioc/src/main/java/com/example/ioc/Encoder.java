package com.example.ioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Encoder {

    private IEncoder iEncoder;

    public Encoder(@Qualifier("urlEncoder") IEncoder iEncoder) {
        this.iEncoder = iEncoder;
    }

    public void setiEncoder(IEncoder iEncoder) {
        this.iEncoder = iEncoder;
    }

    public String encode(String message) {
        return iEncoder.encode(message);
    }

}