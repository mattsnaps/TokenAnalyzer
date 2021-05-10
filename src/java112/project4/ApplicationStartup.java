package java112.project4;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java112.utilities.*;
import java112.employee.*;
import java.util.*;

/**
 *  This is a simple servlet to show html output
 *
 *@author    eknapp
 */
@WebServlet (
    name = "applicationStartup",
    urlPatterns = { "/project4-startup" },
    loadOnStartup = 1
)
public class ApplicationStartup extends HttpServlet implements PropertiesLoader {

    /**
     * [init description]
     * @param  request          [description]
     * @param  response         [description]
     * @throws ServletException [description]
     * @throws IOException      [description]
     */
    public void init(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        Properties properties = new Properties();

        properties = loadProperties("/project4.properties");

        request.setAttribute("project4Properties", properties);

        EmployeeDirectory employeeDirectory = new EmployeeDirectory(properties);

        request.setAttribute("employeeDirectory", employeeDirectory);

        String url = "/name.jsp";

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
