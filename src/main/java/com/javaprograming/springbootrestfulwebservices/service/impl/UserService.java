package com.javaprograming.springbootrestfulwebservices.service.impl;

import com.javaprograming.springbootrestfulwebservices.entity.User;

import java.util.List;

public interface UserService {

    User createUser(User user);

    User getUserById(long userId);
    List<User> getAllUsers();

    User updateUser(User user);

    void deleteUser(Long userId);
}
