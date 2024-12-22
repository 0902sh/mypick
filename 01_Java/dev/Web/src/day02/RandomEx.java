package day02;

import java.util.Random;

import util.MyUtil;

public class RandomEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyUtil u = new MyUtil();
		u.p("Random Example");
		
		Random rd = new Random();
		
		// Random Number
		u.p("");
		
		// nextInt(N) : 0부터 N-1까지 중 하나임을 이용하여
		int result = rd.nextInt(6) + 1;
		u.p("주사위 번호 : " + result);
		
		// Random Alphabet(A~Z)
		// 생각해볼 것, 'A'는 십진수로 65
		
		
		char rchar = (char)(rd.nextInt(26) + 65);
	
		
		u.p("Random Char : " + rchar);
		
		// 대소문자중 Random Alphabet
		// 생각해볼 것, 'A' 65, 'a' 97
		// 과연 대소문자 중 하나는 어떻게 구현할까?
		// 26개 중 1개를 추출한 후 = + 65를 한 후 + 32를 더하거나 안더하거나
		rchar = (char)(rd.nextInt(26) + 65 + rd.nextInt(2) * 32);
		u.p("Random Char : " + rchar);
} }
