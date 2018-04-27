package capstone1;
import java.util.Scanner;
public class cap2 {

	 public void Constants(String userInput){
	     
	       
	       
	        userInput=userInput.toLowerCase();
	     String piglatin="";
	        int flag=0;
	        for(int i=0;i<userInput.length();i++)
	        {
	            char x=userInput.charAt(i);
	            if(x=='a' || x=='e' || x=='i' || x=='o' ||x=='u')
	            {
	                piglatin=userInput.substring(i)+userInput.substring(0,i)+"AY";
	                flag=1;
	                break;
	            }
	        }
	        if(flag==0)
	        {
	            piglatin=userInput+"AY";
	        }
	        System.out.println(userInput+" in Piglatin format is "+piglatin);
	    }
	}
 


