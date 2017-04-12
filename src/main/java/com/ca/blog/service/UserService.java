package com.ca.blog.service;

import com.ca.blog.model.User;
import com.ca.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by Allen on 03/04/2017.
 * coder.allen@hotmail.com
 */

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public Page<User> findAllUser(Pageable pageable) {
        return userRepository.findAllByUsernameIsNotNull(pageable);
    }


    public Page<User> findAllDeptUser(Pageable pageable){
        return userRepository.findUserByUsernameIsNotNullAndDeptIsNotNull(pageable);
    }

    public Page<User> findUser(Pageable pageable){
        return userRepository.findUser(pageable);
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
