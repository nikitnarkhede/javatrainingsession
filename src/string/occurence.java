package string;

import java.util.Scanner;

public class occurence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		
        int index = -1;
        char r = ' ';
        for (char i : string.toCharArray()) {
            if (string.indexOf(i) == string.lastIndexOf(i)) {
                r = i;
                break;
            }
            else {
                index = 1;
            }
        }
        if (index == 1) {
            System.out.println("characters repeating or string is empty");
        }
        else {
            System.out.println("First non-repeating character is " + r);
        }
    }
}
