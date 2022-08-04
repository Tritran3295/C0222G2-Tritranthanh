package com.case_study.service.contract;

import com.case_study.model.contact.ContractDetail;

import java.util.List;

public interface IContractDetailService {
    List<ContractDetail> selectAll();
}
