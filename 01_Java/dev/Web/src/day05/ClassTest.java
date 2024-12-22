package day05;

import util.MyUtil;

public class ClassTest {

	 public static void main(String[] args) {
		 Car car1 = new Car();
		 System.out.println(car1.name);
		 car1.name = "마이바흐";
		 System.out.println(car1.name);
		 
		 Car car2 = new Car("black", "MyTrip", "Full Option");
		 System.out.println(car2.color);	 
		 System.out.println(car2.name);	 
		 System.out.println(car2.type);	 
		 
		 System.out.println("Overrides");
		 System.out.println(car2.toString());
	 }
}

class Car {
	String color;
	String name;
	String type;
	
	Car(){
		color = "미정";
		name = "비밀";
		type = "완전기본형";
		MyUtil.p("Car() called");
	}
	
	Car(String color, String name, String type){
		this.color = color;
		this.name = name;
		this.type = type;
		MyUtil.p("Car(...) called");
	}
	
	// Code Block
	static {
		MyUtil.p("static {} called");
	}
	
	{
		MyUtil.p("{   } called");
	}
	
	// Overriding - 덮어쓰기
	@Override  // annotation 기능은 없이 설명해주는 것
	public String toString() {
		return "이 차 궁금하십니까? 색상은 " + color + "이고, 이름은 " + name + "입니다.";
	}
}
