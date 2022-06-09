package controller;

import model.Customer.Customer;
import model.Customer.CustomerType;
import repository.CustomerImpl.CustomerTypeRepositoryImpl;
import repository.CustomerImpl.ICustomerTypeRepository;
import service.CustomerService.CustomerServiceImpl;
import service.CustomerService.ICustomerService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerController", value = "/Customers")
public class CustomerController extends HttpServlet {
    private ICustomerService iCustomerService = new CustomerServiceImpl();
    private ICustomerTypeRepository iCustomerTypeRepository = new CustomerTypeRepositoryImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                displayCustomer(request, response);
                break;
            case "edit":
                showEditCustomer(request, response);
                break;
            case "search":
                searchCustomer(request, response);
                break;
            case "delete":
                deleteCustomer(request,response);
            default:
                listCustomer(request, response);
                break;

        }
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer idCustomer = Integer.parseInt(request.getParameter("id"));
        iCustomerService.deleteCustomer(idCustomer);
        List<Customer> customerList = iCustomerService.selectAllCustomer();
        request.setAttribute("listCustomer",customerList);
        request.getRequestDispatcher("/Customer/list.jsp").forward(request,response);

    }

    private void showEditCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer idCustomer = Integer.valueOf(request.getParameter("id"));
        Customer existingCustomer = iCustomerService.getCustomerById(idCustomer);

        List<CustomerType> customerTypeList = iCustomerTypeRepository.selectAllCustomerType();
        request.setAttribute("listCustomerType", customerTypeList);
        request.setAttribute("editCustomer", existingCustomer);
        request.getRequestDispatcher("Customer/edit.jsp").forward(request, response);

    }

    private void displayCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("Customer/create.jsp").forward(request, response);
    }

    private void listCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = iCustomerService.selectAllCustomer();
        request.setAttribute("listCustomer", customerList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("Customer/list.jsp");
        requestDispatcher.forward(request, response);
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
            case "edit":
                updateCustomer(request, response);

                break;

        }
    }

    private void searchCustomer(HttpServletRequest request, HttpServletResponse response) {
        String nameCustomer = request.getParameter("nameCustomer");
        List<Customer> customerList = iCustomerService.searchByName(nameCustomer);
        try {
            request.setAttribute("listCustomer", customerList);
            request.getRequestDispatcher("/Customer/list.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }


    private void updateCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Integer id = Integer.valueOf(request.getParameter("id"));
        String customerName = request.getParameter("nameCustomer");
        String dayOfBirth = request.getParameter("birthday");
        Integer genderCustomer = Integer.parseInt(request.getParameter("gender"));
        String idCardCustomer = request.getParameter("idCard");
        String phoneCustomer = request.getParameter("phone");
        String emailCustomer = request.getParameter("email");
        String addressCustomer = request.getParameter("address");
        Integer customerTypeId = Integer.parseInt(request.getParameter("idTypeCustomer"));
        Customer customerUpdate = new Customer(id, customerName, dayOfBirth, genderCustomer, idCardCustomer, phoneCustomer, emailCustomer, addressCustomer, customerTypeId);
        iCustomerService.update(customerUpdate);
        List<Customer> customerList = iCustomerService.selectAllCustomer();
        request.setAttribute("listCustomer", customerList);
        request.getRequestDispatcher("Customer/list.jsp").forward(request, response);

    }


    private void createCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String nameCustomer = request.getParameter("nameCustomer");
        String birthday = request.getParameter("birthday");
        Integer gender = Integer.parseInt(request.getParameter("gender"));
        String idCard = request.getParameter("idCard");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Integer idTypeCustomer = Integer.parseInt(request.getParameter("idTypeCustomer"));
        Customer customer = new Customer(nameCustomer, birthday, gender, idCard, phone, email, address, idTypeCustomer);
        iCustomerService.add(customer);
        response.sendRedirect("/Customers");
    }


}
