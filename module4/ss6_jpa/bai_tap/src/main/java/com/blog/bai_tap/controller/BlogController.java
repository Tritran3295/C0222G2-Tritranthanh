package com.blog.bai_tap.controller;

import com.blog.bai_tap.model.Blog;
import com.blog.bai_tap.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/bloggers")
public class BlogController {
    @Autowired
    private IBlogService blogService;

    @GetMapping("")
    public String showList(Model model) {
        model.addAttribute("blogList", blogService.findAll());
        return "index";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("blogs", new Blog());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Blog blog) {
        blogService.save(blog);
        return "redirect:/bloggers";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        blogService.delete(id);
        return "redirect:/bloggers";
    }

    @GetMapping("/edit/{id}")
    public String showFormEdit(@PathVariable int id, Model model) {
        model.addAttribute("blogs", blogService.findById(id));
        return "edit";
    }

    @PostMapping("edit")
    public String update(@ModelAttribute Blog blog) {
        blogService.save(blog);
        return "redirect:/bloggers";
    }

    @GetMapping("/show-detail/{id}")
    public String showDetails(Model model, @PathVariable int id) {
        model.addAttribute("blogs", blogService.findById(id));
        return "/bloggers";
    }
}
