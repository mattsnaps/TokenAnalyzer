package java112.project3;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
 * @author Matthew Priebe
 *
 */
@WebServlet(
    name = "requestServlet",
    urlPatterns = { "/request-servlet" }
)
public class HttpRequestServlet extends HttpServlet {

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

        HttpRequestData data = new HttpRequestData();

        data.setRemoteComputer(request.getRemoteHost());
        data.setRemoteComputerAddress(request.getRemoteAddr());
        data.setHttpMethod(request.getMethod());
        data.setRequestURI(request.getRequestURI());
        data.setRequestURL(request.getRequestURL());
        data.setRequestProtocol(request.getProtocol());
        data.setServerName(request.getServerName());
        data.setServerPortNumber(request.getServerPort());
        data.setServerLocale(request.getLocale());
        data.setQueryString(request.getQueryString());
        data.setQueryParameter(request.getParameter("queryParameter"));
        data.setUserAgent(request.getHeader("User-Agent"));


        request.setAttribute("rc", data.getRemoteComputer());
        request.setAttribute("addr", data.getRemoteComputerAddress());
        request.setAttribute("method", data.getHttpMethod());
        request.setAttribute("uri", data.getRequestURI());
        request.setAttribute("url", data.getRequestURL());
        request.setAttribute("protocol", data.getRequestProtocol());
        request.setAttribute("servername", data.getServerName());
        request.setAttribute("serverport", data.getServerPortNumber());
        request.setAttribute("locale", data.getServerLocale());
        request.setAttribute("querystring", data.getQueryString());
        request.setAttribute("parameter", data.getQueryParameter());
        request.setAttribute("useragent", data.getUserAgent());


        String url = "/httpRequestData.jsp";

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);

    }
}
