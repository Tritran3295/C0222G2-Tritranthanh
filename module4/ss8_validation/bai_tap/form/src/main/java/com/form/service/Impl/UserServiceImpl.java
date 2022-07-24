package com.form.service.Impl;

import com.form.model.User;
import com.form.repository.IUserRepository;
import com.form.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserRepository userRepository;
    @Override
    public List<User> selectAll() {
        return userRepository.findAll();
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
