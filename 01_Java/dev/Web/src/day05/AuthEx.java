package day05;

import util.MyUtil;

public class AuthEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass c = new MyClass();
		
		MyUtil.cp("c.var1 = " + c.var1);
		c.var1 = 100;  // public 변수는 외부에서 변경 가능한 위험 존재
		MyUtil.cp("c.var1 = " + c.var1);
		
		// MyUtil.cp("c.var2 = " + c.var2);  // private 변수는 not visible
		MyUtil.cp("c.var1 = " + c.getVar2());
		c.setVar2(5000);
		MyUtil.cp("c.var1 = " + c.getVar2());
	}

}

class MyClass {
	public int var1 = 3;
	private int var2 = 10;
	
	// getter
	public int getVar2() {
		return var2;
	}
	
	// setter
	public void setVar2(int var) {
		var2 = var;
	}
	
	// getter와 setter는 추후 Spring에서 lombok 라이브러리를 통해
	// 자동 생성된다.
}
