package day04;

import java.util.Random;

import day01.Welcome;
import util.MyUtil;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyUtil u = new MyUtil();
		u.cp("Array Test");

		// 열 개의 이름, 열 개의 임의의 점수 - 소수점 1자리
		// 점수 중 최고점과 최저점을 찾고
		// 그에 해당하는 이름과 점수를 출력
		
		// 1. 10개의 이름과 10개의 점수를 생성한다.
		String[] names = {"A","B","C","E","F","G","H","I","J"};
		
		float[] scores = new float[10];
		
		
	
		
		Random rd = new Random();
		float score1 = rd.nextFloat() * 100 * 10 / 10F;
		float score2 = rd.nextInt(1001) / 10F;
		u.p(score1 + "");
		u.p(score2 + "");
		
		
		for(int i=0; i<scores.length; i++) {
			scores[i] = rd.nextInt(1001) / 10F;
			
		
		}
		
		// 2. 최고점과 최저점 찾기
		int indexTop = 0, indexBottom = 0;
		float scoreTop = 0.0F, scoreBottom = 100.0F;
		
		for(int i=0; i<scores.length; i++) {
			if(scores[i] > scoreTop) {  // 최고점인가?
				scoreTop = scores[i];
				indexTop = i;
			}
			if(scores[i] < scoreBottom) {  // 최저점인가?
				scoreBottom = scores[i];
				indexBottom = i;
			}
		
		}
		
		// 3. 결과를 출력한다
		u.p("\nResult");
		u.p("Top Score : " + scoreTop + "(" + names[indexTop] + ")");
		u.p("Top Score : " + scoreBottom + "(" + names[indexBottom] + ")");
		
		ArrayEx ex = new ArrayEx();
		u.p(ex.toString());
		Welcome wc = new Welcome();
		u.p(wc.toString());
		
	}

}
