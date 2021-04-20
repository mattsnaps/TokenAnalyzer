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
                Project 3 Properties
                </h2>
                <h3 class="posted">
                For Java112
                </h3>

                <p>Author: ${map["author"]}</p>
                <p>Email: ${map["email"]}</p>
                <p>Course Name: ${map["coursename"]}</p>
                <p>Metting Place: ${map["coursemeeting"]}</p>
                <p>Instructor: ${map["instructorname"]}</p>
                <p>Description: ${map["desc"]}</p>

            </div>
        </div>
    </div>

<%@ include file="sidebar.jsp" %>

<%@ include file="footer.jsp" %>
</body>
</html>
