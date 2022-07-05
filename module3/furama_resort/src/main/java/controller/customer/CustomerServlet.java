package controller.customer;

import model.customer.customer.Customer;
import model.customer.customerType.CustomerType;
import service.customer.CustomerServiceImpl;
import service.customer.ICustomerService;
import service.customerType.CustomerTypeServiceImpl;
import service.customerType.ICustomerTypeService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customer")
public class CustomerServlet extends HttpServlet {
    private ICustomerService customerService = new CustomerServiceImpl();
    private ICustomerTypeService customerTypeService = new CustomerTypeServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showFormCreate(request, response);
                break;
            case "edit":
                showFormEdit(request,response);
                break;
            case "delete":
                deleteCustomer(request,response);
                break;
            case "search":
                searchByName(request,response);
                break;
            default:
                listCustomer(request, response);
                break;
        }
    }

    private void searchByName(HttpServletRequest request, HttpServletResponse response) {
        String nameCustomer = request.getParameter("nameCustomer");
        request.setAttribute("customerTypeList",customerTypeService.selectAllCustomerType());
        request.setAttribute("customerList",customerService.findByName(nameCustomer));
        try {
            request.getRequestDispatcher("/customer/list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        int idCustomer = Integer.parseInt(request.getParameter("id"));
        customerService.deleteCustomer(idCustomer);
        try {
            response.sendRedirect("/customer");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        int idCustomer = Integer.parseInt(request.getParameter("id"));
        Customer customer = customerService.findById(idCustomer);

        try {
            request.setAttribute("idCustomer",customer.getIdCustomer());
            request.setAttribute("nameCustomer",customer.getNameCustomer());
            request.setAttribute("dateOfBirth",customer.getDayOfBirth());
            request.setAttribute("gender",customer.getGender());
            request.setAttribute("idCard",customer.getIdCard());
            request.setAttribute("numberPhone",customer.getPhoneNumber());
            request.setAttribute("email",customer.getEmail());
            request.setAttribute("address",customer.getAddress());
            request.setAttribute("status",customer.getStatus());
            request.setAttribute("customerType",customer.getIdCustomerType());
            request.setAttribute("customerTypeList",customerTypeService.selectAllCustomerType());
            request.getRequestDispatcher("/customer/edit.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("/customer/create.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void listCustomer(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList = customerService.selectAllCustomer();
        List<CustomerType> customerTypeList = customerTypeService.selectAllCustomerType();
        request.setAttribute("customerList", customerList);
        request.setAttribute("customerTypeList", customerTypeList);
        try {
            request.getRequestDispatcher("/customer/list.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
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
                createCustomer(request, response);
                break;
            case "edit":
                editCustomer(request,response);
                break;
        }
    }

    private void editCustomer(HttpServletRequest request, HttpServletResponse response) {
        int idEdit = Integer.parseInt(request.getParameter("id"));
        String nameCustomer = request.getParameter("nameCustomer");
        String dayOfBirth = request.getParameter("dayOfBirth");
        int gender = Integer.parseInt(request.getParameter("gender"));
        String idCard = request.getParameter("idCard");
        String phoneNumber = request.getParameter("phoneNumber");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int idCustomerType = Integer.parseInt(request.getParameter("idCustomerType"));
        int status = Integer.parseInt(request.getParameter("status"));
        Customer customer = new Customer(idEdit,nameCustomer,dayOfBirth,gender,idCard,phoneNumber,email,address,
                idCustomerType,status);
        customerService.update(customer);
        try {
            response.sendRedirect("/customer");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) {
        String nameCustomer = request.getParameter("nameCustomer");
        String dayOfBirth = request.getParameter("dayOfBirth");
        int gender = Integer.parseInt(request.getParameter("gender"));
        String idCard = request.getParameter("idCard");
        String phoneNumber = request.getParameter("phoneNumber");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int idCustomerType = Integer.parseInt(request.getParameter("idCustomerType"));
        Customer customer = new Customer(nameCustomer,dayOfBirth,gender,idCard,phoneNumber,email,address,idCustomerType);
        customerService.add(customer);
        try {
            response.sendRedirect("/customer");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
