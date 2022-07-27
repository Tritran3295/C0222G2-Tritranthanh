package com.example.productupdate.repository;

import com.example.productupdate.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IProductRepository extends JpaRepository<Product, Integer> {
    @Query(value = " select * from product where name_product like :searchName ", nativeQuery = true,
            countQuery = " select count(*) from (select * from product where name_product like :searchName ) temp_table ")
    Page<Product> findAll(@Param("searchName") String searchName, Pageable pageable);


}

