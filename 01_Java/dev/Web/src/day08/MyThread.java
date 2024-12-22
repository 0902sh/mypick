package day08;

public class MyThread extends Thread {

	MyThread(){}
	MyThread(String name){
		setName(name);
	}
	
	public void run() {
		try {
			for(int i=0; i<10; i++) {
				Thread.sleep(1000);
				System.out.println(i);
			}
		}
		catch(Exception e) { e.printStackTrace(); };
	}
	
}
