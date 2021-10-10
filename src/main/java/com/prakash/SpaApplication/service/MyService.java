package com.prakash.SpaApplication.service;

import com.prakash.SpaApplication.model.User;
import com.prakash.SpaApplication.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyService {
    @Autowired
    private MyRepository myRepository;

    public List<User>getAllUsers(){
        List<User>userList=new ArrayList<>();
        myRepository.findAll().forEach(userList::add);
        return userList;
    }
    public User getUser(String name){
        return myRepository.findById(name).get();
    }

    public void addUser(User user){
        myRepository.save(user);
    }

    public void updateUser(User user,String name){

        myRepository.save(user);
    }
    public void deleteUser(String name){
        myRepository.deleteById(name);
    }







}
