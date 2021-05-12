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
                Employee Search Results
                </h2>
                <h3 class="posted">
                For Java112
                </h3>
            </div>

            <c:if test="${!search}">
                <c:out value="No Results found"/>
            </c:if>
            <table class="table">
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Social Security Number</th>
                    <th>Department</th>
                    <th>Room Number</th>
                    <th>Phone Number</th>
                </tr>
            </table>

            <c:forEach var="item" items="${list}">
                <table class="table">
                <tr>
                    <td scope="col">${item.firstName}</td>
                    <td scope="col">${item.lastName}</td>
                    <td scope="col">${item.ssn}</tc>
                    <td scope="col">${item.department}</td>
                    <td scope="col">${item.roomNumber}</td>
                    <td scope="col">${item.phoneNumber}</td>
                </tr>
            </table>
            </c:forEach>

            <br><br><br><a href="/java112/employee-search">Return to Search</a>
        </div>
    </div>

<c:import url="sidebar.jsp" var="sidebarLinks"/>
<c:out value="${sidebarLinks}" escapeXml="flase"/>

<c:import url="footer.jsp" var="footerInfo"/>
<c:out value="${footerInfo}" escapeXml="flase"/>

</body>
</html>
