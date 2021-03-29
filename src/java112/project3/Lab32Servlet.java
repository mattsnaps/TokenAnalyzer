package java112.project3;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
 *  This is part of a lab and is the first servlet for the course.
 *
 *@author    eknapp
 */
@WebServlet(
    name = "lab32servlet",
    urlPatterns = { "/lab32servlet"}
)
public class Lab32Servlet extends HttpServlet {

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

        PrintWriter out = response.getWriter();
        out.print("<HTML>");
        out.print("<HEAD><TITLE>Lab3-2</TITLE></HEAD>");
        out.print("<BODY>");
        out.print("<h1>Matthew Priebe's Lab3-2</h1>");
        out.print("<ul>");
        out.print("<li>" + request.getLocale() + "</li>");
        out.print("<li>" + request.getContextPath() + "</li>");
        out.print("<li>" + request.getServerName() + "</li>");
        out.print("<li>" + request.getScheme() + "</li>");
        out.print("</ul>");
        out.print("</BODY>");
        out.print("</HTML>");
        out.close();
 }

}
