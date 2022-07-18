package com.email.service.Impl;

import com.email.model.Email;
import com.email.repository.IEmailRepository;
import com.email.service.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailServiceImpl implements IEmailService {
    @Autowired
    private IEmailRepository emailRepository;


    @Override
    public void save(Email email) {
        emailRepository.save(email);
    }
}
