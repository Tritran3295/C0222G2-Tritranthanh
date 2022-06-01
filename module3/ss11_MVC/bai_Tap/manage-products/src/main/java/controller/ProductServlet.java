package controller;

import model.Product;
import service.IProductService;
import service.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/ProductServlet")
public class ProductServlet extends HttpServlet {
    private IProductService iProductService = new ProductServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                request.getRequestDispatcher("product/create.jsp").forward(request, response);
                break;
            default:
                listProduct(request, response);
                break;
        }
    }

    private void listProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> productList = this.iProductService.findAll();
        request.setAttribute("products", productList);

            request.getRequestDispatcher("product/list.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                Integer idProduct = Integer.valueOf(request.getParameter("idProduct"));
                String nameProduct = request.getParameter("nameProduct");
                Double priceProduct = Double.valueOf(request.getParameter("priceProduct"));
                String describeProduct = request.getParameter("describeProduct");
                String hostProduct = request.getParameter("hostProduct");
                Product product = new Product(idProduct, nameProduct, priceProduct, describeProduct, hostProduct);
                this.iProductService.save(product);
                request.getRequestDispatcher("/ProductServlet").forward(request, response);
                break;
            default:
                listProduct(request, response);
                break;
        }

    }
}
