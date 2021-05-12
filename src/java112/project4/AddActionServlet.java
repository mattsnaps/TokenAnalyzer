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

        ServletContext ctx = request.getServletContext();
        EmployeeDirectory insert = (EmployeeDirectory) ctx.getAttribute("employeeDirectory");

        int rowsUpdated = 0;

        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");
        String ssn = request.getParameter("ssn");
        String dept = request.getParameter("dept");
        String room = request.getParameter("room");
        String phone = request.getParameter("phone");

        rowsUpdated = insert.insertEmployee(first_name, last_name, ssn, dept, room, phone);

        HttpSession session = request.getSession();
        session.setAttribute("message", "Success! Employee Added");

        request.setAttribute("rows", rowsUpdated);

        String url = "/java112/project4-add.jsp";

        response.sendRedirect(url);

    }
}
