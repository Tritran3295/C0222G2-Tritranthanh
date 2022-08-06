package com.case_study.controller;

import com.case_study.dto.ContractDTO;
import com.case_study.model.contact.Contact;
import com.case_study.model.contact.ContractDetail;
import com.case_study.service.contract.IAttachFacilityService;
import com.case_study.service.contract.IContractDetailService;
import com.case_study.service.contract.IContractService;
import com.case_study.service.customer.ICustomerService;
import com.case_study.service.employee.IEmployeeService;
import com.case_study.service.facility.IFacilityService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
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
    @Autowired
    private ICustomerService customerService;

    @Autowired
    private IEmployeeService employeeService;

    @Autowired
    private IFacilityService facilityService;

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
    @GetMapping("/create")
    public String showForm(Model model){
        model.addAttribute("contractList",new Contact());
        model.addAttribute("employeeList",employeeService.getAllEmployee());
        model.addAttribute("employeeList",customerService.getAllCustomer());
        model.addAttribute("employeeList",facilityService.getAllFacility());
        return "contract/create";
    }
    @PostMapping("/create")
    public String createContract(@Valid @ModelAttribute ContractDTO contractDTO, BindingResult bindingResult,Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("employeeList",employeeService.getAllEmployee());
            model.addAttribute("employeeList",customerService.getAllCustomer());
            model.addAttribute("employeeList",facilityService.getAllFacility());
            return "contract/create";
        }
        Contact contact = new Contact();
        BeanUtils.copyProperties(contractDTO,contact);
        contractService.save(contact);
        return "redirect:/contracts";
    }
    @PostMapping("/createDetailContract")
    public String saveDetailContract(@ModelAttribute ContractDetail contractDetail){
        contractService.saveDetailContract(contractDetail);
        return "redirect:/contract";
    }

}
