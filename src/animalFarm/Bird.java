package animalFarm;

public abstract class Bird extends Animal {

	protected int wingsAndHandsTotal;
				  
	
	public Bird() {
	}
	
	public Bird(int wingsAndHandsTotal, String isExtincted, String isDomestic, String isVegeterian, String latinName) {
		super(isExtincted, isDomestic, isVegeterian, latinName);
		this.wingsAndHandsTotal = wingsAndHandsTotal;
	}

	public int getWingsAndHandsTotal() {
		return wingsAndHandsTotal;
	}
	
	
}
