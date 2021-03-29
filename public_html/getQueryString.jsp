<!DOCTYPE html>

<html>
	<head><title>getQueryString() method of request object.</title></head>
		<body>
            <form method="get" autocomplete="off">

                <label for="FirstName">First Name</label>
                <input type="text" name="FirstName">

                <label for="LastName">LastName</label>
                <input type="text" name="LastName">

                <input type="submit">

            </form>
		<%
			if(request.getQueryString() != null) {
				out.println(request.getQueryString());
            } else {
                out.println("<br>No Parameters");
            }
		%>

        <p><a href="/java112/teamlab.jsp">TeamScriptingTemplate</a></p>
	</body>
</html>
