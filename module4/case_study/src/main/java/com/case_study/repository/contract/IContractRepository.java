package com.case_study.repository.contract;

import com.case_study.model.contact.Contact;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IContractRepository extends JpaRepository<Contact,Integer> {
    @Query(value = "select ct.* from contact ct                \n" +
            "join customer c on ct.customer_id = c.id                \n" +
            "join facility fa on ct.facility_id = fa.id     \n" +
            " join contract_detail dct on dct.contract_id = ct.id               \n" +
            " join attach_facility afa on dct.attach_detail_id = afa.id              \n" +
            " where c.name_customer like :searchName \n" +
            " group by c.id , fa.id",
            nativeQuery = true,countQuery = "select count(*) from(select ct.* from contact ct                \n" +
            "            \"join customer c on ct.customer_id = c.id                \n" +
            "            \"join facility fa on ct.facility_id = fa.id     n" +
            "            \" join contract_detail dct on dct.contract_id = ct.id              \n" +
            "            \" join attach_facility afa on dct.attach_detail_id = afa.id             \n" +
            "            \" where c.name_customer like :searchName \n" +
            "            \" group by c.id , fa.id)"
    )       
    Page<Contact> selectAllCustomerUsing(@Param("searchName") String searchName, Pageable pageable);
}
