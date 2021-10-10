package com.prakash.SpaApplication.controller;

import com.prakash.SpaApplication.model.User;
import com.prakash.SpaApplication.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {
    @Autowired
    private MyService service;

    @GetMapping("/users")
    public String getListOfUsers(){
         service.getAllUsers();
         return "index";

    }

    @GetMapping("/users/{username}")
    public User getUser(@PathVariable("username")String userName){
        return service.getUser(userName);
    }

   @PostMapping("/users/{userName}")
    public void addUser(@RequestBody User user,@PathVariable("userName")String userName){
        service.addUser(user);
   }


   @DeleteMapping("users/{userName}")

    public void deleteUser(@PathVariable("userName")String userName){
        service.deleteUser(userName);
   }


}
