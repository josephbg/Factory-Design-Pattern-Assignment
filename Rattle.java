/**
 * make the class Rattle extend Toy because a rattle is a toy
 * @author Brian Guthrie
 *
 */
public class Rattle extends Toy{
	
	/**
	 * make the method Rattle() have the name of the toy as "Rattle"
	 */
	public Rattle() {
		name = "Rattle";
	}
	
	/**
	 * call the parents print statement and have the rattles print statement
	 */
	public void assemble() {
		super.assemble();
		System.out.println("Create the frame\n"
				+ "Add the pebbles\n"
				+ "Secure the sides");
	}

}
