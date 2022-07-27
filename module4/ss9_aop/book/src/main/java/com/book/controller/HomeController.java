package com.book.controller;

import com.book.model.Book;
import com.book.model.Oder;
import com.book.service.IBookService;
import com.book.service.IOderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private IBookService bookService;
    @Autowired
    private IOderService oderService;

    @GetMapping("")
    public String showList(Model model){
        model.addAttribute("bookList",bookService.findAll());
        return "home";
    }
    @GetMapping("/oder/{id}")
    public ModelAndView oder(@PathVariable int id ){
        Book book = bookService.findById(id);

        if(book.getCount() == 0){
            throw new Exception();
        }
        book.setCount(book.getCount()-1);
        Oder oder = new Oder();
        long code = (long)(Math.random() * (99999 - 10000) + 10000);
        oder.setCode(code);

        List<Oder> oders = book.getList();
        oders.add(oder);
        book.setList(oders);
        bookService.save(book);
        ModelAndView modelAndView = new ModelAndView("redirect:/home");
        return modelAndView;
    }
}
