package day04;

import util.MyUtil;

public class Person {
	// Field
	public int age;
	String name = "Default";
	MyUtil u = new MyUtil();
	
	// Class 변수
	public static String place = "The Earth";
	public static int numOfMan = 0;
	
	// Constructor
	Person(){
		u.p("Person Created");
	}
	
	Person(String n) {
		name = n;
		u.p("Person " + n + " Created");
	}
	
	// static
	public static void hit() {
		MyUtil.p("주인님 좀 때리겠습니다.");
		
	}
	
}