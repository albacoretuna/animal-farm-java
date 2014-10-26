package animalFarm;

public class Bluejay extends Bird {

	
	private int age;
	
	public Bluejay() {
	}
	
	public Bluejay(int age, int wingsAndHandsTotal, boolean isExtincted, boolean isDomestic, boolean isVegeterian, String latinName) {
		super(wingsAndHandsTotal, isExtincted, isDomestic, isVegeterian, latinName);
		this.age = age; 
	}
	
	public int getAge() {
		return age;
	}
	
    @Override
    public void introduce() {
    	
    	
        String message = "Here I introduce a cute Bird: \n "
        		  + "Name: " + latinName
                  + "\n Is extinct: "   + String.valueOf(isExtincted) 
                  + "\n Age: " + age + " Years "
                  + "\n Number of Legs and Wings: " + wingsAndHandsTotal
        		  + "\n Is Domestic: " + String.valueOf(isDomestic);
        System.out.println(message);
    }
	
}
