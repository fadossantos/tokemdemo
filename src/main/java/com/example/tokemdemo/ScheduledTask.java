package com.example.tokemdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class ScheduledTask {

    @Autowired
    TokenManager tokenManager;

    @Async
    @Scheduled(fixedRate = 30000)
    public void verificaServicoPHX() {
        Random random = new Random();
        tokenManager.setToken( "token - " + random.nextInt());
        System.out.println("Atualizou o token para: " + tokenManager.getToken());
    }
}
