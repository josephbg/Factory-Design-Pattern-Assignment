/**
 * 
 * @author Brian Guthrie
 *
 */
public class ToyStore {
	
	/**
	 * Make an orderToy method that lets you order a specific toy by name,
	 * create an instance of toy so you can relate it to the toy subclasses,
	 * return these methods assemble(), boxToy(), priceToy() for each toy ordered
	 * @param type
	 * @return
	 */
	public Toy orderToy(String type) {
		Toy toy;
		
		if(type.equals("doll")) {
			toy = new Doll();
		} else if(type.equals("car")) {
			toy = new Car();
		} else {
			toy = new Rattle();
		}
		
		toy.assemble();
		toy.boxToy();
		toy.priceToy();
		
		return toy;
	}

}
