/**
 * make the class Doll extend Toy because a doll is a toy
 * @author Brian Guthrie
 *
 */
public class Doll extends Toy{
	
	/**
	 * make the method Doll() have the name of the toy as "Doll"
	 */
	public Doll() {
		name = "Doll";
	}
	
	/**
	 * call the parents print statement and have the dolls print statement
	 */
	public void assemble() {
		super.assemble();
		System.out.println("Connecting all pieces\n"
				+ "Painting the face\n"
				+ "Adding the dress\n"
				+ "Adding the shoes");
	}
}
