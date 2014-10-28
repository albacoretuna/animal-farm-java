/* My Exercise for Java Programming Course 
 * Student No. 1305909
 */


package animalFarm;

import javax.swing.JOptionPane;

public class Dog extends Mamal{
	
	private int age;
	private String name;
	public Dog() {
	}
	
	public Dog(String name, int age, int legsAndHandsTotal, String isExtincted, String isDomestic, String isVegeterian, String latinName) {
		super(legsAndHandsTotal, isExtincted, isDomestic, isVegeterian, latinName);
		this.name = name; 
		this.age = age;
	}
	

	public String getName() {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	
    @Override
    public void introduce() {
    	
    	
        String message = "      Here I introduce a cute dog: \n     "
        		  + "Scienefic Name: " + latinName
        		  + "\n Name : " + name
                  + "\n Is extinct: "   + isExtincted 
                  + "\n Age: " + age 
                  + "\n Number of Legs and Hands: " + legsAndHandsTotal
        		  + "\n Is Domestic: " + isDomestic;
        JOptionPane.showMessageDialog(null, message);
    }
	
}




