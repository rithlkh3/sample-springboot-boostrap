package com.basicspringboot.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;


/**
 * Copyright (c) GL Finance Plc. All rights reserved. (http://www.gl-f.com/)
 * Author: Ron Rith (r.ron@gl-f.com) on 2017-07-27.
 */
@Controller
public class WelcomeController {

    //inject var application.properties
    @Value("${welcome.message:default vaule while first variable not defined}")
    private String message = "Hello World!";

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("message", this.message);
        return "welcome";
    }

    @RequestMapping(value = "/home")
    public String homePage(Map<String,Object> model){
        model.put("message",this.message);
        return "home";
    }

}
