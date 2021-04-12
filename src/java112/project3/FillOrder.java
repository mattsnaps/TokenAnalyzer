package java112.project3;
import java.time.*;
import java.time.LocalDate;
import java.util.*;

/**
 * @author mbpriebe
 */
public class FillOrder {

    /**
     *
     */
    public Pizza makePizza(int orderId) {


        if (orderId == 100) {

            Pizza pizza1 = new Pizza();

            pizza1.setPizzaSize("Large");
            pizza1.setPizzaTopping("Pepperoni");


            return pizza1;

        } else if (orderId == 200) {

            Pizza pizza1 = new Pizza();

            pizza1.setPizzaSize("Large");
            pizza1.setPizzaTopping("Sausage");

            return pizza1;

        } else if (orderId == 300) {

            Pizza pizza1 = new Pizza();
            Pizza pizza2 = new Pizza();
            Pizza pizza3 = new Pizza();

            pizza1.setPizzaSize("Large");
            pizza1.setPizzaTopping("Pepperoni");

            pizza2.setPizzaSize("Large");
            pizza2.setPizzaTopping("Pepperoni");

            pizza1.setPizzaSize("Large");
            pizza1.setPizzaTopping("BBQ");

            return pizza1;

        } else if (orderId == 400) {

            Pizza pizza1 = new Pizza();
            Pizza pizza2 = new Pizza();

            pizza1.setPizzaSize("Medium");
            pizza1.setPizzaTopping("Pepperoni");

            pizza2.setPizzaSize("Medium");
            pizza2.setPizzaTopping("Hawaiian");

            return pizza1;

        } else {

            Pizza pizza1 = new Pizza();

            return pizza1;
        }
    }

    public Order orderDetail(int orderId) {

        Order details = new Order();
        LocalDateTime date = LocalDateTime.now();


        if (orderId == 100) {

            details.setType("Delivery");
            details.setStatus("We Received your order and it's beening prepared.");
            details.setGif("received.gif");
            details.setTime(date);

            return details;

        } else if (orderId == 200) {
            details.setType("Delivery");
            details.setStatus("Your Pizza is in the oven being cooked!");
            details.setGif("cooking.gif");
            details.setTime(date);

            return details;

        } else if (orderId == 300) {
            details.setType("Delivery");
            details.setStatus("Our delivery driver is on their way at max speed.");
            details.setGif("driving.gif");
            details.setTime(date);

            return details;

        } else if (orderId == 400) {
            details.setType("Delivery");
            details.setStatus("Your Pizza has arrived!");
            details.setGif("arrived.gif");
            details.setTime(date);

            return details;

        } else {
            details.setType("None");
            details.setStatus("Never");
            details.setGif("None");
            details.setTime(date);

            return details;
        }
    }
}
