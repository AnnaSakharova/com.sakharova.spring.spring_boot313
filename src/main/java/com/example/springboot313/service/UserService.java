package com.example.springboot313.service;

import com.example.springboot313.model.Role;
import com.example.springboot313.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User save(User user);

    User show(int id);

    User update(User user);

    Role showRole(int id);

    void delete(Integer id);

    User findByUserName(String userName);
}
