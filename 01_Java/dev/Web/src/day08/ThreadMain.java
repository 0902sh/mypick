package day08;

public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Thread 상속
		MyThread t1 = new MyThread("코코");
		MyThread t2 = new MyThread("시민케인");
		MyThread t3 = new MyThread();
		
		// run() : 순차적 실행, thread에 기대한 방식이 아님
//		t1.run();
//		t2.run();
//		t3.run();
		
		// start() : thread 방식으로 수행
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("본체는 영업 끝남");
		
		// 2. Runnable 인터페이스 구현
		MyRunnable r1 = new MyRunnable("Element");
		MyRunnable r2 = new MyRunnable("Inside");
		MyRunnable r3 = new MyRunnable("Ralph 2");
		
		Thread t4 = new Thread(r1);
		
		t4.start();
		t5.start();
		t6.start();
		
		System.out.println("본체는 또 영업 끝남");
		
	}

}
