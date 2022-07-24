package com.form.controller;

import com.form.dto.UserDTO;
import com.form.model.User;
import com.form.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("")
    public String showList(Model model) {
        model.addAttribute("userList", userService.selectAll());
        return "index";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("userDTO", new UserDTO());
        return "create";
    }

    @PostMapping("/validateUser")
    public String checkValidation(@Valid @ModelAttribute("userDTO") UserDTO userDTO, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "create";
        } else {
            User user = new User();
            BeanUtils.copyProperties(userDTO, user);
            userService.save(user);
            redirectAttributes.addFlashAttribute("success", "Register success!");
            return "redirect:/users";
        }
    }
}
