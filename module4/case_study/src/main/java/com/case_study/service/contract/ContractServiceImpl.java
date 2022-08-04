package com.case_study.service.contract;

import com.case_study.model.contact.Contact;
import com.case_study.repository.contract.IContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ContractServiceImpl implements IContractService{
    @Autowired
    private IContractRepository contractRepository;

    @Override
    public Page<Contact> selectAll( Pageable pageable) {
        return contractRepository.findAll(pageable);
    }

    @Override
    public Page<Contact> selectAllCustomerUsing(String searchName, Pageable pageable) {
        return contractRepository.selectAllCustomerUsing("%" + searchName + "%",pageable);
    }
}
