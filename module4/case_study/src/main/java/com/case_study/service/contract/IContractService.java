package com.case_study.service.contract;

import com.case_study.model.contact.Contact;
import com.case_study.model.contact.ContractDetail;
import com.case_study.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IContractService {
    Page<Contact> selectAll(Pageable pageable);

    Page<Contact> selectAllCustomerUsing(String searchName, Pageable pageable);


    void save(Contact contact);

    void saveDetailContract(ContractDetail contractDetail);
}
