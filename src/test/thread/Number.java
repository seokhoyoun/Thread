package test.thread;

public class Number extends Thread{

	public Number() {
		
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 500; i++) {
			System.out.println(i);
		}
	}
	
}
