package com.fortune.fortune.auth;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JwtProvider {
    @Value("test")
    private String secretKey;

    private final long accessTokenValidity = 1000 * 60 * 30; //30분
    private final long refreshTokenValidity = 1000L * 60 * 60 * 24 * 7; //1주

    public String generateAccessToken(String userId){
        return createToken(userId, accessTokenValidity);
    }

    public String generateRefreshToken(String userId){
        return createToken(userId, refreshTokenValidity);
    }

    private String createToken(String userId, long validity){
        return 
    }
}
