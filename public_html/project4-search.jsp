<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<!-- Design by Free CSS Templates http://www.freecsstemplates.org Released for free under a Creative Commons Attribution 2.5 License -->
<html xmlns="http://www.w3.org/1999/xhtml">
    <%@ include file="head.jsp"%>

<body>
<c:import url="header.jsp" var="headerLogo"/>
<c:out value="${headerLogo}" escapeXml="flase"/>

    <div id="content">
        <div id="posts">
            <div class="post">
                <h2 class="title">
                Employee Search
                </h2>
                <h3 class="posted">
                For Java112
                </h3>
            </div>
            <form method="GET" action="/java112/search-results" autocomplete="off">
                <input type="text" name="searchTerm"><br>
                <input type="radio" id="fName" value="first_name" name="searchType" required>
                    <label for="fName">First Name</label>
                <input type="radio" id="lName"value="last_name" name="searchType">
                    <label for="lName">Last Name</label>
                <input type="radio" id="eId" value="emp_id" name="searchType">
                    <label for="eId">Employee Id</label><br>
                <input type="submit" value="Search">
            </form>
        </div>
    </div>

<c:import url="sidebar.jsp" var="sidebarLinks"/>
<c:out value="${sidebarLinks}" escapeXml="flase"/>

<c:import url="footer.jsp" var="footerInfo"/>
<c:out value="${footerInfo}" escapeXml="flase"/>

</body>
</html>
