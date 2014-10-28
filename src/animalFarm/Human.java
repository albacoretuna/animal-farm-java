/* My Exercise for Java Programming Course 
 * Student No. 1305909
 */

package animalFarm;

import javax.swing.JOptionPane;

public class Human extends Mamal {

	private String name;
	
	private int age;
	
	public Human() {
	}
	
	public Human(String name,int age, int legsAndHandsTotal, String isExtincted, String isDomestic, String isVegeterian, String latinName) {
		super(legsAndHandsTotal, isExtincted, isDomestic, isVegeterian, latinName);
		this.age = age; 
	}
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}	
	
    @Override
    public void introduce() {
    	
    	
        String message = "Here I introduce a Cool Friend of Mine: \n "
      	     	  + "Scienefic Name: " + latinName
      		      + "\n Name : " + name
                  + "\n Is extinct: "   + String.valueOf(isExtincted) 
                  + "\n Age: " + age 
                  + "\n Number of Legs and Hands: " + legsAndHandsTotal
        		  + "\n Is Domestic: " + String.valueOf(isDomestic);
        JOptionPane.showMessageDialog(null, message);
    
}
}

/* latinName / isExtincted / age / legsAndHandsTotal / */
