package array;

public class array_copy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5};
		int b[] = new int[a.length];
		int sum=0;
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(b[i]);			
		}
		
	}
}
