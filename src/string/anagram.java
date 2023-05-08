package string;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	
	String str1 = sc.next();
	boolean s = true;  
    if (str.length() != str1.length()) {  
        s= false;  
    } else {  
        char[] ArrayS1 = str.toLowerCase().toCharArray();  
        char[] ArrayS2 = str1.toLowerCase().toCharArray();  
        Arrays.sort(ArrayS1);  
        Arrays.sort(ArrayS2);  
        s = Arrays.equals(ArrayS1, ArrayS2);  
    }  
    if (s) {  
        System.out.println(str + " and " + str1 + " are anagrams");  
    } else {  
        System.out.println(str + " and " + str1 + " are not anagrams");  
    }
}
}
