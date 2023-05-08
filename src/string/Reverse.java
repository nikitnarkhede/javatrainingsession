package string;

import java.util.Scanner;

public class Reverse {
	 public static void main (String[] args) {
	       
	        char ch;
	        Scanner sc = new Scanner(System.in);
	    	String str = sc.next();
	        String strr = "";      
	        
	
	       
	      for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i); 
	        strr= ch+strr; 
	      }
	      System.out.println("Reversed word: "+ strr);
	    }
}
