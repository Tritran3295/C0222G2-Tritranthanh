package com.example.productupdate.repository;

import com.example.productupdate.model.HostProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHostProductRepository extends JpaRepository<HostProduct, Integer> {

}
