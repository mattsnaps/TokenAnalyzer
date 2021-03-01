package java112.project2;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.time.*;

/**
 *  This is a simple servlet to show html output
 *
 *@author    eknapp
 */
@WebServlet (
    name = "lab5Servlet",
    urlPatterns = { "/lab5" }
)
public class Lab5Servlet extends HttpServlet {

    int counter = 0;
    LocalDateTime initialAccess;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter  out  = response.getWriter();
        LocalDateTime time = LocalDateTime.now();

        log("doGet access: " + clock());
        counter++;

        out.println("<table style='border: 1px solid black;'>");
        out.println("<tr>");
        out.println("<th>Web site counter</th> <th>Last Accessed</th> <th>First Access</th>");
        out.println("</tr> <tr>");
        out.println("<td style='border: 1px solid black; padding: 10px;'>" + counter + "</td>");
        out.println("<td style='border: 1px solid black; padding: 10px;'>" + clock() + "</td>");
        out.println("<td style='border: 1px solid black; padding: 10px;'>" + initialAccess + "</td>");
        out.println("<tr>");
        out.println("</table>");
        out.println("<br><br><p>1. Only the main server console was updated not the local log files.</p>");
        out.println("<br><p>2. log files updated. doGet() for every refresh init() only on first initialization.</p>");
    }

    public void init() throws ServletException {

        LocalDateTime time = LocalDateTime.now();

        log("Init access: " + clock());

        initialAccess = clock();

    }

    public LocalDateTime clock() {

        LocalDateTime time = LocalDateTime.now();

        return time;
    }


}
