package animalFarm;



public abstract class Mamal extends Animal{
	
	protected int legsAndHandsTotal;
	
	public Mamal() {
	}
	
	public Mamal(int legsAndHandsTotal, boolean isExtincted, boolean isDomestic, boolean isVegeterian, String latinName) {
		super(isExtincted, isDomestic, isVegeterian, latinName);
		this.legsAndHandsTotal = legsAndHandsTotal;
	}

	public int getLegsAndHandsTotal() {
		return legsAndHandsTotal;
	}
}

