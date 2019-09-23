/*
 * Author @ Brent Able
 */
public class Sprinkles extends ToppingsDecorator {
	IceCream iceCream;
	/*
	* Adds chosen icecream from Class IceCream as type
	*/
	public Sprinkles(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	/*
	* Adds string for if sprinkles are selected
 	*/
	public String toString() {
		return ", Rainbow Sprinkles";
	}
	/*
	* Gets cost of sprinkles and adds it to whatever chosen ice cream
	*/
	public double getCost() {
		return iceCream.getCost() + 0.25;
	}
}
