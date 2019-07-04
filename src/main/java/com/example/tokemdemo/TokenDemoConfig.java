package com.example.tokemdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class TokenDemoConfig {

    @Bean
    @Scope(value = "singleton")
    public TokenManager getTokenManager(){
        return new TokenManager();
    }

}
