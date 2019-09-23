/*
 * Author @ Brent Able
 */
public class Cherry extends ToppingsDecorator {
	IceCream iceCream;
	
	public Cherry(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	
	public String toString() {
		return iceCream + ", bright red cherries";
	}
	
	public double getCost() {
		return iceCream.getCost() + 0.3;
	}
}