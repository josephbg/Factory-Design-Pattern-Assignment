/**
 * The class Toy is abstract because each type of toy is different
 * @author Brian Guthrie
 *
 */
public abstract class Toy {
	
	/**
	 * The string name is protected because it is used by this class and it's sub classes
	 */
	protected String name;
	
	/**
	 * make assemble() void because it doesn't return anything
	 */
	public void assemble() {
		System.out.println("Putting together a "+name);
	}
	
	/**
	 * make boxToy() void because it doesn't return anything
	 */
	public void boxToy() {
		System.out.println("Putting the "+name+" in a box");
	}
	
	/**
	 * make priceToy() void because it doesn't return anything
	 */
	public void priceToy() {
		System.out.println("Adding price on "+name);
	}
}
