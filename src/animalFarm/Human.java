package animalFarm;

import javax.swing.JOptionPane;

public class Human extends Mamal {

	
	private int age;
	
	public Human() {
	}
	
	public Human(int age, int legsAndHandsTotal, String isExtincted, String isDomestic, String isVegeterian, String latinName) {
		super(legsAndHandsTotal, isExtincted, isDomestic, isVegeterian, latinName);
		this.age = age; 
	}
	
	public int getAge() {
		return age;
	}
	
    @Override
    public void introduce() {
    	
    	
        String message = "Here I introduce a Cool Friend of Mine: \n "
        		  + "Name: " + latinName
                  + "\n Is extinct: "   + String.valueOf(isExtincted) 
                  + "\n Age: " + age 
                  + "\n Number of Legs and Hands: " + legsAndHandsTotal
        		  + "\n Is Domestic: " + String.valueOf(isDomestic);
        JOptionPane.showMessageDialog(null, message);
    
}
}

/* latinName / isExtincted / age / legsAndHandsTotal / */
