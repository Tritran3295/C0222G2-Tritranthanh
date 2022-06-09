package controller;

import model.Employee.Employee;
import service.EmployeeService.EmployeeServiceImpl;
import service.EmployeeService.IEmployeeService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeController", value = "/Employees")
public class EmployeeController extends HttpServlet {
    private IEmployeeService iEmployeeService = new EmployeeServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                displayEmployee(request,response);
            default:
                listEmployee(request, response);
                break;

        }
    }

    private void listEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Employee> employeeList = iEmployeeService.selectAllEmployee();
        request.setAttribute("employeeList",employeeList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("Employee/list.jsp");
        requestDispatcher.forward(request,response);
    }

    private void displayEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("Employee/create.jsp");
        requestDispatcher.forward(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createEmployee(request, response);
                break;


        }
    }

    private void createEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nameEmployee = request.getParameter("nameEmployee");
        String dayOfBirth = request.getParameter("dayOfBirth");
        String idCardEmployee = request.getParameter("idCardEmployee");
        Double salary = Double.parseDouble(request.getParameter("salary"));
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Integer idPosition = Integer.parseInt(request.getParameter("idPosition"));
        Integer idDegreeEducation = Integer.parseInt(request.getParameter("idDegreeEducation"));
        Integer idDivision = Integer.parseInt(request.getParameter("idDivision"));
        Employee employee = new Employee(nameEmployee,dayOfBirth,idCardEmployee,salary,phone,email,address,
                idPosition,idDegreeEducation,idDivision);
        iEmployeeService.add(employee);
       response.sendRedirect("/Employees");


    }

}