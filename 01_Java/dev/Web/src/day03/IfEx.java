package day03;

import java.util.Random;

import util.MyUtil;

public class IfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyUtil u = new MyUtil();
		u.p(u.RED + "If Example" + u.END);
		
		Random rd = new Random();
		int a = rd.nextInt(200);  // 0 ~ 999 중 하나
		
		
		if(a > 100)  // 명령문이 한 줄일 때는 괄호 생략 가능
			u.p("a는 매우 큽니다 a : " + a);	
		
		else if(a > 50)
			u.p("a는 적당히 큽니다. a : " + a);
	
		else
			u.p("a는 매우 작은 수입니다. a : " + a);
		
		// nested(중첩)
		// 영어와 수학 점수가 모두 60점 이상이면 Pass 아니면 Fail
		int eng = rd.nextInt(101);
		int math = rd.nextInt(101);
		
		// 과제 : 위 로직을 구현하시오.
		
		if(eng > 59 && math > 59)
			u.p("Pass");

		else
			u.p("Fail");
		
		if(eng >= 60) {
			if(math >= 60) {
				u.p("영어 : " + eng + "점, 수학 : " + math + "점, Pass");
			}
			else {
				u.p("영어 : " + eng + "점, 수학 : " + math + "점, Fail");
			}
		}
		else {
			u.p("영어 : " + eng + "점, 수학 : " + math + "점, Fail");
			
			String PF = "";
			if(eng >= 60) {
				if(math >= 60);
					PF = "Pass";}
					else
						PF = "Fail";}
			{
				if(eng >= 60 && math >= 60);
					u.p("영어 : " + eng + "점, 수학 : " + math + "점, Pass");
		
			
		
			}
		
			}
		
	}
