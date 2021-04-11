package java112.project3;

import java.io.*;
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


        FillOrder pizzaOrder = new FillOrder();
        Pizza pizza;
        Order order;

        pizza = pizzaOrder.makePizza(100);
        order = pizzaOrder.orderDetail(100);

        request.setAttribute("jim", order);
        request.setAttribute("pizzaDetails", pizza);


        String url = "/orderStatus.jsp";

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
