package controller;

import repository.IProductRepository;
import repository.ProductRepository;
import model.model.Product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/product")
public class ProductServlet extends HttpServlet {
    private IProductRepository iProductRepository = new ProductRepository();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {

            default:
                listProduct(request, response);
                break;

        }
    }




    private void listProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> listProduct = iProductRepository.selectAllProducts();
        request.setAttribute("listProduct", listProduct);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("product/list.jsp");
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
                createProduct(request,response);

        }
    }
    private void createProduct(HttpServletRequest request, HttpServletResponse response) {
        Integer stt = Integer.valueOf(request.getParameter("stt"));
        String nameProduct = request.getParameter("nameProduct");
        String detailProduct = request.getParameter("detailProduct");
        String dateOfManufacture = request.getParameter("dateOfManufacture");
        String manufacturer = request.getParameter("manufacturer");
        String countryProduct = request.getParameter("countryProduct");
        Product product = new Product(stt,nameProduct,detailProduct,dateOfManufacture,manufacturer,countryProduct);


    }
}
