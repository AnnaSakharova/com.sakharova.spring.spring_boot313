package com.example.springboot313.controllers;

import com.example.springboot313.model.User;
import com.example.springboot313.service.RoleServiceImpl;
import com.example.springboot313.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("")
public class MyController {

    @GetMapping(value = "/admin")
    public String showAllUsers(ModelMap model) {
        return "users";
    }


    @GetMapping(value = "/user")
    public String user() {
        return "userPage";
    }


    @PatchMapping(value = "/{id}")
    public String update(@ModelAttribute("user") User user,
                         @RequestParam(value = "select_roles", required = false) String[] role) {
        return "redirect:/admin";
    }

}