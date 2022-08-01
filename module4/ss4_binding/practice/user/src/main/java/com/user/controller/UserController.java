package com.user.controller;

import com.user.model.Login;
import com.user.model.User;
import com.user.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @GetMapping("/home")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("home","login",new Login());
        return modelAndView;
    }
    @PostMapping("login")
    public ModelAndView login(@ModelAttribute("login") Login login){
        User user = UserRepository.checkin(login);
        ModelAndView modelAndView;
        if(user ==  null){
            modelAndView = new ModelAndView("error");
        }else {
            modelAndView = new ModelAndView("user");
            modelAndView.addObject("user",user);
            return modelAndView;
        }return modelAndView;
    }
}
