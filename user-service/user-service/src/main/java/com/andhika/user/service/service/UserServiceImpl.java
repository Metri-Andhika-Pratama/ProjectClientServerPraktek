/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andhika.user.service.service;

import com.andhika.user.service.dto.User;
import com.andhika.user.service.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author User
 */
public class UserServiceImpl {
    @Autowired
    private UserRepository userRepository;

    
    public List<User> getAllUsers(){
        return userRepository.getAllUsers();
    }
    
    public User getUser(String id){
        return userRepository.getUser(id);
    }
    
    
    public void addUser(User user) {
        userRepository.addUser(user);
    }
    
    public User updateUser(User user){
        return userRepository.updateUser(user);
    }
    
    public User deleteUser(String id){
        return userRepository.deleteUser(id);
    }
}
