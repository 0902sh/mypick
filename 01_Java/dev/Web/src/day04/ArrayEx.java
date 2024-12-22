package day04;

import util.MyUtil;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyUtil u = new MyUtil();
		u.cp("Array Example");
		
		String[] str = new String[5];
		str[0] = "Eliot";
		u.p("str.length? " + str.length);
		
		String[] student1 = new String[5];
		String[] student2 = {"A","B","C","D","Davis"};
		
		String aaa = new String("James");
		String bbb = "David";
		String ccc = new String("James");
		String ddd = "David";
		
		u.p("aaa == ccc : " + (aaa==ccc));
		u.p("bbb == ddd : " + (bbb==ddd));
		u.p("aaa == ccc : " + aaa.equals(ccc));
		
		int score = 100;
		Integer score1 = new Integer(100);
		
		int[] score2 = {10, 20 , 10, 30, 20};
		
		// 점수들을 출력해보세요.
		// **점
		for(int i=0; i<5; i++)
		System.out.println(student2[i] + " : " + score2[i] + "점");
		
		// 2-dimensional Array
		
		
		// classStudent[0][0] ~ [1][1]
		// A학생의 위치는 classStudent[0][0]
		// C학생의 위치는 classStudent[1][0]
		// 학년, 반, 학생 => String[][][]
		// 한 번 써보면 안쓰게 됨
		String[][][] classStudent3 = {{{"A","B"}, {"C","D"},{"E","F"}}};
		
		
		// 모든 학생 이름 출력하기
		u.p("\nDisplay all student's name");
		for(int i=0; i<student2.length; i++) {
			u.p(student2[i]);
		}
		
		u.p("\nSpecial : Enhanced For");
		for(String name : student2) {
			u.p(name);
		}
		
		for(int scr : score2) {
			u.p(scr + "");
		}
		String[][] classStudent2 = {{"A","B"}, {"C","D"}};
		String[] class1 = classStudent2[0];
		String[] class2 = classStudent2[1];
		
		
		for(String[] cls : classStudent2) {
			for(String std : cls) {
				u.p(std);
			}
		}
	}

}