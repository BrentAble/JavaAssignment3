/*
 * Author @ Brent Able
 */
public class ChocolateChips extends ToppingsDecorator {
	IceCream iceCream;
	
	public ChocolateChips(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	/*
	* The toString and get Cost add the toppings when called so that it combines with the chosen ice Cream
	*/
	public String toString() {
		return ", dark Choclate chips";
	}
	
	public double getCost() {
		return iceCream.getCost() + 0.15;
	}
}
