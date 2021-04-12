
<!DOCTYPE html>


<html>
  <head>
    <meta name="generator" content="HTML Tidy, see www.w3.org">

    <title>MVC Demo</title>
  </head>

  <body>
    <h3>Pizza Status</h3>

    <h2>${jim.status}</h2>

    <img src="images/${jim.gif}" alt="image">


    <p>Order Placed for ${jim.type} on ${jim.time}</p>


    <table>
        <caption>Order Details
        <tr><td>-Pizza Size-</td> <td>-Pizza Topping-</td></tr>
        <tr><td>${bill.pizzaSize}</td> <td>${bill.pizzaTopping}</td>
    </table>

    <p>parameter: ${id} </p>

    <br />

    <a href="/java112/java112">Home</a>
  </body>
</html>
