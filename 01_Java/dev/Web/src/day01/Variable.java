package day01;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Variable Example");
		System.out.println("-------------------");
		
		// 1. int, long, float, double
		int var1 = 30;
		long var2 = 100;  // 100은 int로 인식
		System.out.println("var1, var2 = " + var1 + ", " + var2);
		float var3 = 3.008F;  // 3.008은 double로 인식
		double var4 = 3.008;
		System.out.println("var3, var4 = " + var3 + ", " + var4);
		
		// 2. char - 저장할 때는 숫자로, 읽을 때는 문자로 변환해줌
		char ch1 = 'a';
		char ch2 = 97;
		char ch3 = 0x61;
		System.out.println("char : " + ch1 + ch2 + ch3);
		
		// 3. int를 double로 변환,  double을 int로 변환
		int int1 = 100;
		double db1 = int1;
		System.out.println("db1 : " + db1);
		
		double db2 = 3.14;
		//int int2 = db2; // 큰 범위에서 작은 범위로는 자동 변환 불가
		int int2 = (int)db2; // (명시적)Casting
		System.out.println("int2 : " + int2);
		
		// 4. String
		String myName = "BTS";
		System.out.println("My Name is " + myName);
		
		String num = "1";
		String num2 = "2";
		System.out.println("num + num2 : " + num + num2);
		
		// 문자열을 숫자로
		int num3 = Integer.parseInt(num);
		double num4 = Double.parseDouble(num);
		
		// 숫자를 문자열로
		String num5 = num3 + "";  // 숫자와 문자열의 덧셈은 숫자를 문자열로 변환하여 붙인다
		
		// 5. boolean(참 아니면 거짓)
		boolean b = (3 < 5);
		System.out.println("boolean b : " + b);
	}
	

}
