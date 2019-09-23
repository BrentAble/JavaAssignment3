/*
 * Author @ Brent Able
 */
public class ChocolateChips extends ToppingsDecorator {
	IceCream iceCream;
	
	public ChocolateChips(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	
	public String toString() {
		return ", dark Choclate chips";
	}
	
	public double getCost() {
		return iceCream.getCost() + 0.15;
	}
}