package com.basicspringboot;

import com.basicspringboot.domain.Post;
import com.basicspringboot.service.PostRepository;
import com.basicspringboot.web.WelcomeController;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

/**
 * Copyright (c) GL Finance Plc. All rights reserved. (http://www.gl-f.com/)
 * Author: Ron Rith (r.ron@gl-f.com) on 2017-07-27.
 */
@SpringBootApplication
@AutoConfigurationPackage
public class SprinBootWebApplication implements CommandLineRunner {
    private static final Logger logger = Logger.getLogger(WelcomeController.class);

    @Autowired
    private PostRepository postRepository;

    public static void main(String[] args) {
        SpringApplication.run(SprinBootWebApplication.class, args);
    }


    @Override
    public void run(String... strings) throws Exception {

        logger.debug(postRepository);

        Post post = new Post("test 1", "test 1 content");

        post.setTitle("dsadsadsd");

        postRepository.save(post);

        System.out.println(post);

        List<Post> postList = (List<Post>) postRepository.findAll();

        System.out.println(postList.get(0).toString());
    }
}

// SpringBoot start auto configure and scan all component