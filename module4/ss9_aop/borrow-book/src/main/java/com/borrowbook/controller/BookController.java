package com.borrowbook.controller;

import com.borrowbook.model.Book;
import com.borrowbook.service.IBookService;
import com.borrowbook.service.ICodeBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    private ICodeBookService codeBookService;
    @Autowired
    private IBookService bookService;

    @GetMapping("")
    public String showList(@PageableDefault(value = 2)Pageable pageable, Optional<String> nameSearch,Model model){
        String searchName = nameSearch.orElse("");
        model.addAttribute("searchName",searchName);
        model.addAttribute("bookList",bookService.selectAll(searchName,pageable));
        model.addAttribute("codeBookList",codeBookService.selectAll());
        return "index";
    }
    @GetMapping("/create")
    public String showFormCreate(Model model){
        model.addAttribute("bookList",new Book());
        model.addAttribute("codeBookList",codeBookService.selectAll());
        return "create";
    }
    @PostMapping("/create")
    public String create(@ModelAttribute Book book){
        bookService.save(book);
        return "redirect:/books";
    }
    @GetMapping("/show-detail/{id}")
    public String showDetail(@PathVariable int id,Model model){
        model.addAttribute("books",bookService.findById(id));
        return "/books";
    }
    @GetMapping("/borrow")
    public String borrow(@RequestParam Optional<Integer> id,Model model){
        if(id.isPresent()){
            bookService.borrowBook(id.get());
        }
        return "index";
    }
}
