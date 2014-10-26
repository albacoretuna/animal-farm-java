package animalFarm;



public class MyAnimalFarm {
    public static void main(String[ ] a) {
    	Animal [] my = new Animal[10];
    	my [0]= new Dog(2, 4, false, true, false, "Cavalier King Charles Spaniel");
    	
    	for(int i = 0; i < 1; i++)
    		my[0].introduce();
    	
    }

}

