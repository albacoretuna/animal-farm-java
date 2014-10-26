package animalFarm;

public class Dog extends Mamal{
	
	private int age;
	
	public Dog() {
	}
	
	public Dog(int age, int legsAndHandsTotal, boolean isExtincted, boolean isDomestic, boolean isVegeterian, String latinName) {
		super(legsAndHandsTotal, isExtincted, isDomestic, isVegeterian, latinName);
		this.age = age; 
	}
	
	public int getAge() {
		return age;
	}
	
    @Override
    public void introduce() {
    	
    	
        String message = "Here I introduce a cute dog: \n "
        		  + "Name: " + latinName
                  + "\n Is extinct: "   + String.valueOf(isExtincted) 
                  + "\n Age: " + age 
                  + "\n Number of Legs and Hands: " + legsAndHandsTotal
        		  + "\n Is Domestic: " + String.valueOf(isDomestic);
        System.out.println(message);
    }
	
}




