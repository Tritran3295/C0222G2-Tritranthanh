package com.example.exam.controller;

import com.example.exam.dto.NewsDto;
import com.example.exam.model.News;
import com.example.exam.service.INewsService;
import com.example.exam.service.IOptionNewsService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private INewsService newsService;

    @Autowired
    private IOptionNewsService optionNewsService;

    @GetMapping("")
    public String showList(Model model){
        model.addAttribute("newsList",newsService.selectAll());
        model.addAttribute("optionNewsList",optionNewsService.selectAll());
        return "list";
    }
    @GetMapping("/delete/{id}")
    public String deleteNews(@PathVariable int id){
        newsService.delete(id);
        return "redirect:/news";
    }
    @GetMapping("/show-detail/{id}")
    public String showDetails(Model model,@PathVariable int id){
        model.addAttribute("newsList",newsService.findById(id));
        return "/news";
    }
    @GetMapping("/create")
    public String showFormCreate(Model model){
        model.addAttribute("newsListDTO",new NewsDto());
        model.addAttribute("optionNewsList",optionNewsService.selectAll());
        return "create";
    }
    @PostMapping("/create")
    public String createNews(@Valid @ModelAttribute("newsListDTO") NewsDto newsDto, BindingResult bindingResult,Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("optionNewsList",optionNewsService.selectAll());
            return "create";
        }
        News news1 = new News();
        BeanUtils.copyProperties(newsDto,news1);
        newsService.save(news1);
        return "redirect:/news";
    }
    @GetMapping("/searchByName")
    public String searchByName(@ModelAttribute String searchName,Model model){
       model.addAttribute("newsList",newsService.findByName(searchName)) ;
        return "list";
    }
}
