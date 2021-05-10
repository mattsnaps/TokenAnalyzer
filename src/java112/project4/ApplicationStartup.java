package java112.project4;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

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
public class Lab5Servlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    }

    public void init() throws ServletException {
        Properties properties = new Properties();

        properties = loadProperties("/project4.properties");

        request.setAttribute("project4Properties", properties);

        

    }
}
