package com.case_study.controller;

import com.case_study.service.contract.IAttachFacilityService;
import com.case_study.service.contract.IContractDetailService;
import com.case_study.service.contract.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("/contracts")
public class ContractController {
    @Autowired
    private IContractService contractService;

    @Autowired
    private IAttachFacilityService attachFacilityService;

    @Autowired
    private IContractDetailService contractDetailService;

    @GetMapping("")
    public String showList(Model model, @PageableDefault(value = 5)Pageable pageable){
        model.addAttribute("contractList",contractService.selectAll(pageable));
        model.addAttribute("contractDetailList",contractDetailService.selectAll());
        model.addAttribute("attachFacilityList",attachFacilityService.selectAll());
        return "contract/list";
    }
    @GetMapping("/customer-using-service")
    public String listCustomerUsing(Model model, @PageableDefault(value = 5)Pageable pageable, Optional<String> nameSearch){
        String searchName = nameSearch.orElse("");
        model.addAttribute("searchName",searchName);
        model.addAttribute("customerUsingService",contractService.selectAllCustomerUsing(searchName,pageable));
        return "contract/customer-using-service";
    }

}
