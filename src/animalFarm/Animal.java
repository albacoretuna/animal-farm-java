package animalFarm;

public class Animal implements Introduction {
	
   protected boolean isExtincted;
   protected boolean isDomestic;
   protected boolean isVegeterian;
   protected String  latinName;
   
   protected Animal() {
   }

   protected Animal(boolean isExtincted, boolean isDomestic, boolean isVegeterian, String latinName) {
       this.isExtincted = isExtincted;
       this.isDomestic = isDomestic;
       this.isVegeterian = isVegeterian;
       this.latinName = latinName;
   }

   public boolean getIsExtincted() {
       return isExtincted;
   }

   public boolean getIsDomestic() {
       return isDomestic;
   }

   public boolean getIsVegeterian() {
       return isVegeterian;
   }

   public String getLatinName() {
       return latinName;
   }

@Override
public void introduce() {

	
}
   
   
   
}
