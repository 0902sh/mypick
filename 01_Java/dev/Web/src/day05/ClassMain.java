package day05;

import java.util.Scanner;

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassC c = new ClassC();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("어떤 폰?(1.일반폰, 2.스마트폰) : ");
		int sel = sc.nextInt();
		
		Phone myPhone;
		if(sel == 1) {
			myPhone = new Phone();
		}
		else {
			myPhone = new SmartPhone();
		}
		
		myPhone.sendText("1111111111111111111111ddddsfdsfdsfdsfdsfdsfdsfdsfdsfffsfsf");
		SmartPhone sp = (SmartPhone)myPhone;
		sp.installApp();
		sp.webSerfing();
	}

}
