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
    name = "searchResultServlet",
    urlPatterns = { "/search-results" }
)
public class SearchResultServlet extends HttpServlet {
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


        String term = request.getParameter("searchTerm");
        String type = request.getParameter("searchType");

        ServletContext ctx = request.getServletContext();
        EmployeeDirectory search = (EmployeeDirectory) ctx.getAttribute("employeeDirectory");

        Search results = search.search(term, type);

        ArrayList<Employee> list = new ArrayList<Employee>();

        Boolean status = results.isResponse();
        list = results.getResults();

        request.setAttribute("search", status);
        request.setAttribute("list", list);


        String url = "/project4-search-results.jsp";

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);

    }
}
