package day08;

public class MyRunnable implements Runnable {
	
	public void run() {
		try {
			for(int i=0; i<10; i++) {
				Thread.sleep(1000);
				System.out.println(i);
			}
		}
		catch(Exception e) { e.printStackTrace(); };
	}
		
		String name = " ";
		
		MyRunnable(String name) {
			this.name = name;
			
		}
		String getName() {
			return name;
		}
		
	
	

}
