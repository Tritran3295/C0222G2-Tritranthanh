package controller;

import model.Customer;
import service.CustomerServiceImpl;
import service.ICustomerService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/CustomerServlet")
public class CustomerServlet extends HttpServlet {
    private ICustomerService iCustomerService = new CustomerServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                request.getRequestDispatcher("customer/create.jsp").forward(request, response);
                break;
            case "edit":
                break;
            case "delete":
                break;
            default:
                listCustomer(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                Integer id = Integer.valueOf(request.getParameter("id"));
                String name = request.getParameter("name");
                String email = request.getParameter("email");
                String address = request.getParameter("address");
                Customer customer = new Customer(id, name, email, address);
                this.iCustomerService.save(customer);
                response.sendRedirect("/CustomerServlet");
                break;
        }
    }

    private void listCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Customer> customerList = this.iCustomerService.findAll();
        request.setAttribute("customers", customerList);
        request.getRequestDispatcher("customer/list.jsp").forward(request, response);
    }
}

