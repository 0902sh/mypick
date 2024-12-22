package day06;

import util.MyUtil;

public class InterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass mc = new MyClass();
		MyUtil.p("aaa = " + MyInterface.aaa);
		MyUtil.p("aaa = " + mc.aaa);
		//MyUtil.p("aaa = " + MyClass.aaa);
		
		mc.dMethod();
		//mc.sMethod();
		MyInterface.sMethod();
		
		MyInterface mi = new MyClass();
	}

}
