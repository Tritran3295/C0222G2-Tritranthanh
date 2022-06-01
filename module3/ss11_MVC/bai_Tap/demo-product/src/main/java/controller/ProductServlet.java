package controller;

import model.Product;
import service.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/products")
public class ProductServlet extends HttpServlet {
    ProductServiceImpl productService = new ProductServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createProduct(request, response);
                break;
            case "edit":
                editProduct(request, response);
                break;

            default:
                listProduct(request, response);

        }

    }


    private void editProduct(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Integer idProduct = Integer.valueOf(request.getParameter("idProduct"));
        String nameProduct = request.getParameter("nameProduct");
        Integer priceProduct = Integer.valueOf(request.getParameter("priceProduct"));
        String describeProduct = request.getParameter("describeProduct");
        String hostProduct = request.getParameter("hostProduct");
        Product product = new Product(idProduct, nameProduct, priceProduct, describeProduct, hostProduct);
        this.productService.update(idProduct, product);
        response.sendRedirect("/products");

    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Integer idProduct = Integer.valueOf(request.getParameter("id"));
        String nameProduct = request.getParameter("name");
        Integer priceProduct = Integer.valueOf(request.getParameter("price"));
        String describeProduct = request.getParameter("describe");
        String hostProduct = request.getParameter("host");
        Product product = new Product(idProduct, nameProduct, priceProduct, describeProduct, hostProduct);
        this.productService.save(product);
        response.sendRedirect("/products");
//        request.getRequestDispatcher("/products").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateForm(request, response);
                break;
            case "edit":
                showEditForm(request, response);
                break;
            case "delete":
                deleteProduct(request, response);
                break;
            case "detail":
                detailProduct(request, response);
                break;
            default:
                listProduct(request, response);
        }


    }


    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("product/edit.jsp");
        Integer idProduct = Integer.valueOf(request.getParameter("idProduct"));
        Product product = productService.findById(idProduct);
        request.setAttribute("productEdit", product);
        requestDispatcher.forward(request, response);

    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("product/create.jsp");

        requestDispatcher.forward(request, response);

    }

    private void listProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("product/list.jsp");
        List<Product> products = productService.findAll();
        request.setAttribute("danhSach", products);
        requestDispatcher.forward(request, response);
    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) {
        int idProduct = Integer.parseInt(request.getParameter("idProduct"));
        Product product = this.productService.findById(idProduct);
        RequestDispatcher requestDispatcher;
        if (product == null) {
            requestDispatcher = request.getRequestDispatcher("delete");
        } else {
            this.productService.delete(idProduct);
            try {
                response.sendRedirect("/products");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void detailProduct(HttpServletRequest request, HttpServletResponse response) {
        int idProduct = Integer.parseInt(request.getParameter("idProduct"));
        Product product = this.productService.findById(idProduct);
        RequestDispatcher requestDispatcher;
        if (product == null) {
            requestDispatcher = request.getRequestDispatcher("detail");
        }else {
            request.setAttribute("product",product);
            requestDispatcher = request.getRequestDispatcher("product/view.jsp");
        }try{
            requestDispatcher.forward(request,response);
        }catch (ServletException | IOException e){
            e.printStackTrace();
        }
    }
}
