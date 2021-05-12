package java112.project4;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.util.*;
import java112.employee.*;

/**
 * @author Matthew Priebe
 *
 */
@WebServlet(
    name = "addAction",
    urlPatterns = { "/add-action-servlet" }
)
public class AddActionServlet extends HttpServlet {
    /**
     *  Handles HTTP GET requests.
     *
     *@param  request                   the HttpServletRequest object
     *@param  response                   the HttpServletResponse object
     *@exception  ServletException  if there is a Servlet failure
     *@exception  IOException       if there is an IO failure
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");
        String ssn = request.getParameter("ssn");
        String dept = request.getParameter("dept");
        String room = request.getParameter("room");
        String phone = request.getParameter("phone");


        log(first_name);
        log(last_name);
        log(ssn);
        log(dept);
        log(room);
        log(phone);

        String url = "/java112/employee-add";

        response.sendRedirect(url);

    }
}
