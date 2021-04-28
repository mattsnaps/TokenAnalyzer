package java112.project4;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.util.*;

/**
 *  This is part of a lab and is the first servlet for the course.
 *
 *@author    eknapp
 */
@WebServlet(
    name = "JSTLServlet",
    urlPatterns = { "/jstlservlet"}
)
public class JSTLLab1Servlet extends HttpServlet {

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

            ArrayList<String> list = new ArrayList<String>();

            list.add("Book Man");
            list.add("Bells");
            list.add("Glass Cup");
            list.add("Rocket Plane");

            request.setAttribute("myCoolList", list);

            String url = "/jstl-lab2.jsp";

            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);
    }
}
