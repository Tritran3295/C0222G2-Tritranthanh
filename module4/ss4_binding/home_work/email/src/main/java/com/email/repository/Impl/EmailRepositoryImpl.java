package com.email.repository.Impl;

import com.email.model.Email;
import com.email.repository.IEmailRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmailRepositoryImpl implements IEmailRepository {
    List<Email> emailList = new ArrayList<>();
    @Override
    public void save(Email email) {
        emailList.add(email);
    }
}
