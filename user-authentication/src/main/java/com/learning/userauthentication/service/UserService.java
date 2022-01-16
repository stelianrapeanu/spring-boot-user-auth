package com.learning.userauthentication.service;

import com.learning.userauthentication.data.UserRepository;
import com.learning.userauthentication.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers () {
        return userRepository.findAll();
    }
}
