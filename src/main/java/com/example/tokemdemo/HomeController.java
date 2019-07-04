package com.example.tokemdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @Autowired TokenManager tokenManager;

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String home() {
        return tokenManager.getToken();
    }

}
