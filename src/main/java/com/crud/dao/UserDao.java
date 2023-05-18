package com.crud.dao;

import com.crud.models.User;

import java.util.List;

public interface UserDao {
    List<User> getListUsers();
    User getUser(Long id);
    void saveUser(User user);
    void deleteUser(Long id);
}
