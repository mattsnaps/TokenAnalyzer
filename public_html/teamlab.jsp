<html>
  <head>
    <title>Matthew Priebe</title>
  </head>

  <body>
    <h2>Concept Name</h2>
        getQueryString()<br>

    <h2>Description</h2>
        Uses a pre-defined variable 'request'.
        Returns the query string that is contained in the request URL after the path. This method returns null if the URL does not have a query string.
        <br>
    <h2>Syntax</h2>
    <p>
    request.getQueryString()
    </p>
    <br>

    <h2>Example</h2>

    <form method="get" action="getQueryString2.jsp" autocomplete="off">

        <label for="FirstName">First Name</label>
        <input type="text" name="FirstName">

        <label for="LastName">LastName</label>
        <input type="text" name="LastName">

        <input type="submit">

    </form>

    <p><a href="/java112/getQueryString.jsp">Other Example</a></p>

    <h2>JSP Translator</h2>
        <img src="images/servletCode.png" alt="ServletCode"><br>


    <h2>Best Practices</h2>
        Keep the code simple. Don't mix important logic with front end presentation.<br>
        Be aware of the info you are passing in the url. SQL injections<br>


    <h2>Drawbacks</h2>
        Probably shouldn't be used for passing sensitive information between pages. <br>
        Like a password or important ID information.
  </body>
</html>
