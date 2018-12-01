package com.codebrain.lojavirtual.dto.response;

public class JwtResponseDto {
    private String token;
    private String type = "Bearer";

    public JwtResponseDto(String accessToken) {
        this.token = accessToken;
    }

    public String getAccessToken() {
        return token;
    }

    public void setAccessToken(String accessToken) {
        this.token = accessToken;
    }

    public String getTokenType() {
        return type;
    }

    public void setTokenType(String tokenType) {
        this.type = tokenType;
    }
}