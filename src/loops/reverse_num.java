package loops;

public class reverse_num {
	public static void main(String[] args) {
int sum=0;
int n=0;	
int num = 9871;
while(num!=0) {
	n = num%10;
	sum = sum*10+n;
	System.out.println(sum);
	num = num/10;
	System.out.println("number"+num);

}
}
}