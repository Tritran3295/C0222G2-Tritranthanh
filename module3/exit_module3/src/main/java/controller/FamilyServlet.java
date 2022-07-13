package controller;

import model.FamilyManagement;
import model.MaHoKhau;
import service.FamilyServiceImpl;
import service.IFamilyService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "FamilyServlet", value = "/family")
public class FamilyServlet extends HttpServlet {
    private IFamilyService iFamilyService = new FamilyServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "edit":
                showFormEdit(request, response);
                break;
            default:
                listFamily(request, response);
                break;
        }
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        int stt = Integer.parseInt(request.getParameter("id"));
        FamilyManagement familyManagement = iFamilyService.findByStt(stt);
        request.setAttribute("stt", familyManagement.getStt());
        request.setAttribute("idMaHoKhau", familyManagement.getMaHoKhau());
        request.setAttribute("tenChuHo", familyManagement.getTenChuHo());
        request.setAttribute("soLuongThanhVien", familyManagement.getSoLuongThanhVien());
        request.setAttribute("ngayLapHoKhau", familyManagement.getNgayLapHoKhau());
        request.setAttribute("diaChiNha", familyManagement.getDiaChiNha());
        request.setAttribute("maHoKhauList",iFamilyService.selectAllMaHoKhau());
        request.setAttribute("family",familyManagement);
        try {
            request.getRequestDispatcher("/family/edit.jsp").forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void listFamily(HttpServletRequest request, HttpServletResponse response) {
        List<MaHoKhau> maHoKhauList = iFamilyService.selectAllMaHoKhau();
        List<FamilyManagement> familyManagementList = iFamilyService.selectAllFamily();
        request.setAttribute("familyList", familyManagementList);
        request.setAttribute("maHoKhauList", maHoKhauList);
        try {
            request.getRequestDispatcher("/family/list.jsp").forward(request, response);
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
            case "edit":
                EditFamily(request,response);
                break;
        }
    }

    private void EditFamily(HttpServletRequest request, HttpServletResponse response) {
        int stt = Integer.parseInt(request.getParameter("id"));
        String maHoKhau = request.getParameter("maHoKhau");
        String tenChuHo = request.getParameter("tenChuHo");
        int soLuongThanhVien = Integer.parseInt(request.getParameter("soLuongThanhVien"));
        String ngayLapHoKhau = request.getParameter("ngayLapHoKhau");
        String diaChiNha = request.getParameter("diaChiNha");
        FamilyManagement familyManagement = new FamilyManagement(stt,maHoKhau,tenChuHo,soLuongThanhVien,ngayLapHoKhau,diaChiNha);
        iFamilyService.update(familyManagement);
        try {
            response.sendRedirect("/family");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
