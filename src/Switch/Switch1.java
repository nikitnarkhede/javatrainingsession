package Switch;

import java.util.Scanner;

public class Switch1{
	public static void main(String a[])
	{
	Scanner sc = new Scanner(System.in);
	int val1 = sc.nextInt();
	int val2 = sc.nextInt();
	System.out.print("add 1,sub2,mul3, div 4, mod 5");
	int val3 = sc.nextInt();
	int s=0;
	switch(val3)
	{
	case 1:
	s=val1+val2;
	break;
	case 2:
	s=val1-val2;
	break;
	case 3:
	s=val1*val2;
	break;
	case 4:
	s=val1/val2;
	break;
	case 5:
	s=val1%val2;
	break;
	}
	System.out.print(s);
}
}
