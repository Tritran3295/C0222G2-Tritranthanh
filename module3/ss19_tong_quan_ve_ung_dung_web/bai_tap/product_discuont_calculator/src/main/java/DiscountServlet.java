import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", value = "/discount")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        Float listPrice = Float.valueOf(request.getParameter("listPrice"));
        Integer discountPercent = Integer.valueOf(request.getParameter("discountPercent"));

        Double discountAmount = listPrice * discountPercent * 0.01;
        Double lastPrice = listPrice - discountAmount;
        request.setAttribute("lastPrice",lastPrice);
        request.setAttribute("discountAmount",discountAmount);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
        requestDispatcher.forward(request,response);
    }
}
