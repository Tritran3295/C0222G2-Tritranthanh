package controller.employee;

import model.customer.customer.Customer;
import model.employee.division.Division;
import model.employee.educationDegree.EducationDegree;
import model.employee.employee.Employee;
import model.employee.position.Position;
import model.employee.user.User;
import service.employee.EmployeeServiceImpl;
import service.employee.IEmployeeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeServlet", value = "/employee")
public class EmployeeServlet extends HttpServlet {
    private IEmployeeService employeeService = new EmployeeServiceImpl();

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
                deleteEmployee(request,response);
                break;
            case "search":
                searchEmployee(request,response);
                break;
            default:
                listEmployee(request, response);
                break;
        }
    }

    private void searchEmployee(HttpServletRequest request, HttpServletResponse response) {
        String nameEmployee = request.getParameter("nameEmployee");
        request.setAttribute("employeeList",employeeService.findByName(nameEmployee));
        request.setAttribute("positionList",employeeService.selectAllPosition());
        request.setAttribute("educationDegreeList",employeeService.selectAllEducationDegree());
        request.setAttribute("divisionList",employeeService.selectAllDivision());
        try {
            request.getRequestDispatcher("/employee/list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) {
        int idEmployee = Integer.parseInt(request.getParameter("id"));
        employeeService.deleteEmployee(idEmployee);
        try {
            response.sendRedirect("/employee");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        int idEmployee = Integer.parseInt(request.getParameter("id"));
        Employee employee = employeeService.findById(idEmployee);
        try {
            request.setAttribute("idEmployee",employee.getIdEmployee());
            request.setAttribute("nameEmployee",employee.getNameEmployee());
            request.setAttribute("dateOfBirth",employee.getDateOfBirth());
            request.setAttribute("idCard",employee.getIdCard());
            request.setAttribute("salary",employee.getSalary());
            request.setAttribute("phoneNumber",employee.getPhoneNumber());
            request.setAttribute("email",employee.getEmail());
            request.setAttribute("address",employee.getAddress());
            request.setAttribute("idPosition1",employee.getIdPosition());
            request.setAttribute("idEducationDegree1",employee.getIdEducationDegree());
            request.setAttribute("idDivision1",employee.getIdDivision());
            request.setAttribute("status",employee.getStatus());
            request.setAttribute("positionList",employeeService.selectAllPosition());
            request.setAttribute("educationDegreeList",employeeService.selectAllEducationDegree());
            request.setAttribute("divisionList",employeeService.selectAllDivision());
            request.getRequestDispatcher("/employee/edit.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        List<Position> positionList = employeeService.selectAllPosition();
        List<EducationDegree> educationDegreeList = employeeService.selectAllEducationDegree();
        List<Division> divisionList = employeeService.selectAllDivision();
        request.setAttribute("positionList",positionList);
        request.setAttribute("educationDegreeList",educationDegreeList);
        request.setAttribute("divisionList",divisionList);
        try {
            request.getRequestDispatcher("/employee/create.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void listEmployee(HttpServletRequest request, HttpServletResponse response) {
        List<Employee> employeeList = employeeService.selectAllEmployee();
        List<Position> positionList = employeeService.selectAllPosition();
        List<EducationDegree> educationDegreeList = employeeService.selectAllEducationDegree();
        List<Division> divisionList = employeeService.selectAllDivision();
        request.setAttribute("employeeList", employeeList);
        request.setAttribute("positionList", positionList);
        request.setAttribute("educationDegreeList", educationDegreeList);
        request.setAttribute("divisionList", divisionList);
        try {
            request.getRequestDispatcher("/employee/list.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
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
                createEmployee(request, response);
                break;
            case "edit":
                updateEmployee(request,response);
                break;
        }
    }

    private void updateEmployee(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String nameEmployee = request.getParameter("nameEmployee");
        String dateOfBirth = request.getParameter("dateOfBirth");
        String idCard = request.getParameter("idCard");
        Double salary = Double.valueOf(request.getParameter("salary"));
        String phoneNumber = request.getParameter("phoneNumber");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int idPosition = Integer.parseInt(request.getParameter("idPosition"));
        int idEducationDegree = Integer.parseInt(request.getParameter("idEducationDegree"));
        int idDivision = Integer.parseInt(request.getParameter("idDivision"));
        int status = Integer.parseInt(request.getParameter("status"));
        Employee employee = new Employee(id,nameEmployee,dateOfBirth,idCard,salary,phoneNumber,email,address,idPosition,
                idEducationDegree,idDivision,status);
        employeeService.update(employee);
        try {
            response.sendRedirect("/employee");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createEmployee(HttpServletRequest request, HttpServletResponse response) {
        String nameEmployee = request.getParameter("nameEmployee");
        String dateOfBirth = request.getParameter("dateOfBirth");
        String idCard = request.getParameter("idCard");
        Double salary = Double.valueOf(request.getParameter("salary"));
        String phoneNumber = request.getParameter("phoneNumber");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int idPosition = Integer.parseInt(request.getParameter("idPosition"));
        int idEducationDegree = Integer.parseInt(request.getParameter("idEducationDegree"));
        int idDivision = Integer.parseInt(request.getParameter("idDivision"));
        Employee employee = new Employee(nameEmployee,dateOfBirth,idCard,salary,phoneNumber,email,address,idPosition,
                idEducationDegree,idDivision);
        employeeService.add(employee);
        try {
            response.sendRedirect("/employee");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
