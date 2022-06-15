package controller;

import model.Book;
import repository.Book.BookRepositoryImpl;
import repository.Book.IBookRepository;
import service.CardBook.CardBookServiceImpl;
import service.CardBook.ICardBookService;
import service.Student.IStudentService;
import service.Student.StudentServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "BookController", value = "/Books")
public class BookController extends HttpServlet {
    private IBookRepository iBookRepository = new BookRepositoryImpl();
    private IStudentService iStudentService = new StudentServiceImpl();
    private ICardBookService iCardBookService = new CardBookServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){

            default:
                listBook(request,response);
                break;
        }
    }

    private void listBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Book> bookList = iBookRepository.selectAllBook();
        request.setAttribute("listBook",bookList);
        request.getRequestDispatcher("Book/list.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "borrow":
                borrowBook(request,response);
                break;
        }
    }

    private void borrowBook(HttpServletRequest request, HttpServletResponse response) {
        String codeBook = request.getParameter("codeBook");

    }
}
