/*
 * Author @ Brent Able
 */
public class Sprinkles extends ToppingsDecorator {
	IceCream iceCream;
	
	public Sprinkles(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	
	public String toString() {
		return ", Rainbow Sprinkles";
	}
	
	public double getCost() {
		return iceCream.getCost() + 0.25;
	}
}