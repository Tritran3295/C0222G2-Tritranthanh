package controller;

import model.Customer;
import model.CustomerType;
import service.CustomerServiceImpl;
import service.ICustomerService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CustomerController", value = "/Customer")
public class CustomerController extends HttpServlet {
    private ICustomerService iCustomerService = new CustomerServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showNewForm(request, response);
            default:
                listCutomer(request, response);
        }
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("Customer/create.jsp");
        requestDispatcher.forward(request, response);
    }

    private void listCutomer(HttpServletRequest request, HttpServletResponse response) {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createCustomer(request, response);

        }
    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) {
        Integer idCustomer = Integer.parseInt(request.getParameter("idCustomer"));
        String nameCustomer = request.getParameter("nameCustomer");
        String dateOfBirth = request.getParameter("dateOfBirth");
        Integer gender = request.getIntHeader("gender");
        String idCardNumber = request.getParameter("idCardNumber");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");



    }
}

