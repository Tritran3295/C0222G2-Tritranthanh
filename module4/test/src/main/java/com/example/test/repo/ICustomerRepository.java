package com.example.test.repo;

import com.example.test.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer,Integer> {
    @Query(value = "select * from customer where name like :searchName or address like :searchName " +
            " or country like :searchName",nativeQuery = true,
    countQuery = "select count(*) from(select * from customer where name like :searchName or address like :searchName \" +\n" +
            "            \" or country like :searchName) temp_table")
    Page<Customer> selectAll(String searchName, Pageable pageable);
}
