package day02;

public class OperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p("Operator Example");
		
		// 1. 대입연산
		int num = 10;
		p("1. num = " + num);
		
		// 2. 대입연산2
		num += 10;  // 더해서 넣는다 num = num + 10
		p("2-1. num = " + num);
		num -= 10;
		p("2-2. num = " + num);
		
		// 3. 산술연산
		num = 5 + 5 * 2;
		p("3-1. num = " + num);
		num = 5 * (5 + 2);
		p("3-2. num = " + num);
		
		// 4. 산술연산2
		int NUM_OF_GROUP = 3;
		num = 35 % NUM_OF_GROUP;
		p("4. 현재 데이터는 " + num + "그룹 담당입니다.");
		
		// 5. 산술연산3
		float numf = 10 / 4F;  // Python 10 / 4 = 2.5
		p("5-1. numf = " + numf);
		double numd = 10 / 4D;  // float보다 double이 크므로 Casting
		num = (int)numd;  // 명시적 Casting
		p("5-2. num = " + num);
		
		// 6. 0으로 나눠보기
		// num = 10 / 0;  // 오류(Exception)
		
		// 7. 증감연산
		int a = 10, b = 10;
		p("7-1. a = " + a + ", b = " + b);
		a++;
		++b;
		p("7-2. a = " + a + ", b = " + b);
		
		int x = a++;  // int x = a; a++; 이 더 좋은 방식
		int y = ++b;
		p("7-3. x= " + x + ", y = " + y);
		
		// 연습문제
		String myName = "shkim";
		int myAge = 900;
		// 내 이름은 ***이고, 나이는 ***입니다.
		p(" 내 이름은 " + myName + " 이고, 나이는 " + myAge + " 입니다.");
		
		// 8. 비교연산
		a = 10; b = 5;
		p("8-1. a == b : " + (a == b));
		int c = 7;
		boolean result = (a > b) && (b > c);  // (a > b > c)는 안됨(python은 됨)
		
		// 9. 논리연산
		p("9-1. true && false : " + (true && false));
		p("9-2. true || false : " + (true || false));
		p("9-3. true ^ false : " + (true ^ false));
		p("9-4. !true : " + (!true));
		
		// 10. 삼항연산
		int score = 100;
		String dad1 = score>60? "잘했어" : "***";
		String dad2 = score>99? "당연" : "그것도 점수냐";
		p("10-1. dad1 : " + dad1);
		p("10-2. dad2 : " + dad2);
		String host1 = (score>30)? "맥주":"야 그냥 귀국해";
		p("10-3. host1 : " + host1);
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void p(String str) {
		System.out.println(str);
	}

}
