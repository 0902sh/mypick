package day03;

import util.MyUtil;

public class WhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyUtil u = new MyUtil();
		
		u.p("While Statement");
		int i = 0;
		while(i < 100) { 
			u.p("Current i = " + i);
			i++;
		}
		
		u.p("After While i = " + i);
		
		// Infinity Loop
		i = 0;
		while(true) {
			u.p("This i = " + i);
			i++;
		}
		
	}

}
