package com.example.phone.service;

import com.example.phone.model.SmartPhone;

import java.util.List;
import java.util.Optional;

public interface ISmartPhoneService {
    List<SmartPhone> selectAll();

    SmartPhone saveSmart(SmartPhone smartPhone);

    Optional<SmartPhone> findSmartById(int id);

    void remove(int id);
}
