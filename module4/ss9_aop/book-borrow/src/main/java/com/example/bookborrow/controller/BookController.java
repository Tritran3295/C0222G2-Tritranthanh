package com.example.bookborrow.controller;

import com.example.bookborrow.model.Book;
import com.example.bookborrow.model.Borrow;
import com.example.bookborrow.service.IBookService;
import com.example.bookborrow.service.IBorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
//    @GetMapping("/borrow/{id}")
//    public String borrow(@PathVariable int id, Model model){
//        Book book = bookService.findById(id);
////        if(book.getCount() == 0){
////            throw new Exception();
////        }
//        book.setCount(book.getCount()-1);
//        Borrow borrow = new Borrow();
//        long codeBook = (long) (Math.random() * (999999 - 10000) + 10000);
//        borrow.setCodeBook(codeBook);
//
//        List<Borrow> borrows = book.getBorrow();
//        borrows.add(borrow);
//        bookService.save(book);
//        model.addAttribute("borrowList",borrow);
//        return "borrow";
//    }
    @GetMapping("/borrow/{id}")
    public String showBorrowBook(@PathVariable int id,Model model){
        Book book = bookService.findById(id);
        model.addAttribute("book",book);
        return "borrow";
    }
    @PostMapping("/borrow")
    public String borrowBook(@ModelAttribute Book book, RedirectAttributes redirectAttributes){
        int code = (int) (Math.random() * 1000);
        borrowService.saveBorrow(code,book.getId());
        bookService.borrow(book);
        redirectAttributes.addFlashAttribute("msg","Borrow" + book.getNameBook() + "success and your'code Book is " + code);
        return "redirect:/books";
    }
}
