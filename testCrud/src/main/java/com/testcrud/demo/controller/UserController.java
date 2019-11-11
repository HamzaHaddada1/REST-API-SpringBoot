package com.testcrud.demo.controller;

import com.testcrud.demo.Services.UserService;
import com.testcrud.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public User addUser(@RequestBody User u){
        return userService.addUser(u);
    }
    @GetMapping("{name}")
    public List<User> FindByName(@PathVariable String name){
        return userService.FindUser(name);
    }
    @GetMapping("/letter/{letter}")
    public int counts(@PathVariable String letter){
        return userService.counts(letter);
    }
    @GetMapping("/khalils")
    public List<User> findkhalil(){
        return userService.findkhalil();
    }
    @PutMapping("/modifier/{id}")
    public User updateUser(@RequestBody User u ,@PathVariable Long id){
        return userService.updateUser(id,u);
    }
    @DeleteMapping("{id}")
    public String delete(@PathVariable Long id){
        userService.deleteUser(id);
        return "tfassa5";
    }

}
