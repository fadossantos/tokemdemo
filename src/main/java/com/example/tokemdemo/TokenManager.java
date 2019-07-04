package com.example.tokemdemo;

public class TokenManager {
    private String token;

    public TokenManager() {
        System.out.println("Criou a instancia do tokenManager e setou o token como PrimeiroToken");
        this.setToken("Primeiro Token");
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
