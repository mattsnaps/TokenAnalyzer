package java112.project3;

/**
 *  This is a JavaBean to demonstrate using beans with JSP.
 *
 *@author    eknapp
 */
public class Pizza {

    private String pizzaSize;
    private String pizzaTopping;


    /**
     *  Constructor for the BeanOne object
     */
    public Pizza() {
        pizzaSize = "empty";
        pizzaTopping = "empty";
    }

    /**
	* Returns value of pizzaSize
	* @return
	*/
	public String getPizzaSize() {
		return pizzaSize;
	}

	/**
	* Sets new value of pizzaSize
	* @param
	*/
	public void setPizzaSize(String pizzaSize) {
		this.pizzaSize = pizzaSize;
	}

	/**
	* Returns value of pizzaTopping
	* @return
	*/
	public String getPizzaTopping() {
		return pizzaTopping;
	}

	/**
	* Sets new value of pizzaTopping
	* @param
	*/
	public void setPizzaTopping(String pizzaTopping) {
		this.pizzaTopping = pizzaTopping;
	}
}
