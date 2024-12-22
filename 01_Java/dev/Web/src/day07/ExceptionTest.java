package day07;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		c.setOperand(100, 27);
		c.divide1();
		c.setOperand(100, 0);
		//c.divide1();

		try {
			c.divide1();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		c.divide2();
		
		c.setOperand(1100000, 0);
		
		try {
			c.divide3();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램 완벽 종료");
	}

}

class Calculator {
	int left, right;
	private Object arr;
	
	public void setOperand(int left, int right) {
		this.left =left;
		this.right = right;
	}
	
	public void divide1() {
		System.out.println("[divide()] " + left/right);
	}
	
	// 완벽한 예외 대비
	public void divide2() {
		try {
			System.out.println("[divide()] " + left/right);
		}
		catch(ArithmeticException ae) {
			System.out.println("[divide()] 아리스메틱 오류 발생");
			System.out.println("[divide()] 오류 데이터 : " + left + ", " + right);
			System.out.println("asdf");
			ae.printStackTrace();
			
		}
	}
	// 예고
	public void divide3() throws Exception {  // 나 오류날 가능성 있어요
		System.out.println("[divide()] " + left/right);
	}
	
	// 사용자(개발자, 나)가 예외를 강제로 발생시키는 메서드
	public void divide4() throws Exception {
		if(left >= 10000)
			throw new Exception("10000이상 입력하셨어요");
		
		System.out.println("[divide()] " + left/right);
	}
	

}