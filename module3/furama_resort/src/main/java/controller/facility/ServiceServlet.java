package controller.facility;

import model.facility.Facility;
import model.facilityType.FacilityType;
import model.rentType.RentType;
import service.facility.FacilityServiceImpl;
import service.facility.IFacilityService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServiceServlet", value = "/service")
public class ServiceServlet extends HttpServlet {
    private IFacilityService facilityService = new FacilityServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action){
            case "create":
                showFormService(request,response);
                break;
            default:
                listService(request,response);
                break;
        }
    }

    private void showFormService(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("rentTypeList",facilityService.selectAllRentType());
        request.setAttribute("facilityTypeList",facilityService.selectAllFacilityType());
        request.setAttribute("facilityList",facilityService.selectAllFacility());
        try {
            request.getRequestDispatcher("/service/create.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void listService(HttpServletRequest request, HttpServletResponse response) {
        List<Facility> facilityList = facilityService.selectAllFacility();
        List<RentType> rentTypeList = facilityService.selectAllRentType();
        List<FacilityType> facilityTypeList = facilityService.selectAllFacilityType();
        request.setAttribute("facilityList",facilityList);
        request.setAttribute("rentTypeList",rentTypeList);
        request.setAttribute("facilityTypeList",facilityTypeList);
        try {
            request.getRequestDispatcher("service/list.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action){
            case "create":
                createService(request,response);
                break;
        }
    }

    private void createService(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        int area = Integer.parseInt(request.getParameter("area"));
        Double cost = Double.valueOf(request.getParameter("cost"));
        int maxPeople = Integer.parseInt(request.getParameter("maxPeople"));
        int idRentType = Integer.parseInt(request.getParameter("idRentType"));
        int idFacilityType = Integer.parseInt(request.getParameter("idFacilityType"));
        String standardRoom = request.getParameter("standardRoom");
        String descriptionOtherConvenience = request.getParameter("descriptionOtherConvenience");
        Double poolArea = Double.valueOf(request.getParameter("poolArea"));
        int numberFloor = Integer.parseInt(request.getParameter("numberFloor"));
        String facilityFree = request.getParameter("facilityFree");
        Facility facility = new Facility(name,area,cost,maxPeople,idRentType,idFacilityType,standardRoom,
                descriptionOtherConvenience,poolArea,numberFloor,facilityFree);
        facilityService.add(facility);
        try {
            response.sendRedirect("/service/list.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}