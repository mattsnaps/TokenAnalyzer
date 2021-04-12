
<!DOCTYPE html>


<html>
  <head>
    <meta name="generator" content="HTML Tidy, see www.w3.org">
    <%@ include file="bootstrapcss.jsp"%>
    <title>MVC Demo</title>
  </head>

  <body>
      <div class="container">

    <h3>Pizza Status</h3>

    <h2>${jim.status}</h2>

    <img src="images/${jim.gif}" alt="image">


    <p>Order Placed for ${jim.type} on ${jim.time}</p>

    <br>
    <br>

    <table class="text-center">
        <caption class="text-center">Order Details</caption>
        <tr><td>--Pizza Size--</td> <td>--Pizza Topping--</td></tr>
        <tr><td>${bill.pizzaSize}</td> <td>${bill.pizzaTopping}</td>
    </table>


    <br/>

    <a href="/java112/linkingpage.jsp">Back to Links</a>

</div>
    <%@ include file="bootstrapjs.jsp"%>
  </body>
</html>
