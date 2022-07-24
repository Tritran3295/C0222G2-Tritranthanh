package com.blog.controller;

import com.blog.dto.BlogDTO;
import com.blog.model.Blog;
import com.blog.service.IBlogService;
import com.blog.service.ICategoryService;
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
@RequestMapping("/bloggers")
public class BlogController {
    @Autowired
    private IBlogService blogService;
    @Autowired
    private ICategoryService categoryService;

    @GetMapping("")
    public String showList(Model model, @PageableDefault(value = 3) Pageable pageable, Optional<String> nameSearch) {
        String searchName = nameSearch.orElse("");
        model.addAttribute("searchName", searchName);
        model.addAttribute("categoryList", categoryService.selectAll());
        model.addAttribute("blogList", blogService.findAll(searchName, pageable));
        return "index";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("blogDTO", new Blog());
        model.addAttribute("categoryList", categoryService.selectAll());
        return "create";
    }

    @PostMapping("/create")
    public String create(@Valid @ModelAttribute BlogDTO blogDTO, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("categoryList", categoryService.selectAll());
            return "create";
        }
        Blog blog = new Blog();
        BeanUtils.copyProperties(blogDTO, blog);
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
        model.addAttribute("categoryList", categoryService.selectAll());
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Blog blog) {
        blogService.update(blog);
        return "redirect:/bloggers";
    }
}
