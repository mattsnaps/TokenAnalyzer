package java112.project3;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java112.utilities.*;
import java.util.*;

/**
 * @author Matthew Priebe
 *
 */
@WebServlet(
    name = "propertiesServlet",
    urlPatterns = { "/project3-properties" }
)
public class PropertiesServlet extends HttpServlet implements PropertiesLoader {
    Properties properties;

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

        request.setAttribute("author", properties.getProperty("author"));
        request.setAttribute("email", properties.getProperty("email"));
        request.setAttribute("coursename", properties.getProperty("course.name"));
        request.setAttribute("coursemeeeting", properties.getProperty("course.meeting"));
        request.setAttribute("instructorname", properties.getProperty("instructor.name"));
        request.setAttribute("desc", properties.getProperty("description"));



        String url = "/project3properties.jsp";

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);

    }

    public void init() throws ServletException {

        properties = new Properties();

        properties = loadProperties("/project3.properties");


    }
}
