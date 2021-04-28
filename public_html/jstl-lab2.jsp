<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <meta name="generator" content="HTML Tidy, see www.w3.org" />

    <title>JSTL</title>
  </head>

  <body>

    <p><a href="/java112">Home</a></p>

    <table>
        <c:forEach var="item" items="${myCoolList}">
            <br><tr><tc>${item}</tc></tr>
        </c:forEach>
    </table>

  </body>
</html>
