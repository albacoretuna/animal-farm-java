/* My Exercise for Java Programming Course 
 * Student No. 1305909
 */

package animalFarm;

import javax.swing.JOptionPane;

public class Bluejay extends Bird {

	private String name;
	
	private int age;
	
	public Bluejay() {
	}
	
	public Bluejay(String name,int age, int wingsAndHandsTotal, String isExtincted, String isDomestic, String isVegeterian, String latinName) {
		super(wingsAndHandsTotal, isExtincted, isDomestic, isVegeterian, latinName);
		this.age = age; 
		this.name = name;
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
    	
    	
        String message = "Here I introduce a cute Bird: \n "
        		  + "Scienefic Name: " + latinName
        		  + "\n Name : " + name        		  
                  + "\n Is extinct: "   + String.valueOf(isExtincted) 
                  + "\n Age: " + age + " Years "
                  + "\n Number of Legs and Wings: " + wingsAndHandsTotal
        		  + "\n Is Domestic: " + String.valueOf(isDomestic) + "\n \n" ;
        JOptionPane.showMessageDialog(null, message);
    }
	
}
