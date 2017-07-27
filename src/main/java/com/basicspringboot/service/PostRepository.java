package com.basicspringboot.service;

import com.basicspringboot.domain.Post;
import org.springframework.data.repository.CrudRepository;

/**
 * Copyright (c) GL Finance Plc. All rights reserved. (http://www.gl-f.com/)
 * Author: Ron Rith (r.ron@gl-f.com) on 2017-07-27.
 */
public interface PostRepository extends CrudRepository<Post, Long> {
}
