package com.myfuturehub.futuionsales.service;

import com.myfuturehub.futuionsales.entity.User;
import com.myfuturehub.futuionsales.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public User addUser(User user) {
        User existingUser = userRepository.findByEmail(user.getEmail());
        if(existingUser == null){
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            userRepository.save(user);
            return user;
        } else {
            return null;
        }

    }
}
