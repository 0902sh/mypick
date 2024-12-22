package day05;

import util.MyUtil;

public class Phone {
	
	public void sendText(String str) {
		if(str.length() > 80) {
			MyUtil.p("문자열이 너무 깁니다");
		}
		else {
			MyUtil.p(str);
		}
	}
	
	public void call() {
		MyUtil.p("Calling....");
	}
}
