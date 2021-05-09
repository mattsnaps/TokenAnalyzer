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
                Welcome to Matthew Priebe's WebPage
                </h2>
                <h3 class="posted">
                For Java112
                </h3>

            </div>
        </div>
    </div>

<c:import url="sidebar.jsp" var="sidebarLinks"/>
<c:out value="${sidebarLinks}" escapeXml="flase"/>

<c:import url="footer.jsp" var="footerInfo"/>
<c:out value="${footerInfo}" escapeXml="flase"/>

</body>
</html>
