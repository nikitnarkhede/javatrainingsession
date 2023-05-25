package Thread;

public class MyThread extends Thread{
	public MyThread(String name) {
		setName(name);
	}
	
	@Override
	public void run(){
		
		//This method contains logic to execute 
		//In thread
		//print number from 1 to 9
		
		for(int i=0;i<10;i++) {
			System.out.println("Printing number " + i+"from thread"+getName());
		}
	}
}
