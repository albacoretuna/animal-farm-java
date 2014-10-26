package animalFarm;

import javax.swing.JOptionPane;



public class MyAnimalFarm {
    public static void main(String[ ] a) {
    	
    	String res = JOptionPane.showInputDialog("Enter value:");
    	Animal [] my = new Animal[3];
    	my [0]= new Dog(7, 4, "No", "Yes", "No", "Cavalier King Charles Spaniel");
    	my [1]= new Bluejay(14, 4, "No", "No", "No", "Bluejay Sir Alex Fergusen");
    	my [2]= new Human(98, 4, "No", "Yes", "No", "Frantz Kafka");    	
    	for(int i = 0; i < 3; i++)
    		my[i].introduce();
    	
    }

}

