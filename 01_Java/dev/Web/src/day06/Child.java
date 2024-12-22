package day06;

import util.MyUtil;

public class Child extends Parent {
	String name = "Child";
	
	Child(){
		MyUtil.p("Child Created");
	}
	
	void print() {
		String name = "Super Child";
		MyUtil.p("name = " + name);
		MyUtil.p("this.name = " + this.name);
		MyUtil.p("familyName = " + familyName);
		MyUtil.p("super.name = " + super.name);
	}
	void shout() {
		MyUtil.p("내 이름은 " + this.name + "!!!");
		MyUtil.p("내 이름은 " + name + "!!!");
}
	@Override
	void eat() {
		super.eat();
		MyUtil.p("나 " + this.name + "은 저녁식사를 합니다.");
		MyUtil.p("아이스크림 먹기");
		MyUtil.p("불량식품 아폴론 먹기");
	}
	
}