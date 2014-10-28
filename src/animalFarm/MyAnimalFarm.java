/* My Exercise for Java Programming Course 
 * Student No. 1305909
 */

package animalFarm;

import javax.swing.JOptionPane;



public class MyAnimalFarm {
    public static void main(String[ ] a) {
    	
    	Animal [] my = new Animal[3];
    	my [0]= new Dog("No Name Yet", 4 , 4 , "No", "Yes", "No", "Cavalier King Charles Spaniel");
    	my [1]= new Bluejay("No Name Yet",14, 4, "No", "No", "No", "Bluejay Sir Alex Fergusen");
    	my [2]= new Human("No Name Yet",98, 4, "No", "Yes", "No", "Frantz Kafka");    	
    	for(int i = 0; i < 3; i++)
    		my[i].introduce();
    	
        String nameForDog=JOptionPane.showInputDialog("You can now Name the Dog. Enter its name below: ");
        ((Dog) my[0]).setName(nameForDog);
        
        // TODO do the same thing for BlueJay and Human 
        String nameForBird=JOptionPane.showInputDialog("You can now Name the Bird. Enter its name below: ");
        ((Bluejay) my[1]).setName(nameForBird);
        String nameForMan=JOptionPane.showInputDialog("You can now Name the Guy. Enter his name below: ");
        ((Human) my[2]).setName(nameForMan);
       // String newNameForDog =  ((Dog) my[0]).getName();
        //JOptionPane.showMessageDialog(null,"New Name for The Dog is: "+ newNameForDog);
        JOptionPane.showMessageDialog( null, "Thank you for naming the dog, bird and human being. Here I introduce them again!");
    	for(int i = 0; i < 3; i++)
    		my[i].introduce();
        JOptionPane.showMessageDialog( null, "You're a wonderful user! Have a nice day!");

    	
    }

}

