package animalFarm;

public class Animal implements Introduction {
	
   protected String isExtincted;
   protected String isDomestic;
   protected String isVegeterian;
   protected String  latinName;
   
   protected Animal() {
   }

   protected Animal(String isExtincted, String isDomestic, String isVegeterian, String latinName) {
       this.isExtincted = isExtincted;
       this.isDomestic = isDomestic;
       this.isVegeterian = isVegeterian;
       this.latinName = latinName;
   }

   public String getIsExtincted() {
       return isExtincted;
   }

   public String getIsDomestic() {
       return isDomestic;
   }

   public String getIsVegeterian() {
       return isVegeterian;
   }

   public String getLatinName() {
       return latinName;
   }

@Override
public void introduce() {

	
}
   
   
   
}
