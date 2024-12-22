package day02;

import java.util.Scanner;

import util.MyUtil;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 실행 시 입력하기
		System.out.println("작업일자 : " + args[0]);
		System.out.println("작업유형 : " + args[1]);
		
		// 2. Scanner 사용하기
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하십시오 : ");
		String name = sc.next();
		System.out.println("앗 당신이 바로 수배범 " + name + "?");
		
		System.out.print("그렇다면 점수를 입력하세요 : ");
		float score = sc.nextFloat();
		String str = (score > 60)? "짝짝짝" : "그것도 점수냐";
		System.out.println("뭐? " + score + "점? " + str);
		
		// MyUtil.p 이용하기
		MyUtil mu = new MyUtil();
		mu.p("hahahaha");
		MyUtil.p("hahaha2");
	}

}
