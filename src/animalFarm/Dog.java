package animalFarm;

public class Dog extends Mamal{
	
	private int age;
	
	public Dog() {
	}
	
	public Dog(int age, int legsAndHandsTotal, boolean isExtincted, boolean isDomestic, boolean isVegeterian, String latinName) {
		super(legsAndHandsTotal, isExtincted, isDomestic, isVegeterian, latinName);
		this.age = age; 
	}
	
	public int getAge() {
		return age;
	}
	
    @Override
    public void introduce() {
    	
    	
        String message = "This is a Dog with this properties: \n "
        		  + "Breed Latin Name: " + latinName
                  + "\n Is extinct: "   + String.valueOf(isExtincted) 
                  + "\n Age: " + age 
                  + "\n Number of Legs and Hands " + legsAndHandsTotal
        		  + "\n Is Domestic: " + String.valueOf(isDomestic);
        System.out.println(message);
    }
	
}


/*
package fifth;

public class LaserPrinter extends Printer {
    
    private int quality;    //  Dots per inch

    public LaserPrinter() {
    }

    public LaserPrinter(int quality, int speed, 
               String serialnumber, String manufacturer, String model, double price) {
        super(speed, serialnumber, manufacturer, model, price);
        this.quality = quality;
    }

    public int getQuality() {
        return quality;
    }

    @Override
    public void report() {
        String message = "Just a laser printer: " + manufacturer + ": " + model 
                                     + " with speed " + speed + " p/min. and quality " + quality + " dpi.";
        System.out.println(message);
    }
    
}


*/