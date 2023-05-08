package loops;

public class nested_for {
	public static void main(String args[]) {
		
		
		for(int i=0; i<=10;i++) {
			for(int j=0; j<=10;j++) {
				System.out.println(i);
				if(i==5) {
					System.out.println("Break because i = 5");
					break;
				}
		}
		
		}
		
	}
}
