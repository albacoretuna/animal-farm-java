package animalFarm;

import javax.swing.JOptionPane;



public class MyAnimalFarm {
    public static void main(String[ ] a) {
    	
    	Animal [] my = new Animal[3];
    	my [0]= new Dog("No Name Yet", 4 , 4 , "No", "Yes", "No", "Cavalier King Charles Spaniel");
    	my [1]= new Bluejay(14, 4, "No", "No", "No", "Bluejay Sir Alex Fergusen");
    	my [2]= new Human(98, 4, "No", "Yes", "No", "Frantz Kafka");    	
    	for(int i = 0; i < 3; i++)
    		my[i].introduce();
    	
        String nameForDog=JOptionPane.showInputDialog("You can now Name the Dog. Enter its name below: ");
        ((Dog) my[0]).setName(nameForDog);
        
        // TODO do the same thing for BlueJay and Human 
        String nameForBird=JOptionPane.showInputDialog("You can now Name the Bird. Enter its name below: ");
        ((Dog) my[1]).setName(nameForDog);
        String nameForMan=JOptionPane.showInputDialog("You can now Name the Guy. Enter his name below: ");
        ((Dog) my[2]).setName(nameForDog);
       // String newNameForDog =  ((Dog) my[0]).getName();
        //JOptionPane.showMessageDialog(null,"New Name for The Dog is: "+ newNameForDog);
		my[0].introduce();

 
    	
    }

}

