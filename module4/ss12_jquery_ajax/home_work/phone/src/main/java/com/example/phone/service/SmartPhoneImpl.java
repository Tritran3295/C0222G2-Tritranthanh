package com.example.phone.service;

import com.example.phone.model.SmartPhone;
import com.example.phone.repository.ISmartPhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SmartPhoneImpl implements ISmartPhoneService{
    @Autowired
    private ISmartPhoneRepository smartPhoneRepository;
    @Override
    public List<SmartPhone> selectAll() {
        return smartPhoneRepository.findAll();
    }

    @Override
    public SmartPhone saveSmart(SmartPhone smartPhone) {
        return smartPhoneRepository.save(smartPhone);
    }

    @Override
    public Optional<SmartPhone> findSmartById(int id) {
        return smartPhoneRepository.findById(id);
    }

    @Override
    public void remove(int id) {
        smartPhoneRepository.deleteById(id);
    }
}
