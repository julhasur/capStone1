//julhasur chowdhury
//april,27
//Translate from english to pig Latin

package capstone1;

import java.util.Scanner;

public class capOne {
	  public static void main(String[] args) {
		    char option;
		    cap2 capobject= new cap2();
		  
		    
		    do {
		    	 
		    	//prompt user for input
		    	  System.out.println("Enter word: ");
		    	
		        Scanner scanner = new Scanner(System.in);
		       
		        String userInput= scanner.nextLine();
		        capobject.Constants(userInput);
		      //covert input to lower case
				
		       
		      //if word start with vowel - vowel translate
		    
		      
		   
		          /*String first = userInput.substring(0,1);
		            System.out.println("first "+first);
		            
		            String slice = userInput.substring(1,userInput.length());
		            System.out.println(slice);
		            System.out.println(slice + first + "ay");
		        }*/
		        
		        
				//display result to console
				//prompt user to continue
		            System.out.println(" would you like to continue(Y/N)?");
		       
		            
		            option=scanner.next().charAt(0);
		      }      
		         while((option!='n')&&(option!='N'));
		     
		         System.out.println("Bye!");  
		      
		    

		}
}
	


