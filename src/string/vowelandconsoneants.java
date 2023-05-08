package string;

import java.util.Scanner;

public class vowelandconsoneants {
	public static void main(String args[]) {
	int cntv = 0, cntc= 0;    
    
 
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
        
  
    str = str.toLowerCase();    
        
    for(int i = 0; i < str.length(); i++) {    
          if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
              cntv++;    
        }    
          else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
              cntc++;    
        }    
    }    
    System.out.println("vowel: " + cntv);    
    System.out.println("consonants: " + cntc);    
}    
}
