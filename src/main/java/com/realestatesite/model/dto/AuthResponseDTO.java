package com.realestatesite.model.dto;

public class AuthResponseDTO {
    private String username;
    private String accessToken;

    public AuthResponseDTO() { }

    public AuthResponseDTO(String username, String accessToken) {
        this.username = username;
        this.accessToken = accessToken;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
