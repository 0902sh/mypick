package day07;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BaseClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Math
		// Math.round
		System.out.println("round : " + Math.round(30.523333));
		// => 30.5가 나오게 하려면?
		System.out.println("round : " + Math.round(30.523333 * 10) / 10D);
		
		// 2. Date, Calendar
		Date d = new Date();  // 현재 시간
		System.out.println("현재 시간 : " + d);
		System.out.println(d);
		
		// * 번외테스트 toString()
		BaseClass2 b = new BaseClass2();
		System.out.println(b);
		
		// format이 심하게 맘에 안들 경우 => simpleDateFormat
		SimpleDateFormat f1 = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat f2 = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat f3 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		
		System.out.println("현재 시간 : " + f1.format(d));
		System.out.println("현재 시간 : " + f2.format(d));
		System.out.println("현재 시간 : " + f3.format(d));
		
		// Calendar
		Calendar c = Calendar.getInstance();
		System.out.println("오늘의 요일은 : " + c.get(Calendar.DAY_OF_WEEK));
		System.out.println("오늘의 요일은 : " + Calendar.DAY_OF_WEEK);
		System.out.println("오늘의 요일은 : " + c.get(7));
		
		System.out.println("연도 : " + c.get(Calendar.YEAR));  // 연도
		System.out.println("월 : " + (c.get(Calendar.MONTH) + 1));  // 월
		System.out.println("일 : " + c.get(Calendar.DAY_OF_MONTH));  // 일
		System.out.println("일 : " + c.get(Calendar.DAY_OF_YEAR));  // 일년 중 오늘이 몇번째 날인지
		
	}
	
	public String toString() {
		return "나 출력하지 마라";
	}

}
