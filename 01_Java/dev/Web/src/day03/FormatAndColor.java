package day03;

import java.util.Random;

import util.MyUtil;

public class FormatAndColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyUtil u = new MyUtil();
		// 1. Format(Style) -- escape sequence
		u.p(u.BOLD + "BOLD" + u.END);
		u.p(u.INTENSITY + "INTENSITY" + u.END);
		u.p(u.ITALIC + "ITALIC" + u.END);
		u.p(u.UNDERLINE + "UNDERLINE" + u.END);
		u.p(u.NEGATIVE + "NEGATIVE" + u.END);
		u.p(u.CROSSEDOUT + "CROSSEDOUT" + u.END);
		u.p(u.DOUBLEUNDERLINE + "DOUBLEUNDERLINE" + u.END);

		// 2. Color
		u.p("");
		u.p("Color");
		
		// AA라는 글자를 8색으로 나타내시오. "\033[" + 숫자 + "m"
		// for문을 사용하시오. AAAAAAAAAAAAAAAA
		// 일반 8색을 구현하시오.
		
		for(int i=30; i<38; i++) {
			System.out.print("\033[" + i + "m" + "AA" + "\033[0m");
		}
		u.p("");
		for(int i=40; i<48; i++) {
			System.out.print("\033[" + i + "m" + "  " + "\033[0m");
		}
		u.p("");
		for(int i=100; i<108; i++) {
			System.out.print("\033[" + i + "m" + "  " + "\033[0m");
		}
		// 모든 색상을 표현해보시오.
		u.p("");
		for(int x=0; x<256; x++) {
			System.out.print("\033[48;5;" + x +  "m" + " " + "\033[0m");
		}
		Random rd = new Random();
		// True Color
		// Red, Green, Blue에 각각 Random을 사용하여 0부터 255사이의 값을 설정
		// Red, 
		u.p("");
		for(int r=0; r<256; r++) {
		
		int x = rd.nextInt(256);
		int y = rd.nextInt(256);
		int z = rd.nextInt(256);
		String colorString = x + ";" + y + ";" + z;
		u.p("\033[48;2;" + colorString  +  "m" + " " + "\033[0m");
		}
		u.p("");
		}
		
		

}
