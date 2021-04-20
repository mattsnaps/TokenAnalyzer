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

        Map map = new HashMap();

        map.put("author", properties.getProperty("author"));
        map.put("email", properties.getProperty("email"));
        map.put("coursename", properties.getProperty("course.name"));
        map.put("coursemeeeting", properties.getProperty("course.meeting"));
        map.put("instructorname", properties.getProperty("instructor.name"));
        map.put("desc", properties.getProperty("description"));

        request.setAttribute("map", map);



        String url = "/project3properties.jsp";

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);

    }
    /**
     * initial load up the properties value
     * @exception ServletException exception for the init method.
     */
    public void init() throws ServletException {

        properties = new Properties();

        properties = loadProperties("/project3.properties");


    }
}
