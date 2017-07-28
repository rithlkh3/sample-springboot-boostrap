package com.basicspringboot.service;

import com.basicspringboot.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Ron Rith
 * Created on 7/27/2017.
 */
public interface UserRepository extends PagingAndSortingRepository<User,Long> {
}
