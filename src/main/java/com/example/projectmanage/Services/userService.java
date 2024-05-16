package com.example.projectmanage.Services;

import com.example.projectmanage.Model.users;
import com.example.projectmanage.Repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class userService {
    private userRepository userRepository;
    private BCryptPasswordEncoder passwordEncoder;
    @Autowired
    public userService(userRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }
    public List<users> getAllUsers(){
        return userRepository.findAll();
    }
    public users addUser(users user){
        return  userRepository.save(user);
    }
    public users updateUser(users user){
        return  userRepository.save(user);
    }

}
