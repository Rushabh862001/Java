package corejava;
import java.util.*;
public class Toy {
// Creating Multidimensional String Array
	 String[][] toys = new String [6][5];
//Creating Constructor
	    Toy()
	    {

	    toys [0][0]="1";
	    toys[0][1]="Magic Robo";

	    toys [1][0]="2";
	    toys [1][1] ="Robo Car";

	    toys [2][0]="3";
	    toys [2][1]="Modern Bus";

	    toys [3][0]="4";
	    toys [3][1]="Tuk Tuk";

	    toys [4][0]="5";
	    toys[4][1]="Drift Car";

	    }
	    public static String getToy(int price)
	    {
	        String Toy;
	        switch(price)
	        {
	        //Case=Price of toy
	            case 500: 
	            	//nameString=Name of toy 
	            	Toy = "Magic Robo";
	                return Toy;
	            
	            case 450:
	            	Toy= "Robo Car";
	                return Toy;
	                
	            case 300:
	            	Toy = "Modern Bus";
	                return Toy;
	                
	            case 250:
	            	Toy = "Tuk Tuk";
	                return Toy;
	                
	            case 480:
	            	Toy = "Drift Car";
	                return Toy;
	        //when none of the case is true,then default statement is used        
	            default:
	            	Toy= "No Toys Available in this Range";
	                return Toy;
	        }
	    }
	public static void main(String[] args) {
		 //Taking input from User
		Scanner sc = new Scanner (System.in); 
		int price = sc.nextInt ();
        System.out.println(getToy(price));
        //closing scanner object
        sc.close();
	}
}
