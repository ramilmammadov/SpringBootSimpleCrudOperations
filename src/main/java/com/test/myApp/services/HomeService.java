package com.test.myApp.services;

import com.test.myApp.models.User;
import com.test.myApp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        List<User> list = new ArrayList<>();
        userRepository.findAll().forEach(list::add);
        return list;
    }

    public List<User> saveUser(User user) {
        userRepository.save(user);
        List<User> list = new ArrayList<>();
        userRepository.findAll().forEach(list::add);
        return list;
    }

    public User getUser(int id) {
        return userRepository.findById(id).get();
    }

    public List<User> deleteUser(int id) {
        userRepository.deleteById(id);
        List<User> list = new ArrayList<>();
        userRepository.findAll().forEach(list::add);
        return list;
    }

    public List<User> updateUser(User user) {
        userRepository.save(user);
        List<User> list = new ArrayList<>();
        userRepository.findAll().forEach(list::add);
        return list;
    }
}
