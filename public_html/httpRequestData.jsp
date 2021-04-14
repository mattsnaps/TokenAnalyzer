<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<!-- Design by Free CSS Templates http://www.freecsstemplates.org Released for free under a Creative Commons Attribution 2.5 License -->
<html xmlns="http://www.w3.org/1999/xhtml">
    <%@ include file="head.jsp"%>

<body>
<%@ include file="header.jsp" %>

    <div id="content">
        <div id="posts">
            <div class="post">
                <h2 class="title">
                HTTP Request Data JSP Page
                </h2>
                <h3 class="posted">
                For Java112
                </h3>

                <p>Remote computer: ${rc}</p>
                <p>Remote Address: ${addr}</p>
                <p>HTTP method: ${method}</p>
                <p>Request URI: ${uri}</p>
                <p>Request URL: ${url}</p>
                <p>Request Protocol: ${protocol}</p>
                <p>Server Name: ${servername}</p>
                <p>Server Port: ${serverport}</P>
                <p>Server Locale: ${locale}</p>
                <p>Query String: ${querystring}</p>
                <p>Query Parameter: ${parameter}</p>
                <p>User-Agent: ${useragent}</p>

            </div>
        </div>
    </div>

<%@ include file="sidebar.jsp" %>

<%@ include file="footer.jsp" %>
</body>
</html>
