package com.basicspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Copyright (c) GL Finance Plc. All rights reserved. (http://www.gl-f.com/)
 * Author: Ron Rith (r.ron@gl-f.com) on 2017-07-27.
 */
@SpringBootApplication
@AutoConfigurationPackage
public class SprinBootWebApplication {
    public static void main(String[] args){
        SpringApplication.run(SprinBootWebApplication.class,args);
    }
}

// SpringBoot start auto configure and scan all component