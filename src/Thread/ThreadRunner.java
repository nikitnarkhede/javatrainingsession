package Thread;

public class ThreadRunner {
	public static void main(String args[]) throws InterruptedException {
		MyThread t1 = new MyThread("t1");
		MyThread t2 = new MyThread("t2");
		MyThread t3 = new MyThread("t3");
		
		System.out.println("Starting thread 1 and "+"t2 and t3");
		
		//Here sequence of thread execution is random
		//This depends on OS and processor
		
		t1.start();
		t2.start();
		t3.start();
		
		Thread.sleep(9);
		
		System.out.println("t1 and t2 and"+"t3 started");
		
	}

}
