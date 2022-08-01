package com.productvalidate.repository;

import com.productvalidate.model.HostProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHostProductRepository extends JpaRepository<HostProduct,Integer> {
}
