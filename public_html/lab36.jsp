<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <meta name="lab3.6" content="HTML Tidy, see www.w3.org" />

    <title>Matthew Priebe- Lab 3-6 JSP</title>
  </head>

  <body>
      <h2>Page One</h2>

      <%!
        public void jspInit() {

            ServletConfig sConfig = getServletConfig();

            ServletContext ctx = sConfig.getServletContext();

            ctx.setAttribute("guyOne", "Jim Bo Jones");

        }
        %>

        ${guyOne}



    <p><a href="/java112">Home</a></p>
  </body>
</html>
