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

                <p>Remote computer: ${data.remoteComputer}</p>
                <p>Remote Address: ${data.remoteComputerAddress}</p>
                <p>HTTP method: ${data.httpMethod}</p>
                <p>Request URI: ${data.requestURI}</p>
                <p>Request URL: ${data.requestURL}</p>
                <p>Request Protocol: ${data.requestProtocol}</p>
                <p>Server Name: ${data.serverName}</p>
                <p>Server Port: ${data.serverPortNumber}</P>
                <p>Server Locale: ${data.serverLocale}</p>
                <p>Query String: ${data.queryString}</p>
                <p>Query Parameter: ${data.queryParameter}</p>
                <p>User-Agent: ${data.userAgent}</p>

            </div>
        </div>
    </div>

<%@ include file="sidebar.jsp" %>

<%@ include file="footer.jsp" %>
</body>
</html>
