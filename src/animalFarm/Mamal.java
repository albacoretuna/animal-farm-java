/* My Exercise for Java Programming Course 
 * Student No. 1305909
 */

package animalFarm;


public abstract class Mamal extends Animal{
	
	protected int legsAndHandsTotal;
	
	public Mamal() {
	}
	
	public Mamal(int legsAndHandsTotal, String isExtincted, String isDomestic, String isVegeterian, String latinName) {
		super(isExtincted, isDomestic, isVegeterian, latinName);
		this.legsAndHandsTotal = legsAndHandsTotal;
	}

	public int getLegsAndHandsTotal() {
		return legsAndHandsTotal;
	}
}

