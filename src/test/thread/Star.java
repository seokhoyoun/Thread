package test.thread;

public class Star extends Thread {
	
	public Star() {
		
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 500; i ++) {
			System.out.println("★");
		}
	}
	
	
}
