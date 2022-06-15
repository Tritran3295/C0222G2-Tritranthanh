package controller;

import model.RentBuilding;
import service.RentBuilding.IRentBuildingService;
import service.RentBuilding.RentBuildingServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "RentBuildingController", value = "/Rents")
public class RentBuildingController extends HttpServlet {
        private IRentBuildingService iRentBuildingService = new RentBuildingServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action){
            case "create":
                showFormCreate(request,response);
                break;
            default:
                listRent(request,response);
                break;
        }
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("Rent/create.jsp").forward(request,response);
    }

    private void listRent(HttpServletRequest request, HttpServletResponse response) {
        List<RentBuilding> rentBuildingList = iRentBuildingService.selectAllRentBuilding();
        request.setAttribute("rentBuildingList",rentBuildingList);
        RequestDispatcher requestDispatcher =request.getRequestDispatcher("/Rent/list.jsp");
        try {
            requestDispatcher.forward(request,response);
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
        switch (action){
            case "create":
                createRentBuilding(request,response);

                break;
        }
    }

    private void createRentBuilding(HttpServletRequest request, HttpServletResponse response) {
        String codeRentBuilding =request.getParameter("name");
        Integer status = Integer.valueOf(request.getParameter("status"));
        Double SRentBuilding = Double.valueOf(request.getParameter("SRentBuilding"));
        Integer floor = Integer.valueOf(request.getParameter("floor"));
        Integer typeRoom = Integer.valueOf(request.getParameter("typeRoom"));
        Double price = Double.valueOf(request.getParameter("price"));
        String dayStart = request.getParameter("dayStart");
        String dayEnd = request.getParameter("dayEnd");
        RentBuilding rentBuilding = new RentBuilding(codeRentBuilding,status,SRentBuilding,floor,typeRoom,price,
                dayStart,dayEnd);
        iRentBuildingService.add(rentBuilding);
        try {
            response.sendRedirect("/Rents");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
