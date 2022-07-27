package com.example.bookborrow.controller;

import com.example.bookborrow.model.Book;
import com.example.bookborrow.model.Borrow;
import com.example.bookborrow.service.IBookService;
import com.example.bookborrow.service.IBorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    private IBookService bookService;
    @Autowired
    private IBorrowService borrowService;
    @GetMapping("")
    public String showList(Model model){
        model.addAttribute("bookList",bookService.selectAll());
        model.addAttribute("borrowList",borrowService.selectAll());
        return "list";
    }
    @GetMapping("/borrow/{id}")
    public String borrow(@PathVariable int id, Model model){
        Book book = bookService.findById(id);
//        if(book.getCount() == 0){
//            throw new Exception();
//        }
        book.setCount(book.getCount()-1);
        Borrow borrow = new Borrow();
        long codeBook = (long) (Math.random() * (999999 - 10000) + 10000);
        borrow.setCodeBook(codeBook);

        List<Borrow> borrows = book.getBorrow();
        borrows.add(borrow);
        bookService.save(book);
        model.addAttribute("borrowList",borrow);
        return "borrow";
    }
}
