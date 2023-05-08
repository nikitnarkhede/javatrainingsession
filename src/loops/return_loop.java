package loops;

public class return_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f = method();
		System.out.println("main method"+f);
		

	}
	public static int method() {
		int a=0;
		System.out.println("Inside method");
		for (int x = 0; x < 3; x++) { 
			System.out.println(x); 
			if(x==2) {
				a=x;
				break;
			}
			
		}
		return a; 
	}

}
