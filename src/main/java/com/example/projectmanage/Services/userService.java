package com.example.projectmanage.Services;

import com.example.projectmanage.Model.users;
import com.example.projectmanage.Repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {
    @Autowired
    private userRepository userRepository;
    public List<users> getAllUsers(){
        return userRepository.findAll();
    }
    public users addUser(users user){
        return  userRepository.save(user);
    }
    public users updateUser(users user){
        return  userRepository.save(user);
    }
    public boolean checkEmailExist(String email){
        return userRepository.emailExist(email);
    }

}
