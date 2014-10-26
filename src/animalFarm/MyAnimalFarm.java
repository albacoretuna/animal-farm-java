package animalFarm;

import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class MyAnimalFarm {
    public static void main(String[ ] a) {
    	
    	JTextField ageFi = new JTextField();
    	JTextField extinFi = new JTextField();
    	
    	Object[] fields = {
    			"ageFi", ageFi,
    			"extinFi", extinFi,
    	};
    	
    	String fieldStr = fields.toString(); 
    	JOptionPane.showConfirmDialog(null, fields, "Please Enter The Animal's Properties", JOptionPane.OK_OPTION);
    	
        int[] fieldsInt = Integer.parseInt( fieldStr);
        
    /*	
    	Animal [] my = new Animal[3];
    	my [0]= new Dog(fields["ageFi"], fields["extinFi"], "No", "Yes", "No", "Cavalier King Charles Spaniel");
    	my [1]= new Bluejay(14, 4, "No", "No", "No", "Bluejay Sir Alex Fergusen");
    	my [2]= new Human(98, 4, "No", "Yes", "No", "Frantz Kafka");    	
    	for(int i = 0; i < 3; i++)
    		my[i].introduce();
    	*/
    }

}

