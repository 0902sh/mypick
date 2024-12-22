package day06;

import util.MyUtil;

public interface MyInterface {
	int aaa = 500;
	
	void myMethod();
	
	default void dMethod() {
		MyUtil.p("[dMethod] Called");
	}
	
	// static 메서드는 구현되지 않는다 => 클래스로 이전 안됨
	static void sMethod() {
		MyUtil.p("[sMethod] 누가 날 불렀냐");
	}
}
