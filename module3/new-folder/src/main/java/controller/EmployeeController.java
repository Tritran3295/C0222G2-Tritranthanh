package controller;

import common.Validate;
import model.DegreeEducation;
import model.Division;
import model.Employee.Employee;
import model.Position;
import repository.DivisionImpl.DivisionRepositoryImpl;
import repository.DivisionImpl.IDivisionRepository;
import repository.EducationDegreeImpl.EducationDegreeImpl;
import repository.EducationDegreeImpl.IEducationDegreeRepository;
import repository.PositionImpl.IPositionRepository;
import repository.PositionImpl.PositionRepositoryImpl;
import service.EmployeeService.EmployeeServiceImpl;
import service.EmployeeService.IEmployeeService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "EmployeeController", value = "/Employees")
public class EmployeeController extends HttpServlet {
    private IEmployeeService iEmployeeService = new EmployeeServiceImpl();
    private IDivisionRepository iDivisionRepository = new DivisionRepositoryImpl();
    private IEducationDegreeRepository iEducationDegreeRepository = new EducationDegreeImpl();
    private IPositionRepository iPositionRepository = new PositionRepositoryImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                displayEmployee(request,response);
            case "edit":
                showFormEditEmployee(request,response);
            case "search":
                searchByName(request,response);
            case "delete":
                deleteEmployee(request,response);
                break;
            default:
                listEmployee(request, response);
                break;

        }
    }

    private void searchByName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nameEmployee = request.getParameter("nameEmployee");
        List<Employee> employeeList = iEmployeeService.searchByName(nameEmployee);
        request.setAttribute("employeeList",employeeList);
        request.getRequestDispatcher("/Employee/list.jsp").forward(request,response);
    }

    private void showFormEditEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer idEmployee = Integer.parseInt(request.getParameter("id"));
        Employee existEmployee = iEmployeeService.getEmployeeById(idEmployee);
        List<Division> divisionList = iDivisionRepository.selectAllDivision();
        request.setAttribute("divisionList", divisionList);
        List<Position> positionList = iPositionRepository.selectAllPosition();
        request.setAttribute("positionList",positionList);
        List<DegreeEducation> degreeEducationList = iEducationDegreeRepository.selectAllDegreeEducation();
        request.setAttribute("degreeEducationList",degreeEducationList);
        request.setAttribute("editEmployee",existEmployee);
        request.getRequestDispatcher("/Employee/edit.jsp").forward(request,response);
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
            case "edit":
                updateEployee(request,response);
                break;




        }
    }

    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer idEmployee = Integer.valueOf(request.getParameter("id"));
        iEmployeeService.deleteEmployee(idEmployee);
        List<Employee> employeeList = iEmployeeService.selectAllEmployee();
        request.setAttribute("employeeList",employeeList);
        request.getRequestDispatcher("/Employee/list.jsp").forward(request,response);
    }

    private void updateEployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer idEmployee = Integer.parseInt(request.getParameter("id"));
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
        Employee employee = new Employee(idEmployee,nameEmployee,dayOfBirth,idCardEmployee,salary,phone,email,
                address,idPosition,idDegreeEducation,idDivision);
        iEmployeeService.update(employee);
        List<Employee> employeeList = iEmployeeService.selectAllEmployee();
        request.setAttribute("employeeList",employeeList);
        request.getRequestDispatcher("/Employee/list.jsp").forward(request,response);
    }

    private void createEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> errors = new HashMap<>();
        Map<String, String> errors1;
        Map<String, String> errors2;
        Map<String, String> errors3;
        Map<String, String> errors4;
        Map<String, String> errors5;
        Map<String, String> errors6;
        Map<String, String> errors7;
        Map<String, String> errors8;
        Map<String, String> errors9;

        String nameEmployee = request.getParameter("nameEmployee");
        String dayOfBirth = request.getParameter("dayOfBirth");
        String idCardEmployee = request.getParameter("idCardEmployee");
        String salary = request.getParameter("salary");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String idPosition = request.getParameter("idPosition");
        String idDegreeEducation = request.getParameter("idDegreeEducation");
        String idDivision = request.getParameter("idDivision");

        errors1= Validate.regexEmail(email);
        errors2= Validate.regexIdCard(idCardEmployee);
        errors3=Validate.regexNumberPhone(phone);
        errors4=Validate.regexName(nameEmployee);
        errors5=Validate.regexAddress(address);
        errors6=Validate.regexSalary(salary);
        errors7=Validate.regexPosition(idPosition);
        errors8=Validate.regexEducationDegree(salary);
        errors9=Validate.regexDivision(idDivision);

        errors.putAll(errors1);
        errors.putAll(errors2);
        errors.putAll(errors3);
        errors.putAll(errors4);
        errors.putAll(errors5);
        errors.putAll(errors6);
        errors.putAll(errors7);
        errors.putAll(errors8);
        errors.putAll(errors9);

        if (errors.isEmpty()) {
            Employee employee = new Employee(nameEmployee,dayOfBirth,idCardEmployee,Double.parseDouble(salary),phone,email,address,
                    Integer.parseInt(idPosition),Integer.parseInt(idDegreeEducation),Integer.parseInt(idDivision));
            iEmployeeService.add(employee);
            response.sendRedirect("/employees");
        } else {
            request.setAttribute("errors",errors);

            request.getRequestDispatcher("Employee/create.jsp").forward(request, response);
        }
    }

}