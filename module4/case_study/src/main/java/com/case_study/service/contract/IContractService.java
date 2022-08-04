package com.case_study.service.contract;

import com.case_study.model.contact.Contact;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IContractService {
    Page<Contact> selectAll(Pageable pageable);

    Page<Contact> selectAllCustomerUsing(String searchName, Pageable pageable);
}
