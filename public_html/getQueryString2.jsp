<!DOCTYPE html>

<html>
	<head><title>getQueryString() method of request object.</title></head>
		<body>
		<%
			if(request.getQueryString() != null) {

				out.println(request.getQueryString());
			} else {
				out.println("<br>No parameters");
			}
		%>

		<p><a href="/java112/teamlab.jsp">TeamScriptingTemplate</a></p>
	</body>
</html>
