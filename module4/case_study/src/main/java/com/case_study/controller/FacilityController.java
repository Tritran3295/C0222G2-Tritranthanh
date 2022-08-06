package com.case_study.controller;

import com.case_study.dto.FacilityDTO;
import com.case_study.model.facility.Facility;
import com.case_study.service.facility.IFacilityService;
import com.case_study.service.facility.IFacilityTypeService;
import com.case_study.service.facility.IRentTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("/facility")
public class FacilityController {
    @Autowired
    private IFacilityService facilityService;

    @Autowired
    private IRentTypeService rentTypeService;

    @Autowired
    private IFacilityTypeService facilityTypeService;

    @GetMapping("")
    public String showList(Model model, @PageableDefault(value = 5)Pageable pageable, Optional<String> nameSearch){
        String searchName = nameSearch.orElse("");
        model.addAttribute("searchName",searchName);
        model.addAttribute("facilityTypeList",facilityTypeService.selectAll());
        model.addAttribute("rentTypeList",rentTypeService.selectAll());
        model.addAttribute("facilityList",facilityService.selectAll(searchName,pageable));
        return "facility/list1";
    }
    @GetMapping("/create")
    public String showFormCreate(Model model){
        model.addAttribute("facilityListDTO",new FacilityDTO());
        model.addAttribute("facilityTypeList",facilityTypeService.selectAll());
        model.addAttribute("rentTypeList",rentTypeService.selectAll());
        return "facility/create1";
    }
    @PostMapping("/create")
    public String createFacility(@Valid @ModelAttribute("facilityListDTO") FacilityDTO facilityDTO, BindingResult bindingResult,Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("facilityTypeList",facilityTypeService.selectAll());
            model.addAttribute("rentTypeList",rentTypeService.selectAll());
            return "facility/create1";
        }
        Facility facility = new Facility();
        BeanUtils.copyProperties(facilityDTO,facility);
        facilityService.save(facility);
        return "redirect:/facility";
    }
    @GetMapping("/edit/{id}")
    public String showFormEdit(@PathVariable int id,Model model){
        Facility facilityEdit = facilityService.findById(id);
        model.addAttribute("facilityList",facilityEdit);
        model.addAttribute("facilityTypeList",facilityTypeService.selectAll());
        model.addAttribute("rentTypeList",rentTypeService.selectAll());
        model.addAttribute("facilityTypeId",facilityEdit.getFacilityType().getId());
        return "facility/edit";
    }
    @PostMapping("/edit")
    public String editFacility(@ModelAttribute Facility facility){
        facilityService.update(facility);
        return "redirect:/facility";
    }
    @GetMapping("/delete/{id}")
    public String deleteFacility(@PathVariable int id){
        facilityService.delete(id);
        return "redirect:/facility";
    }
}
