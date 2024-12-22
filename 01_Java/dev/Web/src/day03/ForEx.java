package day03;

import util.MyUtil;

public class ForEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyUtil u = new MyUtil();
		
		u.p(u.BOLD + "For Statement" + u.END);
		
		for(int i=0; i<10; i++) {
			u.p("this i is " + i);
			
		int k = -100;
		for(k=0; k<10; k++) {
			u.p("[1] this k is " + k);
		}
		
		u.p("[1] final k is " + k);
		
		// do - while
		int l = 100;
		
		do {
			u.p("[2] this l is " + l);
			l++;
		} while(l < 10);
		
		
		// 실습과제
		// 제어문을 사용하여 1부터 100까지를 출력하되,
		// 3의 배수만 제외하고 출력하세요.
		
		
		
		}
		
	 	for(int x=1; x<101; x++) {
			if(x % 3 != 0)
				u.p("current x = " + x);
		}
		for(int x=1; x<101; x++) {
			if(x % 3 == 0) continue;
			u.p("Current x = " + x);
		}

}}
