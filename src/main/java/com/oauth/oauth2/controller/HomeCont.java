package com.oauth.oauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeCont {

    @GetMapping(path = "/")
    public String rootPage(){
        return "Welcome to Root";
    }
    @GetMapping(path = "/secured")
    public String securedPage(){
        return "Welcome to Secured Page !";
    }
}
