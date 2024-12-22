package day03;

import java.util.Random;

import util.MyUtil;

public class SwitchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyUtil u = new MyUtil();
		Random rd = new Random();
		
		int i = rd.nextInt(3);  // i는 0, 1 ,2 중 하나 (n) = (가짓수)
		
		switch(i) {
			case 0:
				u.p("아 0이시네요 꽝입니다.");
				break;
			case 1:
				u.p("아 1이시네요 이것도 꽝입니다.");
				break;
			case 2:
				u.p(u.RED + "This is the TWO!!!!" + u.END);
				u.p("축!!! 당첨!!! 거액의 상품 증정!!");
				break;
			default:
				u.p("엄청난 버그 발생.... 시스템 이상함");
		}{
				// 의도적으로 break를 빼는 경우
				// 아래 단계 작업이 상위 작업을 반드시 거쳐야 되는 경우
				
				int workProcess = rd.nextInt(4);
				u.p(u.GREEN + "앞으로의 작업 프로세스" + u.END);
				
				switch(workProcess) {
				case 0:
					u.p("Step1 : 작업 준비");
				case 1:
					u.p("Step2 : 개발 준비");
				case 2:
					u.p("Step3 : 개발 완료");
				case 3:
					u.p("Step4 : 출시 준비");
				}
				// if statement로 구현한다면
				if(workProcess == 0) {
					u.p("Step1 : 작업 준비");
					u.p("Step2 : 개발 준비");
					u.p("Step3 : 개발 완료");
					u.p("Step4 : 출시 준비");
				}
				else if(workProcess == 1) {
					u.p("Step2 : 개발 준비");
					u.p("Step3 : 개발 완료");
					u.p("Step4 : 출시 준비");
				}
		}
		
	}

}
