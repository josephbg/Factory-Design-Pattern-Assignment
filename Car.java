/**
 * make the class Car extend Toy because a car is a toy
 * @author Brian Guthrie
 *
 */
public class Car extends Toy {
	
	/**
	 * make the method Car() have the name of the toy as "Car"
	 */
	public Car() {
		name = "Car";
	}
	
	/**
	 * call the parents print statement and have the cars print statement
	 */
	public void assemble() {
		super.assemble();
		System.out.println("Make the body\n"
				+ "Add the wheels\n"
				+ "Paint the car");
	}

}
