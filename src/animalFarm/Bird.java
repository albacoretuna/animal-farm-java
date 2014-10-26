package animalFarm;

public abstract class Bird extends Animal {

	protected int wingsAndHandsTotal;
				  
	
	public Bird() {
	}
	
	public Bird(int wingsAndHandsTotal, boolean isExtincted, boolean isDomestic, boolean isVegeterian, String latinName) {
		super(isExtincted, isDomestic, isVegeterian, latinName);
		this.wingsAndHandsTotal = wingsAndHandsTotal;
	}

	public int getWingsAndHandsTotal() {
		return wingsAndHandsTotal;
	}
	
	
}
