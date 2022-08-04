package com.case_study.service.contract;

import com.case_study.model.contact.ContractDetail;
import com.case_study.repository.contract.IContractDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractDetailServiceImpl implements IContractDetailService{
    @Autowired
    private IContractDetailRepository contractDetailRepository;

    @Override
    public List<ContractDetail> selectAll() {
        return contractDetailRepository.findAll();
    }
}
