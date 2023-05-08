package loops;

public class label_continue {
	 public static void main(String args[])
	    {
	
	    l1:
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (i == 1 && j == 1) {
	                    continue l1;
	                }
	                System.out.println(i + " " + j);
	            }
	        }
	    }
}
