package java112.project3;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
 * @author Eric Knapp
 *
 */
@WebServlet(
    name = "teamLab",
    urlPatterns = { "/teamLab" }
)
public class MvcTeamLab extends HttpServlet {

    /**
     *  Handles HTTP GET requests.
     *
     *@param  request                   the HttpServletRequest object
     *@param  response                   the HttpServletResponse object
     *@exception  ServletException  if there is a Servlet failure
     *@exception  IOException       if there is an IO failure
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int orderId;

        orderId = Integer.parseInt(request.getParameter("id"));

        FillOrder pizzaOrder = new FillOrder();


        Pizza pizza;
        Order order;

        pizza = pizzaOrder.makePizza(orderId);
        order = pizzaOrder.orderDetail(orderId);

        request.setAttribute("jim", order);

        request.setAttribute("bill", pizza);

        request.setAttribute("id", orderId);


        String url = "/orderStatus.jsp";

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
