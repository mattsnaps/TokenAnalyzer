<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <meta name="generator" content="HTML Tidy, see www.w3.org" />

    <title>First JSP</title>
  </head>

  <body>

    <p><a href="/java112">Home</a></p>

    <c:set var = "message" value = "Welcome to Twin Peaks"/>
    <h1>${message}</h1>
  </body>
</html>
