package com.example.springboot313.controllers;

import com.example.springboot313.model.User;
import com.example.springboot313.service.RoleService;
import com.example.springboot313.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class MyRestController {

    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;


    @GetMapping("/allusers")
    public List<User> list() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getOne(@PathVariable Integer id) {
        return userService.show(id);
    }

    @PostMapping("/newUser")
    public User addUserBd(@RequestBody User user) {
        User user1 = user;
        return userService.save(user1);
    }

    @PutMapping("/edit")
    public User update(@RequestBody User user) {
        return userService.update(user);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id) {
        userService.delete(id);
    }
}

