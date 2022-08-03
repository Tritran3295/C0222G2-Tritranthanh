package com.case_study.repository.customer;

import com.case_study.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer,Integer> {

    @Query(value = " select * from customer where name_customer like :searchName or address like :searchName ", nativeQuery = true,
            countQuery = " select count(*) from (select * from customer where name_customer like :searchName or address like :searchName ) temp_table ")
    Page<Customer> findAll(@Param("searchName") String searchName, Pageable pageable);

    @Modifying
    @Transactional
    @Query(value = "update customer set status = 1 where customer.id= :id", nativeQuery = true)
    void deleteCustomer(int id);
}
