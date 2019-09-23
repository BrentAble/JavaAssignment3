/*
 * Author @ Brent Able
 */
public abstract class IceCream {
	protected String iceCream;
	/*
	* Returns the ice cream desired
	*/
	public String toStringn() {
		return iceCream;
	}
	/*
	* Returns all cost values and adds them up
	*/
	public abstract double getCost();
}
