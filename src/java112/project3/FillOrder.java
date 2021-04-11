package java112.project3;
import java.time.*;
import java.time.LocalDate;

/**
 * @author mbpriebe
 */
public class FillOrder {

    /**
     *
     */
    public Pizza makePizza(int orderId) {

        Pizza pizza = new Pizza();

        if (orderId == 100) {
            pizza.setPizzaSize("Large");
            pizza.setPizzaTopping("Pepperoni");

            return pizza;

        } else if (orderId == 200) {
            pizza.setPizzaSize("Medium");
            pizza.setPizzaTopping("Sausage");

            return pizza;

        } else if (orderId == 300) {
            pizza.setPizzaSize("Extra Large");
            pizza.setPizzaTopping("Hawaiian");

            return pizza;

        } else if (orderId == 400) {
            pizza.setPizzaSize("Small");
            pizza.setPizzaTopping("Cheese");

            return pizza;
        } else {
            return pizza;
        }
    }

    public Order orderDetail(int orderId) {

        Order details = new Order();
        LocalDateTime date = LocalDateTime.now();


        if (orderId == 100) {
            details.setType("Delivery");
            details.setStatus("Received");
            details.setTime(date);

            return details;

        } else if (orderId == 200) {
            details.setType("Delivery");
            details.setStatus("Cooking");
            details.setTime(date);

            return details;

        } else if (orderId == 300) {
            details.setType("Delivery");
            details.setStatus("Delivering");
            details.setTime(date);

            return details;

        } else if (orderId == 400) {
            details.setType("Delivery");
            details.setStatus("Arrived");
            details.setTime(date);

            return details;

        } else {
            details.setType("None");
            details.setStatus("Never");
            details.setTime(date);

            return details;
        }
    }
}
