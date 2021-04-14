package java112.project2;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java112.utilities.*;
import java.util.*;

/**
 *  This is part of a lab and is the first servlet for the course.
 *
 *@author    eknapp
 */
@WebServlet(
    name = "PropertiesServlet",
    urlPatterns = {"/propertiesServlet"}
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
        response.setContentType("text/html");
        // set the response type before sending data

        PrintWriter  out  = response.getWriter();

        out.print("<HTML>");
        out.print("<HEAD><TITLE>Properties Servlet Output</TITLE></HEAD>");
        out.print("<BODY>");
        out.print("<h1>Properties Servlet</h1>");

        out.println("<table>");

        out.println("<tr>");
        out.println("<td style='border: 1px solid black; padding: 10px;'>" + properties.getProperty("author") + "</td>");
        out.println("<td style='border: 1px solid black; padding: 10px;'>" + properties.getProperty("email") + "</td>");
        out.println("<td style='border: 1px solid black; padding: 10px;'>" + properties.getProperty("course.name") + "</td>");
        out.println("</tr> <tr>");
        out.println("<td style='border: 1px solid black; padding: 10px;'>" + properties.getProperty("course.meeting") + "</td>");
        out.println("<td style='border: 1px solid black; padding: 10px;'>" + properties.getProperty("instructor.name") + "</td>");
        out.println("<td style='border: 1px solid black; padding: 10px;'>" + properties.getProperty("description") + "</td>");
        out.println("</tr>");
        out.println("</table>");

        out.print("<br><br><a href=\"/java112\">home</a>");
        out.print("</BODY>");
        out.print("</HTML>");
        out.close();
    }
    /**
     * initial startup method
     * @throws ServletException
     */
    public void init() throws ServletException {
        properties = new Properties();

        properties = loadProperties("/project2.properties");

    }

}
