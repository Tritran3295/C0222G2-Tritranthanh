package com.example.phone.repository;

import com.example.phone.model.SmartPhone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISmartPhoneRepository extends JpaRepository<SmartPhone,Integer> {

}
