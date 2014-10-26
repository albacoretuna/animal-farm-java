package animalFarm;



public class MyAnimalFarm {
    public static void main(String[ ] a) {
    	Animal [] my = new Animal[10];
    	my [0]= new Dog(7, 4, false, true, false, "Cavalier King Charles Spaniel");
    	my [1]= new Bluejay(14, 4, false, false, false, "Bluejay Sir Alex Fergusen");
    	for(int i = 0; i < 2; i++)
    		my[i].introduce();
    	
    }

}

