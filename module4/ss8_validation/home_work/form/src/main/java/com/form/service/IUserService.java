package com.form.service;

import com.form.model.User;

import java.util.List;

public interface IUserService {
    List<User> selectAll();

    void save(User user);
}
