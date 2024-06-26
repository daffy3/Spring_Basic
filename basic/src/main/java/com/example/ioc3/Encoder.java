package com.example.ioc3;

// DI
public class Encoder implements IEncoder {

    private IEncoder iEncoder;

    public Encoder(IEncoder iEncoder) {
        this.iEncoder = iEncoder;
    }

    public String encode(String message) {
        return iEncoder.encode(message);
    }

}




