package array;

public class array_largest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,5,4,2};
		int large=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>large)
				large= a[i];
			
		}
		System.out.println(large);
	}

}
