/*
 * Author @ Brent Able
 */
public class Cherry extends ToppingsDecorator {
	IceCream iceCream;
	
	public Cherry(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	/*
	* The toString and get Cost add the toppings when called so that it combines with the chosen ice Cream
	*/
	public String toString() {
		return iceCream + ", bright red cherries";
	}
	
	public double getCost() {
		return iceCream.getCost() + 0.3;
	}
}
