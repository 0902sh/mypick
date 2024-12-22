package day06;

import util.MyUtil;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String, StringBuffer Performance Contest
		String str1 = "";
		StringBuffer str2 = new StringBuffer();
		
		int SAMPLE_CNT = 10000;
		
		long start = System.currentTimeMillis();
		for(int i=0; i<SAMPLE_CNT; i++) {
			str1 = str1 + i;
		}
		long mid = System.currentTimeMillis();
		for(int i=0; i<SAMPLE_CNT; i++) {
			str2.append(i);
		}
		long end = System.currentTimeMillis();
		
		MyUtil.cp("** Performance Result **");
		MyUtil.p("String Elapsed : " + (mid-start) + "(ms)");
		MyUtil.p("StringBuffer Elapsed : " + (end-mid) + "(ms)");
		MyUtil.p(str1);
		
	}

}
