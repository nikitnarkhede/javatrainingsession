package string;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
	       
        char ch;
        Scanner sc = new Scanner(System.in);
    	String str = sc.next();
        String strr = "";      
        

       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); 
        strr= ch+strr; 
      }
      if(strr.equals(str)) {
    	  System.out.println("Palindrome");
      }
      else {
    	  System.out.println("Not Palindrome");
            
      }
    }
	}

