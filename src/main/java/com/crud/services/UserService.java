package com.crud.services;

import com.crud.models.User;

import java.util.List;

public interface UserService {
    List<User> getListUsers();
    User getUser (Long id);
    void saveUser(User user);
    void deleteUser(Long id);
}
